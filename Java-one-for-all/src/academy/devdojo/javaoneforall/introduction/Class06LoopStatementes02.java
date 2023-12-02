package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatementes02 {
    //print all numbers even from 0 to 1000

    public static void main(String[] args) {

        //one way to resolve, but wrong. Have problem with com the information, if user send 1 is odd
        for(int i=0; i<=1000;i+=2){
            System.out.println(i);
        }

        //other way, correctly. More flexible and upscale.
        for(int i=0; i<=1000;i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
