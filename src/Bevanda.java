public class Bevanda extends Portata{
    private String descrizione;

    public Bevanda(String nomePortata, double prezzoPortata, String descrizione) {
        super(nomePortata,prezzoPortata);
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
        System.out.println(getNomePortata() + ",  €" + getPrezzoPortata()+ ",  \n" + descrizione);
    }
}
