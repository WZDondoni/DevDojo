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
          AS = ALIASES/APELIDOS DAS COLUNAS OU TABELAS

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

-----------------------------------------------------------------------------------------------------------

--Nesse select, pode-se usar "SELECT TOP 10 *" para trazer os 10 primeiros registros de todas as colunas. 
--uma forma de conhecer o Banco de Dados sem requerer muito do banco de dados usando o "SELECT * FROM"
SELECT TOP 10
        *
    FROM Person.Person
    --WHERE  
    ORDER BY FirstName DESC,    --Ordenar consulta decrescente. P/ ascendente(ASC) "ORDER BY FirstName ASC" nem precisa por o ASC, é dafault.
             LastName ASC -- Colocando pra ordenar ascendentemente


SELECT TOP 1000 --Pode por o número entre parenteses se quiser (1000)
        BusinessEntityID AS [ID PESSOA],
        PersonType       AS [TIPO PESSOA],
        Title            AS [TITULO],-- WHERE NÃO RECONHECE ALIAS.
        FirstName        AS [PRIMEIRO NOME],
        MiddleName       AS [NOME DO MEIO],
        LastName         AS [ULTIMO NOME]
    FROM Person.Person
    --WHERE  
    ORDER BY [PRIMEIRO NOME] DESC,    --Ordenar consulta decrescente. P/ ascendente(ASC) "ORDER BY FirstName ASC" nem precisa por o ASC, é dafault.
             LastName ASC -- Colocando pra ordenar ascendentemente

SELECT TOP 10
        *
    FROM Person.Person
    --WHERE  
    ORDER BY FirstName DESC,    --Ordenar consulta decrescente. P/ ascendente(ASC) "ORDER BY FirstName ASC" nem precisa por o ASC, é dafault.
             LastName ASC -- Colocando pra ordenar ascendentemente


-------------ACHANDO DUPLICADAS----------------------------------------------------------------------------

SELECT DISTINCT -- eram 19 mil registro, ao colocar DISTINCT, trouxe 1018. A diferença são os repetidos // DISTINCT SEMPRE APÓS SELECT nunca outro comando entre eles, tipo SELECT TOP 10 DISTINCT;
       TOP 1000 --Pode por o número entre parenteses se quiser (1000)
        --BusinessEntityID AS [ID PESSOA],
        --PersonType       AS [TIPO PESSOA],
        --Title            AS [TITULO],-- WHERE NÃO RECONHECE ALIAS.
          FirstName      --AS [PRIMEIRO NOME], //numa query se esquecer das vírgulas o programa entende que é um alias.
        --MiddleName       AS [NOME DO MEIO],
        --LastName         AS [ULTIMO NOME]
    
    FROM Person.Person
    WHERE Title = 'Mr.'  --filtro
    AND MiddleName = 'M' --filtro 
    ORDER BY FirstName,
             MiddleName

    