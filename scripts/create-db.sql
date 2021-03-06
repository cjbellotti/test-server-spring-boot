CREATE TABLE TIPOS_DOCUMENTO (
	ID INT PRIMARY KEY AUTO_INCREMENT,
	CODIGO VARCHAR(5) NOT NULL,
	DESCRIPCION VARCHAR(50) NOT NULL,
	CONSTRAINT UNIQUE INDEX TIPOS_DOCUMENTO_CODIGO_IDX (CODIGO)
);

CREATE TABLE CLIENTES (
	ID INT PRIMARY KEY AUTO_INCREMENT,
	NOMBRE VARCHAR(100) NOT NULL,
	APELLIDO VARCHAR(100) NOT NULL,
	FECHA_NAC DATE NOT NULL,
	TIPO_DOCUMENTO_ID INT NOT NULL,
	NRO_DOCUMENTO INT NOT NULL,
	FOREIGN KEY (TIPO_DOCUMENTO_ID) REFERENCES TIPOS_DOCUMENTO(ID)
);