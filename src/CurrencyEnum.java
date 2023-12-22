public enum CurrencyEnum {
    EURO("€","EUR"),
    US_DOLLAR("$","USD"),
    POUND_STERLING("£","GBP");

    //PROPERTY
    private String currencySymbol;
    private String currencyCode;

    //CONSTRUCTOR
    CurrencyEnum(String currencySymbol, String currencyCode) {
        this.currencySymbol = currencySymbol;
        this.currencyCode = currencyCode;
    }

    //GETTER
    public String getCurrencySymbol() {
        return currencySymbol;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
}
