//Task: Gym Day Pass System
//
//A small gym sells day passes at the front desk. The receptionist types in the visitor's name, age, and which section they want (weights/cardio/pool). Price depends on the section:
// weights is 500, cardio is 400, pool is 700.
//
//Write a program that:
//
//Reads the visitor's details from the keyboard using Scanner
//Creates a GymPass object using a parameterized constructor — price is NOT typed in, it's determined by which section was chosen
//Prints a pass summary
//
//Make 2 passes in one run (read input twice, create two objects).
//
//Constraint: if someone types a section that doesn't exist, the pass should still be created but with price 0 and the summary should print "INVALID SECTION" next to it.

import java.util.Scanner;

public class GymPass {

    private String name;
    private int age;
    private String section;
    private int price;

    GymPass(String name, int age, String section) {

        this.name = name;
        this.age = age;
        this.section = section;

        if (section.equals("weights")) {
            price = 500;
        } else if (section.equals("cardio")) {
            price = 400;
        } else if (section.equals("pool")) {
            price = 700;
        } else {
            price = 0;
        }
    }

    public void summary() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("Price: " + price);

        if (price == 0) {
            System.out.println("INVALID SECTION");
        }
    }
}

class GymApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter name:");
        String name = input.nextLine();

        System.out.println("Enter age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter section:");
        String section = input.nextLine().toLowerCase();

        GymPass pass1 = new GymPass(name, age, section);

        System.out.println("------------Pass Created----------");
        pass1.summary();

        System.out.println("------------------------------------");

        
        System.out.println("Enter name:");
        name = input.nextLine();

        System.out.println("Enter age:");
        age = input.nextInt();
        input.nextLine();

        System.out.println("Enter section:");
        section = input.nextLine().toLowerCase();

        GymPass pass2 = new GymPass(name, age, section);

        System.out.println("------------Pass Created----------");
        pass2.summary();
    }
}
