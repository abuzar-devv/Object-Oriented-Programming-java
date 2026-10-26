//Write a program that inputs a student's marks and displays Pass if marks are at least 50; otherwise, display Fail.

import java.util.Scanner;

public class Result {
    private double marks;

    Result(double marks) {
        this.marks = marks;
    }

    void displayResult() {
        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

class MarksRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks (x/100):");
        double marks = input.nextDouble();

        if (marks >= 0 && marks <= 100) {
            Result r1 = new Result(marks);
            r1.displayResult();
        } else {
            System.out.println("Enter marks in valid range (0-100)");
        }
    }
}