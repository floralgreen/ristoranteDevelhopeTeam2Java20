package classiconsumazioni;

import enumvari.CurrencyEnum;
import enumvari.TipoPortataEnum;

public class SecondoPiatto extends Portata {

    private String ingredienti;
    private String tipoCottura;
    private String contorni;


   public SecondoPiatto (TipoPortataEnum tipoPortataEnum, CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String ingredienti, String tipoCottura, String contorni) {
       super(tipoPortataEnum, currencyEnum, nomePortata, prezzoPortata);
       this.ingredienti = ingredienti;
       this.tipoCottura = tipoCottura;
       this.contorni = contorni;
   }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public String getTipoCottura() {
        return tipoCottura;
    }

    public void setTipoCottura(String tipoCottura) {
        this.tipoCottura = tipoCottura;
    }

    public String getContorni() {
        return contorni;
    }

    public void setContorni(String contorni) {
        this.contorni = contorni;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(ingredienti + "\n" + "Tipo Cottura: " + tipoCottura + "\n" + "Contorni: " + contorni + "\n");
    }

}

