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

    public void stampaHashSetDiPortataOrdinato() {
        Map<String, List<Portata>> map = filter();

        //recupero le chiavi della mappa presenti nell'ENUM
        List<String> chiaviMappaEnum = new ArrayList<>();
        for (TipoPortataEnum tipoPortataEnumCorrente: TipoPortataEnum.values()) {
            //per ogni ciclo prende l'enum corrente e recupera l'attributo nomePortataPlurale(String) e lo mette nella lista
            chiaviMappaEnum.add(tipoPortataEnumCorrente.getNomePortataPlurale());
        }

        for (String chiave: chiaviMappaEnum) {

            System.out.println(chiave + ": \n");
            List<Portata> listaDaStampare = map.get(chiave);
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

    //metodo per separare le portate
    public Map<String, List<Portata>> filter(){
        Map<String, List<Portata>> map = new HashMap<>();

        for (Portata portata: this.portate) {
            if (map.containsKey(portata.getTipoPortataEnum().getNomePortataPlurale())){

                map.get(portata.getTipoPortataEnum().getNomePortataPlurale()).add(portata);

            } else {
                map.put(portata.getTipoPortataEnum().getNomePortataPlurale(), new ArrayList<>(List.of(portata)));
            }
        }
        return map;
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

        stampaHashSetDiPortata();

        System.out.println("\n-END-");
    }

}