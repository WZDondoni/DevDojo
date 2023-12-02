package academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.domain.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor mathProfessor = new Professor();
        mathProfessor.age = 150;
        mathProfessor.name = "Kami";
        mathProfessor.gender = 'M';

        System.out.println("Age: "+ mathProfessor.age + "\nGender: "+ mathProfessor.gender+ "\nName: " + mathProfessor.name );

    }
}
