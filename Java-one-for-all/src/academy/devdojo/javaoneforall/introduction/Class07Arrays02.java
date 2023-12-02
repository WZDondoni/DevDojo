package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        //reference types      //arrays are objects
        String[] names = new String[10];//always to need info the size.

        names[0] = "Goku";//assigning values
        names[2] = "Naruto";
        names[1] = "Luffy";
        //the ordem d'ont interfere

        System.out.println("==========printing JUST with println===========");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("==========PRINTING WITH FOR ===========");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);

        }
        //names = new String[5]; // criouse um novo tamanho para o array
        // nesse momento EXISTE o array de 3 posições e o de 5,
        // porém apenas o de 5 está sendo referenciado na memoria.
        // the copilator recolhe this spaces memory dont have references.

        System.out.println("========== PRINT WHIT .LENGTH ===========");
        //arrays names is references "variables" types and references theres metodhs e propriets
        // Ex> names.length
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }






        //primitive types zero value is zero and string is null;
        // char is blank space like '' unicode u000
        // boolean default value is false
        // reference types default value null
        // objetcts is null too.

    }
}
