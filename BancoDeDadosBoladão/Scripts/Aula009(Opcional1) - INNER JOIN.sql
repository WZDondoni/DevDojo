/*

INNER JOIN / JOIN -
Pode usar o JOIN que o SQL internamente transforma em INNER JOIN

SÓ QUE É COMUM ENTRE DOIS CONJUNTOS / DUAS TABELAS INTERCEÇÃO ENTRE DUAS TABELAS (x (XY) y)
AO DAR INNER JOIN QUANDO HÁ DUAS COLUNAS IGUAIS O SQL NÃO ACEITA, EX: BusinessEntityID da tablema Person.Perosn
e a mesma coluna da tabela Person.EmailAdress, nesse caso deve resolver usando ALIAS.Ex: FROM Person.Person AS PP e INNER JOIN Person.EmailAddress AS PEA

ON É O ELO


LEFT JOIN
O QUE ESTÁ CONTIDO EM UMA TABELA(X) EM OUTRA(Y)  (X (XY) y)

RIGHT JOIN
O QUE ESTÁ CONTIDO EM UMA TABELA(Y) EM OUTRA(X)  (x (XY) Y)

FULL OUTER JOIN
TUDO O QUE ESTÁ CONTIDO ENTRE DUAS TABELAS/CONJUNTOS (X (XY) Y)


*/
  -- PRIMEIRO CHAMEI AS DUAS TABELAS DE INTERESSE PARA VER AS COLUNAS QUE TENHO.
    SELECT TOP 5 * FROM Person.Person
    SELECT TOP 5 * FROM Person.EmailAddress  



 -- SEGUNDO REALIZO O SELECT DAS COLUNAS QUE QUERO DO 1º GRUPO/TABELA E ESCOLHO A COLUNA DA SEGUNDA. 
    SELECT PP.BusinessEntityID, --USADO ALIAS USADO ALIAS PARA IDENTIFICAR A COLUNA DE MESMO NOME EM DUAS TABELAS DIFERENTES
           Title,
           FirstName,
           MiddleName,
           LastName,
           EmailAddress,
           PEA.BusinessEntityID, --USADO ALIAS PARA IDENTIFICAR A COLUNA DE MESMO NOME EM DUAS TABELAS DIFERENTES
           PPP.PhoneNumber
       
       --TERCEIRO CHAMEI AS TABELAS     
      FROM Person.Person AS PP -- DANDO ALIAS A TABELA
     INNER JOIN Person.EmailAddress AS PEA --DANDO ALIAS A TABELA
        ON  PP.BusinessEntityID = PEA.BusinessEntityID    -- "ON" É O ELO ENTRE AS TABELAS
        -- AS DUAS TABELAS TEM O MESMO NÚMERO DE REGISTROS O QUE É BOM, MAS DEVE FICAR ATENTO.
      JOIN Person.PersonPhone AS PPP --TRAZER MAIS UMA COLUNA DE OUTRA TABELA
        ON PEA.BusinessEntityID = PPP.BusinessEntityID

    