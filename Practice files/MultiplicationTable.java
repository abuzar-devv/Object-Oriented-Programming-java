//Write a program to display the multiplication table of a number entered by the user.

import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter value for printing table:");
        int table= input.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(table+"x"+i+"="+(table*i));
        }
    }
}
