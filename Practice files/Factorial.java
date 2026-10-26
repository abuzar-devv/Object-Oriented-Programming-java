// Take an integer as input and calculate its factorial

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a +ve integer to take its factorial:");
        int number=input.nextInt();
        int factorial=1;

        if(number>=0){

            for(int i=number;i>0;i--){
                factorial*=i;
            }
            System.out.println("Factorial is :"+factorial);


        }else {
            System.out.println("Enter a +ve integer!");
        }
    }
}
