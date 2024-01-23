package classiconsumazioni;

import enumvari.CurrencyEnum;
import enumvari.TipoPortataEnum;

public class Dolce extends Portata {
    private String ingredienti;
    private boolean preparatoAlMomento;

    public Dolce(TipoPortataEnum tipoPortataEnum, CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String ingredienti, boolean preparatoAlMomento) {
        super(tipoPortataEnum, currencyEnum, nomePortata, prezzoPortata);
        this.ingredienti = ingredienti;
        this.preparatoAlMomento = preparatoAlMomento;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public boolean isPreparatoAlMomento() {
        return preparatoAlMomento;
    }

    public void setPreparatoAlMomento(boolean preparatoAlMomento) {
        this.preparatoAlMomento = preparatoAlMomento;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(ingredienti + "\n" + "Prodotto preparato in loco: " + (preparatoAlMomento? "si" : "no") + "\n");
    }
}
