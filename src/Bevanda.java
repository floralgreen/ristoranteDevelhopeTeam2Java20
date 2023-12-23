public class Bevanda extends Portata{
    private String descrizione;

    public Bevanda(CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String descrizione) {
        super(currencyEnum,nomePortata,prezzoPortata);
        this.descrizione = descrizione;

    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(descrizione + "\n");
    }
}
