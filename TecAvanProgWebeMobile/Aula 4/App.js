// Importa o framework Express para criação de servidor web
const express = require("express");
const app = express(); // Inicializa uma instância do Express

// Importa e configura o mecanismo de template Handlebars
const handlebars = require("express-handlebars").engine;


// Importa o middleware 'body-parser' para interpretar dados enviados via formulários
const bodyParser = require("body-parser");

// Importa o modelo 'post' que representa a tabela de agendamentos no banco de dados
const post = require("./models/post");

// Importa o objeto 'handlebars' para que seja possível registrar helpers personalizados usados nas views
const handlebarsHelper = require("handlebars");

// Configura o motor de templates com o layout padrão "main"
app.engine("handlebars", handlebars({ defaultLayout: "main" }));
app.set("view engine", "handlebars"); // Define Handlebars como view engine

// Middleware para permitir leitura de dados enviados por formulário
app.use(bodyParser.urlencoded({ extended: false }));
// Middleware para permitir leitura de dados no formato JSON
app.use(bodyParser.json());

// Rota inicial que renderiza a página principal
app.get("/", function (req, res) {
  res.render("primeira_pagina");
});

// Rota para consulta de todos os agendamentos salvos
app.get("/consulta", async function (req, res) {
  try {
    const agendamentos = await post.findAll(); // Busca todos os registros no banco
    res.render("segunda_pagina", {
      agendamentos: agendamentos.map((a) => a.toJSON()), // Converte cada registro para JSON para usar na view
    });
  } catch (error) {
    res.send("Erro ao buscar agendamentos: " + error);
  }
});

// Rota para carregar os dados de um agendamento específico e permitir edição
app.get("/editar/:id", async function (req, res) {
  try {
    const agendamento = await post.findByPk(req.params.id); // Busca o agendamento pelo ID
    if (!agendamento) {
      return res.send("Agendamento não encontrado.");
    }
    res.render("editar_pagina", { agendamento: agendamento.toJSON() });
  } catch (error) {
    res.send("Erro ao buscar agendamento: " + error);
  }
});

// Rota para atualizar um agendamento com base no ID
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
        where: { id: req.params.id }, // Define qual registro será atualizado
      }
    );
    res.redirect("/consulta"); // Redireciona para página de consulta após atualização
  } catch (error) {
    res.send("Erro ao atualizar agendamento: " + error);
  }
});

// Rota para excluir um agendamento com base no ID
app.get("/excluir/:id", async function (req, res) {
  try {
    await post.destroy({
      where: { id: req.params.id },
    });
    res.redirect("/consulta"); // Redireciona após exclusão
  } catch (error) {
    res.send("Erro ao excluir agendamento: " + error);
  }
});

// Registro de um helper personalizado no Handlebars para comparar valores
handlebarsHelper.registerHelper("eq", function (a, b) {
  return a === b;
});

// Rota para cadastrar um novo agendamento
app.post("/cadastrar", function (req, res) {
  post
    .create({
      nome: req.body.nome,
      telefone: req.body.telefone,
      origem: req.body.origem,
      data_contato: req.body.data_contato,
      observacao: req.body.observacao,
    })
    .then(function () {
      res.redirect("/"); // Redireciona após cadastro com sucesso
    })
    .catch(function (erro) {
      res.send("Erro ao criar post: " + erro);
    });
});

// Inicializa o servidor na porta 8081
app.listen(8081, function () {
  console.log("Servidor ativo!");
});
