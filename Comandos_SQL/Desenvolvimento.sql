CREATE OR REPLACE TYPE USER_IPESP.TYPE_WILLI_EXEMPLO AS OBJECT (
    nome  varchar2(50),
    idade   NUMBER,
    sexo VARCHAR2(10)
);


CREATE OR REPLACE TYPE TYPE_LIST_WILLI_EXEMPLO IS TABLE OF TYPE_WILLI_EXEMPLO;


CREATE OR REPLACE TYPE TYPE_WILLI_EXEMPLO as RECORD (
    nome  varchar2(50),
    idade   NUMBER,
    sexo VARCHAR2(10)
);

    select * from wrktip
    order by tip_des_tipo;
select * from wrktar;

select * from wrktip
inner join wrktar
on tar_cod_tipo = tip_cod_tipo
where tip_cod_tipo = 'RECAD'
order by tar_ord_tar;

select * from wrktip
inner join wrktar
on tar_cod_tipo = tip_cod_tipo
where tip_cod_tipo = 'RCD_M'
order by tar_ord_tar;


select * from wrkcli;
select * from wrkreg;


select * from wrkcli
inner join wrkreg
on cli_cod_adm_tra = reg_cod_adm_tra
where cli_cod_adm_tra = 0060843539;


update wrkreg
set REG_COD_ESTADO = 'P'
where REG_cod_adm_tra = 0060843539 AND REG_COD_REGISTRO = 42935321;

update wrkreg
set REG_FEC_TERMINO = null
where REG_cod_adm_tra = 0060843539 AND REG_COD_REGISTRO = 42935321;

update wrkreg
set REG_COD_ESTADO = 'I'
where REG_cod_adm_tra = 0060843539 AND REG_COD_REGISTRO = 42935322;

update wrkreg
set REG_FEC_INI = null
where REG_cod_adm_tra = 0060843539 AND REG_COD_REGISTRO = 42935322;


 SELECT TIP_COD_TIPO, TIP_DES_TIPO FROM WRKTIP WHERE TIP_COD_TIPO IN ('ALCAO','ALCAD','RECAD','RCD_M');
 
 
 select * from TB_GABRIEL_TESTE;
 
 
 select * from TB_PORTARIA_BENEFICIOS;
 cli_cod_adm_tra
 
select cli_cod_adm_tra from wrkcli
inner join wrkreg
on cli_cod_adm_tra = reg_cod_adm_tra
where cli_ind_tip_tra = 'ON' and REG_COD_ESTADO = 'P' and reg_cod_tarefa = 220;


reg_cod_adm_tra
select * from wrkreg
where reg_cod_tipo = 'ON' and REG_COD_ESTADO = 'P' and reg_cod_tarefa = 220;

select * from wrkreg where reg_cod_tipo = 'ALCAD' and reg_cod_estado = 'P' and reg_cod_tarefa = 30

select * from tb_pessoa_fisica
where NOM_PESSOA_FISICA = 'CHRISTIAN HENRIQUE DA SILVA';

select * from tb_pessoa_fisica
where COD_IDE_CLI = '0200015426300';

select * from tb_pessoa_fisica
where COD_IDE_CLI = '0100010205700';

select * from tb_pessoa_fisica
where NOM_PESSOA_FISICA = 'JOAO BAPTISTA DE OLIVEIRA SAMPAIO';

select * from tb_servidor
where COD_IDE_CLI = '0200015426300';
 
 