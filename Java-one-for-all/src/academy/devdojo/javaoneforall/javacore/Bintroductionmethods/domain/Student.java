package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    //Ha duas classes iguais, Student, em pacotes diferentes. Pra nós
    //humanos é a mesma coisa, para a máquina são coisa bem diferentes

    public String name;
    public int age;
    public char gender;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
