public class Main {

    public static void main(String[] args) {
         SecondoPiatto[] secondiPiatti=new SecondoPiatto[5];


        SecondoPiatto secondoPiatto1 = new SecondoPiatto("Salti in bocca alla romana",8.50,"Fettine di vittella,salvia,vino bianco,farina 00,prosciutto crudo,burro,pepe,olio");
        SecondoPiatto secondoPiatto2 = new SecondoPiatto("Tagliata di manzo",18.50,"Controfiletto di manzo,sale,olio,rosmarino,pepe");
        SecondoPiatto secondoPiatto3 = new SecondoPiatto("Grigliata mista",23.0,"4 salsicce di maiale,4 pancetta di maiale,4 costolette di agnello ,4 braciole di maiale,pepe,olio,aglio,rosmarino,aceto di vino");
        SecondoPiatto secondoPiatto4 = new SecondoPiatto("Abbacchio fritto",12.0,"costolette d agnello,sale,pepe,olio,uovo,pangrattato");
        SecondoPiatto secondoPiatto5 = new SecondoPiatto("Arrosticini alla brace",11.0,"arrosticini di pecora,sale");

        secondiPiatti[0]=secondoPiatto1;
        secondiPiatti[1]=secondoPiatto2;
        secondiPiatti[2]=secondoPiatto3;
        secondiPiatti[3]=secondoPiatto4;
        secondiPiatti[4]=secondoPiatto5;




        String nomeRistorante = " ~ RISTORANTE TEAM2 JAVA20 ~ ";

        //TIPO MENÙ
        System.out.println(nomeRistorante + "\n" +
                "MENÙ DI CARNE: ");

        // PRIMI PIATTI
        System.out.println("Primi piatti:\n" +
                "- Carbonara\n" +
                "- Amatriciana\n" +
                "- Lasagna\n" +
                "- Cacio e pepe\n" +
                "- Ravioli alla gricia");

        //SECONDI PIATTI
        System.out.println("SECONDI PIATTI" + "\n" +
                "- Salti in bocca alla romana" + "\n" +
                "- Tagliata di manzo" + "\n" +
                "- Grigliata mista" + "\n" +
                "- Abbacchio fritto" + "\n" +
                "- Arrosticini alla brace");

        //DOLCI
        System.out.println("DOLCI  \n" +
                "- Tiramisù\n" +
                "- Panna Cotta\n" +
                "- Sorbetto Limone\n" +
                "- Crostata c/marmellata di visciole\n" +
                "- Sbriciolata");

        //BEVANDE
        System.out.println("BEVANDE" + "\n" +
                "- Acqua Naturale" + "\n" +
                "- Acqua Minerale" + "\n" +
                "- Vino Rosso" + "\n" +
                "- Vino Bianco" + "\n" +
                "- Coca Cola");
    }

}
