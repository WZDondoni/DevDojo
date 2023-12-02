package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(num1,num2);
        System.out.println(" Inside Calculator Teste4");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
        //quando se passa valores do tipo primitivo para um método, não está passando a REFERÊNCIA
        // e sim apenas uma copia. não afetando.
        // se passasse referência, assim que retornasse do método o num1 se tornaria 99


    }
}
