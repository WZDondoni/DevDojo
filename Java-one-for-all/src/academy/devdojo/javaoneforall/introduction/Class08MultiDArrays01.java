package academy.devdojo.javaoneforall.introduction;

public class Class08MultiDArrays01 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("MOSTRANDO O VALOR ALOCADO NA MEMORIA NO PRIMEIRO ARRAY SEM INICIALIZAR OS VALORES DO ARRAY"); //imprimirá  saída será uma alocação na memória "default."
        int[][] days = new int[3][3];
        //ao criar um array multd do primeiro array será a referencia
        // em memória para cada array
        //https://i.imgur.com/DjpkMoo.jpg
        System.out.println("alocação da referência na memória" + days[0]);
        //imprimirá  saída será uma alocação na memória "default."
        // [I@4dd8dc3

        System.out.println("");
        System.out.println("");
        System.out.println("Exemplo alocação na memória do array");
        int[][] days1 = new int[2][2];
        days1[0][0] = 31;
        days1[0][1] = 30;
        days1[1][0] = 31;
        days1[1][1] = 31;
        System.out.println("vlr alcoado na memória 0 0 " + days1[0][0]);
        //https://i.imgur.com/wQ2Z9Wm.jpg
        //Há um padrão de ir a base e depois percorrer cada um;

        System.out.println("");
        System.out.println("");
        System.out.println("Exemplo percorrer array com for");
        double[][] days2 = new double[3][10];
        System.out.println("tamanho da alocação de day2 : " + days2.length);
        days2[0][0] = 0.1;
        days2[0][1] = 0.2;
        days2[0][2] = 0.3;
        days2[1][0] = 1.1;
        days2[1][1] = 1.2;
        days2[1][2] = 1.3;
        days2[2][0] = 2.1;
        days2[2][1] = 2.2;
        days2[2][2] = 2.3;

        for (int i = 0; i < days2.length; i++) {
            for (int j = 0; j < days2[i].length; j++) {
                System.out.println(days2[i][j]);
            }

        }

        System.out.println("USANDO O FOR EACH - LEMBRAR EM COLOCAR UMA VARIÁVEL DO LADO ESQUERDO ");
        System.out.println("A BASE DO ARRAY É UM TIPO DE ARRAY DE INTEIRO");

        for (double[] arrBase : days2) {
            for (double num : arrBase ) {
                System.out.println(num);

            }
        }





    }
}
