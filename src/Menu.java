public class Menu {


    TipoMenuEnum tipoMenuEnum;
    PrimoPiatto[] primiPiatti;
    SecondoPiatto[] secondiPiatti;
    Dolce[] dolci;
    Bevanda[] bevande;

    public Menu(PrimoPiatto[] primiPiatti, SecondoPiatto[] secondiPiatti, Dolce[] dolci, Bevanda[] bevande, TipoMenuEnum tipoMenuEnum){
        this.primiPiatti = primiPiatti;
        this.secondiPiatti = secondiPiatti;
        this.dolci = dolci;
        this.bevande = bevande;
        this.tipoMenuEnum = tipoMenuEnum;
    }

    public PrimoPiatto[] getPrimiPiatti() {
        return primiPiatti;
    }

    public void setPrimiPiatti(PrimoPiatto[] primiPiatti) {
        this.primiPiatti = primiPiatti;
    }

    public SecondoPiatto[] getSecondiPiatti() {
        return secondiPiatti;
    }

    public void setSecondiPiatti(SecondoPiatto[] secondiPiatti) {
        this.secondiPiatti = secondiPiatti;
    }

    public Dolce[] getDolci() {
        return dolci;
    }

    public void setDolci(Dolce[] dolci) {
        this.dolci = dolci;
    }

    public Bevanda[] getBevande() {
        return bevande;
    }

    public void setBevande(Bevanda[] bevande) {
        this.bevande = bevande;
    }

    public TipoMenuEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoMenuEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
    }

    public void stampaArrayDiPortata(Portata[] arrayDaTrasformare) {
        for (Portata portata: arrayDaTrasformare) {
            portata.stampaInfoPortata();
        }
    }

    public void stampaMenu() {

        //TODO refactoring metodi di stampa info delle Portate, meglio far tornare una Stringa/StringBuilder
        //altrimenti bisogna fare un casino per la stampa menu.

        //Stampo info Menù
        System.out.println("Selezionato il menù di: " + tipoMenuEnum.getNomeMenu() + "\n" +
                tipoMenuEnum.getDescrizioneMenu() +"\n");

        //Stampo Primi Piatti
        System.out.println("- Primi Piatti");
        stampaArrayDiPortata(primiPiatti);
        System.out.println();
        //Stampo Secondi Piatti
        System.out.println("- Secondi Piatti");
        stampaArrayDiPortata(secondiPiatti);
        System.out.println();
        //Stampo Dolci
        System.out.println("- Dolci");
        stampaArrayDiPortata(dolci);
        System.out.println();
        //Stampo Bevande
        System.out.println("- Bevande");
        stampaArrayDiPortata(bevande);
        System.out.println();

        System.out.println("\n-END-");

    }

}
