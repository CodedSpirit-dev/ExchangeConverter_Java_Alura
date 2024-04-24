package com.exchangeconverter.bashconverter.api;

public class UrlApi {
    // Define API key as a constant
    private static final String API_KEY = "9beb9440922d7b3f38f00bc4";

    public static void main(String[] args) {
        // Build the URL
        String urlBase = buildUrl();
        System.out.println("API URL: " + urlBase);
    }

    public static String buildUrl() {
        // URL Builder
        StringBuilder urlBuildedWithApi = new StringBuilder();
        urlBuildedWithApi.append("https://v6.exchangerate-api.com/v6/")
                .append(API_KEY);
        return urlBuildedWithApi.toString();
    }

}
