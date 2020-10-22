CREATE TABLE Usuario (
	idUsuario int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	tipo int NOT NULL,
	nombre varchar(30) NOT NULL,
	apellido varchar(30) NOT NULL,
	correo varchar(60) NOT NULL UNIQUE,
	contrasena varchar(30) NOT NULL,
	username varchar(30) NOT NULL,
	creditos int NOT NULL
);


CREATE TABLE Deporte (
	idDeporte int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	nombre varchar(20) NOT NULL UNIQUE
);


CREATE TABLE Equipo (
	idEquipo int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	nombre varchar(60) NOT NULL UNIQUE,
	pais varchar(40) NOT NULL,
	idDeporte int FOREIGN KEY REFERENCES Deporte(idDeporte)
);


CREATE TABLE Partido (
	idPartido int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	idEquipoA int FOREIGN KEY REFERENCES Equipo(idEquipo),
	idEquipoB int FOREIGN KEY REFERENCES Equipo(idEquipo),
	puntuacionA int NOT NULL,
	puntuacionB int NOT NULL,
	multiplicadorA float NOT NULL,
	multiplicadorB float NOT NULL,
	fechaInicio datetime NOT NULL,
	fechaFin datetime NOT NULL,
	tipoResultado int NOT NULL,
	idDeporte int FOREIGN KEY REFERENCES Deporte(idDeporte)
);  


CREATE TABLE Apuesta (
	idApuesta int IDENTITY(1,1) NOT NULL PRIMARY KEY,
	idUsuario int FOREIGN KEY REFERENCES Usuario(idUsuario),
	idPartido int FOREIGN KEY REFERENCES Partido(idPartido),
	idEquipo int FOREIGN KEY REFERENCES Equipo(idEquipo),
	apuesta int NOT NULL
);


INSERT INTO Deporte (nombre) VALUES ('Futbol Soccer');
INSERT INTO Deporte (nombre) VALUES ('Futbol Americano');
INSERT INTO Deporte (nombre) VALUES ('Boxeo');

INSERT INTO Usuario (tipo, nombre, apellido, correo, contrasena, username, creditos)
	VALUES(1, 'ADMIN', 'ADMIN', 'admin', 'password', 'admin', 9999999);

