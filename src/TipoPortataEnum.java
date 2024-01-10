public enum TipoPortataEnum {

    ANTIPASTO("Antipasto","Antipasti"),
    PRIMOPIATTO("Primo Piatto","Primi Piatti"),
    SECONDOPIATTO("Secondo Piatto","Secondi Piatti"),
    DOLCE("Dolce","Dolci"),
    BEVANDA("Bevanda","Bevande");

    private String nomePortata;
    private String nomePortataPlurale;

    TipoPortataEnum(String nomePortata, String nomePortataPlurale){
        this.nomePortata = nomePortata;
        this.nomePortataPlurale = nomePortataPlurale;
    }

    public String getNomePortata() {
        return nomePortata;
    }

    public void setNomePortata(String nomePortata) {
        this.nomePortata = nomePortata;
    }

    public String getNomePortataPlurale() {
        return nomePortataPlurale;
    }

    public void setNomePortataPlurale(String nomePortataPlurale) {
        this.nomePortataPlurale = nomePortataPlurale;
    }
}
