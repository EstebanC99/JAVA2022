# CREACION DE BASE DE DATOS #
DROP DATABASE IF EXISTS javamarket;
CREATE DATABASE javamarket;
USE javamarket;

# CREACION DE TABLAS #
DROP TABLE IF EXISTS t_Producto;
CREATE TABLE t_Producto (
							ID_Producto INT NOT NULL PRIMARY KEY,
                            Nombre VARCHAR(50) NOT NULL,
                            Descripcion VARCHAR(100) NULL,
                            Precio DOUBLE NOT NULL,
                            Stock INT NOT NULL,
                            EnvioIncluido BOOLEAN NOT NULL DEFAULT FALSE
);

# INSERCION DE VALORES #
INSERT INTO t_Producto VALUES 
(1, 'Coca', 'Gaseosa refresco', 150.00, 5, 0),
(2, 'Arroz', 'Legumbres integrales', 80.00, 2, 0),
(3, 'Papas', 'Snack frito', 200.00, 10, 1);

