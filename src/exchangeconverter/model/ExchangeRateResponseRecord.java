package exchangeconverter.model;

public record ExchangeRateResponseRecord(
        String base_code,
        String target_code,
        double conversion_rate
) {
}
