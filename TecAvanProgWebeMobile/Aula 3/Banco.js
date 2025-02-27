// Configuração do Sequelize para conexão com o banco de dados
const Sequelize = require("sequelize");
const sequelize = new Sequelize("exemplo", "root", "", {
  // Informa qual o tipo de banco de dados que será utilizado
  host: "localhost",
  dialect: "mysql",
});

// Testando a conexão com o banco de dados
/*sequelize
  .authenticate()
  .then(function () {
    console.log("Conexão com o banco de dados realizada com sucesso!");
  })
  .catch(function (erro) {
    console.log("Erro ao tentar conectar com o banco de dados: " + erro);
  });
*/

// Criação das tabelas no banco de dados
const Agendamentos = sequelize.define("agendamentos", {
  nome: {
    type: Sequelize.STRING,
  },
  email: {
    type: Sequelize.STRING,
  },
  telefone: {
    type: Sequelize.STRING,
  },
  cpf: {
    type: Sequelize.STRING,
  },
  data: {
    type: Sequelize.STRING,
  },
  hora: {
    type: Sequelize.STRING,
  },
});

// Sincronização das tabelas no banco de dados
// "force: true" força a criação da tabela
// Agendamentos.sync({ force: true });

// Inserção de dados na tabela
Agendamentos.create({
  nome: "Matheus Romano",
  email: "teste@gmail.com",
  telefone: "1123456789",
  cpf: "12345678900",
  data: "2025-02-27",
  hora: "20:38",
});
