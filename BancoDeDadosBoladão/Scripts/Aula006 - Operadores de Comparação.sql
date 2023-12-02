/*

OPERADORES DE COMPARAÇÃO
= (ÍGUAL A)
> (MAIOR QUE)
< (MENOR QUE)
>= (MAIOR IGUAL)
<= (MENOR IGUAL)
<> (DIFERENTE DE) 
!= (DIFERENTE DE)        [NÃO É PADRÃO ISO]
!< (NÃO É MENOR DO QUE ) [NÃO É PADRÃO ISO]
!> (NÃO É MAIOR DO QUE ) [NÃO É PADRÃO ISO]

*/


SELECT * FROM Person.Person
    WHERE FirstName = 'GIGI'

SELECT * FROM Person.Person
    WHERE FirstName <> 'GIGI'

SELECT * FROM Person.Person
    WHERE BusinessEntityID <= 10

SELECT * FROM Person.Person
    WHERE BusinessEntityID >= 10