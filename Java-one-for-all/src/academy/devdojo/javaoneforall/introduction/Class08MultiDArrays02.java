package academy.devdojo.javaoneforall.introduction;

public class Class08MultiDArrays02 {
    public static void main(String[] args) {

        int[][] array = new int[3][]; //CRIANDO um Array Multidimensional definir no mínimo o tamanho, pios pode ter um tamanho indefinido.
        int[] numbers = {1, 2, 3};//criado para ser atribuido abaixo
        //inicializando os arrays
        array[0] = new int[]{1, 2}; //1ª posição "0" desse array faz referencia para um array de 2 posições
        array[1] = numbers; //2ª posição "1" desse array faz referencia para um array de 3 posições criado antes e atribuido
        array[2] = new int[]{1, 2, 3, 4, 5, 6};//3ª posição "2" desse array faz referencia para um array de 6 posições


        for (int[] baseArray : array) {
            System.out.println("\n----------");
            for (int num : baseArray) {
                System.out.println(num + " "); // se tentar acessar algo que não existe, no caso os arrays
                // dentro do array dará "null point exception", porque aquilo que está tentando acessar não existe na memória
                // array de array sempre inicializa com nulo.
                // arrays da ponta criados, como são inteiros seu valor padrão é zero.

            }


        }
        /*Uma outra forma de inicializar array Mult*/
        int[][] array2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        // um array de base 3(três coxetes), e com 2 3 e 6 elementos cada array da ponta.
        for (int[] baseArray : array2) {
            System.out.println("\n----------");
            for (int num : baseArray) {
                System.out.println(num + " ");


            }
        }
    }
}
