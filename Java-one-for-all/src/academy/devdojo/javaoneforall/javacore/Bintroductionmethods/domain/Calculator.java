package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Calculator {
    //metodos sempre retornam, um valor  ou vazio (sem retorno (void));
    //método corta maça em dois pedaços.
    // se o método cortar e devolver os dois pedaços pra quem pediu, retornou algo;
    // se só cortou e guardou pra si, não retornou nada.
    // void não retornará nada pra alguém, mas terá uma saída de informação(no console)

    public void sumTwoNumbers() {
        System.out.println(10 + 10);

    }

    public void subtractTwoNumbers() {
        System.out.println(21 - 2);

    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) { // checking second number.
            return 0;
        }
        //se não colocar uma parada acima ele continua o código. Um else
        return num1 / num2;

    }

    public double divideTwoNumbers02(double num1, double num2) {
        if (num2 != 0) { // checking second number.
            return num1 / num2;
        }
        return 0;
        //mudou um pouco a lógica,
        // o return é tipo o break para o "if"
        // validações primeiro.


    }

    public void printTwoNumbersDivided(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cant divide by zero");
        } else {
            //break não tá pois só é aceito em loop
            //return; é tipo um break, ao chegar nele ele volta.
            // else resolve

            System.out.println(num1 / num2);
        }
    }

    public void changeTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("inside changeTwoNumbers");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);

    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num: numbers){
            sum += num;
            /* remember, foreach walk in to array and print all results.
            nothing more. The variable num received firt and last indice of array numbers
             */
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){ /*"type"... variable name*/ // more than 1  atributes put than before vargars.
        int sum = 0;
        for (int num: numbers){
            sum += num;

        }
        System.out.println(sum);
    }



}
