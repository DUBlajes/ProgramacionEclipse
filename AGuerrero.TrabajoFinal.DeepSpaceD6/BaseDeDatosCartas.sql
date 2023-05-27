CREATE DATABASE DeepSpaceD6;

CREATE TABLE Amenazas (
    Nombre varchar(50),
    ValorAmenaza int,
    DadoActivacion int,
    AccionQueRealiza int,
    InternaOExterna boolean
);

ALTER TABLE Amenazas
ADD ID int NOT NULL AUTO_INCREMENT PRIMARY KEY;

INSERT INTO Amenazas (Nombre,ValorAmenaza,DadoActivacion,AccionQueRealiza,InternaOExterna,NumeroCartas,DadoDesactivacion)VALUES (

'Alzamiento de los robots',0,2,4,0,1,5);


CREATE TABLE AccionQueRealiza (
	ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Funcion varchar(50)
);

INSERT INTO AccionQueRealiza
VALUES ('Ignorar escudos (ataca directamente al casco)','Destruir escudo','Enviar a enfermeria','Tirar dado amenaza','Amenazas externas recuperan 1 nivel','Devolver dado bloqueado','No asignar','No ocurre nada');