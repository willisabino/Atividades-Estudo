create database db_games_online;


create table tb_personagem(
id bigint auto_increment,
nome varchar(80) not null,
especialidade enum('Distancia', 'Corpo a Corpo', 'Magia'),
ataque bigint default '0',
defesa bigint default '0',
agilidade bigint default '0',
equipe bigint,
primary key(id),
foreign key (equipe) references tb_cla(id)
);

create table tb_cla(
id bigint auto_increment,
nome_equipe varchar(80) not null,
cor_uniforme enum('Vermelho','Azul','Amarelo') not null,
regiao varchar(50),
primary key(id)
);

create table tb_armas(
id bigint auto_increment,
nome_arma varchar(80) not null,
forca int,
pontos_extras int default '0',
primary key(id)
);


insert into tb_personagem values
(default, 'Gerald de Rivia', 'Corpo a Corpo', '8', '8', '7', default),
(default, 'Voldemort', 'Magia', '10', '6', '4', default),
(default, 'Ellie', 'Distancia', '7', '5', '6', default),
(default, 'Shiryu de Dragao', 'Corpo a Corpo', '9', '10', '8', default),
(default, 'Naruto', 'Corpo a Corpo', '10', '9', '10', default),
(default, 'Yeniffer', 'Magia', '8', '8', '6', default),
(default, 'Deidara', 'Distancia', '10', '6', '6', default),
(default, 'Sasori', 'Distancia', '9', '10', '7', default),
(default, 'Chuck Norris', 'Corpo a Corpo', '10', '10', '10', default),
(default, 'Doutor Estranho', 'Magia', '8', '9', '5', default);

insert into tb_cla values
(default, 'Vingadores', 'Vermelho', 'Norte'),
(default, 'Quarteto Fantastico', 'Azul', 'Leste'),
(default, 'Liga da Justiça', 'Amarelo', 'Sul');

insert into tb_cla values
(default, 'SemNomes', 'Vermelho', 'Oeste');


insert into tb_armas values
(default, 'Espada de Prata', '7', '4'),
(default, 'Varinha', '10', '5'),
(default, 'Revolver', '6', '3'),
(default, 'Shotgun', '9', '4'),
(default, 'Espada de Aco', '6', '3'),
(default, 'Kunai', '5', '1'),
(default, 'Argila Explosiva', '9', '4');

alter table tb_personagem
add column cod_armas bigint;

alter table tb_personagem
add foreign key(cod_armas)
references tb_armas(id);




/*INNER JOIN - RETORNA APENAS OS ID QUE SE RELACIONAM*/
Select * from tb_personagem
inner join tb_cla
on tb_personagem.equipe = tb_cla.id
order by tb_cla.nome_equipe;

/*INNER JOIN - RETORNA APENAS OS ID QUE SE RELACIONAM*/
select tb_personagem.nome, tb_personagem.especialidade, tb_cla.nome_equipe from tb_personagem
inner join tb_cla
on tb_personagem.equipe = tb_cla.id
order by tb_cla.nome_equipe;


/*LEFT JOIN - RETORNA TODOS OS LEMENTOS DA TABELA A ESQUERDA*/
select * from tb_personagem
left join tb_cla
on tb_personagem.equipe = tb_cla.id;

/*LEFT JOIN - RETORNA TODOS OS LEMENTOS DA TABELA A ESQUERDA*/
select tb_personagem.nome, tb_personagem.especialidade, tb_cla.nome_equipe from tb_personagem
left join tb_cla
on tb_personagem.equipe = tb_cla.id;


/*RIGHT JOIN - RETORNA TODOS OS LEMENTOS DA TABELA A ESQUERDA*/
select * from tb_personagem
right join tb_cla
on tb_personagem.equipe = tb_cla.id
order by tb_cla.nome_equipe;

/*RIGHT JOIN - RETORNA TODOS OS LEMENTOS DA TABELA A ESQUERDA*/
select tb_personagem.nome, tb_personagem.especialidade, tb_cla.nome_equipe from tb_personagem
right join tb_cla
on tb_personagem.equipe = tb_cla.id
order by tb_cla.nome_equipe;



/*INNER JOIN COM TRÊS TABELAS*/
select * from tb_personagem
inner join tb_cla
on  tb_personagem.equipe = tb_cla.id
join tb_armas
on tb_personagem.cod_armas = tb_armas.id;


/*INNER JOIN COM TRÊS TABELAS*/
select tb_personagem.nome, tb_cla.nome_equipe, tb_armas.nome_arma from tb_personagem
inner join tb_cla
on  tb_personagem.equipe = tb_cla.id
join tb_armas
on tb_personagem.cod_armas = tb_armas.id;



/*LEFT JOIN COM TRÊS TABELAS*/
select * from tb_personagem
left join tb_cla
on tb_personagem.equipe = tb_cla.id
left join tb_armas
on tb_personagem.cod_armas = tb_armas.id
order by tb_personagem.id;


/*LEFT JOIN COM TRÊS TABELAS*/
select tb_personagem.nome, tb_cla.nome_equipe, tb_armas.nome_arma from tb_personagem
left join tb_cla
on tb_personagem.equipe = tb_cla.id
left join tb_armas
on tb_personagem.cod_armas = tb_armas.id
order by tb_personagem.id;



/*RIGHT JOIN COM TRÊS TABELAS*/
select * from tb_personagem
right join tb_cla
on tb_personagem.equipe = tb_cla.id
right join tb_armas
on tb_personagem.cod_armas = tb_armas.id;


/*RIGHT JOIN COM TRÊS TABELAS*/
select tb_personagem.nome, tb_cla.nome_equipe, tb_armas.nome_arma from tb_personagem
right join tb_cla
on tb_personagem.equipe = tb_cla.id
right join tb_armas
on tb_personagem.cod_armas = tb_armas.id;



/*LEFT JOIN COM TRÊS TABELAS*/
select tb_personagem.nome, tb_cla.nome_equipe, tb_armas.nome_arma from tb_cla
left join tb_personagem
on tb_cla.id = tb_personagem.equipe
Left join tb_armas
on tb_personagem.cod_armas = tb_armas.id;



select * from tb_personagem;
select * from tb_cla;
select * from tb_armas;
desc tb_personagem;
desc tb_cla;
desc tb_armas;



