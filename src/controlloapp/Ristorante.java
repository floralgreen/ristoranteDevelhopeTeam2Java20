package controlloapp;

import classiconsumazioni.Portata;
import enumvari.CurrencyEnum;
import enumvari.TipoMenuEnum;
import enumvari.colorEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Ristorante {

    private HashSet<Menu> menuDisponibili;
    private String nomeRistorante;
    private HashSet<Tavolo> tavoliRistorante;
    private Map<Customer, Tavolo> prenotazioni;
    private Integer totTavoliRistorante;

    private Integer pointsToAddAfterPurchase;

    private final Integer maxPointsCard = 50;


    public Ristorante(String nomeRistorante, Integer totTavoliRistorante, Integer pointsToAddAfterPurchase) {
        this.nomeRistorante = nomeRistorante;
        this.totTavoliRistorante = totTavoliRistorante;
        this.menuDisponibili = new HashSet<>();
        this.tavoliRistorante = new HashSet<>();
        this.prenotazioni = new HashMap<>();
        this.pointsToAddAfterPurchase = pointsToAddAfterPurchase;


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


    public void rimuoviMenuDalRistorante(Menu menuDaRimuovere) throws Exception {
        if (menuDisponibili.contains(menuDaRimuovere)) {
            menuDisponibili.remove(menuDaRimuovere);
        } else {
            throw new Exception("Impossibile rimuovere il menu selezionato, non esistente");
        }
    }

    public void aggiungiTavoloAlRistorante(Tavolo tavolo) throws Exception {
        if (tavoliRistorante.size() < totTavoliRistorante) {
            tavoliRistorante.add(tavolo);
        } else {
            throw new Exception("Impossibile aggiungere il tavolo, capacità massima raggiunta");
        }
    }

    public void prenotaTavolo(Customer cliente, Integer postiDaOccupare) {
        boolean prenotazioneEffettuata = false;

        for (Tavolo tavoloCorrente : tavoliRistorante) {
            Integer postiTavoloCorrente = tavoloCorrente.getPostiTavolo();
            Boolean tavoloLibero = tavoloCorrente.getFree();

            if (tavoloLibero && postiTavoloCorrente.equals(postiDaOccupare)) {
                prenotazioni.put(cliente, tavoloCorrente);
                tavoloCorrente.setFree(false);
                tavoloCorrente.setPostiOccupati(postiDaOccupare);
                prenotazioneEffettuata = true;
                break;
            }
        }

        if (!prenotazioneEffettuata) {
            for (Tavolo tavoloCorrente : tavoliRistorante) {
                Integer postiTavoloCorrente = tavoloCorrente.getPostiTavolo();
                Boolean tavoloLibero = tavoloCorrente.getFree();

                if (tavoloLibero && postiTavoloCorrente >= postiDaOccupare) {
                    prenotazioni.put(cliente, tavoloCorrente);
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

        for (Customer clienteCorrente : prenotazioni.keySet()) {
            Tavolo tavolo = prenotazioni.get(clienteCorrente);

            System.out.println("Nome Prenotazione: " + clienteCorrente.getFirstName() +
                    ", Per: " + tavolo.getPostiOccupati() + " persone");


        }

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

    //metodo per stampare tutti i menu disponibilli
    public void stampaMenuDisponibili() {
        for (Menu menu : menuDisponibili) {
            menu.stampaMenu();
            System.out.println();
        }
    }

    public void coloraConsole(colorEnum colore, colorEnum sfondo) {
        System.out.println(colore + "" + sfondo);
    }

    public void printMenuCustomer(Customer customer) {

        System.out.println("Nome Ristorante: " + getNomeRistorante() + "\n");
        if (customer.getPreference() == TipoMenuEnum.NONPREFERENCE) {
            this.stampaMenuDisponibili();
        } else {
            for (Menu menuCorrente : this.menuDisponibili) {
                if (menuCorrente.getTipoMenuEnum() == customer.getPreference()) {
                    menuCorrente.stampaMenu();
                }
            }
        }
    }

    public void payCheck(Customer customer, CurrencyEnum valuta) {
        List<Portata> customerOrder = customer.getFoodOrder();

        BigDecimal checkToPay = BigDecimal.valueOf(0);
        for (Portata portataCorrente : customerOrder) {
            checkToPay = checkToPay.add(BigDecimal.valueOf(portataCorrente.getPrezzoPortata()));
        }

        if (customer.getCustomerCard().getFideltyPoints() >= maxPointsCard) {
            System.out.println("Totale pagato: 0" + valuta.getCurrencySymbol() + "\n" +
                    "Il cliente ha utilizzato i punti della tessera fedeltà!");
            customer.getCustomerCard().resetPoints();
        } else {
            customer.getCustomerCard().addPoints(pointsToAddAfterPurchase);
            System.out.println("Totale pagato: " + checkToPay.setScale(2, RoundingMode.DOWN) + valuta.getCurrencySymbol() + "\n" +
                    "Punti aggiunti: " + pointsToAddAfterPurchase + "\n" +
                    "Punti carta fedeltà: " + customer.getCustomerCard().getFideltyPoints());
        }
    }
}
