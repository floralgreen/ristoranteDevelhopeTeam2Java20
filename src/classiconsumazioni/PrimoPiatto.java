package classiconsumazioni;

import enumvari.CurrencyEnum;
import enumvari.TipoPortataEnum;

public class PrimoPiatto extends Portata {

    private String ingredienti;
    private String tipoFarina;
    private String formaPasta;


    public PrimoPiatto(TipoPortataEnum tipoPortataEnum, CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String ingredienti, String tipoFarina, String formaPasta) {
        super(tipoPortataEnum, currencyEnum, nomePortata, prezzoPortata);
        this.ingredienti = ingredienti;
        this.tipoFarina = tipoFarina;
        this.formaPasta = formaPasta;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getTipoFarina() {
        return tipoFarina;
    }

    public void setTipoFarina(String tipoFarina) {
        this.tipoFarina = tipoFarina;
    }

    public String getFormaPasta() {
        return formaPasta;
    }

    public void setFormaPasta(String formaPasta) {
        this.formaPasta = formaPasta;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(ingredienti + "\n" + "Tipo farina: " + tipoFarina + "\n" + "Forma Pasta: " + formaPasta + "\n");

    }
}
