--liquibase formatted sql

--changeset task_card:1_by_Ibra
CREATE TABLE task_card (
    task_card_id serial PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(1500),
    began_time timestamp,
    end_time timestamp,
    spended_time_in_minutes int,
    user_task_id INTEGER REFERENCES user_card (card_id)
)