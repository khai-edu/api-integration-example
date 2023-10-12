package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
	HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://airlabs.co/api/v9/ping?api_key=11b5266b-3a1d-4afa-aa59-bce531fddda6"))
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.header("accept", "*/*")
		.build();

	HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

	System.out.println(response.body());
    }
}