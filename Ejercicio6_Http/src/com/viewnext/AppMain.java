package com.viewnext;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AppMain {

	public static void main(String[] args) throws Exception {
		
		// Usamos la API de usuarios
		String url = "http://jsonplaceholder.typicode.com/users";
		
		// Preparar la petición
		URI uri = new URI (url);		
		HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
		
		// Crear el cliente
		HttpClient cliente = HttpClient.newHttpClient();
		
		// El cliente envía la petición
		HttpResponse<String> respuesta = cliente.send(request, HttpResponse.BodyHandlers.ofString()); 	
		String responseBodyStr = respuesta.body();
		System.out.println(responseBodyStr); // se recupera todo el body sin formateo.		
		
		//jsonplaceholder.typicode.com 
		
		// Recuperar y mostrar el nombre de los usuarios a partir del String recuperado del body transformar a objeto json -> Lo hacemos en el Ejercicio6
//		ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode jsonNode = objectMapper.readTree(responseBodyStr);

	}

}
