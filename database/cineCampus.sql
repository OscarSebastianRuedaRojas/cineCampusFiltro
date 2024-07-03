CREATE DATABASE cinecamapus;
USE cinecampus;

CREATE TABLE tipoactor (
id INT PRIMARY KEY,
descripcion VARHCAR(50));

CREATE TABLE peliculaprotagonista(
idpelicula INT,
idprotagonista INT,
idtipoactor INT
CONSTRAINT FK_idpelicula FOREING KEY (idpelicula) REFERENCES pelicula(id))
CONSTRAINT FK_idtipoactor FOREING KEY (idtipoactor) REFERENCES tipoactor(id);

CREATE TABLE actor(
id INT PRIMARY KEY,
nombre VARCHAR(50),
idnacionalidad INT,
edad INT,
idgenero INT
CONSTRAINT FK_idnacionalidad FOREING KEY ()REFERENCES actor(id))
CONSTRAINT FK_idgenero FOREING KEY(id) REFERENCES genero(id)
CONSTRAINT FK_idnacionalidad FOREING key (idnacionalidad) REFERENCES pais(id);

CREATE TABLE  genero(
id INT PRIMARY KEY,
descripcion VARHCAR(50));

CREATE TABLE pais(
id INT PRIMARY KEY,
descripcion VARCHAR(50)

);

CREATE TABLE pelicula (
contenido VARCHAR(5)
nombre VARCHAR (50)
duracion (50)
sinopsis TEXT
CONSTRAINT FK_id  FOREING KEY (id) REFERENCES peliculaprotagonista(idprotagonista));


CREATE TABLE peliculaformato (
idpelicula INT,
idformato INT,
cantidad INT
CONSTRAINT FK_idpelicula FOREING KEY (idpelicula) REFERENCES pelicula(id)); 


CREATE TABLE formato (
id INT,
descripcion VARCHAR(50)
CONTRAIN FK_id FOREING KEY (id) REFERENCES peliculaformato(idformato));





