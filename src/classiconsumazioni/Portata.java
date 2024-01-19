package classiconsumazioni;

import enumvari.CurrencyEnum;
import enumvari.TipoPortataEnum;

public abstract class Portata {

    private TipoPortataEnum tipoPortataEnum;
    private CurrencyEnum currencyEnum;
    private String nomePortata;
    private double prezzoPortata;

    public Portata(TipoPortataEnum tipoPortataEnum, CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata) {
        this.tipoPortataEnum = tipoPortataEnum;
        this.currencyEnum = currencyEnum;
        this.nomePortata = nomePortata;
        this.prezzoPortata = prezzoPortata;
    }

    public TipoPortataEnum getTipoPortataEnum() {
        return tipoPortataEnum;
    }

    public void setTipoPortataEnum(TipoPortataEnum tipoPortataEnum) {
        this.tipoPortataEnum = tipoPortataEnum;
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

    @Override
    public String toString() {
        return "MainProgram.Portata{" +
                "tipoPortataEnum=" + tipoPortataEnum +
                ", currencyEnum=" + currencyEnum +
                ", nomePortata='" + nomePortata + '\'' +
                ", prezzoPortata=" + prezzoPortata +
                '}';
    }
}
