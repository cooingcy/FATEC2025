// Importa o pacote Sequelize
const Sequelize = require("sequelize");

// Cria uma instância do Sequelize configurada para se conectar ao banco de dados
const sequelize = new Sequelize('projetoweb', 'root', '', {
    host: 'localhost',   // Endereço do servidor do banco de dados
    dialect: 'mysql'     // Tipo de banco de dados
});

// Exporta o objeto com duas propriedades:
// - Sequelize: a biblioteca Sequelize em si
// - sequelize: a instância de conexão configurada
module.exports = {
    Sequelize: Sequelize,
    sequelize: sequelize
};
