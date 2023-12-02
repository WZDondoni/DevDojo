package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTipes {
    public static void main(String[] args) {
        /*
        **Primitive types**
        *lowcase*

        int : integer numbers
        long : integer numbers
        char: integer numbers
        byte: integer numbers : 1byte == 8bits (11111111)
        short: integer numbers

        double : decimal numbers
        float : decimal numbers
        boolean : true or false
         */
        //lembre-se que para nomear uma classe, sempre será primeira letra maíscula de cada palavra
        //variáveis, será "camelCase";
        int age = 10; //inteiros não decimais.
        long bigNumber = 1000; //inteiros não decimais.
        float salaryFloat = 2500; //são para decimais.
        double salaryDouble = 5000; //são para decimais.
        boolean trueValue = true;
        boolean flaseValue = false;
        short ageShort = 29;
        byte ageByte = 127;//store one byte; one byte == 8bits
        char character = 95; //ASCII TABLE, ou digite apenas uma letra. Or Unicode '\u0041'
        char character2 = '\u0041'; //tabela unicode.
        //all primiteve types are numbers, except boolean;
        //"cast" is talk to the compiler "I know what I want, trust me"
       //String is a Class. Because this initialize with Upercase

        //default valor= quando digitador um valor inteiro subentende-se interger
        //default valor = quando digitar um valor com virgula, por defaut é double.


        System.out.println("The age is "+ age+" years old");
                //lembre-se que a variável é separar um espacço na memória e lhe dar um nome a esse espaço;

        //String is not primitive tipe, he is a reference type. He is a Classe.





    }
}
