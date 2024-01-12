import java.sql.SQLOutput;
import java.util.HashSet;

public class Ristorante {

    private HashSet<Menu> menuDisponibili;
    private String nomeRistorante;

    public Ristorante(String nomeRistorante){
        this.menuDisponibili = new HashSet<Menu>();
        this.nomeRistorante = nomeRistorante;
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
    public void stampaMenuDisponibili(colorEnum colore, backgroundEnum sfondo){


        System.out.println(colore + "" + sfondo + "Nome Ristorante: " + nomeRistorante + "\n");

        for (Menu menu: menuDisponibili) {
            menu.stampaMenu();
            System.out.println();
        }

    }
}
