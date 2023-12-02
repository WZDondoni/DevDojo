package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.PrinterStudent;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student fisicalStudent = new Student();
        /*fisicalStudent é uma variavel de referencia, com seu ENDEREÇO INDIVIDUAL, que referencia um novo objeto*/
        Student mathStudent = new Student();
        /*mathStudent é uma variavel de referencia, com seu ENDEREÇO INDIVIDUAL, que referencia um novo objeto*/
        PrinterStudent printer = new PrinterStudent();
        //criado uma nova Classe que só serve pra imprimir Estudante(alta coesão),
        // e essa classe precisa virar objeto, nome printer.
        //o objeto "printer" tem dentro dele herdado da classe blueprint há um método chamado "print"

        fisicalStudent.name = "Midoriya"; //< inicializando o objeto
        fisicalStudent.gender = 'M'; //<inicializando o objeto
        fisicalStudent.age = 15; //< inicializando o objeto

        mathStudent.name = "Sakura";//< inicializando o objeto
        mathStudent.gender = 'F';//< inicializando o objeto
        mathStudent.age = 16;//< inicializando o objeto

        /*
        System.out.println(student01.name);
        System.out.println(student01.gender);
        System.out.println(student01.age);

        System.out.println("-----------------------------");

        System.out.println(student02.name);
        System.out.println(student02.gender);
        System.out.println(student02.age);
        */
        /*observa-se que o print usado ACIMA é repetitivo, e o que se muda
         * é APENAS A VARIÁVEL DE REFERÊNCIA*/


        //LEMBRE-SE:
        //Quando se passa Objeto como arqumento, vc passa onde aquele objeto está guardado na memória.
        //Quando passa tipo primitivo como argumento, vc passa copia

        printer.print(fisicalStudent);
        printer.print(mathStudent);













    }
}
