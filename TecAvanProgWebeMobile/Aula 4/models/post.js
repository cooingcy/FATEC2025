// Cria uma const para o banco de dados
const db = require('./Banco')

// Define o modelo Agendamentos com os campos e tipos de dados
const Agendamentos = db.sequelize.define('agendamentos', {
    nome:{
        type: db.Sequelize.STRING
    },
    telefone:{
        type: db.Sequelize.STRING
    },
    origem:{
        type: db.Sequelize.STRING
    },
    data_cntt:{
        type: db.Sequelize.DATE
    },
    observacao:{
        type: db.Sequelize.TEXT
    }
})

// Sincroniza o modelo com o banco de dados, criando a tabela se não existir
// Agendamentos.sync({focus: true})

// Exporta o modelo Agendamentos
module.exports = Agendamentos