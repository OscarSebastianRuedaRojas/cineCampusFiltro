CREATE DATABASE cinecamapus;
USE cinecampus;

CREATE TABLE tipoactor (
id INT PRIMARY KEY,
descripcion VARHCAR(50));

CREATE TABLE peliculacategoria(
idpelicula INT PRIMARY KEY,
isprotagonista INT,
idtipoactor INT
CONSTRAINT FK_idpelicula FOREING KEY (idpelicula) REFERENCES pelicula(id));

CREATE TABLE actor(
id INT PRIMARY KEY,
nombre VARCHAR(50),
idnacionalidad INT,
edad INT,
idgenero INT
CONTRAIN FK_id FOREING KEY ());

CREATE TABLE  genero(
id INT PRIMARY KEY,
descripcion VARHCAR(50));

CREATE TABLE pais(
id INT PRIMARY KEY,
descripcion VARCHAR(50));

CREATE TABLE pelicula (
contenido VARCHAR(5)
nombre VARCHAR (50)
duracion (50)
sinopsis TEXT);

CREATE TABLE peliculaformato (
idpelicula INT PRIMARY KEY,
idformato INT,
cantidad );

CREATE TABLE formato (
idpelicula INT PRIMARY KEY,
idformato INT,
cantidad INT);




