package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatementes01 {
    public static void main(String[] args) {
        // while; do-while, for
        int counter = 0;

        System.out.println("====WHILE====");
        while (counter < 10/*waiting boolean result "True" Not value*/) {
            //always change the counter to no in on infinit loop
            System.out.println(++counter);
            //counter = counter + 1; adiciona um de valor ao contador.
            //++counter resulta em 1, 2, 3, 4,5, 6, 7, 8, 9 ,10
            //counter++ resulta em 0, 1, 2, 3, 4, 5, 6, 7, 8, 9


        }
        System.out.println("====DO-WHILE====");

        counter = 12;
        do {
            System.out.println("dentro 'do' -- executado mesmo se falso ao menos uma vez." + ++counter);

        } while (counter < 10);

        System.out.println("====FOR====");
        /* USADO QUANDO NÃO TIVER UM INDEX. DESEJA RODAR POR TODOS A PROCURA DE ALGO;
        USADO TAMBÉM PARA PASSAR DE UM EM UM.
        //há 3 partes; for(;;) { sout(insidefor) } É ESTRANHO MAS É UMA SINTAXE VÁLIDA, MAS SEM USO.
        //1 PARTE : DECLARAR, ou usar, A VARIÁVEL QUE SERÁ USADA APENAS DENTRO DO BLOCO(LOCAL), COMO É LOCAL É ACONSELHADO INICIAR A VARIÁVEL;
        //2 PARTE :

        * */
        for (int i=0; /*until*/ i<10;/*increment*/i++){
            /*do this*/
            System.out.println("inside for "+i);
            //this 'i' just inside the 'for' block

        }





    }



}

