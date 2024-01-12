import java.util.*;

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
    public void aggiungiPortata(Portata portata){
        portate.add(portata);
    }

    public void rimuoviPortata(Portata portata){
        portate.remove(portata);
    }

    //metodo per separare le portate
    public Map<String, List<Portata>> filter(){
        //creo una mappa d'appoggio per separare le portate in relative liste
        Map<String, List<Portata>> mappaConListePortate = new HashMap<>();

        //inserisco le portate nelle rispettive liste nella mappa
        for (Portata portata: this.portate) {
            if (mappaConListePortate.containsKey(portata.getTipoPortataEnum().getNomePortataPlurale())){

                mappaConListePortate.get(portata.getTipoPortataEnum().getNomePortataPlurale()).add(portata);

            } else {
                //se non esiste la lista la prima volta che incontra una nuova chiave viene creata
                mappaConListePortate.put(portata.getTipoPortataEnum().getNomePortataPlurale(), new ArrayList<>(List.of(portata)));
            }
        }
        return mappaConListePortate;
    }
    public void stampaHashSetDiPortataOrdinato() {
        //recupero la mappa con tutte le liste divise
        Map<String, List<Portata>> map = filter();

        //recupero le chiavi della mappa presenti nell'ENUM
        List<String> chiaviMappaEnum = new ArrayList<>();


        for (TipoPortataEnum tipoPortataEnumCorrente: TipoPortataEnum.values()) {
            //per ogni ciclo prende l'enum corrente e recupera l'attributo nomePortataPlurale(String) e lo mette nella lista
            chiaviMappaEnum.add(tipoPortataEnumCorrente.getNomePortataPlurale());
        }

        //treamite le chiavi del enum posso accedere alle liste presenti nella mappa e stamparle una all avolta
        for (String chiave: chiaviMappaEnum) {

            System.out.println(chiave + ": \n");
            List<Portata> listaDaStampare = map.get(chiave);

            //posso ordinare tramite l'attributo che voglio
            listaDaStampare.sort(Comparator.comparing(Portata::getPrezzoPortata));

            for (Portata portataCorrente: listaDaStampare) {
                portataCorrente.stampaInfoPortata();
            }
            //style line
            System.out.println();
        }
    }

    public void stampaHashSetDiPortata() {

        //recupero le chiavi della mappa presenti nell'ENUM
        List<String> valoriEnum = new ArrayList<>();
        for (TipoPortataEnum tipoPortataEnumCorrente: TipoPortataEnum.values()) {
            //per ogni ciclo prende l'enum corrente e recupera l'attributo nomePortataPlurale(String) e lo mette nella lista
            valoriEnum.add(tipoPortataEnumCorrente.getNomePortataPlurale());
        }

        for (String valoreCorrente: valoriEnum) {

            //intestazione Categoria Menu
            System.out.println(valoreCorrente + ": \n");

            for (Portata portataCorrente: this.portate) {
                if (portataCorrente.getTipoPortataEnum().getNomePortataPlurale().equals(valoreCorrente)){
                    portataCorrente.stampaInfoPortata();
                }
            }
            //style line
            System.out.println();
        }
    }
    public void stampaMenu(colorEnum colore, backgroundEnum sfondo) {

        //Stampo info Menù
        System.out.println(colore + "" + sfondo +"Selezionato il menù di: " + tipoMenuEnum.getNomeMenu() + "\n" +
                tipoMenuEnum.getDescrizioneMenu() +"\n");

        stampaHashSetDiPortataOrdinato();

        System.out.println("\n-END-" + colorEnum.RESET);
    }

}