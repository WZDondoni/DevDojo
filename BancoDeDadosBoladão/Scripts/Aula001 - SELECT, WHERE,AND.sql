/*
SQL STRUCTURED QUERY LANGUAGE -  LINGUAGEM DE CONSULTA ESTRUTURADA
Querry significa CONSULTA;
LINGUAGEM UTILIZADA : T-SQL / TRANSACT SQL /  UTILIZADA PELA MICROSOFT
NUNCA USE "SELECT * FROM" NUM BD DESCONHECIDO, PODE SER UM BD DE 10 MILHOES DE REGISTROS
E A CONSULTA PARA SER REALIZADA ACARRETARÁ MUITO RECURSOS DO SISTEMA/TRAVAMENTO. 
MICROSOFT USA O PADRÃO CAMMON CASE - PRIMEIRA LETRA MAIUSCULA DOS TERMOS NO NOME DAS COLUNAS.

SELECT * FROM Person.Person WHERE FirstName = 
          SELECT = SELECIONE
          * = TUDO(TODAS AS COLUNAS)
          FROM = APARTIR DE // VINDO DE 
          Person.Person NOME DA TABELA 
          WHERE = ONDE "FILTRO"
          FistName = uma Coluna do BD. Obseve o icone de coluna no autopreenchimento
          '' = aspas simples para colocar entre elas o valor procurado.
          AND = ESTÁ "VINCULADO" COM O WHERE.

*/
SELECT  BusinessEntityID,
        PersonType,
        FirstName,
        Title,
        MiddleName,
        LastName,
        ModifiedDate --ultima coluna sem vírgula


    FROM Person.Person
    WHERE FirstName = 'Ken'
        AND MiddleName = 'L'

