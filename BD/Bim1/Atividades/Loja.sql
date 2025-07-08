CREATE DATABASE IF NOT EXISTS Loja;
USE Loja;

CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    email VARCHAR(50),
    cidade VARCHAR(50)
);

CREATE TABLE forma_pagto (
    nome VARCHAR(50)
);

INSERT INTO Clientes (nome, email, cidade)
VALUES
    ('Ana Silva', 'ana@email.com', 'sao paulo'),
    ('Carlos Sousa', 'carlos@email.com', 'campinas'),
    ('Joana Lima', 'carlos@email.com', 'rio de janeiro'),
    ('Pedro Alves', 'carlos@email.com', 'ceara');

INSERT INTO forma_pagto (nome)
VALUES
    ('pix'),
    ('cartao credito'),
    ('boleto'),
    ('ted');

UPDATE Clientes
SET Cidade = 'Santos'
WHERE Nome = 'Joana Lima';

DELETE FROM Clientes WHERE id = 2;

ALTER TABLE Clientes
ADD Telefone VARCHAR(20);

ALTER TABLE Clientes
MODIFY Cidade VARCHAR(100);

ALTER TABLE Clientes
RENAME COLUMN Email TO Email_Contato;

ALTER TABLE Clientes
DROP COLUMN Telefone;

SELECT
    Clientes.nome AS "nome_cliente",
    forma_pagto.nome AS "nome_formaPagamento"
FROM
    Clientes
CROSS JOIN
    forma_pagto;