create database if not exists yasi_solutions;

create table app_user (
    id serial primary key,
    first_name varchar(25),
    last_name varchar(25),
    username  varchar(25),
    email varchar(100),
    birth_date date,
    address varchar (200),
    city varchar (50),
    state varchar (15),
    zipcode varchar (10)
);