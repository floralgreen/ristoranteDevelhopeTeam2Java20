public class Antipasto extends Portata {
    private String ingredienti;

    public Antipasto(CurrencyEnum currencyEnum, String nomePortata, double prezzoPortata, String ingredienti) {
        super(currencyEnum, nomePortata, prezzoPortata);
        this.ingredienti = ingredienti;

    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void stampaInfoPortata() {
        super.stampaInfoPortata();
        System.out.println(ingredienti + "\n");
    }
}
