public class Main {

    public static void main(String[] args) {
        PrimoPiatto[] primiPiatti = new PrimoPiatto[5];
        SecondoPiatto[] secondiPiatti = new SecondoPiatto[5];
        Dolce[] dolci = new Dolce[5];
        Bevanda[] bevande = new Bevanda[5];


        PrimoPiatto primoPiatto1 = new PrimoPiatto("Carbonara", 12.00, "Spaghetti, Guanciale, Uovo intero, Tuorli, Pecorino Romano, Pepe");
        PrimoPiatto primoPiatto2 = new PrimoPiatto("Amatriciana", 10.00, "800 gr Pomodori maturi, 500 gr Bucatini, 150 gr Pecorino Romano grattugiato, 100 gr Guanciale, Olio extraverrgine di oliva, sale e pepe");
        PrimoPiatto primoPiatto3 = new PrimoPiatto("Lasagna", 8.00, "350 grams Semola di grano duro rimacinato, Pomodoro,Besciamella,Farina,uova, Tuorli, 300 gr Carne bovina");
        PrimoPiatto primoPiatto4 = new PrimoPiatto("Cacio e pepe", 7.00, "Spaghetti, Pepe nero in grani, Pecorino romano");
        PrimoPiatto primoPiatto5 = new PrimoPiatto("Ravioli alla gricia",8.00,"Farina,Sale,Olio,Pecorino romano,Parmiggiano, Pepe");

        primiPiatti[0] = primoPiatto1;
        primiPiatti[1] = primoPiatto2;
        primiPiatti[2] = primoPiatto3;
        primiPiatti[3] = primoPiatto4;
        primiPiatti[4] = primoPiatto5;


        SecondoPiatto secondoPiatto1 = new SecondoPiatto("Salti in bocca alla romana", 8.50, "Fettine di vittella,salvia,vino bianco,farina 00,prosciutto crudo,burro,pepe,olio");
        SecondoPiatto secondoPiatto2 = new SecondoPiatto("Tagliata di manzo", 18.50, "Controfiletto di manzo,sale,olio,rosmarino,pepe");
        SecondoPiatto secondoPiatto3 = new SecondoPiatto("Grigliata mista", 23.0, "4 salsicce di maiale,4 pancetta di maiale,4 costolette di agnello ,4 braciole di maiale,pepe,olio,aglio,rosmarino,aceto di vino");
        SecondoPiatto secondoPiatto4 = new SecondoPiatto("Abbacchio fritto", 12.0, "costolette d agnello,sale,pepe,olio,uovo,pangrattato");
        SecondoPiatto secondoPiatto5 = new SecondoPiatto("Arrosticini alla brace", 11.0, "arrosticini di pecora,sale");

        secondiPiatti[0] = secondoPiatto1;
        secondiPiatti[1] = secondoPiatto2;
        secondiPiatti[2] = secondoPiatto3;
        secondiPiatti[3] = secondoPiatto4;
        secondiPiatti[4] = secondoPiatto5;

        Dolce dolci1 = new Dolce("Tiramisù", 4.0, "Savoiardi,caffe,uova,cacao amaro,mascarpone");
        Dolce dolci2 = new Dolce("PannaCotta", 4.0, "Panna fresca,bacca di vaniglia,zucchero,gelatina,Topping a scelta");
        Dolce dolci3 = new Dolce("Sorbetto al limone", 3.0, "Zucchero,Limoncello,succo di limone,albumi");
        Dolce dolci4 = new Dolce("Crostata con marmellata di visciole", 3.50, "Farina,burro,sale,zucchero a velo,scorza di limone,tuorli,visciole,confettura di ciligie,zucchero di canna");
        Dolce dolci5 = new Dolce("Sbricioolata", 4.0, "Farina,Uova,burro,zucchero,lievito,bacca di vaniglia,Nutella/Crema");

        dolci[0] = dolci1;
        dolci[1] = dolci2;
        dolci[2] = dolci3;
        dolci[3] = dolci4;
        dolci[4] = dolci5;

        Bevanda bevanda1 = new Bevanda("Acqua Naturale", 2.00, "Brocca da 1L");
        Bevanda bevanda2 = new Bevanda("Acqua Minerale", 2.00, "Brocca da 1L");
        Bevanda bevanda3 = new Bevanda("Vino Rosso", 5.00, "Vino della casa, 1L");
        Bevanda bevanda4 = new Bevanda("Vino Bianco", 5.00, "Vino della casa, 1L");
        Bevanda bevanda5 = new Bevanda("Coca Cola", 3.00, "lattiana da 33cl");

        bevande[0] = bevanda1;
        bevande[1] = bevanda2;
        bevande[2] = bevanda3;
        bevande[3] = bevanda4;
        bevande[4] = bevanda5;

        Menu menuDiCarne = new Menu(primiPiatti, secondiPiatti, dolci, bevande, TipoMenuEnum.CARNE);

        menuDiCarne.stampaMenu();
    }
}

