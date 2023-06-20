package com.viewnext;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class AppMain {

	public static void main(String[] args) throws Exception {
		
		// Usamos la API de Usuarios
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
		// Convertir este string en un array de JSON
		JSONArray jsonArray = new JSONArray(respuesta.body());
		
		for(Object obj : jsonArray) {
			JSONObject jsonObject = new JSONObject(obj.toString());
			System.out.println(jsonObject.get("name"));
			System.out.println("------------");
		}

	}

}
