package exchangeconverter.model;

public class UrlApi {
    private static final String API_KEY = "9beb9440922d7b3f38f00bc4";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public static void main(String[] args) {
        String url = buildUrlWithApiKey();
        printApiUrl(url);
    }

    // Builds the complete API URL using the base URL and the API key
    public static String buildUrlWithApiKey() {
        return BASE_URL + API_KEY;
    }

    // Prints the API URL to the console
    public static void printApiUrl(String url) {
        System.out.println("API URL: " + url);
    }
}