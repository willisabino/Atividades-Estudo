create database db_funcionario;
use db_funcionario;

create table tb_pessoa(
	cpf bigint	not null,
	nome varchar(30) not null,
	nascimento date,
    cargo varchar(30) not null,
    salario decimal(5,2),
    primary key(cpf)
);

insert into tb_pessoa values
	('123456789', 'Willi' , '1995-07-22', 'Função x', '100.50'),
    ('234567891', 'Ramon' , '1995-07-24', 'Função y', '150.60'),
    ('345678912', 'Sabino' , '1990-08-05', 'Função z', '200.9');
    
    select * from tb_pessoas;
    
    select cpf from tb_pessoas;
    
    select cpf, nome from tb_pessoas;
    
    select * from tb_pessoas where salario > '2000' and salario < '3000';
    
    /*Alterando minha tabela*/
    
/*Adicionando tabela*/
alter table tb_pessoa
add column codigo int after cpf;
/*Para especificar a posição da minha nova tabela, uso: first, after*/

/*Removendo tabela*/
alter table tb_pessoa
drop column codigo;

	
	/*Alterando estrutura da minha tabela*/
    
alter table tb_pessoa
modify column salario decimal(10,2);



	/*Modificando nome da columa*/
    
alter table tb_pessoa
change column nascimento nasc date;

	
    /*Alterar o nome da tabela*/
    
alter table tb_pessoa
rename to tb_pessoas;

	
    /*Modificando um elemento da tabela*/
    
update tb_pessoas
set salario = '1000.50'
where cpf = '123456789';

update tb_pessoas
set salario = '2564.6'
where cpf = '234567891';

update tb_pessoas
set salario = '5000.50'
where cpf = '345678912';


	/*Apagar alguma linha/registro*/
delete from tb_pessoas
where cpf = 'xxxxxxxx';

	/*Para apagar todas as linhas*/
truncate table tb_pessoas;


	/*Caso esteja trabalhando com moedas, posso fazer a seguinte configuração*/
    
select nome, Concat('R$', Format(salario, 2, 'pt_BR'))
as salario from tb_pessoas;


