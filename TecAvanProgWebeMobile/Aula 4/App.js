const express = require('express')
const app = express()
const handlebars = require("express-handlebars").engine
const bodyParser = require('body-parser')
const post = require('./models/post')
const handlebarsHelper = require("handlebars");

app.engine("handlebars", handlebars({ defaultLayout: "main" }))
app.set("view engine", "handlebars")

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

app.get("/", function (req, res) {
    res.render("primeira_pagina")
})

app.get("/consulta", async function (req, res) {
    try {
        const agendamentos = await post.findAll();
        res.render("segunda_pagina", { agendamentos: agendamentos.map(a => a.toJSON()) });
    } catch (error) {
        res.send("Erro ao buscar agendamentos: " + error);
    }
});


app.get("/editar/:id", async function (req, res) {
    try {
        const agendamento = await post.findByPk(req.params.id);
        if (!agendamento) {
            return res.send("Agendamento não encontrado.");
        }
        res.render("editar_pagina", { agendamento: agendamento.toJSON() });
    } catch (error) {
        res.send("Erro ao buscar agendamento: " + error);
    }
});

app.post("/editar/:id", async function (req, res) {
    try {
        await post.update(
            {
                nome: req.body.nome,
                telefone: req.body.telefone,
                origem: req.body.origem,
                data_contato: req.body.data_contato,
                observacao: req.body.observacao,
            },
            {
                where: { id: req.params.id }
            }
        );
        res.redirect("/consulta");
    } catch (error) {
        res.send("Erro ao atualizar agendamento: " + error);
    }
});

app.get("/excluir/:id", async function (req, res) {
    try {
        await post.destroy({
            where: { id: req.params.id }
        });
        res.redirect("/consulta");
    } catch (error) {
        res.send("Erro ao excluir agendamento: " + error);
    }
});


handlebarsHelper.registerHelper("eq", function (a, b) {
    return a === b;
});


app.post("/cadastrar", function (req, res) {
    post.create({
        nome: req.body.nome,
        telefone: req.body.telefone,
        origem: req.body.origem,
        data_contato: req.body.data_contato,
        observacao: req.body.observacao,
    }).then(function () {
        res.redirect('/')

    }).catch(function (erro) {
        res.send('Erro ao criar post: ' + erro)
    })
})

app.listen(8081, function () {
    console.log("Servidor ativo!")
}) 