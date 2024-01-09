import java.util.HashSet;

public class Menu {


    private TipoMenuEnum tipoMenuEnum;
    //TODO trovare modo di sitemare sto casino con hashset
    private HashSet<Portata> antipasti;
    private HashSet<Portata> primiPiatti;
    private HashSet<Portata> secondiPiatti;
    private HashSet<Portata> dolci;
    private HashSet<Portata> bevande;

    public Menu(TipoMenuEnum tipoMenuEnm){
        this.antipasti = new HashSet<Portata>();
        this.primiPiatti = new HashSet<Portata>();
        this.secondiPiatti = new HashSet<Portata>();
        this.dolci = new HashSet<Portata>();
        this.bevande = new HashSet<Portata>();
        this.tipoMenuEnum = tipoMenuEnm;
    }

    public HashSet<Portata> getPrimiPiatti() {
        return primiPiatti;
    }

    public void setPrimiPiatti(HashSet<Portata> primiPiatti) {
        this.primiPiatti = primiPiatti;
    }

    public HashSet<Portata> getSecondiPiatti() {
        return secondiPiatti;
    }

    public void setSecondiPiatti(HashSet<Portata> secondiPiatti) {
        this.secondiPiatti = secondiPiatti;
    }

    public HashSet<Portata> getDolci() {
        return dolci;
    }

    public void setDolci(HashSet<Portata> dolci) {
        this.dolci = dolci;
    }

    public HashSet<Portata> getBevande() {
        return bevande;
    }

    public void setBevande(HashSet<Portata> bevande) {
        this.bevande = bevande;
    }

    public TipoMenuEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoMenuEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
    }

    public void stampaHashSetDiPortata(HashSet<Portata> hashSetDaStampare) {
        for (Portata portata: hashSetDaStampare) {
            portata.stampaInfoPortata();
        }
    }

    public void aggiungiPortata(Portata portata){

        if (portata != null){
            if (portata instanceof PrimoPiatto){
                primiPiatti.add(portata);
            } else if (portata instanceof SecondoPiatto) {
                secondiPiatti.add(portata);
            } else if (portata instanceof Dolce) {
                dolci.add(portata);
            } else if (portata instanceof Antipasto) {
                antipasti.add(portata);
            } else {
                bevande.add(portata);
            }
        } else {
            System.out.println("Inserire una portata valida");
        }
    }

    public void rimuoviPortata(Portata portata){

        if (portata != null){
            if (portata instanceof PrimoPiatto){
                primiPiatti.remove(portata);
            } else if (portata instanceof SecondoPiatto) {
                secondiPiatti.remove(portata);
            } else if (portata instanceof Dolce) {
                dolci.remove(portata);
            } else if (portata instanceof Antipasto) {
                antipasti.remove(portata);
            } else {
                bevande.remove(portata);
            }
        } else {
            System.out.println("Inserire una portata valida");
        }
    }



    public void stampaMenu() {

        //Stampo info Menù
        System.out.println("Selezionato il menù di: " + tipoMenuEnum.getNomeMenu() + "\n" +
                tipoMenuEnum.getDescrizioneMenu() +"\n");

        //Stampo Antipasti
        System.out.println("- Antipasti");
        stampaHashSetDiPortata(antipasti);
        System.out.println();
        //Stampo Primi Piatti
        System.out.println("- Primi Piatti");
        stampaHashSetDiPortata(primiPiatti);
        System.out.println();
        //Stampo Secondi Piatti
        System.out.println("- Secondi Piatti");
        stampaHashSetDiPortata(secondiPiatti);
        System.out.println();
        //Stampo Dolci
        System.out.println("- Dolci");
        stampaHashSetDiPortata(dolci);
        System.out.println();
        //Stampo Bevande
        System.out.println("- Bevande");
        stampaHashSetDiPortata(bevande);
        System.out.println();

        System.out.println("\n-END-");

    }

}
