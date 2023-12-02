    /*
     
     COUNT:CONTAGEM
     MIN: MÍNIMO -- USADO EM CAMPOS NUMÉRICO 
     MAX: MÁXIMO
     SUM: SOMATÓRIO
     AVG: MÉDIA

     
     */

     USE AdventureWorks2019 
     GO

     SELECT COUNT(*) FROM Person.Person --SABER O NÚMERO DE LINHAS/REGISTROS DA TABELA Person.Person, 19972. Evitando assim fazer o "SELECT * FROM" e sobrecarregar o BD.
     
     
     ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     SELECT COUNT(*) AS QUANTIDADES,
            FirstName,
            MiddleName

            FROM Person.Person    
            --AO EXECUTAR A QUERY ACIMA ELE RETORNA ERRO, POIS PRECISA NECESSARIAMENTE DO GROUP BY, que será as colunas /* Msg 8120, Level 16, State 1, Line 2
            --A coluna 'Person.Person.FirstName' é inválida na lista de seleção porque não está contida em uma função de agregação nem na cláusula GROUP BY. */

--adicionado o GROUP BY--
    SELECT COUNT(*) AS QUANTIDADES,
           FirstName,
           MiddleName

           FROM Person.Person
           GROUP BY FirstName,
                    MiddleName
    GO
    --RESULTADO EX:
                --QUANTIDADES:26 PESSOAS COM FIRST NAME Aarron e SECOND NAME NULL -- pode incluir um filtro WHERE MiddleName IS NOT NULL e excluir os resultados c/ NULL

--adicionado o HAVING APÓS O GROUP BY--
    
    SELECT COUNT(*) AS QUANTIDADES,
           FirstName
           FROM Person.Person
           GROUP BY FirstName
           HAVING COUNT(*) >20 -- conte os primeiros nomes da tabela PERSON.PERSON e só me apresente os nomes que estiverem mais de 20 insidências.
                    
    GO

   




------------------------------------------------------------------------------------------------------------------------------------------------------------------------

--USO DO MÍNIMO E MÁXIMO

    SELECT MIN(BusinessEntityID) AS [Menor valor registrado na Coluna] 
      FROM Person.Person
      --resultado : 1
    
    SELECT MAX(BusinessEntityID) AS [Maior valor registrado na Coluna] 
      FROM Person.Person
      --resultado : 20777

    SELECT MIN(BusinessEntityID) AS [Menor valor registrado na coluna], 
           MIN(ModifiedDate) AS [Menor data registrada na coluna]
      FROM Person.Person
      --resultado : 1 | 2006-06-23 00:00:00.000
    
    SELECT MAX(BusinessEntityID) AS [Maior valor registrado na Coluna], 
           MAX(ModifiedDate) AS [Menor data registrada na coluna]
      FROM Person.Person
      --resultado : 20777 | 2015-04-15 16:33:33.123

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--USO DO SUM (SOMA)
    -- ** SUM e AVG não aceitam colunas do tipo TEXTO.

    --**SOMA DE UMA COLUNA
    SELECT SUM(SalesQuota) AS [SALES COTA] 
      FROM Sales.SalesPerson -- A somatória de toda a coluna SalesQuota.  Resultado: 3650000,00

    

    --**SOMA DE TRÊS COLUNAS AGRUPANDO POR DATA--
    SELECT SSP.ModifiedDate AS [DATA],
           SUM(SalesQuota) AS [VENDAS],
           SUM(SalesLastYear) AS [VENDAS DO ÚLTIMO ANO],
           SUM(SalesYTD) AS [VENDAS DOS ULTIMOS 12 MESES]
      FROM Sales.SalesPerson AS SSP
     GROUP BY 
              SSP.ModifiedDate



    SELECT SUM(Rate) AS [RATE],
           RateChangeDate

      FROM HumanResources.EmployeePayHistory
     GROUP BY RateChangeDate
    HAVING SUM(Rate) < 7.000


    SELECT SUM(Rate) AS [SUM], 
           MIN(Rate) AS [MIN],
           MAX(Rate) AS [MAX],
           COUNT(Rate) AS [COUNT],
           AVG(Rate) AS [AVG] 
      FROM HumanResources.EmployeePayHistory


