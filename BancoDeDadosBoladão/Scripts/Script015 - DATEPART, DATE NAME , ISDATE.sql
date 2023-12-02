USE AdventureWorks2019
    GO

    /*
        DATEPART(Parte_da_data/hora, Data/Nome_da_coluna) : retorno, resultado da querry, será do tipo INTEIRO 
        DATENAME(Parte_da_data/hora, Data/Nome_da_coluna) : retorno do tipo texto (nvarchar)
        ISDATE(Nome_da_coluna) : retorno 1 = TRUE | 0 = FALSE
    */

    SELECT ISDATE('GETDATE()') AS [ISDATE()],
           ISDATE('2010F1231') AS [ISDATE()],
           GETDATE() AS [GETDATE()],
           SYSDATETIME() AS [SYSDATETIME()],
           DATEPART(HOUR, GETDATE()) AS HORA, /* mostra só a hora*/
           DATEPART(MINUTE, GETDATE()) AS MINUTO, /* mostra só o minuto*/
           DATEPART(YEAR, GETDATE()) AS ANO, /* mostra só o ano*/

           YEAR(GETDATE()) AS ANO_SOZINHO,/* mostra só o ano*/
           MONTH(GETDATE()) AS MES_SOZINHO,/* mostra só o mês*/
           DAY(GETDATE()) AS DIA_SOZINHO,/* mostra só o dia*/ /* por convenção, usa-se o DATEPART e dentro dele segrega o que se quer*/

           DATEPART(MICROSECOND, SYSDATETIME()) AS [MICROSECOND], /* mais precisão apresentar MICRO SEGUNDOS*/
           DATEPART(NANOSECOND, SYSDATETIME()) AS NANO, /* mais precisão apresentar NANO SEGUNDOS*/ 

           DATENAME(MONTH, GETDATE()) AS NOME_DO_MES, /* Traz nome dos meses */
           DATENAME(DAY, GETDATE()) AS DIA_DO_MES  /* Traz o  dia */
           /* Atenção, DIA e ANO não se traz por extenso, apenas o MÊS*/
    GO

    
    /* EXEMPLO DO DATEPART */ 
    SELECT BusinessEntityID,
           Title,
           FirstName,
           MiddleName,
           LastName,
           TRY_CAST(ModifiedDate AS DATE) AS ModifiedDate,
           DATEPART(YEAR, ModifiedDate) AS ANO,
           ISDATE(ModifiedDate) AS VERIFICADATA,
           TRY_CONVERT( VARCHAR(10), ModifiedDate, 103) AS data_formatada,
           ISDATE( TRY_CONVERT( VARCHAR(10), ModifiedDate, 103 ) ) AS VERIFICA2 /* avalia 
      FROM Person.Person
     WHERE DATEPART(YEAR, ModifiedDate) = 2008
       AND DATENAME(MONTH, ModifiedDate) = 'Dezembro'
    GO