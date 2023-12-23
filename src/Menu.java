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

    public void aggiungiPortata(PrimoPiatto primoPiatto){
        if (primoPiatto != null) {
            primiPiatti.add(primoPiatto);
            System.out.println("Piatto aggiunto!");
        } else {
            System.out.println("Non è stato possibile aggiungere il piatto!");
        }
    }

    public void aggiungiPortata(SecondoPiatto secondoPiatto){
        if (secondoPiatto != null) {
            secondiPiatti.add(secondoPiatto);
            System.out.println("Piatto aggiunto!");
        } else {
            System.out.println("Non è stato possibile aggiungere il piatto!");
        }
    }

    public void aggiungiPortata(Dolce dolce){
        if (dolce != null) {
            dolci.add(dolce);
            System.out.println("Piatto aggiunto!");
        } else {
            System.out.println("Non è stato possibile aggiungere il piatto!");
        }
    }

    public void aggiungiPortata(Bevanda bevanda){
        if (bevanda != null) {
            bevande.add(bevanda);
            System.out.println("Bevanda aggiunta!");
        } else {
            System.out.println("Non è stato possibile aggiungere la bevanda!");
        }
    }

    public void aggiungiPortata(Antipasto antipasto){
        if (antipasto != null) {
            antipasti.add(antipasto);
            System.out.println("Antipasto aggiunto!");
        } else {
            System.out.println("Non è stato possibile aggiungere l'antipasto!");
        }
    }

    public void rimuoviPortata(PrimoPiatto primoPiatto){
        if (primiPiatti.contains(primoPiatto)) {
            primiPiatti.remove(primoPiatto);
            System.out.println("Piatto rimosso!");
        } else {
            System.out.println("Non è stato possibile rimuovere il piatto! non esistente");
        }
    }

    public void rimuoviPortata(SecondoPiatto secondoPiatto){
        if (secondiPiatti.contains(secondoPiatto)) {
            secondiPiatti.remove(secondoPiatto);
            System.out.println("Piatto rimosso!");
        } else {
            System.out.println("Non è stato possibile rimuovere il piatto! non esistente");
        }
    }

    public void rimuoviPortata(Dolce dolce){
        if (dolci.contains(dolce)) {
            dolci.remove(dolce);
            System.out.println("Dolce rimosso!");
        } else {
            System.out.println("Non è stato possibile rimuovere il dolce! non esistente");
        }
    }

    public void rimuoviPortata(Bevanda bevanda){
        if (bevande.contains(bevanda)) {
            bevande.remove(bevanda);
            System.out.println("Bevanda rimossa!");
        } else {
            System.out.println("Non è stato possibile rimuovere la bevanda! non esistente");
        }
    }

    public void rimuoviPortata(Antipasto antipasto){
        if (antipasti.contains(antipasto)) {
            antipasti.remove(antipasto);
            System.out.println("Antipasto rimosso!");
        } else {
            System.out.println("Non è stato possibile rimuovere l' Antipasto! non esistente");
        }
    }


    public void stampaMenu() {

        //TODO refactoring metodi di stampa info delle Portate, meglio far tornare una Stringa/StringBuilder
        //altrimenti bisogna fare un casino per la stampa menu.

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
