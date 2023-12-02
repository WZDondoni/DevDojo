package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double res = calculator.divideTwoNumbers(5,7);
        System.out.println(res );
        System.out.println(calculator.divideTwoNumbers(5,7));
        //println não aceita método void. o void imprime por ele mesmo,
        // caso o método tenha um print no seu bojo.
        System.out.println("---------------");
        calculator.printTwoNumbersDivided(20,1);

    }
}
