select nome, curso_preferido from tb_aluno;

select nome, ano from tb_curso;

/*Esse é o inner join. Simplismente, ele faz a junção de tabelas
perfeito que eu quiser fazer uma busca unindo as duas

Com o "on", eu referencio as linhas que deve se "unir"*/

select tb_aluno.nome, tb_curso.nome from tb_aluno join tb_curso
on tb_aluno.curso_preferido = tb_curso.id_curso
order by tb_aluno.nome;


/*Com o "as", dei um apelido as minhas tabelas*/
select a.nome, c.nome from tb_aluno as a join tb_curso as c
on a.curso_preferido = c.id_curso
order by a.nome;

select * from tb_aluno join tb_curso
on tb_aluno.curso_preferido = tb_curso.id_curso;

desc tb_aluno;


/*outer join chama todas as linhas da tabela. Mesmo que estejam vazias*/


/*
Estrutura de um INNER JOIN

SELECT colunas
FROM tabela1
INNER JOIN tabela2
ON tabela1.coluna = tabela2.coluna;

Ou seja, com esse comando eu estou dizendo:

SELECIONE as colunas
DA tabela 1
JUNTO COM a tabela 2
CONECTADAS PELA chave estrangeira e chave primaria
*/











select * from tb_curso;
select * from tb_aluno;