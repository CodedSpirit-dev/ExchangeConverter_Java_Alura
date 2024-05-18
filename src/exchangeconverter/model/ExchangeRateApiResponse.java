package exchangeconverter.model;

/**
 * Represents the response received from the external API for currency conversion.
 * It contains the base currency code, target currency code, and the conversion rate.
 */
public class ExchangeRateApiResponse {
    private String base_code; // The base currency code (e.g., USD)
    private String target_code; // The target currency code (e.g., ARS)
    private double conversion_rate; // The conversion rate from base to target currency

    /**
     * Gets the base currency code.
     * @return The base currency code.
     */
    public String getBase_code() {
        return base_code;
    }

    /**
     * Sets the base currency code.
     * @param base_code The base currency code to set.
     */
    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    /**
     * Gets the target currency code.
     * @return The target currency code.
     */
    public String getTarget_code() {
        return target_code;
    }

    /**
     * Sets the target currency code.
     * @param target_code The target currency code to set.
     */
    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    /**
     * Gets the conversion rate from base to target currency.
     * @return The conversion rate.
     */
    public double getConversion_rate() {
        return conversion_rate;
    }

    /**
     * Sets the conversion rate from base to target currency.
     * @param conversion_rate The conversion rate to set.
     */
    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }
}