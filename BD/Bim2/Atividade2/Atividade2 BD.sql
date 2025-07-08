-- Criar usuário
CREATE USER 'teste'@'localhost' IDENTIFIED BY 'Teste@123';

-- Alterar a senha do usuário
ALTER USER 'teste'@'localhost' IDENTIFIED BY 'NovaSenha@2024';

-- Expirar a senha após 45 dias
ALTER USER 'teste'@'localhost' PASSWORD EXPIRE INTERVAL 45 DAY;

-- Bloquear o usuário
ALTER USER 'teste'@'localhost' ACCOUNT LOCK;

-- Renomeia o usuário
RENAME USER 'teste'@'localhost' TO 'teste_seguro'@'localhost';

-- Excluir o usuário
DROP USER 'teste_seguro'@'localhost';