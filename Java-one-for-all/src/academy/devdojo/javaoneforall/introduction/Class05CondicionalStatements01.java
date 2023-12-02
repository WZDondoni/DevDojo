package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements01 {
    public static void main(String[] args) {

        System.out.println("--- IF ----");
        int age = 10;
        boolean isAllowedToBuyAlcohol = age >=20;
        if(isAllowedToBuyAlcohol){
            System.out.println("Authorized to buy alcohol");//true
        }
        //System.out.println("outside IF");//false

        System.out.println("--- ! 'NOT'----");
        if (
                !isAllowedToBuyAlcohol/* SE NÃO VERDADEIRO..versão curta da linha abaixo usando '!' a frente*/
                /*isAllowedToBuyAlcohol == false*/
           ){
            System.out.println("Sorry, you are not allowed to buy alcohol");

            boolean c = true;
            if (c = false /*lembrese que é necessário ter uma comparação para retornor V ou F. Nesse caso o C está recebendo um vaor false e não realizando uma comparação*/){
                System.out.println("c inside if");
            }
            System.out.println("c out of if");

            boolean d = false;
            if (d==true){
                System.out.println("d - if - true");
            } else {
                System.out.println("d - else - false");
            }
        }






    }
}
