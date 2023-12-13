public abstract class Portata {

    private String nomePortata;
    private double prezzoPortata;

    public Portata(String nomePortata, double prezzoPortata){
        this.nomePortata = nomePortata;
        this.prezzoPortata = prezzoPortata;
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

    public abstract void stampaInfoPortata();

}
