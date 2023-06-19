package com.viewnext.implementacion.calculadora;

import com.viewnext.interfaz.calculadora.ItfzCalculadora;

public class Calculadora implements ItfzCalculadora {

	@Override
	public double sumar(double... numeros) {

		double resultado = 0;
		for (double num : numeros) {
			resultado += num;

		}
		return resultado;
	}

	@Override
	public double restar(double num1, double num2) {

		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) {

		return num1 * num2;
	}

	@Override
	public double dividir(double num1, double num2) {

		return num1 / num2;
	}

}
