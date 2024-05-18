package exchangeconverter.model;

/**
 * The UrlApi class provides utility methods for constructing and displaying the API URL.
 * It encapsulates the base URL and API key for the exchange rate API.
 */
public class UrlApi {
    private static final String API_KEY = "9beb9440922d7b3f38f00bc4"; // The API key for accessing the exchange rate API.
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/"; // The base URL of the exchange rate API.

    /**
     * The main method for testing the URL construction and display functionality.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        String url = buildUrlWithApiKey(); // Build the complete API URL.
        printApiUrl(url); // Print the API URL to the console.
    }

    /**
     * Builds the complete API URL using the base URL and the API key.
     * @return The complete API URL as a String.
     */
    public static String buildUrlWithApiKey() {
        return BASE_URL + API_KEY; // Concatenate the base URL with the API key.
    }

    /**
     * Prints the API URL to the console.
     * @param url The API URL to be printed.
     */
    public static void printApiUrl(String url) {
        System.out.println("API URL: " + url); // Print the API URL.
    }
}