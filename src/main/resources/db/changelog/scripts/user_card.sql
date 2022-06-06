--liquibase formatted sql

--changeset user_card:1_by_Ibra
CREATE TABLE user_card (
    card_id serial PRIMARY KEY,
    firstname VARCHAR (50) NOT NULL,
    lastname VARCHAR (50) ,
    email VARCHAR (50) UNIQUE
)