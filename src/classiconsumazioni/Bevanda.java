package classiconsumazioni;

import enumvari.CurrencyEnum;
import enumvari.TipoPortataEnum;

public class Bevanda extends Portata {
    private String descrizione;
    private String gradoAlcolico;

    public Bevanda(TipoPortataEnum tipoPortataEnum, CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String descrizione, String gradoAlcolico) {
        super(tipoPortataEnum, currencyEnum, nomePortata, prezzoPortata);
        this.descrizione = descrizione;
        this.gradoAlcolico = gradoAlcolico;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getGradoAlcolico() {
        return gradoAlcolico;
    }

    public void setGradoAlcolico(String gradoAlcolico) {
        this.gradoAlcolico = gradoAlcolico;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(descrizione + "\n" + "Grado Alcolico: " + gradoAlcolico + "\n");
    }
}
