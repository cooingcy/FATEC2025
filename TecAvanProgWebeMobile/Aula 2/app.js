// Importação do modulo express
const express = require('express');
// Carrega o modulo
const app = express();

app.get("/", function (req, res) {
    res.sendFile(__dirname + "/html/index.html")
})

app.get("/produtos/:item/:qnt", function (req, res) {
    res.send("Item: " + req.params.item + "<br>Quantidade: " + req.params.qnt)
})

app.listen(8081, function () {
    console.log("Servidor Rodando na porta 8081")
})

/*
// Contruir o servidor
app.listen(8081, function () {
    console.log('Servidor rodando na porta 8081')
)}*/
