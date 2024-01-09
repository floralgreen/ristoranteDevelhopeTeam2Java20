import java.util.HashSet;

public class Menu {

    private String nomeMenu;
    private String nomeCuoco;
    private TipoMenuEnum tipoMenuEnum;
    private HashSet<Portata> portate;


    public Menu(String nomeMenu, String nomeCuoco, TipoMenuEnum tipoMenuEnm){
        this.portate = new HashSet<Portata>();
        this.nomeMenu = nomeMenu;
        this.nomeCuoco = nomeCuoco;
        this.tipoMenuEnum = tipoMenuEnm;
    }


    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public String getNomeCuoco() {
        return nomeCuoco;
    }

    public void setNomeCuoco(String nomeCuoco) {
        this.nomeCuoco = nomeCuoco;
    }

    public HashSet<Portata> getPortate() {
        return portate;
    }

    public void setPortate(HashSet<Portata> portate) {
        this.portate = portate;
    }

    public TipoMenuEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoMenuEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
    }

    public void stampaHashSetDiPortata() {
        for (Portata portata: portate) {
            portata.stampaInfoPortata();
        }
    }

    public void aggiungiPortata(Portata portata){
        portate.add(portata);
    }

    public void rimuoviPortata(Portata portata){
        portate.remove(portata);
    }



    public void stampaMenu() {

        //Stampo info Menù
        System.out.println("Selezionato il menù di: " + tipoMenuEnum.getNomeMenu() + "\n" +
                tipoMenuEnum.getDescrizioneMenu() +"\n");

        //TODO STAMPA CON I COLORI
        //TODO c'è da ciclare e stampare, potete farlo come vi pare ottimizzato o non, scegliete voi
        //TODO bisogna capire come inserire i titoli delle sezioni
        System.out.println("");
        stampaHashSetDiPortata();
        System.out.println();

        //System.out.println("\n-END-");
    }

}