package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        //+ , sinal de soma está sobrecarregado, é usado para concatenar assim como fazer operação. Se foram duas variáveis numericas apenas ele soma, se tiver uma string junto apartir da string o compilador irá concatenar.
        // antes da string ele vai somar.
        // -
        // /
        // *
        int number01 = 10;
        double number02 = 20;
        int number02a = 20;

        System.out.println(number02 - number01);
        System.out.println(number02 + number01 + "Value " + number02 + number01);//30Value 2010
        System.out.println(number02 * number01);
        System.out.println(number01 / number02);//pro java na divisão de 2 números inteiros, resultará em 1 número inteiro. O que teria de fazer é alterar o valor de ao menos uma variável para double.
        System.out.println(number01 / (double) number02a);//pode ser realizado o CAST na operação, caso não queira alterar a variável. Evite CASTING,deixa confuso o código.

        //%
        System.out.println("------------------ Módulos % ---------------------");
        int modulos = 20 % 2;//qualquer número dividido por 2 se o resto for  número '0' é par(even);
        int modulos1 = 21 % 2; //1 número impar(odd)
        int modulos2 = 21 % 7; //
        System.out.println(modulos);
        System.out.println(modulos1);
        System.out.println(modulos2);

        System.out.println("------------------ <> <= >= != == ---------------------");
        //<> <= >= != ==
        //Convencion. when create the boolean variable, uses 'is' before the name of variable.
        boolean isTenLowerTwenty = 10 < 20;
        boolean isTenGreaterTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsTwenty = 10 == 20;
        System.out.println("isTenLowerTwenty : " + isTenLowerTwenty);
        System.out.println("isTenGreaterTwenty : " + isTenGreaterTwenty);
        System.out.println("isTenLowerOrEqualsThanTwenty : " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwenty : " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwenty : " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsTwenty : " + isTenEqualsTwenty);
        //Do not compare int with Strings.. dont compare different types

        System.out.println("------------------ Logical AND(&&) OR(||) NOT(!) ---------------------");
        //no uso do && para que seja verdadeiro toda a sentença deve ser verdaderia. Uma afirmação falsa torna toda a sentença falsa.
        //no uso do || para que seja falso toda a sentença deve ser falsa. Uma sentença verdadeiro não torna a sentença falsa.

        int age = 29;
        float salary = 3500f;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println("isLegalOlderThanThirty: " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty: " + isLegalYoungerThanThirty);


        double curentAccount = 299;
        double savingcurentAccount = 3000;
        float playstationFivePrice = 500;
        boolean isCanBeBouch = curentAccount > playstationFivePrice || savingcurentAccount > playstationFivePrice;
        System.out.println("isCanBeBouch " + isCanBeBouch);

        System.out.println("------------------ = += -= *= %= ---------------------");

        double bonus = 1800;
        // dont need declare the variable type again for a new value. in the scope;
        bonus = 2800;// just change de value
        bonus += 1000; //add 1000 in bonus value memory. bonus = bonus + 1000;
        System.out.println(bonus);//3800
        bonus -= 1000; //remove 1000 in bonus value memory. bonus = bonus - 1000;
        System.out.println(bonus);//2800
        bonus *= 2; //multiple 2 in bonus value memory. bonus = bonus * 2;
        System.out.println(bonus);//5600
        bonus /= 2; //divide 2 in bonus value memory. bonus = bonus / 2;
        System.out.println(bonus);//2800
        bonus %= 2; //demonstre rest(modulos) the division bonus value memory by 2. bonus = bonus % 2;
        System.out.println(bonus);//0

        System.out.println("---------Unary---------");//0
        //Unary ++ -- add 1 ou remove 1
        int count = 0;
        count++;//Do and after increment;
        count--;
        ++count; // increment and when Do;
        --count;
        int count2 = 0;
        System.out.println("count2++");//nesse caso executa o print do valor count2 e depois adicionar +1 a variável
        System.out.println(count2++);//nesse caso executa o print do valor count2 e depois adicionar +1 a variável
        System.out.println(count2);//nesse caso executa o print do valor count2 e depois adicionar +1 a variável

        int count3 = 0;
        System.out.println("++count3");//nesse caso adiciona valor a variável count3 e depois imprime
        System.out.println(++count3);//
        System.out.println(count3);//observe o valor da variável acrescida;





    }
}
