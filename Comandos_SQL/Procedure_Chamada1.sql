/*EXECUTANDO PROCEDURE REGISTRO NA TABELA ----> INICIO*/
EXEC SP_CIDADES(1, 'COLATINA', 'ES', 'I');

EXEC SP_CIDADES(2, 'Jandira', 'SP', 'I');

EXEC SP_CIDADES(2, 'Barueri', 'SP', 'A');
/*EXECUTANDO PROCEDURE REGISTRO NA TABELA ----> FIM*/


/*EXECUTADNO PROCEDURE SOMA E REGISTRA NA TABELA ----> INICIO*/
EXEC SP_SOMATESTE(2, 2);
/*EXECUTADNO PROCEDURE SOMA E REGISTRA NA TABELA ----> FIM*/


/*EXECUTANDO PROCEDURE CHAMA HELLO WORLD COM PARAMETRO ----> INICIO*/
set serveroutput on;

declare
    v_retorno varchar2(1000);
begin
    procPrintHelloWorld(3, v_retorno);
    dbms_output.put_line(v_retorno);
end;
/*EXECUTANDO PROCEDURE CHAMA HELLO WORLD COM PARAMETRO ----> FIM*/


/*EXECUTANDO PROCEDURE CHAMA HELLO WORLD SEM PARAMETRO ----> INICIO*/
declare
    v_retorno varchar2(1000);
begin
    procPrintHelloWorld_2(v_retorno);
    dbms_output.put_line(v_retorno);
end;
/*EXECUTANDO PROCEDURE CHAMA HELLO WORLD SEM PARAMETRO ----> FIM*/


/*EXECUTANDO PROCEDURE SOMA ----> INICIO*/
DECLARE
    v_saida number;
BEGIN
    procSomaTeste(2, 2, v_saida);
    dbms_output.put_line(v_saida);
END;
/*EXECUTANDO PROCEDURE SOMA ----> FIM*/