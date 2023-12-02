/*
FULL JOIN - TRAZER TUDO DE AMBAS AS TABELAS.

*/

    USE AdventureWorks2019
    GO

    SELECT SSP.BusinessEntityID,
           PP.BusinessEntityID,
           FirstName,
           MiddleName,
           LastName,
           TerritoryID,
           Bonus,
           SalesLastYear
           
      FROM Sales.SalesPerson AS SSP
      FULL OUTER JOIN Person.Person AS PP --USAR O JOIN=17 LINHAS / LEFT JOIN=17 LINHAS / RIGHT JOIN 19.972 LINHAS
        ON SSP.BusinessEntityID = PP.BusinessEntityID

    GO 

    SELECT PP.BusinessEntityID AS [PP.BusinessEntityID],
           PEA.BusinessEntityID AS [PEA.BusinessEntityID],
           SSP.BusinessEntityID AS [SSP.BusinessEntityID],
           HRE.BusinessEntityID AS [HRE.BusinessEntityID],
           PP.Title AS [PP.Title],
           PP.FirstName AS [PP.FirstName],
           PP.MiddleName AS [PP.MiddleName],
           PP.LastName AS [PP.LastName],
           SSP.TerritoryID AS [SSP.TerritoryID], 
           PEA.EmailAddress AS [PEA.EmailAddress],
           HRE.Gender AS [HRE.Gender],
           HRE.LoginID AS [HRE.LoginID] 
           
     /*  FROM Person.Person AS PP
      FULL OUTER JOIN Sales.SalesPerson AS SSP
        ON PP.BusinessEntityID = SSP.BusinessEntityID

      FULL OUTER JOIN Person.EmailAddress AS PEA 
        ON PEA.BusinessEntityID = SSP.BusinessEntityID

      FULL OUTER JOIN HumanResources.Employee AS HRE
        ON HRE.BusinessEntityID = PEA.BusinessEntityID */--TODOS ESSES JOINS TROUXERAM 39.927 LINHAS, E ESSES RESULTADOS TROUXERAM COLUNAS COM VARIOS VALORES NULL. FALTOU REFERÊNCIA
        -- PERSON
        
       --==VERIFICAR OS TAMANHOS DAS TABELAS==
                --Procurar uma melhor relação entre os valores e suas colunas para trazerem melhores resultados. 
                    -- SELECT * FROM Sales.SalesPerson -- 17 Linhas com a BusinessEntityID indo do 274 -> 290         SSP
                    -- SELECT * FROM Person.Person -- 19.972 Linhas com a BusinessEntityID indo do 1 -> 20777         PP
                    -- SELECT * FROM Person.EmailAddress -- 19.972 Linhas com a BusinessEntityID indo do 1 -> 20777   PEA
                    -- SELECT * FROM HumanResources.Employee -- 290 Linas com a BusinessEntityID indo do 1 -> 290     HRE
                    -- --devemos buscar uma comparação entre tabelas que traga menos null, fazendo uma melhor relação. 

    --REORGANIZANDO AS RELAÇÕES 
  FROM Person.Person AS PP
      FULL OUTER JOIN Person.EmailAddress AS PEA 
        ON PP.BusinessEntityID = PEA.BusinessEntityID

      FULL OUTER JOIN HumanResources.Employee AS HRE
        ON  PEA.BusinessEntityID = HRE.BusinessEntityID

      FULL OUTER JOIN Sales.SalesPerson AS SSP
        ON HRE.BusinessEntityID = PEA.BusinessEntityID -- ON ESTÁ RELACIONANDO HRE C/ PEA. NÃO SERIA COM SSP? QUE É A TABELA CARREGADA?
        --após melhorer a relação, retornou 24.612 linhas com poucos valores NULL; a relação se mostrou mais acertiva.
