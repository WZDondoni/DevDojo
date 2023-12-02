package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements02 {
    public static void main(String[] args) {
        //age < 15 category junior
        //age >= 15 && age <18 category senior
        //age >=18 category master

        int age = 42;
        if (age < 15) {
            System.out.println("Category Junior");
        } else if (age >= 15 && age < 18) {
            System.out.println("Category Senior");
        } else {
            System.out.println("Category Master"); //não precisa digitar toda a condição, pois já abrangeu todas apenas sobrando uma;
        }

        //Uma forma mais clean de escrever o código acima.
        int age2 = 47;
        String category2 = ""; // ao declarar uma variável local, sempre inicialize ela.
        if (age2 < 15) {
            category2 = "Category Junior";
        } else if (age2 >= 15 && age2 < 18) {
            category2="Category Senior";
        } else {
            category2="Category Master";
        }
        System.out.println("age2 " + category2);

        //uma forma mais clean usando Ternary Operator.
        int age3 = 7;
        String category3 = ""; // ao declarar uma variável local, sempre inicialize ela.

        category3 = age3 < 15 ? "Category Junior" : age3 >= 15 && age2 < 18 ? "Category Senior" : "Category Master";

        System.out.println("age3 " + category3);


    }

}
