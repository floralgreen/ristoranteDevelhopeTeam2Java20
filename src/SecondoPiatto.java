public class SecondoPiatto extends  Portata {

    private String ingredienti;

   public SecondoPiatto (String nomePortata,double prezzoPortata,String ingredienti) {
       super(nomePortata,prezzoPortata);
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
        System.out.println(getNomePortata() + ",  €" + getPrezzoPortata()+ ",  \n" + ingredienti + "\n");
    }


}

