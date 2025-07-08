-- Cria o usuário 'jose' com a senha 'Jose@2024', permitindo acesso apenas local (localhost)
CREATE USER 'jose'@'localhost' IDENTIFIED BY 'Jose@2024';

-- Concede ao usuário 'jose' permissão para selecionar (SELECT) e inserir (INSERT) dados
-- na tabela 'produtos' do banco de dados 'estoque'
GRANT SELECT, INSERT ON estoque.produtos TO 'jose'@'localhost';

-- Exibe os privilégios atuais atribuídos ao usuário 'jose'
SHOW GRANTS FOR 'jose'@'localhost';

-- Remove a permissão de inserção (INSERT) da tabela 'produtos' para o usuário 'jose'
REVOKE INSERT ON estoque.produtos FROM 'jose'@'localhost';

-- Concede todos os privilégios (leitura, escrita, alteração, etc.)
-- em todas as tabelas do banco 'estoque' para o usuário 'jose'
GRANT ALL PRIVILEGES ON estoque.* TO 'jose'@'localhost';

-- Concede todos os privilégios e também a permissão para que 'jose' repasse esses privilégios para outros usuários
GRANT ALL PRIVILEGES ON estoque.* TO 'jose'@'localhost' WITH GRANT OPTION;

-- Revoga todos os privilégios que o usuário 'jose' tem no banco 'estoque'
REVOKE ALL PRIVILEGES ON estoque.* FROM 'jose'@'localhost';

-- Exclui o usuário 'jose' do MySQL
DROP USER 'jose'@'localhost';
