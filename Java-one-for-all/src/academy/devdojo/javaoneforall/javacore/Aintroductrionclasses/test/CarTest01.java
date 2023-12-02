package academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductrionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Ferrari";
        car1.model = "Enzo";
        car1.year = 2007;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1956;

        car1 = car2; // com isso vc refencia que o objeto car1 receberá todos os atributos de car2
        //imprimindo aparecerá apenas Mustang GT500 1956
        //car2 = mathProfessor; Não dá certo, pois são "coisas" diferentes. Será possível algo similar com heranças.




        System.out.println("\n-----Car1-----");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);


        System.out.println("\n-----Car2------");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);

        //https://i.imgur.com/SbyTP15.jpg





    }
}
