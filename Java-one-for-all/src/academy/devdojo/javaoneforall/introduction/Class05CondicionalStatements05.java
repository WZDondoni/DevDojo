package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements05 {
    public static void main(String[] args) {
        byte day = 4;

        System.out.println("__________uso de SwitchCase_______________");

//        if (day == 1) {
//            System.out.println("Sunday");
//        } else if (day == 2) {
//            System.out.println("Monday");
//        } else if (day == 3) {
//            System.out.println("Tuesday");
//        } else if (day == 4) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else {
//        System.out.println("Saturday");
//        }
        //todo o código acima pode ser substituido utilizando o "Switch Case"
        //Não necessitamos de resultados booleanos, e sim apenas expressões
        //char, int, byte, short, enum, String
        switch (day) {
            case 1:/*esse um é o valor que é esperado na variável day*/
                System.out.println("Sunday");
                break;
            case 2:/*esse dois é o valor que é esperado na variável day*/
                System.out.println("Monday");
                break;
            case 3:/*esse três é o valor que é esperado na variável day*/
                System.out.println("Tuesday");
                break;
            case 4:/*esse quatro é o valor que é esperado na variável day*/
                System.out.println("Wednesday");
                break;
            case 5:/*esse cinco é o valor que é esperado na variável day*/
                System.out.println("Thursday");
                break;
            case 6:/*esse seis é o valor que é esperado na variável day*/
                System.out.println("Friday");
                break;
            case 7:/*esse sete é o valor que é esperado na variável day*/
                System.out.println("Saturday");
                break;
            //POR DEFAULT, O CASE EXECUTARÁ TODOS OS CASES APÓS O VALOR, SE 5 IMPRIME
            //Thursday
            //Friday
            //Saturday
            //Para "Stop do flow", adicione o break; após cada case;
            //Se adicionar um valor que não está previsto nos "Cases" não imprimirá nada.
            //nesse caso  adicionaremos o default: que poderá se uma mensagem, uma parte do código, etc.
            //ele deverá ser incluido ao final ou no início do Switch
            default:
                System.out.println("Número inválido");

        }

    }
}
