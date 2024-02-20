#inserimento ristoranti
insert into ristorante_develhope.ristoranti(nome_ristorante, tot_tavoli_ristorante) values ('pippo baudo fast food', 25);

#inserimento menu
insert into ristorante_develhope.menu(nome_menu, nome_cuoco, ristorante_id, tipo_menu) values ('Carne Rossa', 'Ivanone', 1, 'carne');

#inserimento tavoli
insert into ristorante_develhope.tavoli(isFree, posti_tavolo, posti_occupati, ristorante_id) values (true, 8, 0, 1);

#inserimento customers
insert into ristorante_develhope.customers(first_name, last_name, age, menu, gender) values ('Federico','Carducci',23,'nonpreference','male');

#inserimento antipasti
insert into ristorante_develhope.antipasti(nome_antipasto, prezzo_antipasto, tipo_portata_enum, currency_enum, ingredienti, crudo_e_cotto, menu_id)
values ('Tagliere di salumi',8.00,'antipasto','euro','Salame, Prosciutto Crudo, Prosciutto Cotto, Lonza, Speck, Spianata','Crudo',1);

#inserimento primi piatti
insert into ristorante_develhope.primi_piatti(nome_primo_piatto, prezzo_primo_piatto, tipo_portata_enum, currency_enum, ingredienti, tipo_farina, forma_pasta, menu_id)
values ('Carbonara',12.00,'primopiatto','euro','Spaghetti, Guanciale, Uovo intero, Tuorli, Pecorino Romano, Pepe','Integrale, Farro, 00','Spaghetti',1);

#inserimento bevande
insert into ristorante_develhope.bevande(nome_bevanda, prezzo_bevanda, tipo_portata_enum, currency_enum, descrizione, grado_alcolico, menu_id)
values ('Coca Cola',3.00,'bevanda','euro','lattina da 33cl','0%',1);

#inserimento dolci
insert into ristorante_develhope.dolci(nome_dolci, prezzo_dolci, tipo_portata_enum, currency_enum, ingredienti, preparato_al_momento, menu_id)
values ('Tiramisù',4.00,'dolce','euro','Savoiardi,caffe,uova,cacao amaro,mascarpone', true, 1);
