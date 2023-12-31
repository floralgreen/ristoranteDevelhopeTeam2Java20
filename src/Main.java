public class Main {

    public static void main(String[] args) {

        Ristorante caffeineCoders = new Ristorante("Caffeine Coders");
        Menu menuDiCarne = new Menu("Menù Magna e Zitto", "Ivan Piccioni", TipoMenuEnum.CARNE);

        caffeineCoders.aggiungiMenuAlRistorante(menuDiCarne);

        PrimoPiatto primoPiatto1 = new PrimoPiatto(CurrencyEnum.EURO,"Carbonara", 12.00, "Spaghetti, Guanciale, Uovo intero, Tuorli, Pecorino Romano, Pepe");
        PrimoPiatto primoPiatto2 = new PrimoPiatto(CurrencyEnum.EURO,"Amatriciana", 10.00, "800 gr Pomodori maturi, 500 gr Bucatini, 150 gr Pecorino Romano grattugiato, 100 gr Guanciale, Olio extraverrgine di oliva, sale e pepe");
        PrimoPiatto primoPiatto3 = new PrimoPiatto(CurrencyEnum.EURO,"Lasagna", 8.00, "350 grams Semola di grano duro rimacinato, Pomodoro,Besciamella,Farina,uova, Tuorli, 300 gr Carne bovina");
        PrimoPiatto primoPiatto4 = new PrimoPiatto(CurrencyEnum.EURO,"Cacio e pepe", 7.00, "Spaghetti, Pepe nero in grani, Pecorino romano");
        PrimoPiatto primoPiatto5 = new PrimoPiatto(CurrencyEnum.EURO,"Ravioli alla gricia",8.00,"Farina,Sale,Olio,Pecorino romano,Parmiggiano, Pepe");

        SecondoPiatto secondoPiatto1 = new SecondoPiatto(CurrencyEnum.EURO,"Salti in bocca alla romana", 8.50, "Fettine di vittella,salvia,vino bianco,farina 00,prosciutto crudo,burro,pepe,olio");
        SecondoPiatto secondoPiatto2 = new SecondoPiatto(CurrencyEnum.EURO,"Tagliata di manzo", 18.50, "Controfiletto di manzo,sale,olio,rosmarino,pepe");
        SecondoPiatto secondoPiatto3 = new SecondoPiatto(CurrencyEnum.EURO,"Grigliata mista", 23.0, "4 salsicce di maiale,4 pancetta di maiale,4 costolette di agnello ,4 braciole di maiale,pepe,olio,aglio,rosmarino,aceto di vino");
        SecondoPiatto secondoPiatto4 = new SecondoPiatto(CurrencyEnum.EURO,"Abbacchio fritto", 12.0, "costolette d agnello,sale,pepe,olio,uovo,pangrattato");
        SecondoPiatto secondoPiatto5 = new SecondoPiatto(CurrencyEnum.EURO,"Arrosticini alla brace", 11.0, "arrosticini di pecora,sale");

        Dolce dolci1 = new Dolce(CurrencyEnum.EURO,"Tiramisù", 4.0, "Savoiardi,caffe,uova,cacao amaro,mascarpone");
        Dolce dolci2 = new Dolce(CurrencyEnum.EURO,"PannaCotta", 4.0, "Panna fresca,bacca di vaniglia,zucchero,gelatina,Topping a scelta");
        Dolce dolci3 = new Dolce(CurrencyEnum.EURO,"Sorbetto al limone", 3.0, "Zucchero,Limoncello,succo di limone,albumi");
        Dolce dolci4 = new Dolce(CurrencyEnum.EURO,"Crostata con marmellata di visciole", 3.50, "Farina,burro,sale,zucchero a velo,scorza di limone,tuorli,visciole,confettura di ciligie,zucchero di canna");
        Dolce dolci5 = new Dolce(CurrencyEnum.EURO,"Sbriciolata", 4.0, "Farina,Uova,burro,zucchero,lievito,bacca di vaniglia,Nutella/Crema");

        Bevanda bevanda1 = new Bevanda(CurrencyEnum.EURO, "Acqua Naturale", 2.00, "Brocca da 1L");
        Bevanda bevanda2 = new Bevanda(CurrencyEnum.EURO, "Acqua Minerale", 2.00, "Brocca da 1L");
        Bevanda bevanda3 = new Bevanda(CurrencyEnum.EURO, "Vino Rosso", 5.00, "Vino della casa, 1L");
        Bevanda bevanda4 = new Bevanda(CurrencyEnum.EURO, "Vino Bianco", 5.00, "Vino della casa, 1L");
        Bevanda bevanda5 = new Bevanda(CurrencyEnum.EURO, "Coca Cola", 3.00, "lattina da 33cl");

        Antipasto antipasto1 = new Antipasto(CurrencyEnum.EURO, "Tagliere di salumi", 8.00, "Salame, Prosciutto Crudo, Prosciutto Cotto, Lonza, Speck, Spianata");
        Antipasto antipasto2 = new Antipasto(CurrencyEnum.EURO, "Tagliere di formaggi", 9.00, "Asiago DOP, Parmiggiano Reggiano DOP, Provola, Scamorza affumicata");
        Antipasto antipasto3 = new Antipasto(CurrencyEnum.EURO, "Tris di bruschette", 5.00, "Bruschetta al pomodoro, Bruschetta alle olive, Bruschetta con olio della casa");
        Antipasto antipasto4 = new Antipasto(CurrencyEnum.EURO, "Pizzella con prosciutto crudo", 6.00, "Prosciutto crudo, acqua, sale, olio, farina");
        Antipasto antipasto5 = new Antipasto(CurrencyEnum.EURO, "Mozzarella in carrozza", 4.00, "Mozzarella, pan grattato, uovo, sale");

        menuDiCarne.aggiungiPortata(primoPiatto1);
        menuDiCarne.aggiungiPortata(primoPiatto2);
        menuDiCarne.aggiungiPortata(primoPiatto3);
        menuDiCarne.aggiungiPortata(primoPiatto4);
        menuDiCarne.aggiungiPortata(primoPiatto5);

        menuDiCarne.aggiungiPortata(secondoPiatto1);
        menuDiCarne.aggiungiPortata(secondoPiatto2);
        menuDiCarne.aggiungiPortata(secondoPiatto3);
        menuDiCarne.aggiungiPortata(secondoPiatto4);
        menuDiCarne.aggiungiPortata(secondoPiatto5);

        menuDiCarne.aggiungiPortata(dolci1);
        menuDiCarne.aggiungiPortata(dolci2);
        menuDiCarne.aggiungiPortata(dolci3);
        menuDiCarne.aggiungiPortata(dolci4);
        menuDiCarne.aggiungiPortata(dolci5);

        menuDiCarne.aggiungiPortata(bevanda1);
        menuDiCarne.aggiungiPortata(bevanda2);
        menuDiCarne.aggiungiPortata(bevanda3);
        menuDiCarne.aggiungiPortata(bevanda4);
        menuDiCarne.aggiungiPortata(bevanda5);

        menuDiCarne.aggiungiPortata(antipasto1);
        menuDiCarne.aggiungiPortata(antipasto2);
        menuDiCarne.aggiungiPortata(antipasto3);
        menuDiCarne.aggiungiPortata(antipasto4);
        menuDiCarne.aggiungiPortata(antipasto5);

        menuDiCarne.stampaMenu();
    }
}