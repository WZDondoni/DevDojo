package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        int[] numbers2 = {1, 2, 3, 4, 5}; // creating array arry with 4 index
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        int[] numbers3 = new int[]{5, 4, 3, 2, 1}; //without value into [], because dont want inicialize
        System.out.println("====for ======");
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println("For Normal - "+numbers3[i]);
        }

        System.out.println("====for each======");

        for (int/*same type*/ num/*LOCAL variable name*/ : numbers3)//1º diga o tipo do array, se for int declare int: variavel local
        {
            System.out.println(num);
            //nesse forEACh vc não acessa os valores individuais, somente todos de uma única vez.
            //numbers3 é um array, cria-se uma varíavel do mesmo tipo para percorrer por dentro d array
            //usando o Array para um tipo simples, somente um Vetor não precisa se preocupar com o tipo, pois esse
            // array é um inteiro, o que não acontece quando é um array dentro de um array,
            // em que a base do array não é inteiro

        }

        for (int num : numbers3) {
            System.out.println("ForEach  - "+num);
        }


    }
}
