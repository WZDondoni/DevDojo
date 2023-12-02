/*
LEFT JOIN
O QUE ESTÁ CONTIDO EM UMA TABELA(X) EM OUTRA(Y)  (X (XY) y)
TRAREI TODA A TABELA DA ESQUERDA E O QUE FOR INTERCESSÃO COM A TABELA DA DIREITA.

*/

    USE AdventureWorks2019
    GO

    SELECT * FROM HumanResources.Employee --290 LINHAS
    SELECT * FROM Person.Person -- 19 MIL LINHAS

    SELECT PP.BusinessEntityID AS [PP.BusinessEntityID], -- PARA Q O SQL ACEITE Q O NOME DA COLUNA INCLUA A ALIAS, TERÁ DE COLOCAR ENTRE COLCHETES OU ASPAS SIMPLES
           HRE.BusinessEntityID AS [HRE.BusinessEntityID],
           FirstName,
           MiddleName,
           LastName,
           LoginID,
           JobTitle,
           BirthDate  



    FROM Person.Person AS PP --TABELA DA ESQUERDA
    LEFT JOIN HumanResources.Employee AS HRE --TABELA DA DIREITA
     --USANDO O JOIN TRAZ O QUE É DE IGUAL ENTRE DUAS TABELAS, O LEFTJOIN TRAZ OS RESULTADOS DA PRIMEIRA TABELA AGREGANDO OS RESULTADOS DA SEGUNDA.
      ON PP.BusinessEntityID = HRE.BusinessEntityID
    ORDER BY PP.BusinessEntityID


