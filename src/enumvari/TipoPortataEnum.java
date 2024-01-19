package enumvari;

public enum TipoPortataEnum {

    ANTIPASTO("ClassiConsumazioni.Antipasto","Antipasti"),
    PRIMOPIATTO("Primo Piatto","Primi Piatti"),
    SECONDOPIATTO("Secondo Piatto","Secondi Piatti"),
    DOLCE("ClassiConsumazioni.Dolce","Dolci"),
    BEVANDA("ClassiConsumazioni.Bevanda","Bevande");

    private String nomePortata;
    private String nomePortataPlurale;

    TipoPortataEnum(String nomePortata, String nomePortataPlurale){
        this.nomePortata = nomePortata;
        this.nomePortataPlurale = nomePortataPlurale;
    }

    public String getNomePortata() {
        return nomePortata;
    }

    public String getNomePortataPlurale() {
        return nomePortataPlurale;
    }
}
