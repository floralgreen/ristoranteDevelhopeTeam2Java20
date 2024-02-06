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
# ivan piccioni 05/02/2024 | creazione portata
CREATE TABLE IF NOT EXISTS ristorante_develhope.portate(
    id_portata INT PRIMARY key auto_increment not null,
    nome_portata VARCHAR(255) not null,
    prezzo_portata VARCHAR(255) not null,
    tipo_portata_enum Enum('antipasto','primopiatto','secondopiatto','dolce','bevanda')not null,
    currency_enum Enum ('euro','us_dollar','pound_sterling')not null      
);



