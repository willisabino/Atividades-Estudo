CREATE OR REPLACE PROCEDURE SP_TESTE_WILLI (P_NOME IN VARCHAR, P_BRITO IN OUT VARCHAR)
IS
BEGIN
    p_resultado := p_num_1 + p_num_2;
END;



CREATE OR REPLACE PROCEDURE teste_soma_in_out_willi (n1 IN NUMBER, n2 IN OUT NUMBER)
IS
BEGIN
    n2 := n1 + n2;
END;
/

/*EXECUTANDO PROCEDURE IN OUT ----> INICIO*/
DECLARE
    n2 number;
BEGIN
    n2 := 2;
    teste_soma_in_out_willi(2, n2);
    dbms_output.put_line(n2);
END;
/*EXECUTANDO PROCEDURE IN OUT  ----> FIM*/






/*INICIO DA PROCEDURE SP_TESTE_WILLI*/
set serveroutput on;

CREATE OR REPLACE PROCEDURE SP_TESTE_WILLI (P_NOME IN VARCHAR, P_BRITO IN OUT VARCHAR2)
IS
BEGIN
      if P_NOME = 'renan' then
      P_BRITO := 'parametro recebido';          
    else
      P_BRITO := 'Valor de Entreda diferente de Renan';
    end if;
END;


DECLARE
    P_BRITO varchar2(20);
BEGIN
    P_BRITO := 'Willi';
    SP_TESTE_WILLI ('renan', P_BRITO);
    dbms_output.put_line(P_BRITO);
END;





CREATE OR REPLACE PROCEDURE SP_TESTE_WILLI2 (P_NOME IN VARCHAR, P_CODIGO OUT NUMBER, P_MENSAGEM_CODIGO OUT VARCHAR2)
IS
BEGIN
      if P_NOME = 'renan' then
      P_CODIGO := 0;
      P_MENSAGEM_CODIGO := 'Cadastrado com sucesso';    
    else
    P_CODIGO := -1;
    P_MENSAGEM_CODIGO := 'Nome invalido';
    end if;
END;


DECLARE
    numero NUMBER;
    texto varchar2(30);
BEGIN
    SP_TESTE_WILLI2 ('renan', numero, texto);
    dbms_output.put_line(numero);
    dbms_output.put_line(texto);
END;



PROCEDURE SP_SERVIDOR_MONTA_HIST;





