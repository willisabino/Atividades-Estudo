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

update tb_cla
set nome_equipe = 'Furia'
where id = '2';


select * from tb_personagem;
select * from tb_cla;
desc tb_personagem;
desc tb_cla;

