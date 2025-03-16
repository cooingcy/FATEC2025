const db = require('./Banco')

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

// Agendamentos.sync({focus: true})

// module.exports = Agendamentos