/*
Operadores
+ (somar)
- (subtrair)
* (multiplicar)
/ (dividir)
% (modulo) resto da divisão

*/
SELECT 1+1 AS ADICAO
SELECT 5 - 10 AS [SUBTRACAO(-1)] --colocar colchetes em todo o termo que vc quer quer vire o nome da coluna
SELECT (2+7)*10 AS MULTIPLICACAO
SELECT 90/3 AS DIVISAO 
SELECT 90/60 AS DIV2
SELECT 90%60 as [RESTO DA DIVISAO]

--Pode fazer o cálculo acima com apenas um SELECT
    SELECT 1+3 AS SOMA,
           5-10 AS [SUBTRACAO(NEGATIVA)],
           1700 + (-900) AS [OPERACAO(NEGATIVA)],
           5 * ( 5+1) AS SOMA_E_MULTIPLICACAO,
           -5 * (500/40) % 3 AS TODO

    SELECT 1 + '1' AS [SOMA_NUMERO+STRING]--SQL CONVERTE STRING EM NÚMERO PARA SOMAR 
    SELECT '1' + 1 AS [SOMA_NUMERO+STRING2]
    SELECT '1' + '1' AS [SOMA_DE_STRINGS]--NESSE CASO HÁ A CONCATENAÇÃO. RESULTADO 11.
    SELECT '1' + '1' + 1 AS [SOMA_DUAS_STRINGS_MAIS_NUMERO] --SQL CONCATENA O "TEXTO" QUE DÁ 11 E SOMA. RESULTADO = 12
    SELECT '1' + '1A' + 5 --ERRO Falha ao converter o varchar valor '11A' para o tipo de dados int. 

    SELECT '5' * '5' --ERRO DE CONVERSÃO TEXTO EM NÚMERO COM OPERADOR MULTIPLICAÇÃO

    SELECT 'WATILEY'+' '+'DONDONI' AS NOME  --CONCATENAR TEXTO C/ ESPACÇO ENTRE OS NOMES
    SELECT 'DEV DOJO' + 2 --ERRO Falha em converter DEV Dojo em número inteiro.



           






