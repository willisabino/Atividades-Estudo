create or replace function frase
(texto in varchar2)
    return varchar2
    is
    begin
        return(texto);
    end frase;
    
    SELECT frase('Hello World') FROM dual;



create or replace function calculo
(numero in number)
    return number
    is
    begin
        return(numero + 20);
    end calculo;
    
    variable calc number;
    execute :calc :=calculo(30);
    
    print calc;
    
    
    
    
create or replace function soma
    (numero1 in number, 
     numero2 in number)
        return number
     is
        soma number;
     begin
            soma := numero1 + numero2;
            return (soma);
      end soma;
      
    variable calcSoma number;
    execute :calcSoma :=soma(10, 2);
    
    print calcSoma;