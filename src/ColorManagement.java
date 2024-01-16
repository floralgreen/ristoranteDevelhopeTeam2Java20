public class ColorManagement {
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

    //constructor
    public ColorManagement(colorEnum backgroundColor, colorEnum nomePortataColor, colorEnum valutaColor,
                           colorEnum ingredientiColor, colorEnum descrizioneColor, colorEnum nomeCuocoColor,
                           colorEnum nomeMenuColor, colorEnum tipoMenuColor, colorEnum nomeRistoranteColor) {
        this.backgroundColor = backgroundColor;
        this.nomePortataColor = nomePortataColor;
        this.valutaColor = valutaColor;
        this.ingredientiColor = ingredientiColor;
        this.descrizioneColor = descrizioneColor;
        this.nomeCuocoColor = nomeCuocoColor;
        this.nomeMenuColor = nomeMenuColor;
        this.tipoMenuColor = tipoMenuColor;
        this.nomeRistoranteColor = nomeRistoranteColor;
    }

    //Getter & Setter


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
        backgroundColor = colorEnum.BLACK_BACKGROUND;
        nomePortataColor = colorEnum.RED;
        ingredientiColor = colorEnum.BLUE;
        descrizioneColor = colorEnum.BLUE;
        nomeCuocoColor = colorEnum.CYAN;
        intestazioneColor = colorEnum.GREEN;
    }

    public static void preset2() {
        backgroundColor = colorEnum.BLACK_BACKGROUND;
        nomePortataColor = colorEnum.RED;
        ingredientiColor = colorEnum.BLUE;
        descrizioneColor = colorEnum.BLUE;
        nomeCuocoColor = colorEnum.CYAN;
        intestazioneColor = colorEnum.GREEN;
    }
}

