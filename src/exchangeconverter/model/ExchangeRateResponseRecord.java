package exchangeconverter.model;

/**
 * Represents a record for the response received from the external API for currency conversion.
 * This record encapsulates the base currency code, target currency code, and the conversion rate.
 *
 * @param base_code The base currency code (e.g., USD).
 * @param target_code The target currency code (e.g., ARS).
 * @param conversion_rate The conversion rate from base to target currency.
 */
public record ExchangeRateResponseRecord(
        String base_code,
        String target_code,
        double conversion_rate
) {
}