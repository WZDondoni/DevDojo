-- IDENTAÇÃO = ORDENAR AS QUERYS de uma forma mais lógica para melhor entendimento 
SELECT TOP 1000
    BusinessEntityID,
    PersonType,
    Title,
    FirstName,
    MiddleName,
    LastName,
    ModifiedDate
    FROM Person.Person
    ORDER BY BusinessEntityID
   
    --ORDER BY FirstName //Quando não ordenado, ele usa a primeira coluna por padrão para ordenar; 
    --Pode ordenar por 1, 2, 3; tipo ordenar pela 1ªcoluna, 2ªcoluna. Nâo recomendável, pois não sabemos o nome da coluna
    --ORDER BY SEMPRE após o WHERE. Se antes , dá erro de sintaxe.

-----------------------------------------------------------------------------------------------------------------------------------------------
SELECT 
     --TOP 1000
     BusinessEntityID,
     PersonType,
     Title,
     FirstName,
     MiddleName,
     LastName,
     ModifiedDate
        FROM Person.Person
          ORDER BY BusinessEntityID
            OFFSET 50 ROW --OFFSET e TOP não podem ser rodados na mesma Query // OFFSET (ignora) corta as linhas de exibição, no exemplo, ele mostra apartir da 51ª linha.
            FETCH NEXT 10 ROW ONLY --apartir da 51 só mostra APENAS os primeiros 10 registros. 
