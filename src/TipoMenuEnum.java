public enum TipoMenuEnum {

    CARNE("Carne", "Menù di carne per chiunque voglia provare le bontà della terra Italiana.");


    private String nomeMenu;
    private String descrizioneMenu;

    TipoMenuEnum(String nomeMenu, String descrizioneMenu) {
        this.nomeMenu = nomeMenu;
        this.descrizioneMenu = descrizioneMenu;
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public String getDescrizioneMenu() {
        return descrizioneMenu;
    }
}
