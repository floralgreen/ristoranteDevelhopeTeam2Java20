package controlloapp;

import java.time.OffsetTime;

public class OrariRistorante {

    private OffsetTime inizioPranzo;
    private OffsetTime finePranzo;
    private OffsetTime inizioCena;
    private OffsetTime fineCena;


    public OrariRistorante(OffsetTime inizioPranzo, OffsetTime finePranzo, OffsetTime inizioCena, OffsetTime fineCena) {
        this.inizioPranzo = inizioPranzo;
        this.finePranzo = finePranzo;
        this.inizioCena = inizioCena;
        this.fineCena = fineCena;
    }

    public OffsetTime getInizioPranzo() {
        return inizioPranzo;
    }

    public void setInizioPranzo(OffsetTime inizioPranzo) {
        this.inizioPranzo = inizioPranzo;
    }

    public OffsetTime getFinePranzo() {
        return finePranzo;
    }

    public void setFinePranzo(OffsetTime finePranzo) {
        this.finePranzo = finePranzo;
    }

    public OffsetTime getInizioCena() {
        return inizioCena;
    }

    public void setInizioCena(OffsetTime inizioCena) {
        this.inizioCena = inizioCena;
    }

    public OffsetTime getFineCena() {
        return fineCena;
    }

    public void setFineCena(OffsetTime fineCena) {
        this.fineCena = fineCena;
    }

    public boolean isOrarioPranzo(OffsetTime ora) {
        return !ora.isBefore(inizioPranzo) && !ora.isAfter(finePranzo);
    }

    public boolean isOrarioCena(OffsetTime ora) {
        return !ora.isBefore(inizioCena) && !ora.isAfter(fineCena);
    }
}
