//Write a program to calculate the sum of integers from x to y , take x and y as input.

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter starting integer:");
        int start=input.nextInt();

        System.out.println("Enter ending integer:");
        int stop= input.nextInt();

        int sum=0;

        if(stop>=start) {
            for (int i = start; i <= stop; ) {
                sum += i;
                i++;
            }
            System.out.println("Sum is :"+sum);

        }else {
            System.out.println("Stoping integer should be > starting integer");
        }
    }
}