package academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {


        Student FisicalStudent = new Student();
        FisicalStudent.name = "Sanji"; // mesmo o nome atribuido na Classe mesta, ao atribuir local ele recebe esse.
        System.out.println(FisicalStudent.name);
        System.out.println(FisicalStudent.age);
        System.out.println(FisicalStudent.gender);

        System.out.println("----------------------------");

        Student EnginerStudent = new Student();
        System.out.println(EnginerStudent.name);
        System.out.println(EnginerStudent.age);
        System.out.println(EnginerStudent.gender);

    }

}
