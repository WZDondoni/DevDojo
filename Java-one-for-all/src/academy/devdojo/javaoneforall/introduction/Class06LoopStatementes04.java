package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatementes04 {
    public static void main(String[] args) {
        /*Given a car's total price, for ex. 20000.
        I want to find how much and for how long I'll have to pay monthly.
        Condition: The monthly payment cannot be lower 1000
                * */
        double totalPrice = 20000;

        System.out.println("-----------PRIMEIRA RESOLUÇÃO---------");
        System.out.println("-----------COM DESPERDÍCIO DE RECURSO---------");

        for (int monthCount = 1; monthCount <= totalPrice; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice >= 1000) {
                System.out.println(" Months " + monthCount + "Price:" + monthlyPrice);
            }
            System.out.println("inside for, outside if - processo continua  - DESPERDÍCIO DE RECURSO" + monthCount);

        }

        System.out.println("-----------SEGUNDA RESOLUÇÃO---------");
        System.out.println("-----------SEM DESPERDÍCIO DE RECURSO---------");

        for (int monthCount = 1; monthCount <= totalPrice; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice >= 1000) {
                System.out.println(" Months " + monthCount + "Price:" + monthlyPrice);
            } else {
                break; //USO DO BREAK PRA PARAR OS CONTADORES
            }
            System.out.println("inside for, outside if - processo continua  - DESPERDÍCIO DE RECURSO" + monthCount);


        }

        System.out.println("-----------TERCEIRA RESOLUÇÃO---------");
        System.out.println("-----------MELHORANDO O CÓDIGO---------");

        for (int monthCount = 1; monthCount <= totalPrice; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                break;
            }

            System.out.println(" Months " + monthCount + "Price:" + monthlyPrice);


        }

        System.out.println("-----------QUARTA RESOLUÇÃO---------");
        System.out.println("-----------MUDANDO brake; por continue;---------");

        for (int monthCount = 1; monthCount <= totalPrice; monthCount++) {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                continue; // após ser verdadeiro ao invés de sair do for, ele retorna.
            }

            System.out.println(" Months " + monthCount + "Price:" + monthlyPrice);


        }

    }
}