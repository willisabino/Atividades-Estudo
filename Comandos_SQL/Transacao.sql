select @@autocommit;	
set @@autocommit = off;

# Transação
-- Criar tabela para testes

create table Dados_Livro
select id_aluno, nome, nascimento
from tb_aluno;

select * from Dados_Livro;

# Transação com rollback
start transaction;
	delete from Dados_Livro; 
    insert into Dados_Livro(id_aluno, nome, nascimento)
		values(default, 'teste rollback', '1995-07-24');
	select * from Dados_Livro;
rollback;

select * from Dados_Livro;


//Exemplo de um comando de transação com COMMIT e ROLLBACK

DELIMITER //
CREATE PROCEDURE insere_dados()
BEGIN
DECLARE erro_sql TINYINT DEFAULT FALSE;
DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET erro_sql = TRUE;
START TRANSACTION;
  INSERT INTO Dados_Livro (NomeLivro, ISBN13, PrecoLivro) VALUES
    ('História da Numismática', '9789865321465', 78.60);
  INSERT INTO Dados_Livro (NomeLivro, ISBN13, PrecoLivro) VALUES
    ('Biologia Marinha', '9784233876972', 177.50);
  INSERT INTO Dados_Livro (NomeLivro, ISBN13, PrecoLivro) VALUES
    ('Química Experimental', '9789563210970', 165.32);
  INSERT INTO Dados_Livro (NomeLivro, ISBN13, PrecoLivro) VALUES
    ('Artes Plásticas', '9784523415974', 98,00); # Aqui há um erro que impedirá o COMMIT e provocará o ROLLBACK.
  IF erro_sql = FALSE THEN
    COMMIT;
    SELECT 'Transação efetivada com sucesso.' AS Resultado;
  ELSE
    ROLLBACK;
    SELECT 'Erro na transação' AS Resultado;
  END IF;
END//
DELIMITER ;



/* Para testar, basta chamar o procedimento armazenado:*/
CALL insere_dados();

#Verificamos o conteúdo da tabela Dados_Livro após sua execução:
SELECT * FROM Dados_Livro;
