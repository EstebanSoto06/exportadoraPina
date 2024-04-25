CREATE DATABASE tresPatitosDB;

USE tresPatitosDB;

-- TABLA USUARIOS
CREATE TABLE usuarios (
	id INT IDENTITY(1,1) PRIMARY KEY,
	username NVARCHAR(25) not null UNIQUE,
	password NVARCHAR(25) not null,
	admin BIT
);

INSERT INTO usuarios (username, password, admin) VALUES ('admin', 'admin', 1);

SELECT * FROM usuarios

-- TABLA PROVEEDORES
CREATE TABLE proveedores (
	id INT IDENTITY(1,1) PRIMARY KEY,
	nombre NVARCHAR(50) not null UNIQUE,
	encargado NVARCHAR(50) not null,
	telefono NVARCHAR(25) not null,
	correo NVARCHAR(50) not null,
);

INSERT INTO proveedores (nombre, encargado, telefono, correo) VALUES ('LOS 3 PATITOS SA', 'Admin', '88888888', 'los3patitos@gmail.com');

SELECT * FROM proveedores

-- TABLA FINCAS
CREATE TABLE fincas (
	id INT IDENTITY(1,1) PRIMARY KEY,
	nombre NVARCHAR(50) not null UNIQUE,
	ubicacion NVARCHAR(50) not null,
	id_proveedor INT not null,
	FOREIGN KEY (id_proveedor) REFERENCES proveedores(id)
);

INSERT INTO fincas (nombre, ubicacion, id_proveedor) VALUES ('Finca 3 Patitos', 'Pital', 1);

SELECT * FROM fincas

SELECT f.id, f.nombre, f.ubicacion , p.nombre as 'Nombre Proveedor' FROM fincas f JOIN proveedores p ON f.id_proveedor = p.id;

-- TABLA TIPOS
CREATE TABLE tipos (
	id INT IDENTITY(1,1) PRIMARY KEY,
	categoria NVARCHAR(50) not null UNIQUE
);

INSERT INTO tipos (categoria) VALUES ('Primera');

SELECT * FROM tipos

-- TABLA VARIEDADES
CREATE TABLE variedades (
	id INT IDENTITY(1,1) PRIMARY KEY,
	nombre NVARCHAR(50) not null UNIQUE,
	caracteristicas NVARCHAR(250) not null
);

INSERT INTO variedades (nombre, caracteristicas) VALUES ('MD2 GOLDEN', 'Es un híbrido. Exquisito sabor. Forma muy simétrica y uniforme. Color dorado en su corteza externa.');

SELECT * FROM variedades

/* Variedades y sus características:
PEROLERA: Variedad colombiana. Ausencia total de espinas. Ápice agudo y resistente. Color de hoja verde oscuro con una tonalidad plomiza. 
MANZANA: Posiblemente una mutación. No presenta espinas. Fruto color rojo intenso. Número alto de bulbillos en la corona. 
CAYENA LISA: Variedad más cultivada. Algunas espinas en la base y la parte superior de la hoja. Ápice suave y se dobla a la menor presión. Fruto amarillo oro. Presenta corona sencilla.
PIAMBA: Conocida como "Castilla". Plantas vigorosas. Sin espinas en los bordes. Corona única. No presenta colinos basales. Pulpa color blanco y dulce.
DE AGUA: Se conoce como Cambray. Hojas espinozas. Fruto grande. Forma cónica. Bajo porcentaje de azúcares y acidez.
MD2 GOLDEN: Es un híbrido. Exquisito sabor. Forma muy simétrica y uniforme. Color dorado en su corteza externa.
*/

-- TABLA BOLETAS
CREATE TABLE boletas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_proveedor INT NOT NULL FOREIGN KEY (id_proveedor) REFERENCES proveedores(id),
    id_finca INT NOT NULL FOREIGN KEY (id_finca) REFERENCES fincas(id),
    lote NVARCHAR(50) NOT NULL,
    bloque NVARCHAR(50) NOT NULL,
    numeroBinA NVARCHAR(50) NOT NULL,
    cantidadFrutaBinA INT NOT NULL,
    numeroBinB NVARCHAR(50) NOT NULL,
    cantidadFrutaBinB INT NOT NULL,
    placaCamion NVARCHAR(20) NOT NULL,
    fecha NVARCHAR(30) NOT NULL,
    consecutivo NVARCHAR(20) NOT NULL,
    id_tipoFruto INT NOT NULL FOREIGN KEY (id_tipoFruto) REFERENCES tipos(id)
);

INSERT INTO boletas (id_proveedor, id_finca, lote, bloque, numeroBinA, cantidadFrutaBinA, numeroBinB, cantidadFrutaBinB, placaCamion, fecha, consecutivo, id_tipoFruto) VALUES (1, 1, 'Lote1', 'Bloque1', 'BinA', 760, 'BinB', 840, 'ABC123', '11:49 2024-04-18', 'BC 100', 1);

SELECT * FROM boletas

SELECT b.id, p.nombre, f.nombre, b.lote, b.bloque, b.numeroBinA, b.cantidadFrutaBinA, b.numeroBinB, b.cantidadFrutaBinB, b.placaCamion, b.fecha, b.consecutivo, t.categoria FROM boletas b INNER JOIN proveedores p ON b.id_proveedor = p.id INNER JOIN fincas f ON b.id_finca = f.id INNER JOIN tipos t ON b.id_tipoFruto = t.id

-- TABLA INMERSIONES
CREATE TABLE inmersiones (
	id INT IDENTITY(1,1) PRIMARY KEY,
	numeroBin NVARCHAR(50) NOT NULL,
	fecha NVARCHAR(50) NOT NULL
)

INSERT INTO inmersiones (numeroBin, fecha) VALUES ('456 581', '16:02 18/04/2024')

SELECT * FROM inmersiones

-- TABLA EMPAQUES
CREATE TABLE empaques (
	id INT IDENTITY(1,1) PRIMARY KEY,
	cantidadCajasT4 INT NOT NULL,
	cantidadCajasT5 INT NOT NULL,
	cantidadCajasT6 INT NOT NULL,
	cantidadCajasT7 INT NOT NULL,
	cantidadCajasT8 INT NOT NULL,
	cantidadCajasT9 INT NOT NULL,
	cantidadCajasT10 INT NOT NULL,
	totalCajas INT NOT NULL,
	fechaEmpaque NVARCHAR(50) NOT NULL
);

INSERT INTO empaques (cantidadCajasT4, cantidadCajasT5, cantidadCajasT6, cantidadCajasT7, cantidadCajasT8, cantidadCajasT9, cantidadCajasT10, totalCajas, fechaEmpaque) VALUES (5, 5, 5, 5, 5, 5, 5, 35, '16:02 18/04/2024') 

SELECT * FROM empaques;

-- TABLA PALLETS
CREATE TABLE pallets (
	id INT IDENTITY(1,1) PRIMARY KEY,
	grupo1Empaque INT FOREIGN KEY REFERENCES empaques(id),
	grupo2Empaque INT FOREIGN KEY REFERENCES empaques(id),
	grupo3Empaque INT FOREIGN KEY REFERENCES empaques(id),
	fechaEmpaque NVARCHAR(50) NOT NULL
)

INSERT INTO pallets (grupo1Empaque, grupo2Empaque, grupo3Empaque, fechaEmpaque) VALUES (1, null, null, '16:02 18/04/2024')

SELECT * FROM pallets
