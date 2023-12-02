/*
Não retorna Verdadeiro ou Falto, apenas 1 ou 0. Banco trabalha com bytes.

ALL (REQUER SUBQUERY)
SOME | ANY (REQUER SUBQUERY)
EXISTS (REQUER SUBQUERY)
AND 
OR
BETWEEN
IN | NOT IN
LIKE | NOTE LIKE

*/ --OR--
    SELECT * FROM Person.Person
        WHERE BusinessEntityID > 150
            --AND FirstName = 'Aaron'
            AND (MiddleName = 'Dev Dojo' OR MiddleName = 'G') -- OR -- executou o parentes e vai trazer a condição que for verdadeira, (que geram resultados)
        ORDER BY FirstName
   --AND--
   SELECT * FROM Person.Person
        WHERE BusinessEntityID > 150
            --AND FirstName = 'Aaron'
            AND (MiddleName = 'Dev Dojo' AND MiddleName = 'G') -- AND --  executou o parentes e vai trazer APENAS QUANDO TODAS AS CONDIÇÕES FOREM VERDADEIRASos verdadeiros.
        ORDER BY FirstName

     --BETWEEN--
     SELECT * FROM Person.Person
        WHERE BusinessEntityID BETWEEN 600 AND 800 -- ENTRE 600 E 800
            --AND FirstName = 'Aaron'
            --AND (MiddleName = 'Dev Dojo' AND MiddleName = 'G') 
        --ORDER BY FirstName
    
    --IN-- NOT IN // UMA LISTA
     SELECT * FROM Person.Person
        WHERE BusinessEntityID IN (1,2,3,4,659,580,900,4500) --UMA LISTA NA CONSULTA O 580 E 900 NÃO TEM RESULTADO.
            --AND FirstName = 'Aaron'
            --AND (MiddleName = 'Dev Dojo' AND MiddleName = 'G') 
        --ORDER BY FirstName

    SELECT * FROM Person.Person
        WHERE FirstName IN ('KEN', 'GIGI', 'AARON') --APRESENTE NA CONSULTA ESSES NOMES
    SELECT * FROM Person.Person
        WHERE FirstName NOT IN ('KEN', 'GIGI', 'AARON') --NÃO APRESENTE NA CONSULTA ESSES NOMES

--LIKE-- // TIPO, A GOSTO, 
     SELECT * FROM Person.Person
         WHERE
             --FirstName LIKE 'G%' -- Buscará nomes iniciados com G, sem limite de tamanho. Ex: Gato ou Gerimbibolandoos
             --FirstName LIKE '%G' -- Buscará nomes que terminam com G, sem limite de tamanho. Ex: G ou Yau-Fin-Dum-Greg
             --FirstName LIKE 'G___' --Buscará nomes iniciados com G, porém limitados a 4 letras
             --FirstName LIKE '___a' --Buscará nomes terminados com A, porém limitados a 4 letras
             --FirstName LIKE '[ADF]___a' --Buscará nomes iniciados com A D e F, e que tenham 4 letras e terminem com A;
             --FirstName LIKE '[^ADF]___a' --ADICIONAR O CHAPÉU DE VOVO Desconsiderará os nome que iniciarem com as  letras ADF. Trará nomes NAO iniciados com A D e F, e que tenham 4 letras e terminem com A;
             FirstName NOT LIKE '[ADF]___a' --Buscará nomes no banco, excluindo do resultado os iniciados com A D e F, e que tenham 4 letras e terminem com A;