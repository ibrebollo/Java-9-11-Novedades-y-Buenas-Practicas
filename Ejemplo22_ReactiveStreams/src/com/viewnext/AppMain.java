package com.viewnext;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class AppMain {
	private static class Subscriptor implements Flow.Subscriber<Integer> {

		private Flow.Subscription subscription;
		
		// Basado en API FLOW, novedad JAVA 9. Tratamiento asíncrono de programación reactiva. 

		@Override
		public void onSubscribe(Subscription subscription) {
			this.subscription = subscription;
			subscription.request(1);
		}

		@Override
		public void onNext(Integer item) {
			System.out.println("Mensaje recibido: " + item);
			subscription.request(1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void onError(Throwable error) {
			error.printStackTrace();
		}

		@Override
		public void onComplete() {
			System.out.println("Subscriptor completo");
		}

	}

	private static class Procesador extends SubmissionPublisher<Integer> implements Flow.Processor<Integer, Integer> {

		private Flow.Subscription subscription;

		@Override
		public void onSubscribe(Subscription subscription) {
			this.subscription = subscription;
			subscription.request(1);
		}

		@Override
		public void onNext(Integer item) {
			// publicar el mensaje
			submit(item);
			System.out.println("Mensaje enviado: " + item);
			subscription.request(1);
		}

		@Override
		public void onError(Throwable error) {
			error.printStackTrace();
		}

		@Override
		public void onComplete() {
			System.out.println("Publicador completo");
			close();
		}

	}

	public static void main(String[] args) throws Exception {
		// Crear el publicador
		SubmissionPublisher<Integer> publicador = new SubmissionPublisher<Integer>();

		// Crear el procesador
		Flow.Processor<Integer, Integer> processor = new Procesador();

		// Crear el subscriptor
		Flow.Subscriber<Integer> subscriptor = new Subscriptor();

		publicador.subscribe(processor);
		processor.subscribe(subscriptor);

		for(int i = 1; i<=10; i++) {
			publicador.submit(i);
			Thread.sleep(2000);
		}

		publicador.close();


	}

}
