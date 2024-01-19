package controlloapp;

import java.util.*;

public class Tavolo {

    private Boolean isFree;
    private Integer postiTavolo;
    private Integer numeroTavolo;
    private Integer postiOccupati;
    private static Integer indiceTavoli = 1;

    public Tavolo(Integer postiTavolo){
        this.postiTavolo = postiTavolo;
        this.isFree = true;
        this.numeroTavolo = indiceTavoli++;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public Integer getPostiTavolo() {
        return postiTavolo;
    }

    public void setPostiTavolo(Integer postiTavolo) {
        this.postiTavolo = postiTavolo;
    }

    public Integer getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(Integer numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public static Integer getIndiceTavoli() {
        return indiceTavoli;
    }

    public static void setIndiceTavoli(Integer indiceTavoli) {
        Tavolo.indiceTavoli = indiceTavoli;
    }

    public Integer getPostiOccupati() {
        return postiOccupati;
    }

    public void setPostiOccupati(Integer postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public void stampaInfoTavolo(){
        System.out.println("Prenotazione.Tavolo n° " + numeroTavolo + ", " +
                "Posti tavolo: " + postiTavolo + ", " +
                "Prenotazione.Tavolo libero: " + (isFree ? "Si" : "No") + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tavolo tavolo = (Tavolo) o;
        return Objects.equals(isFree, tavolo.isFree) && Objects.equals(postiTavolo, tavolo.postiTavolo) && Objects.equals(numeroTavolo, tavolo.numeroTavolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFree, postiTavolo, numeroTavolo);
    }

    @Override
    public String toString() {
        return "Prenotazione.Tavolo{" +
                "isFree=" + isFree +
                ", postiTavolo=" + postiTavolo +
                ", numeroTavolo=" + numeroTavolo +
                ", postiOccupati=" + postiOccupati +
                '}';
    }
}
