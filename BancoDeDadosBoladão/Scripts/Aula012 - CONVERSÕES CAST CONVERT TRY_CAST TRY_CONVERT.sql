/* 

 CAST (Valor[Nome_da_coluna] AS [Tipo_do_dado]) --tranforma um texto em algo expecifico m, em número ou data;
 TRY_CAST - mesma coisa do CAST, só que não interrompe o fluxo da Query. executa mesmo com erro.
 CONVERT ([Tipo_do_dado], Nome_da_coluna, [style]) --  style SÓ COM DATA 103 é o padrão britânico.., é o que nós usamos;
 TRY_CONVERT - Usado no lugar do CONVERT, pois não enterrompe o fluxo da query. executa mesmo com erro, e onde for erro retorna null







*/

    USE AdventureWorks2019
    GO

 ---------------------------CAST---------------------------------------
    SELECT ( SELECT '33') + (SELECT '37') --RESULTADO 3337
    SELECT ( SELECT CAST('33' AS INT) ) + ( SELECT CAST( '37' AS INT)) AS RESULT --RESULTADO 70

    SELECT '20222008' --DATA EM TEXTO
    SELECT CAST( '20220820' AS DATE)  -- CONVERTIDO EM DATA 2022-08-20

    
    SELECT GETDATE() -- Traz a data atual da seguinte forma : 2022-08-12 14:34:10.177 -- CONVERTEREMOS para o padrão Brasil pelo comando CONVERT.
    SELECT CONVERT(VARCHAR(10), GETDATE(), 103) --Converta para mim, em tipo de texto (VARCHAR), a minha data, e o stylo 103,britânico; resultado 12/08/2022
    --o stylo escolhido as vezes não se encaixa dentro do tamanho do VARCHAR. Ajustar.

    SELECT ( SELECT CONVERT(INT, '6526164')) + 6 --STYLE SÓ COM DATA;

    
    SELECT CONVERT(DATE, '14/02/2017', 101) AS COLUNA1, --101 PADRÃO AMERICANO, mas está començando com dia--mes--ano; e o padrão americano é mes--dia--ano..//DARÁ ERRO
           CONVERT(DATE, '02/14/2017', 101) AS COLUNA2 -- ao selecionar as duas não executará, pois a primeira está com erro.

    SELECT TRY_CONVERT(DATE, '14/02/2017', 101) AS COLUNA1, -- as duas Querys serão executadas, mas somente a segunda trará resultado.
           TRY_CONVERT(DATE, '02/14/2017', 101) AS COLUNA2 

    --CAST--
    SELECT CAST('45F' AS SMALLMONEY ) --DA ERRO
    SELECT TRY_CAST('45F' AS SMALLMONEY)  -- EXECUTA, mas não traz resultad., muito usado em imensas querrys

