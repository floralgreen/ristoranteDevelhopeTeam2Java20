package enumvari;

public enum TipoMenuEnum {
    CARNE("Carne", "Menù di carne per chiunque voglia provare le bontà della terra Italiana."),
    PESCE("pesce","Menù vegetariano per chi non mangia la carne"),
    VEGANO("vegano","Menù vegano per chi non mangia la carne e alimenti derivati dagli animali"),
    NONPREFERENCE("nessuna preferenza ","nessun menù per chi invece mangia qualsiasi alimento di origine animale e vegetale");



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