var http = require('http');

http.createServer(function(req, res){
    res.end("Mensagem direction");
}).listen(8081);

console.log("Servidor esta aberto");