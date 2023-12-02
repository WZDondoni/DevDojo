package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class PrinterStudent {
    public  void print(Student student){
        //no argumento crio-se a variável de referência student.
        // lembre-se que a classe blueprint Student, tem em seu corpo name, age e gender;

        //a variável student
        System.out.println("-----------------------------");

        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);

        //PODE HAVER INFINITAS REFERENCIAS PRO MESMO OBJETO.

    }

}
