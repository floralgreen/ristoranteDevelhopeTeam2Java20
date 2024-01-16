public abstract class ColorManagement {
    private static colorEnum backgroundColor;
    private static colorEnum nomePortataColor;
    private static colorEnum valutaColor;
    private static colorEnum ingredientiColor;
    private static colorEnum descrizioneColor;
    private static colorEnum nomeCuocoColor;
    private static colorEnum nomeMenuColor;
    private static colorEnum tipoMenuColor;
    private static colorEnum nomeRistoranteColor;

    private static colorEnum intestazioneColor;

    private static colorEnum backgroundReservations;
    private static colorEnum colorReservations;


    //Getter & Setter


    public static colorEnum getBackgroundReservations() {
        return backgroundReservations;
    }

    public static void setBackgroundReservations(colorEnum backgroundReservations) {
        ColorManagement.backgroundReservations = backgroundReservations;
    }

    public static colorEnum getColorReservations() {
        return colorReservations;
    }

    public static void setColorReservations(colorEnum colorReservations) {
        ColorManagement.colorReservations = colorReservations;
    }

    public static colorEnum getIntestazioneColor() {
        return intestazioneColor;
    }

    public static void setIntestazioneColor(colorEnum intestazioneColor) {
        ColorManagement.intestazioneColor = intestazioneColor;
    }

    public static colorEnum getBackgroundColor() {
        return backgroundColor;
    }

    public static void setBackgroundColor(colorEnum backgroundColor) {
        ColorManagement.backgroundColor = backgroundColor;
    }

    public static colorEnum getNomePortataColor() {
        return nomePortataColor;
    }

    public static void setNomePortataColor(colorEnum nomePortataColor) {
        ColorManagement.nomePortataColor = nomePortataColor;
    }

    public static colorEnum getValutaColor() {
        return valutaColor;
    }

    public static void setValutaColor(colorEnum valutaColor) {
        ColorManagement.valutaColor = valutaColor;
    }

    public static colorEnum getIngredientiColor() {
        return ingredientiColor;
    }

    public static void setIngredientiColor(colorEnum ingredientiColor) {
        ColorManagement.ingredientiColor = ingredientiColor;
    }

    public static colorEnum getDescrizioneColor() {
        return descrizioneColor;
    }

    public static void setDescrizioneColor(colorEnum descrizioneColor) {
        ColorManagement.descrizioneColor = descrizioneColor;
    }

    public static colorEnum getNomeCuocoColor() {
        return nomeCuocoColor;
    }

    public static void setNomeCuocoColor(colorEnum nomeCuocoColor) {
        ColorManagement.nomeCuocoColor = nomeCuocoColor;
    }

    public static colorEnum getNomeMenuColor() {
        return nomeMenuColor;
    }

    public static void setNomeMenuColor(colorEnum nomeMenuColor) {
        ColorManagement.nomeMenuColor = nomeMenuColor;
    }

    public static colorEnum getTipoMenuColor() {
        return tipoMenuColor;
    }

    public static void setTipoMenuColor(colorEnum tipoMenuColor) {
        ColorManagement.tipoMenuColor = tipoMenuColor;
    }

    public static colorEnum getNomeRistoranteColor() {
        return nomeRistoranteColor;
    }

    public static void setNomeRistoranteColor(colorEnum nomeRistoranteColor) {
        ColorManagement.nomeRistoranteColor = nomeRistoranteColor;
    }

    public static void preset1() {
        backgroundColor = colorEnum.WHITE_BACKGROUND;
        nomePortataColor = colorEnum.BLACK;
        valutaColor = colorEnum.BLUE;
        ingredientiColor = colorEnum.GREEN;
        descrizioneColor = colorEnum.GREEN;
        nomeCuocoColor = colorEnum.BLACK_BOLD;
        nomeMenuColor = colorEnum.RED_BOLD;
        tipoMenuColor = colorEnum.YELLOW_BOLD;
        nomeRistoranteColor = colorEnum.RED_BOLD;
        intestazioneColor = colorEnum.RED_BOLD;
        backgroundReservations = colorEnum.YELLOW_BACKGROUND;
        colorReservations = colorEnum.BLACK_BOLD;
    }

    public static void preset2() {
        backgroundColor = colorEnum.CYAN_BACKGROUND;
        nomePortataColor = colorEnum.BLACK;
        valutaColor = colorEnum.RED;
        ingredientiColor = colorEnum.YELLOW;
        descrizioneColor = colorEnum.YELLOW;
        nomeCuocoColor = colorEnum.BLACK_BOLD;
        nomeMenuColor = colorEnum.RED_BOLD;
        tipoMenuColor = colorEnum.YELLOW_BOLD;
        nomeRistoranteColor = colorEnum.RED_BOLD;
        intestazioneColor = colorEnum.RED_BOLD;
        backgroundReservations = colorEnum.YELLOW_BACKGROUND;
        colorReservations = colorEnum.BLACK_BOLD;
    }
}

