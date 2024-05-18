package exchangeconverter.model;

/**
 * The ConversionTarget enum represents the supported currency conversion pairs.
 * Each enum constant is associated with a specific API path for fetching the conversion rate.
 */
public enum ConversionTarget {
    USD_ARS("/pair/USD/ARS"), // Represents conversion from USD to Argentine Peso
    ARS_USD("/pair/ARS/USD"), // Represents conversion from Argentine Peso to USD
    USD_BRL("/pair/USD/BRL"), // Represents conversion from USD to Brazilian Real
    BRL_USD("/pair/BRL/USD"), // Represents conversion from Brazilian Real to USD
    MXN_USD("/pair/MXN/USD"), // Represents conversion from Mexican Peso to USD
    USD_MXN("/pair/USD/MXN"), // Represents conversion from USD to Mexican Peso
    USD_COP("/pair/USD/COP"), // Represents conversion from USD to Colombian Peso
    COP_USD("/pair/COP/USD"); // Represents conversion from Colombian Peso to USD

    private final String path; // The API path associated with the conversion pair

    /**
     * Constructor for the ConversionTarget enum.
     * @param path The API path for the currency conversion pair.
     */
    ConversionTarget(String path) {
        this.path = path;
    }

    /**
     * Retrieves the API path associated with the conversion pair.
     * @return The API path as a String.
     */
    public String getPath() {
        return path;
    }
}