package controlloapp;

import enumvari.colorEnum;

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

    public void aggiungiMenuAlRistorante(Menu menuDaAggiungere) throws Exception {
        if (menuDaAggiungere != null) {
            menuDisponibili.add(menuDaAggiungere);
        } else {
            throw new Exception("Impossibile aggiungere il menu alla lista: menu nullo");
        }
    }


    public void rimuoviMenuDalRistorante(Menu menuDaRimuovere)throws Exception {
        if (menuDisponibili.contains(menuDaRimuovere)) {
            menuDisponibili.remove(menuDaRimuovere);
        } else {
            throw new Exception("Impossibile rimuovere il menu selezionato, non esistente");
        }
    }


    public void aggiungiTavoloAlRistorante(Tavolo tavolo)throws Exception {
        if (tavoliRistorante.size() < totTavoliRistorante) {
            tavoliRistorante.add(tavolo);
        } else {
            throw new Exception("Impossibile aggiungere il tavolo, capacità massima raggiunta");
        }
    }

    public void prenotaTavolo(String nomeCliente, Integer postiDaOccupare){
        //variabile d'appoggio per verificare successivamente se con la prenotazione precisa è stata effettuata la prenotazione
        boolean prenotazioneEffettuata = false;
        for (Tavolo tavoloCorrente : tavoliRistorante) {
            Integer postiTavoloCorrente = tavoloCorrente.getPostiTavolo();
            Boolean tavoloLibero = tavoloCorrente.getFree();
            if (tavoloLibero && postiTavoloCorrente == postiDaOccupare) {
                prenotazioni.put(nomeCliente, tavoloCorrente);
                tavoloCorrente.setFree(false);
                tavoloCorrente.setPostiOccupati(postiDaOccupare);
                prenotazioneEffettuata = true;
                break;
            }
        }
        //cerca un tavolo che vada bene per i posti da occupare, senza verificare però che sia precisamente uguale il numero dei posti del primo tavolo che incontra
        if (!prenotazioneEffettuata) {
            for (Tavolo tavoloCorrente : tavoliRistorante) {
                Integer postiTavoloCorrente = tavoloCorrente.getPostiTavolo();
                Boolean tavoloLibero = tavoloCorrente.getFree();
                if (tavoloLibero && postiTavoloCorrente >= postiDaOccupare) {
                    prenotazioni.put(nomeCliente, tavoloCorrente);
                    tavoloCorrente.setFree(false);
                    tavoloCorrente.setPostiOccupati(postiDaOccupare);
                    break;
                } else {
                    System.out.println("Ci dispiace non abbiamo tavoli disponibili per il vostro numero di persone! :(");
                }
            }
        }

    }

    public void stampaPrenotazioni() {
        System.out.println("Lista di tutte le prenotazioni del ristorante: \n");
        for (String nomePrenotazione : prenotazioni.keySet()) {
            Tavolo tavoloCorrispondenteAlNome = prenotazioni.get(nomePrenotazione);
            System.out.println("Nome Prenotazione: " + nomePrenotazione + ", Per: " + tavoloCorrispondenteAlNome.getPostiOccupati() + " persone");
            tavoloCorrispondenteAlNome.stampaInfoTavolo();
        }
        System.out.println("\n");
    }

    public void stampaTavoliLiberi() {
        System.out.println("Lista di tutti i tavoli ancora liberi: \n");
        for (Tavolo tavoloCorrente : tavoliRistorante) {
            if (tavoloCorrente.getFree()) {
                tavoloCorrente.stampaInfoTavolo();
            }
        }
        System.out.println("\n");
    }

    public void stampaMenuDisponibili(colorEnum colore, colorEnum sfondo) {


        System.out.println(colore + "" + sfondo + "Nome MainProgram.Ristorante: " + nomeRistorante + "\n");

        for (Menu menu : menuDisponibili) {
            menu.stampaMenu();
            System.out.println();
        }

    }
}
