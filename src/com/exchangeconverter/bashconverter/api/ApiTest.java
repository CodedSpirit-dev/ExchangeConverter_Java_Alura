package com.exchangeconverter.bashconverter.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

public class ApiTest {
    public HttpResponse<Object> response;

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a new HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Create a new HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.exchangerate-api.com/v4/latest/USD"))
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Print the response
        System.out.println("Response status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());

        //Get JSON response
        String json = response.body();
        System.out.println(json);

        // Create a new Gson object
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Print the response
        System.out.println(response.body());
        System.out.println(gson.toJson(response.body()));
    }
}
