CREATE DATABASE IF NOT EXISTS ristorante_develhope;


#Federico Carducci 03/02/2024 | creazione tabella prenotazioni
CREATE TABLE IF NOT EXISTS ristorante_develhope.prenotazioni
(
    id_prenotazione INT primary key auto_increment not null,
    tavolo_id       int                            not null,
    customer_id     int                            not null
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;

#Federico Carducci 03/02/2024 | creazione tabella tavoli
CREATE TABLE IF NOT EXISTS ristorante_develhope.tavoli(
    id_tavolo int primary key auto_increment not null, #id usato anche come num_tavolo
    isFree    BOOL not null default true,
    posti_tavolo int not null,
    posti_occupati int,
    ristorante_id int not null
)
ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

#Domenico Ribaudo 03/02/2024 | creazione tabella customers 
CREATE TABLE IF NOT EXISTS ristorante_develhope.customers(
    id_customer int primary key auto_increment not null, 
    first_name  varchar(255) not null,
    last_name  varchar(255) not null,
    age        int not null,
    menu ENUM('carne', 'pesce', 'vegano','nonpreference'),
    gender ENUM('male', 'female', 'unspecified') 
);

#Domenico Ribaudo 03/02/2024 | creazione tabella ristoranti
CREATE TABLE IF NOT EXISTS ristorante_develhope.ristoranti(
    id_ristorante int primary key auto_increment not null, 
    nome_ristorante  varchar(255) not null,
    tot_tavoli_ristorante int not null,
    prenotazione_id int not null
);

# Stefano Forcinito 06/02/2024 creazione tabella menu
create table ristorante_develhope.menu(
id_menu int not null,
nome_menu varchar(255) not null,
nome_cuoco varchar(255) not null,
tipo_menu enum('carne','pesce','vegano','nonpreference')not null
);

#Federico Carducci 10/02/2024 | creazione tabella dolci
create table if not exists ristorante_develhope.dolci (
    id_dolce             int auto_increment,
    nome_dolce           varchar(255)                                                           not null,
    prezzo_dolce         DOUBLE                                                                 not null,
    tipo_portata_enum    enum ('antipasto', 'primopiatto', 'secondopiatto', 'bevanda', 'dolce') not null,
    currency_enum        enum ('euro', 'us_dollar', 'pound_sterling')                           not null,
    ingredienti          varchar(500)                                                           not null,
    preparato_al_momento bool                                                                   not null,
    menu_id              int                                                                    not null,
    constraint dolci_pk primary key (id_dolce)
);

#Domenico Ribaudo 10/02/2024 | creazione tabella antipasti
create table if not exists ristorante_develhope.antipasti (
    id_antipasto         int auto_increment                                                     not null,
    nome_antipasto       varchar(255)                                                           not null,
    prezzo_antipasto     DOUBLE                                                                 not null,
    tipo_portata_enum    enum ('antipasto', 'primopiatto', 'secondopiatto', 'bevanda', 'dolce') not null,
    currency_enum        enum ('euro', 'us_dollar', 'pound_sterling')                           not null,
    ingredienti          varchar(500)                                                           not null,
    crudo_e_cotto        varchar(500)                                                           not null,
    menu_id              int                                                                    not null,
    constraint antipasti_pk primary key (id_antipasto)
);

#Ivan Piccioni 09/02/2024 | creazione tabella secondi_piatti
create table if not exists ristorante_develhope.secondi_piatti(
id_secondo_piatto int primary key auto_increment not null,
nome_secondo_piatto varchar(255) not null,
prezzo_secondo_piatto double not null,
tipo_portata_enum Enum ('antipasto','primopiatto','secondopiatto','dolce','bevande') not null,
currency_enum Enum ('euro','us_dollar','pound_sterling') not null,
ingredienti varchar(255) not null,
tipo_cottura varchar(255),
contorni varchar(255)
);







