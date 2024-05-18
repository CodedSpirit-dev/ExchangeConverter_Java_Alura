package exchangeconverter.model;

public enum ConversionTarget {
    USD_ARS("/pair/USD/ARS"),
    ARS_USD("/pair/ARS/USD"),
    USD_BRL("/pair/USD/BRL"),
    BRL_USD("/pair/BRL/USD"),
    MXN_USD("/pair/MXN/USD"),
    USD_MXN("/pair/USD/MXN"),
    USD_COP("/pair/USD/COP"),
    COP_USD("/pair/COP/USD");

    private final String path;

    ConversionTarget(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}