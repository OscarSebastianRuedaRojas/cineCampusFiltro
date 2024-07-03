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
    codinterno VARCHAR(5),
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
    id INT PRIMARY KEY AUTO_increment,
    nombre VARCHAR(50),
    idnacionalidad INT,
    edad INT,
    idgenero INT,
    CONSTRAINT FK_idnacionalidad FOREIGN KEY (idnacionalidad) REFERENCES pais(id),
    CONSTRAINT FK_idgenero FOREIGN KEY (idgenero) REFERENCES genero(id)
);


CREATE TABLE peliculaprotagonista(
    idpelicula INT,
    idprotagonista INT,
    idtipoactor INT,
    CONSTRAINT FK_idpelicula FOREIGN KEY (idpelicula) REFERENCES pelicula(id),
    CONSTRAINT FK_idprotagonista FOREIGN KEY (idprotagonista) REFERENCES actor(id),
    CONSTRAINT FK_idtipoactor FOREIGN KEY (idtipoactor) REFERENCES tipoactor(id)
);


INSERT INTO formato(descripcion) VALUES("3D");
INSERT INTO formato(descripcion) VALUES("2D");

INSERT INTO pelicula(contenido,nombre,duracion,sinopsis) VALUES("CONT1 ","Vengadores","1HR","sinopsis Pelicula Vengadores");
INSERT INTO pelicula(contenido,nombre,duracion,sinopsis) VALUES("CONT2 ","Vengadores2","3HR","sinopsis Pelicula Vengadores2");

INSERT INTO pelicula_formato(idpelicula,idformato,cantidad)VALUES (1,1,3);
INSERT INTO pelicula_formato(idpelicula,idformato,cantidad)VALUES (2,2,6);


INSERT INTO pais(descripcion) VALUES ("Colombia");
INSERT INTO pais(descripcion) VALUES ("Panama");
INSERT INTO pais(descripcion) VALUES ("Chile");


INSERT INTO genero(descripcion) VALUES ("Terror");
INSERT INTO genero(descripcion) VALUES ("Accion");
INSERT INTO genero(descripcion) VALUES ("Comedia");


INSERT INTO actor(nombre,idnacionalidad,edad,idgenero) VALUES("PEPE",1,25,1);
INSERT INTO actor(nombre,idnacionalidad,edad,idgenero) VALUES("PEPEs",3,30,2);
INSERT INTO actor(nombre,idnacionalidad,edad,idgenero) VALUES("PEPEd",2,50,3);


INSERT INTO tipoactor(descripcion) VALUES ("extras");
INSERT INTO tipoactor(descripcion) VALUES ("doble");
INSERT INTO tipoactor(descripcion) VALUES ("principal");


INSERT INTO peliculaprotagonista (idpelicula,idprotagonista,idtipoactor) VALUES (1,1,1);
INSERT INTO peliculaprotagonista (idpelicula,idprotagonista,idtipoactor) VALUES (1,2,3);
INSERT INTO peliculaprotagonista (idpelicula,idprotagonista,idtipoactor) VALUES (1,3,2);

