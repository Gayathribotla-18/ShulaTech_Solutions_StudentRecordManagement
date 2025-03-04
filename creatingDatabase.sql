CREATE DATABASE StudentDB;
USE StudentDB;
CREATE TABLE students (
    id int primary key AUTO_INCREMENT,
    name varchar(150) NOT NULL,
    course varchar(70),
    email varchar(150) unique ,
    phone varchar(20)
);
