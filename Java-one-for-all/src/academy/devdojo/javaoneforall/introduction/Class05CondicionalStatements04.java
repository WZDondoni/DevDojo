package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements04 {
    public static void main(String[] args) {
        double annualSalary = 30000;
        double firstBracket = 9.70/100;
        double secondBracket = 37.35/100;
        double thirdBracket = 49.50/100;
        double amountToBePaid;
        if (annualSalary <= 34712){
            amountToBePaid = annualSalary * firstBracket;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) //poderia economizar digitos retirando a primeira condição, porém caso houvesse uma construção errada do código, tipo IF e depois IF (sendo que o correto seria ELSE IF) , o programa iria validar a segunda cadeira, uma vez que também é manor do que 65587.
        {
            amountToBePaid = annualSalary * secondBracket;


         } amountToBePaid = annualSalary * thirdBracket;
        System.out.println(amountToBePaid);
    }




}
