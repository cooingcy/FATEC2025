create Database Lojinha;
use Lojinha;

create table Clientes (
		ID_Cli int identity primary key,
		Nome varchar(50),
		Email varchar(50),
		Cidade varchar(50)
)


INSERT INTO Clientes (Nome, Email, Cidade)
VALUES ('Alex', 'therunner@gmail.com', 'São-Paulo');

Select * from Clientes

ALTER TABLE Clientes
ADD Telefone VARCHAR(20);


UPDATE Clientes
set
 Telefone = '11-93913921'
 Where ID_Cli = 1;

 create table AmigosOruam (
	Oruam_ID INT PRIMARY KEY,

)