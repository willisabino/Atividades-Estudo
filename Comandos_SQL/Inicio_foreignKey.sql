create database db_escola;
use db_escola;

create table tb_aluno(
	id_aluno bigint auto_increment,
    nome varchar(50) not null,
    nascimento date,
    primary key(id_aluno)
);

create table tb_curso(
	id_curso bigint auto_increment,
    nome varchar(50) not null unique,
    ano date,
    primary key(id_curso)
);

insert into tb_aluno values
	(default, 'Willi' , '1995-07-22', '2'),
    (default, 'Ramon' , '1995-07-24', '1'),
    (default, 'Sabino' , '1990-08-05', '1');
    
insert into tb_curso values
	(default, 'Inglês' , '1995-07-22'),
    (default, 'Portugues' , '1995-07-22'),
    (default, 'Matematica' , '1995-07-22');

/*Vou chamar de relacionamento 1:n
Onde um aluno prefere um curso e um curso pode ser preferido por vários alunos*/

desc tb_curso;
select * from tb_curso;
desc tb_aluno;	
select * from tb_aluno;

alter table tb_aluno
add column curso_preferido bigint;

alter table tb_aluno
add foreign key (curso_preferido)
references tb_curso(id_curso);


update tb_aluno
set curso_preferido = '3'
where id_aluno = '1';