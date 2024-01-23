package main;

import classiconsumazioni.*;
import enumvari.*;
import controlloapp.Menu;
import controlloapp.Ristorante;
import controlloapp.Tavolo;

public class Main {

    public static void main(String[] args) {
        try {

        Ristorante caffeineCoders = new Ristorante("Caffeine Coders", 5);
        Menu menuDiCarne = new Menu("Menù Magna e Zitto", "Ivan Piccioni", TipoMenuEnum.CARNE);

        Tavolo tavolo1 = new Tavolo(5);
        Tavolo tavolo2 = new Tavolo(8);
        Tavolo tavolo3 = new Tavolo(2);
        Tavolo tavolo4 = new Tavolo(3);
        Tavolo tavolo5 = new Tavolo(7);

        caffeineCoders.aggiungiTavoloAlRistorante(tavolo1);
        caffeineCoders.aggiungiTavoloAlRistorante(tavolo2);
        caffeineCoders.aggiungiTavoloAlRistorante(tavolo3);
        caffeineCoders.aggiungiTavoloAlRistorante(tavolo4);
        caffeineCoders.aggiungiTavoloAlRistorante(tavolo5);




        caffeineCoders.aggiungiMenuAlRistorante(menuDiCarne);

        PrimoPiatto primoPiatto1 = new PrimoPiatto(TipoPortataEnum.PRIMOPIATTO, CurrencyEnum.EURO,"Carbonara", 12.00, "Spaghetti, Guanciale, Uovo intero, Tuorli, Pecorino Romano, Pepe", "Integrale, Farro, 00", "Rigatoni");
        PrimoPiatto primoPiatto2 = new PrimoPiatto(TipoPortataEnum.PRIMOPIATTO,CurrencyEnum.EURO,"Amatriciana", 10.00, "800 gr Pomodori maturi, 500 gr Bucatini, 150 gr Pecorino Romano grattugiato, 100 gr Guanciale, Olio extraverrgine di oliva, sale e pepe", "Integrale, Farro, 00", "Fettuccine");
        PrimoPiatto primoPiatto3 = new PrimoPiatto(TipoPortataEnum.PRIMOPIATTO,CurrencyEnum.EURO,"Lasagna", 8.00, "350 grams Semola di grano duro rimacinato, Pomodoro,Besciamella,Farina,uova, Tuorli, 300 gr Carne bovina", "Integrale, Farro, 00", "Sfoglia di pasta");
        PrimoPiatto primoPiatto4 = new PrimoPiatto(TipoPortataEnum.PRIMOPIATTO,CurrencyEnum.EURO,"Cacio e pepe", 7.00, "Spaghetti, Pepe nero in grani, Pecorino romano", "Integrale, Farro, 00", "Rigatone");
        PrimoPiatto primoPiatto5 = new PrimoPiatto(TipoPortataEnum.PRIMOPIATTO,CurrencyEnum.EURO,"Ravioli alla gricia",8.00,"Farina,Sale,Olio,Pecorino romano,Parmiggiano, Pepe", "Integrale, Farro, 00", "Ravioli");

        SecondoPiatto secondoPiatto1 = new SecondoPiatto(TipoPortataEnum.SECONDOPIATTO,CurrencyEnum.EURO,"Salti in bocca alla romana", 8.50, "Fettine di vittella,salvia,vino bianco,farina 00,prosciutto crudo,burro,pepe,olio", "Unica", "Friarielli");
        SecondoPiatto secondoPiatto2 = new SecondoPiatto(TipoPortataEnum.SECONDOPIATTO,CurrencyEnum.EURO,"Tagliata di manzo", 18.50, "Controfiletto di manzo,sale,olio,rosmarino,pepe", "Blue, Al Sangue, Media, Ben Cotta", "Patate al forno");
        SecondoPiatto secondoPiatto3 = new SecondoPiatto(TipoPortataEnum.SECONDOPIATTO,CurrencyEnum.EURO,"Grigliata mista", 23.0, "4 salsicce di maiale,4 pancetta di maiale,4 costolette di agnello ,4 braciole di maiale,pepe,olio,aglio,rosmarino,aceto di vino", "Unica", "Patate al forno");
        SecondoPiatto secondoPiatto4 = new SecondoPiatto(TipoPortataEnum.SECONDOPIATTO,CurrencyEnum.EURO,"Abbacchio fritto", 12.0, "costolette d agnello,sale,pepe,olio,uovo,pangrattato", "Unica", "Insalata fresca");
        SecondoPiatto secondoPiatto5 = new SecondoPiatto(TipoPortataEnum.SECONDOPIATTO,CurrencyEnum.EURO,"Arrosticini alla brace", 11.0, "arrosticini di pecora,sale", "Unica", "Patate al forno");

        Dolce dolci1 = new Dolce(TipoPortataEnum.DOLCE,CurrencyEnum.EURO,"Tiramisù", 4.0, "Savoiardi,caffe,uova,cacao amaro,mascarpone", true);
        Dolce dolci2 = new Dolce(TipoPortataEnum.DOLCE,CurrencyEnum.EURO,"PannaCotta", 4.0, "Panna fresca,bacca di vaniglia,zucchero,gelatina,Topping a scelta", true);
        Dolce dolci3 = new Dolce(TipoPortataEnum.DOLCE,CurrencyEnum.EURO,"Sorbetto al limone", 3.0, "Zucchero,Limoncello,succo di limone,albumi", false);
        Dolce dolci4 = new Dolce(TipoPortataEnum.DOLCE,CurrencyEnum.EURO,"Crostata con marmellata di visciole", 3.50, "Farina,burro,sale,zucchero a velo,scorza di limone,tuorli,visciole,confettura di ciligie,zucchero di canna", false);
        Dolce dolci5 = new Dolce(TipoPortataEnum.DOLCE,CurrencyEnum.EURO,"Sbriciolata", 4.0, "Farina,Uova,burro,zucchero,lievito,bacca di vaniglia,Nutella/Crema", true);

        Bevanda bevanda1 = new Bevanda(TipoPortataEnum.BEVANDA,CurrencyEnum.EURO, "Acqua Naturale", 2.00, "Brocca da 1L", "0%");
        Bevanda bevanda2 = new Bevanda(TipoPortataEnum.BEVANDA,CurrencyEnum.EURO, "Acqua Minerale", 2.00, "Brocca da 1L", "0%");
        Bevanda bevanda3 = new Bevanda(TipoPortataEnum.BEVANDA,CurrencyEnum.EURO, "Vino Rosso", 5.00, "Vino della casa, 1L", "18%");
        Bevanda bevanda4 = new Bevanda(TipoPortataEnum.BEVANDA,CurrencyEnum.EURO, "Vino Bianco", 5.00, "Vino della casa, 1L", "15%");
        Bevanda bevanda5 = new Bevanda(TipoPortataEnum.BEVANDA,CurrencyEnum.EURO, "Coca Cola", 3.00, "lattina da 33cl", "0%");

        Antipasto antipasto1 = new Antipasto(TipoPortataEnum.ANTIPASTO,CurrencyEnum.EURO, "Tagliere di salumi", 8.00, "Salame, Prosciutto Crudo, Prosciutto Cotto, Lonza, Speck, Spianata", "Crudo");
        Antipasto antipasto2 = new Antipasto(TipoPortataEnum.ANTIPASTO,CurrencyEnum.EURO, "Tagliere di formaggi", 9.00, "Asiago DOP, Parmiggiano Reggiano DOP, Provola, Scamorza affumicata", "Crudo");
        Antipasto antipasto3 = new Antipasto(TipoPortataEnum.ANTIPASTO,CurrencyEnum.EURO, "Tris di bruschette", 5.00, "Bruschetta al pomodoro, Bruschetta alle olive, Bruschetta con olio della casa", "Cotto");
        Antipasto antipasto4 = new Antipasto(TipoPortataEnum.ANTIPASTO,CurrencyEnum.EURO, "Pizzella con prosciutto crudo", 6.00, "Prosciutto crudo, acqua, sale, olio, farina", "Cotto");
        Antipasto antipasto5 = new Antipasto(TipoPortataEnum.ANTIPASTO,CurrencyEnum.EURO, "Mozzarella in carrozza", 4.00, "Mozzarella, pan grattato, uovo, sale", "Cotto");

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

        caffeineCoders.stampaMenuDisponibili(colorEnum.BLACK, colorEnum.YELLOW_BACKGROUND);
        System.out.println("\n");
        caffeineCoders.stampaPrenotazioni();
        caffeineCoders.stampaTavoliLiberi();

        } catch (Exception e) {
            System.out.println("Errore durante l'esecuzione dell applicazione: " + e.getMessage());
        }
    }
}