CREATE DATABASE DeepSpaceD6;

CREATE TABLE Amenazas (
    Nombre varchar(50),
    ValorAmenaza int,
    DadoActivacion int,
    AccionQueRealiza int,
    InternaOExterna boolean
);

ALTER TABLE Amenazas
ADD NumeroCartas int,
ADD DadoDesactivacion int;

INSERT INTO Amenazas
VALUES (value1, value2, value3, ...);