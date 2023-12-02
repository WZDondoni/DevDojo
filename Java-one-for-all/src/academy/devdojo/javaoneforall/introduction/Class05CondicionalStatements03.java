package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements03 {
    public static void main(String[] args) {
        // if salary > 1000 = buy ps5 or dont buy
        double salary = 3500D;
        String shouldBuyMessagem = "buy PS5";
        String shouldNotBuyMessagem = "don't buy PS5";
        String displayMessage;

        //usando IF NORMAL SEM TERNARY
        if (salary > 2000) {
            displayMessage = shouldBuyMessagem;
        } else {
            displayMessage = shouldNotBuyMessagem;
        }
        System.out.println(displayMessage);

        System.out.println("--------------------Ternay melhor que IF ELSE---------------");
        //USING TERNARY
        //using Ternary operator. always return something. This return should be put in the variable or inside println
        // SINTAXE:
        // (condicion) ? <trueCase> : <falseCase>
        double salary2 = 5500D;
        String shouldBuyMessagem2 = "Ex: Ternary: buy PS5";
        String shouldNotBuyMessagem2 = "Ex: Ternary: don't buy PS5";
        // (condicion) ? <trueCase> : <falseCase>
        String displayMessage2 = salary2 > 2000 ? shouldBuyMessagem2 : shouldNotBuyMessagem2;
        //Aloquei o ternary acima dentro da String displayMessage2;
        System.out.println(displayMessage2);

        System.out.println("--------------------Ternay DENTRO DO PRINTLN---------------");
        //USING TERNARY
        //using Ternary operator. always return something. This return should be put in the variable or inside println
        // SINTAXE:
        // (condicion) ? <trueCase> : <falseCase>
        double salary3 = 5500D;
        String shouldBuyMessagem3 = "Ex: Ternary no println: buy PS5";
        String shouldNotBuyMessagem3 = "Ex: Ternary no println: don't buy PS5";
        // (condicion) ? <trueCase> : <falseCase>

        //IF ELSE quando guarda o valor dentro de uma variável se utilza o ternary
        System.out.println(salary3 > 2000 ? shouldBuyMessagem3 : shouldNotBuyMessagem3);
        // OBSERVE que o Ternario PRECISA estar atribuido a alguma coisa, ou numa variável ou no print statement, ou num retorno de um método.
        // precisa estar guardado em algum lugar ou ser utilizado por alguém.;

        //uma forma mais clean usando Ternary Operator.
        int age3 = 47;
        String category3 = ""; // ao declarar uma variável local, sempre inicialize ela.

        category3 = age3 < 15 ? "Category Junior" : age3 >= 15 && age3 < 18 ? "Category Senior" : "Category Master";

        System.out.println("age3 " + category3);


    }
}
