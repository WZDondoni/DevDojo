package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.PrinterStudent;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student fisicalStudent = new Student();
        /*fisicalStudent é uma variavel de referencia, com seu ENDEREÇO INDIVIDUAL, que referencia um novo objeto*/
        Student mathStudent = new Student();
        /*mathStudent é uma variavel de referencia, com seu ENDEREÇO INDIVIDUAL, que referencia um novo objeto*/
        PrinterStudent printer = new PrinterStudent();


        fisicalStudent.name = "Midoriya"; //< inicializando o objeto
        fisicalStudent.gender = 'M'; //<inicializando o objeto
        fisicalStudent.age = 15; //< inicializando o objeto

        mathStudent.name = "Sakura";//< inicializando o objeto
        mathStudent.gender = 'F';//< inicializando o objeto
        mathStudent.age = 16;//< inicializando o objeto

    }
}
