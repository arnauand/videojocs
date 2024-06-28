DROP TABLE TIPUS_CONSOLA;

CREATE TABLE TIPUS_CONSOLA (
id INT AUTO_INCREMENT PRIMARY KEY,
descripcio VARCHAR(100) NOT NULL
);

DROP TABLE CONSOLA;

CREATE TABLE CONSOLA (
id INT AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(100) NOT NULL,
--idTipus_Consola INT,
--idHistoria_Context INT,
--idCreador INT,
--idFoto_Logo INT,
--idVideojoc INT,
id_empresa INT
);

DROP TABLE VIDEOJOC;

CREATE TABLE VIDEOJOC (
id INT AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(100) NOT NULL,
idHistoria_Context INT,
idFoto_Logo INT,
idCreador INT,
idConsola INT
);

DROP TABLE EMPRESA;

CREATE TABLE EMPRESA (
id INT AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(100) NOT NULL
--id_historia_context INT,
--id_creador INT,
--id_foto_logo INT,
--id_videojoc INT
);

DROP TABLE CREADOR;

CREATE TABLE CREADOR (
id INT AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR(100) NOT NULL,
data_naixement VARCHAR(100) NOT NULL,
idFoto_Logo INT,
idHistoria_Context INT
);

DROP TABLE HISTORIA_CONTEXT;

CREATE TABLE HISTORIA_CONTEXT (
id INT AUTO_INCREMENT PRIMARY KEY,
descripcio VARCHAR(100) NOT NULL
);

DROP TABLE FOTO_LOGO;

CREATE TABLE FOTO_LOGO (
id INT PRIMARY KEY AUTO_INCREMENT,
descripcio VARCHAR(255),
imatge BLOB
);

--INSERT INTO EMPRESA VALUES (1, 'Nintendo', 0, 1, 1, 1);
--INSERT INTO EMPRESA VALUES (2,'Sega', 0, 1, 1, 3);
--INSERT INTO EMPRESA VALUES (3, 'Microsoft', 0, 1, 1, 2);
--INSERT INTO EMPRESA VALUES (4, 'Sony', 0, 1, 1, 1);
--INSERT INTO EMPRESA VALUES (5, 'NEC', 0, 1, 1, 2);
--INSERT INTO EMPRESA VALUES (6, 'SNK', 0, 1, 1, 3);
--INSERT INTO EMPRESA VALUES (7, 'ATARI', 0, 1, 1, 2);
INSERT INTO EMPRESA VALUES (1, 'Nintendo');
INSERT INTO EMPRESA VALUES (2,'Sega');
INSERT INTO EMPRESA VALUES (3, 'Microsoft');
INSERT INTO EMPRESA VALUES (4, 'Sony');
INSERT INTO EMPRESA VALUES (5, 'NEC');
INSERT INTO EMPRESA VALUES (6, 'SNK');
INSERT INTO EMPRESA VALUES (7, 'ATARI');


INSERT INTO CONSOLA VALUES (1, 'DreamCast', 2);
INSERT INTO CONSOLA VALUES (2, 'Wii U', 1);
--INSERT INTO CONSOLA VALUES (1, 'DreamCast', 1, 0, 1, 1, 3, 2 );
--INSERT INTO CONSOLA VALUES (2, 'Wii U', 1, 0, 1, 1, 1, 1);
--INSERT INTO CONSOLA VALUES (3, 'Virtual Boy', 2, 0, 1, 1, 1, 1 );
--INSERT INTO CONSOLA VALUES (4, 'Zeebo', 1, 0, 1, 1, 3, 3);
--INSERT INTO CONSOLA VALUES (5, 'PC Engine', 1, 0, 1, 1, 2, 5 );
--INSERT INTO CONSOLA VALUES (6, 'Playstation', 1, 0, 1, 1, 2, 4 );
--INSERT INTO CONSOLA VALUES (7, 'Atari 2600', 1, 0, 1, 1, 2, 7 );
--INSERT INTO CONSOLA VALUES (8, 'XBOX', 1, 0, 1, 1, 2, 3 );
--INSERT INTO CONSOLA VALUES (9, 'Neo Geo', 1, 0, 1, 1, 2, 6 );
--INSERT INTO CONSOLA VALUES (10, 'Nintendo SWITCH', 3, 0, 1, 1, 1, 1 );

INSERT INTO TIPUS_CONSOLA VALUES (1, 'Sobremesa' );
INSERT INTO TIPUS_CONSOLA VALUES (2, 'Portatil' );
INSERT INTO TIPUS_CONSOLA VALUES (3, 'Hibrida' );

INSERT INTO VIDEOJOC VALUES (1, 'Super Mario Bros', 0, 1, 1, 10 );
INSERT INTO VIDEOJOC VALUES (2, 'Halo', 0, 1, 1, 8 );
INSERT INTO VIDEOJOC VALUES (3, 'Sonic The Hedgehog', 0, 1, 1, 1 );

INSERT INTO HISTORIA_CONTEXT VALUES (0, 'Sense informar' );

INSERT INTO CREADOR VALUES (1, 'sense informar', 'dd/mm/aa', 1, 0 );

INSERT INTO FOTO_LOGO VALUES (1, 'sense informar', null );