import enumvari.colorEnum;

public class ColorManagement {
    private colorEnum backgroundColor;
    private colorEnum nomePortataColor;
    private colorEnum valutaColor;
    private colorEnum ingredientiColor;
    private colorEnum descrizioneColor;
    private colorEnum nomeCuocoColor;
    private colorEnum nomeMenuColor;
    private colorEnum tipoMenuColor;
    private colorEnum nomeRistoranteColor;

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
    public colorEnum getBackgroundColor() {
        return backgroundColor;
    }
    public void setBackgroundColor(colorEnum backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public colorEnum getNomePortataColor() {
        return nomePortataColor;
    }
    public void setNomePortataColor(colorEnum nomePortataColor) {
        this.nomePortataColor = nomePortataColor;
    }
    public colorEnum getValutaColor() {
        return valutaColor;
    }
    public void setValutaColor(colorEnum valutaColor) {
        this.valutaColor = valutaColor;
    }
    public colorEnum getIngredientiColor() {
        return ingredientiColor;
    }
    public void setIngredientiColor(colorEnum ingredientiColor) {
        this.ingredientiColor = ingredientiColor;
    }
    public colorEnum getDescrizioneColor() {
        return descrizioneColor;
    }
    public void setDescrizioneColor(colorEnum descrizioneColor) {
        this.descrizioneColor = descrizioneColor;
    }
    public colorEnum getNomeCuocoColor() {
        return nomeCuocoColor;
    }
    public void setNomeCuocoColor(colorEnum nomeCuocoColor) {
        this.nomeCuocoColor = nomeCuocoColor;
    }
    public colorEnum getNomeMenuColor() {
        return nomeMenuColor;
    }
    public void setNomeMenuColor(colorEnum nomeMenuColor) {
        this.nomeMenuColor = nomeMenuColor;
    }
    public colorEnum getTipoMenuColor() {
        return tipoMenuColor;
    }
    public void setTipoMenuColor(colorEnum tipoMenuColor) {
        this.tipoMenuColor = tipoMenuColor;
    }
    public colorEnum getNomeRistoranteColor() {
        return nomeRistoranteColor;
    }
    public void setNomeRistoranteColor(colorEnum nomeRistoranteColor) {
        this.nomeRistoranteColor = nomeRistoranteColor;
    }


    //Preset
    ColorManagement preset1 = new ColorManagement(colorEnum.WHITE_BACKGROUND, colorEnum.BLACK,
            colorEnum.BLUE, colorEnum.GREEN, colorEnum.GREEN, colorEnum.BLACK_BOLD, colorEnum.RED_BOLD,
            colorEnum.YELLOW_BOLD, colorEnum.RED_BOLD);
//    public void presetMenuCarne1(){
//        colorEnum backgroundColor = colorEnum.WHITE_BACKGROUND;
//        colorEnum nomePortataColor = colorEnum.BLACK;
//        colorEnum valutaColor = colorEnum.BLUE;
//        colorEnum ingredientiColor = colorEnum.GREEN;
//        colorEnum descrizioneColor =colorEnum.GREEN;
//        colorEnum nomeCuocoColor = colorEnum.BLACK_BOLD;
//        colorEnum nomeMenuColor = colorEnum.RED_BOLD;
//        colorEnum tipoMenuColor = colorEnum.YELLOW_BOLD;
//        colorEnum nomeRistoranteColor = colorEnum.RED_BOLD;
//    }

}
