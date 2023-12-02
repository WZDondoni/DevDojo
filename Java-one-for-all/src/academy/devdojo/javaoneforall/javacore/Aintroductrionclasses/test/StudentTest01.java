package academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {


        Student computerStudent = new Student();
        computerStudent.age = 21;
        computerStudent.gender = 'M';
        computerStudent.name = "Luffy";

        System.out.println(computerStudent.name);
        System.out.println(computerStudent.age);
        System.out.println(computerStudent.gender);

    }

}
