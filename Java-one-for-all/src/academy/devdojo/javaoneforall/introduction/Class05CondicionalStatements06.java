package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements06 {
    public static void main(String[] args) {
        // using swich, print if the day is business day or weekend.
        //Giving the number 1 to 7, Consider 1 being Sunday

        //  A SACADA É QUE TEMOS 2 GRUPOS DE DIAS, DIAS DE TRABALHO E DIAS DE FIM DE SEMANA
        byte day = 9;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }


    }
}
