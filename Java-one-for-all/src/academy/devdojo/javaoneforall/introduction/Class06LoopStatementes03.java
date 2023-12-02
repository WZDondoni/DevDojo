package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatementes03 {
    public static void main(String[] args) {
        //Give a total number, for exemple 50, print the firts 25


        int maxNumber = 50;
        for (int i = 0; i < maxNumber; i++) {
            if (i <= 25) {
                System.out.println("inside if "+ i);
            } else {
                break;
                //não será executado noda aqui, dará erro de statement;
            }
            System.out.println("outside if "+i);
            //PARA PARAR PODEMOS USAR O BREAK, QUE VAI SOMENTE DENTRO DE FORLOOP, WHILE, DO-WHILE, SWITCH.
            //SE ESTIVER DENTRO DE UM IF E ESSE IF DENTRO DE UM FOR, POR EX, FUNCIONA

        }

        System.out.println("FORMA MAIS CLEAN ");

        for (int i = 0; i < maxNumber; i++) {
            if (i>25){
                break;
            }
            System.out.println(i);

        }


    }
}
