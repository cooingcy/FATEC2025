const express = require("express");
const app = express();
const handlebars = require("express-handlebars").engine;
const bodyParser = require('body-parser');
const post = require('./models/post')

app.engine('handlebars', handlebars({ defaultLayout: "main" }));
app.set("view engine", "handlebars");

app.use(bodyParser.urlencoded({extended: false}))
app.use(bodyParser.json)

app.get("/", function(req, res) {
    res.render("primeira_pagina");
});

app.post("/cadastrar", function(req, res){
    post.create({
        nome: req.body.nome,
        telefone: req.body.telefone,
        origem: req.body.origem,
        data_cntt: req.body.data_cntt,
        observacao: req.body.observacao
    }).then(function(){
        res.redirect('/')
    }).catch(function(erro){
        res.send("Erro ao criar post: " + erro)
    })
})

app.listen(8081, function() {
    console.log("Servidor ativo!");
});
