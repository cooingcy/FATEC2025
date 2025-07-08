-- 1. CRIAR O BANCO DE DADOS
CREATE DATABASE IF NOT EXISTS comercio_digital;
USE comercio_digital;

-- 2. CRIAR AS TABELAS
CREATE TABLE clientes (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  email VARCHAR(100),
  cidade VARCHAR(100),
  estado CHAR(2),
  INDEX idx_cidade (cidade),
  INDEX idx_nome (nome)
);

CREATE TABLE produtos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  descricao TEXT,
  preco DECIMAL(10,2),
  categoria VARCHAR(50),
  FULLTEXT INDEX idx_descricao (descricao),
  INDEX idx_categoria (categoria)
);

CREATE TABLE pedidos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  cliente_id INT,
  data_pedido DATE,
  FOREIGN KEY (cliente_id) REFERENCES clientes(id),
  INDEX idx_cliente (cliente_id),
  INDEX idx_data_pedido (data_pedido)
);

CREATE TABLE itens_pedido (
  id INT AUTO_INCREMENT PRIMARY KEY,
  pedido_id INT,
  produto_id INT,
  quantidade INT,
  valor_unitario DECIMAL(10,2),
  FOREIGN KEY (pedido_id) REFERENCES pedidos(id),
  FOREIGN KEY (produto_id) REFERENCES produtos(id),
  INDEX idx_pedido (pedido_id),
  INDEX idx_produto (produto_id)
);

-- 3. INSERÇÃO DOS DADOS
INSERT INTO clientes (nome, email, cidade, estado) VALUES
('Joana Lopes', 'joana@gmail.com', 'São Paulo', 'SP'),
('Carlos Silva', 'carlos@gmail.com', 'Curitiba', 'PR'),
('Maria Dias', 'maria@gmail.com', 'Rio de Janeiro', 'RJ'),
('Pedro Alves', 'pedro@gmail.com', 'Belo Horizonte', 'MG'),
('Ana Costa', 'ana@gmail.com', 'Porto Alegre', 'RS'),
('Lucas Mendes', 'lucas@gmail.com', 'Salvador', 'BA'),
('Fernanda Lima', 'fernanda@gmail.com', 'Fortaleza', 'CE'),
('Rafael Torres', 'rafael@gmail.com', 'Manaus', 'AM'),
('Camila Rocha', 'camila@gmail.com', 'Recife', 'PE'),
('Bruno Souza', 'bruno@gmail.com', 'São Paulo', 'SP');

INSERT INTO produtos (nome, descricao, preco, categoria) VALUES
('Notebook', 'Notebook com processador Intel i7', 3500.00, 'Informática'),
('Smartphone', 'Smartphone com câmera de 108MP', 2200.00, 'Eletrônicos'),
('Impressora', 'Impressora multifuncional HP', 800.00, 'Informática'),
('Cadeira Gamer', 'Cadeira ergonómica para jogos', 1200.00, 'Móveis'),
('Monitor', 'Monitor LED 27 polegadas', 1100.00, 'Informática'),
('Mouse Gamer', 'Mouse com DPI ajustável', 150.00, 'Informática'),
('Teclado Mecânico', 'Teclado com switches azuis', 300.00, 'Informática'),
('Caixa de Som', 'Caixa de som Bluetooth', 250.00, 'Eletrônicos'),
('Webcam HD', 'Webcam com microfone embutido', 200.00, 'Informática'),
('HD Externo', 'HD externo 1TB USB 3.0', 400.00, 'Informática');

INSERT INTO pedidos (cliente_id, data_pedido) VALUES
(1, '2023-01-10'), (2, '2023-02-12'), (3, '2023-03-15'),
(4, '2023-03-20'), (5, '2023-04-18'), (6, '2023-04-25'),
(7, '2023-05-02'), (8, '2023-05-10'), (9, '2023-06-01'),
(10, '2023-06-05');

INSERT INTO itens_pedido (pedido_id, produto_id, quantidade, valor_unitario) VALUES
(1, 1, 1, 3500.00), (2, 2, 2, 2200.00), (3, 3, 1, 800.00),
(4, 4, 1, 1200.00), (5, 5, 1, 1100.00), (6, 6, 2, 150.00),
(7, 7, 1, 300.00), (8, 8, 1, 250.00), (9, 9, 1, 200.00),
(10, 10, 1, 400.00);

-- 4. CONSULTAS DE EXEMPLO COM COMENTÁRIOS
-- Buscar todos os pedidos de um cliente específico
-- Índice idx_cliente otimiza busca por cliente_id em pedidos
EXPLAIN SELECT * FROM pedidos WHERE cliente_id = 1;

-- Buscar produtos por categoria (FULLTEXT em descricao + Índice em categoria)
-- FULLTEXT idx_descricao otimiza busca textual na descrição do produto
-- Índice idx_categoria otimiza filtro pela categoria dos produtos
EXPLAIN SELECT * FROM produtos WHERE MATCH(descricao) AGAINST('Intel');
EXPLAIN SELECT * FROM produtos WHERE categoria = 'Informática';

-- Relatório de pedidos por faixa de datas
-- Índice idx_data_pedido otimiza consulta por intervalo de datas
EXPLAIN SELECT * FROM pedidos WHERE data_pedido BETWEEN '2023-01-01' AND '2023-06-30';

-- 5. MANUTENÇÃO DE TABELAS
ANALYZE TABLE clientes;
OPTIMIZE TABLE produtos;

-- 6. PARTICIONAMENTO POR ANO
CREATE TABLE pedidos_particionados (
  id INT NOT NULL,
  cliente_id INT,
  data_pedido DATE NOT NULL,
  ano INT NOT NULL,
  PRIMARY KEY (id, ano)
)
PARTITION BY RANGE (ano) (
  PARTITION p2022 VALUES LESS THAN (2023),
  PARTITION p2023 VALUES LESS THAN (2024),
  PARTITION p2024 VALUES LESS THAN (2025),
  PARTITION pFuturo VALUES LESS THAN MAXVALUE
);

-- 7. CONSULTA USANDO EXPLAIN PARTITIONS
EXPLAIN PARTITIONS
SELECT * FROM pedidos_particionados
WHERE ano BETWEEN 2023 AND 2023;
