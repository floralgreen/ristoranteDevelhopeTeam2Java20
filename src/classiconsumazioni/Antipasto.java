package classiconsumazioni;

import enumvari.CurrencyEnum;
import enumvari.TipoPortataEnum;

public class Antipasto extends Portata {
    private String ingredienti;
    private String crudoECotto;

    public Antipasto(TipoPortataEnum tipoPortataEnum, CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String ingredienti, String crudoECotto) {
        super(tipoPortataEnum, currencyEnum, nomePortata, prezzoPortata);
        this.ingredienti = ingredienti;
        this.crudoECotto = crudoECotto;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getCrudoECotto() {
        return crudoECotto;
    }

    public void setCrudoECotto(String crudoECotto) {
        this.crudoECotto = crudoECotto;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(ingredienti + "\n" + "Antipasto " + crudoECotto + "\n");
    }
}
