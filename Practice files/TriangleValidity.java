// Check validity of triangle

import java.util.Scanner;
public class TriangleValidity {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter length of side a:");
        double a= input.nextDouble();

        System.out.println("Enter length of side b:");
        double b= input.nextDouble();

        System.out.println("Enter length of side c:");
        double c= input.nextDouble();

        if (a > 0 && b > 0 && c > 0 &&
                a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

}
