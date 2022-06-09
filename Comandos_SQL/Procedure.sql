/*EXECUTANDO PROCEDURES DIRETO NO BANCO DE DADOS*/
/*INICIO*/
CREATE TABLE CIDADES
(
  COD_CIDADE  INTEGER NOT NULL,
  NOME        VARCHAR2(100 BYTE),
  UF          CHAR(2 BYTE)
);

select * from CIDADES;


CREATE OR REPLACE PROCEDURE "SP_CIDADES" (
  vCOD_CIDADE  INTEGER,
  vNOME       VARCHAR2,
  vUF         CHAR,
  vOPR        CHAR)
IS
  vEXCEPTION EXCEPTION;
BEGIN
  IF (vOPR = 'I') THEN
    INSERT INTO CIDADES(COD_CIDADE, NOME, UF) VALUES (vCOD_CIDADE, vNOME, vUF);
  ELSE
  IF(vOPR = 'A') THEN
    UPDATE CIDADES SET NOME = vNOME, UF = vUF WHERE COD_CIDADE = vCOD_CIDADE;
  ELSE
  IF(vOPR = 'D')THEN
    DELETE FROM CIDADES WHERE COD_CIDADE = vCOD_CIDADE;
  ELSE
    RAISE vEXCEPTION;
  END IF;
  END IF;
  END IF;
  EXCEPTION
    WHEN vEXCEPTION THEN
      RAISE_APPLICATION_ERROR(-20999,'ATENÇÃO! Operação diferente de I, D, A.', FALSE);
END SP_CIDADES;

/*FIM*/ /*FIM*/ /*FIM*/ /*FIM*/


/*EXECUTANDO PROCEDURES DIRETO NO BANCO DE DADOS*/ 
/*SOMA*/ /*SOMA*/ /*SOMA*/ /*SOMA*/
/*INICIO*/
CREATE TABLE SOMATESTE
(
    n1 INTEGER NOT NULL,
    n2 INTEGER NOT NULL,
    soma INTEGER
);

CREATE OR REPLACE PROCEDURE "SP_SOMATESTE" (vN1  INTEGER, vN2       VARCHAR2)
IS
vSOMA INTEGER;
BEGIN

    vSOMA := vN1 + vN2;
    
    INSERT INTO SOMATESTE(n1, n2, soma) VALUES (vN1, vN2, vSOMA);

END SP_SOMATESTE;

select * from SOMATESTE;

/*SOMA*/ /*SOMA*/ /*SOMA*/ /*SOMA*/
/*FIM*/ /*FIM*/ /*FIM*/ /*FIM*/




/*PROCEDURE PARA HELLO WORLD COM PARAMETRO*/

CREATE OR REPLACE PROCEDURE procPrintHelloWorld (p_entrada  in number ,p_saida    out varchar2)
IS
BEGIN
  
  if p_entrada = 1 then
      p_saida := 'Hello World 1';     
  elsif p_entrada = 2 then
      p_saida := 'Hello World 2';     
  else
      p_saida := 'Por favor informe o parâmetro de entrada entre 1 e 2';
  end if;

END;
/


/*PROCEDURE PARA HELLO WORLD SEM PARAMETRO*/
CREATE OR REPLACE PROCEDURE procPrintHelloWorld_2 (p_saida    out varchar2)
IS
BEGIN
       p_saida := 'Hello World';
END;



/*PROCEDURE SOMA*/
CREATE OR REPLACE PROCEDURE procSomaTeste (p_num_1 in number, p_num_2 in number, p_resultado out number)
IS
BEGIN
    p_resultado := p_num_1 + p_num_2;
END;
