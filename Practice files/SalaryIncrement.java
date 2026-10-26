//A company wants a Java console program to manage an employee's salary. HR enters the employee's current salary and a percentage increment.
// The program must calculate the increment, update the salary, and display both the original and updated salary.
//
// Requirements:

//- Take the salary and increment percentage as user input using Scanner.
//- Keep the employee's salary private.
//- Use a constructor to initialize the salary.
//- Use a method to apply the percentage increment.
// - Display the original salary, increment amount, and updated salary.
//- Reject negative salaries and negative increment percentages.
//- An increment of 0% is valid.
//- No inheritance, arrays, or advanced concepts.

import java.util.Scanner;
public class SalaryIncrement {
    private double salary;
    private double increment;

    SalaryIncrement(double salary, double increment){

        this.salary=salary;
        this.increment=increment;

    }

    double incrementCalc(){
        return (salary+( (increment/100) * salary ));
    }

    double getSalary(){
        return salary;
    }

    double getIncrement(){
        return increment;
    }
}

class SalaryCalc{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Enter base salary:");
        double salary = input.nextDouble();

        System.out.println("Enter increment percentage:");
        double increment = input.nextDouble();


        SalaryIncrement s1 = new SalaryIncrement(salary, increment);


        if(s1.getSalary()>0 && s1.getIncrement()>=0){
            System.out.println("Base salary:"+s1.getSalary()+"\nIncrement % :"+s1.getIncrement()+"\nUpdated salary:"+s1.incrementCalc());
        }else {
            System.out.println("Error");
        }
    }
}
