package controlloapp;

import classiconsumazioni.Portata;
import enumvari.TipoMenuEnum;
import enumvari.TipoPortataEnum;
import enumvari.colorEnum;

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
    public void aggiungiPortata(Portata portata) throws Exception{
        if (portate.contains(portata)) {
            throw new Exception("La portata è già presente nella lista.");
        } else {
            portate.add(portata);
        }
    }


    public void rimuoviPortata(Portata portata)throws Exception {
        if (portate.contains(portata)) {
            portate.remove(portata);
        } else {
            throw new Exception("La portata non è presente nella lista.");
        }
    }


    //metodo per separare le portate
    public Map<String, List<Portata>> filtroPortate(){
        //creo una mappa d'appoggio per separare le portate in relative liste
        Map<String, List<Portata>> mappaConListePortate = new HashMap<>();

        //inserisco le portate nelle rispettive liste nella mappa
        for (Portata portataCorrente: this.portate) {
            String chiaveMappa = portataCorrente.getTipoPortataEnum().getNomePortataPlurale();

            if (mappaConListePortate.containsKey(portataCorrente.getTipoPortataEnum().getNomePortataPlurale())){

                List<Portata> listaRecuperata = mappaConListePortate.get(chiaveMappa);
                listaRecuperata.add(portataCorrente);


            } else {
                //se non esiste la lista la prima volta che incontra una nuova chiave viene creata
                List<Portata> listaNuovaDaInserire = new ArrayList<>(List.of(portataCorrente));
                mappaConListePortate.put(chiaveMappa, listaNuovaDaInserire);
            }
        }
        return mappaConListePortate;
    }
    public void stampaHashSetDiPortataOrdinato() {
        //recupero la mappa con tutte le liste divise
        Map<String, List<Portata>> map = filtroPortate();

        //recupero le chiavi della mappa presenti nell'ENUM
        List<String> chiaviMappaEnum = new ArrayList<>();


        for (TipoPortataEnum tipoPortataEnumCorrente : TipoPortataEnum.values()) {
            //per ogni ciclo prende l'enum corrente e recupera l'attributo nomePortataPlurale(String) e lo mette nella lista
            String nomePortataPlurale = tipoPortataEnumCorrente.getNomePortataPlurale();
            chiaviMappaEnum.add(nomePortataPlurale);
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

    public void stampaMenu() {

        //Stampo info Menù
        System.out.println("Selezionato il menù di: " + tipoMenuEnum.getNomeMenu() + "\n" +
                tipoMenuEnum.getDescrizioneMenu() +"\n" +
                "Cuoco: " + nomeCuoco + "\n" +
                "Nome Menu: " + nomeMenu + "\n");

        stampaHashSetDiPortataOrdinato();

        System.out.println(colorEnum.RESET + "\n-END-");
    }

}