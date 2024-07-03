CREATE DATABASE cinecampus;
USE cinecampus;

CREATE TABLE tipoactor (
    id INT PRIMARY KEY AUTO_increment,
    descripcion VARCHAR(50)
);

CREATE TABLE  genero(
    id INT PRIMARY KEY AUTO_increment,
    descripcion VARCHAR(50)
);


CREATE TABLE pais(
    id INT PRIMARY KEY AUTO_increment,
    descripcion VARCHAR(50)
);

CREATE TABLE formato (
    id INT PRIMARY KEY AUTO_increment, 
    descripcion VARCHAR(50)
);

CREATE TABLE pelicula (
    id int AUTO_increment PRIMARY Key,
    contenido VARCHAR(5),
    nombre VARCHAR (50),
    duracion VARCHAR(50),
    sinopsis TEXT
);

CREATE TABLE pelicula_formato (
    idpelicula INT,
    idformato INT,
    cantidad INT,
    CONSTRAINT fk_idpelicula_formato FOREIGN KEY (idpelicula) REFERENCES pelicula(id),
    CONSTRAINT fk_idformato_pelicula FOREIGN KEY (idformato) REFERENCES formato(id)
);


CREATE TABLE actor(
    id INT PRIMARY KEY,
    nombre VARCHAR(50),
    idnacionalidad INT,
    edad INT,
    idgenero INT,
    CONSTRAINT FK_idnacionalidad FOREIGN KEY (idnacionalidad) REFERENCES pais(id),
    CONSTRAINT FK_idgenero FOREIGN KEY (idgenero) REFERENCES genero(id)
);


CREATE TABLE peliculacategoria(
    idpelicula INT,
    idprotagonista INT,
    idtipoactor INT,
    CONSTRAINT FK_idpelicula FOREIGN KEY (idpelicula) REFERENCES pelicula(id),
    CONSTRAINT FK_idprotagonista FOREIGN KEY (idprotagonista) REFERENCES actor(id),
    CONSTRAINT FK_idtipoactor FOREIGN KEY (idtipoactor) REFERENCES tipoactor(id)
);











