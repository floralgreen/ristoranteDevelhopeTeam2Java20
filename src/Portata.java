public abstract class Portata {

    private CurrencyEnum currencyEnum;
    private String nomePortata;
    private double prezzoPortata;

    public Portata(CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata) {
        this.currencyEnum = currencyEnum;
        this.nomePortata = nomePortata;
        this.prezzoPortata = prezzoPortata;
    }

    public CurrencyEnum getCurrencyEnum() {
        return currencyEnum;
    }

    public void setCurrencyEnum(CurrencyEnum currencyEnum) {
        this.currencyEnum = currencyEnum;
    }

    public String getNomePortata() {
        return nomePortata;
    }

    public void setNomePortata(String nomePortata) {
        this.nomePortata = nomePortata;
    }

    public double getPrezzoPortata() {
        return prezzoPortata;
    }

    public void setPrezzoPortata(double prezzoPortata) {
        this.prezzoPortata = prezzoPortata;
    }

    public void stampaInfoPortata() {
        System.out.println(nomePortata + ", " + currencyEnum.getCurrencySymbol() + prezzoPortata);
    }

}
