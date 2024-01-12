import java.sql.SQLOutput;
import java.util.*;

public class Ristorante {

    private HashSet<Menu> menuDisponibili;
    private String nomeRistorante;
    private HashSet<Tavolo> tavoliRistorante;
    private Map<String, Tavolo> prenotazioni;
    private Integer totTavoliRistorante;

    public Ristorante(String nomeRistorante, Integer totTavoliRistorante){
        this.nomeRistorante = nomeRistorante;
        this.totTavoliRistorante = totTavoliRistorante;
        this.menuDisponibili = new HashSet<>();
        this.tavoliRistorante = new HashSet<>();
        this.prenotazioni = new HashMap<>();

    }

    public HashSet<Menu> getMenuDisponibili() {
        return menuDisponibili;
    }

    public void setMenuDisponibili(HashSet<Menu> menuDisponibili) {
        this.menuDisponibili = menuDisponibili;
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public void aggiungiMenuAlRistorante(Menu menuDaAggiungere){
        if (menuDaAggiungere != null) {
            menuDisponibili.add(menuDaAggiungere);
        } else {
            System.out.println("Impossibile aggiungere il menu alla lista");
        }
    }

    public void rimuoviMenuDalRistorante(Menu menuDaRimuovere) {
        if (menuDisponibili.contains(menuDaRimuovere)) {
            menuDisponibili.remove(menuDaRimuovere);
        } else {
            System.out.println("Impossibile rimuovere il menu selezionato, non esistente");
        }
    }

    public void aggiungiTavoloAlRistorante(Tavolo tavolo){
        if (tavoliRistorante.size() < totTavoliRistorante){
            tavoliRistorante.add(tavolo);
        }
    }
    public void prenotaTavolo(String nomeCliente, Integer postiDaOccupare){

        for (Tavolo tavoloCorrente: tavoliRistorante) {
            Integer postiTavoloCorrente = tavoloCorrente.getPostiTavolo();
            Boolean tavoloLibero = tavoloCorrente.getFree();
            if (tavoloLibero && postiTavoloCorrente >= postiDaOccupare){
                prenotazioni.put(nomeCliente, tavoloCorrente);
                tavoloCorrente.setFree(false);
                tavoloCorrente.setPostiOccupati(postiDaOccupare);
                break;
            } else {
                System.out.println("Ci dispiace non abbiamo tavoli disponibili per il vostro numero di persone! :(");
            }
        }
    }

    public void stampaPrenotazioni(){
        System.out.println("Lista di tutte le prenotazioni del ristorante: \n");
        for (String nomePrenotazione: prenotazioni.keySet()) {
            Tavolo tavoloCorrispondenteAlNome = prenotazioni.get(nomePrenotazione);
            System.out.println("Nome Prenotazione: " + nomePrenotazione + ", Per: " + tavoloCorrispondenteAlNome.getPostiOccupati() + " persone");
            tavoloCorrispondenteAlNome.stampaInfoTavolo();
        }
        System.out.println("\n");
    }

    public void stampaTavoliLiberi(){
        System.out.println("Lista di tutti i tavoli ancora liberi: \n");
        for (Tavolo tavoloCorrente: tavoliRistorante) {
            if (tavoloCorrente.getFree()){
                tavoloCorrente.stampaInfoTavolo();
            }
        }
        System.out.println("\n");
    }

    public void stampaMenuDisponibili(colorEnum colore, backgroundEnum sfondo){


        System.out.println(colore + "" + sfondo + "Nome Ristorante: " + nomeRistorante + "\n");

        for (Menu menu: menuDisponibili) {
            menu.stampaMenu();
            System.out.println();
        }

    }
}
