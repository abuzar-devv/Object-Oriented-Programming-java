/*
Task 2 — Student Course Enrollment

A university needs a small system to decide whether a student can enroll
in a course.

The system takes:
- Student name
- Student ID
- Course code
- Credit hours

Allowed course codes:
MATH101, CS101, STAT201, DS201

Allowed credit hours:
3 or 4

An enrollment is valid only if:
- Student ID is exactly 8 characters long
- Student name is not empty
- Course code exists in the allowed course set
- Credit hours are 3 or 4

Requirements:
- Create a class representing the enrollment.
- All fields must be private.
- Take input using Scanner inside the constructor.
- Perform validation inside the constructor.
- Use a data structure for the allowed course codes instead of
  writing separate if conditions for every course.
- The object must remember whether the enrollment is valid.
- main() must create at least 3 enrollment objects:
  1. One valid enrollment
  2. One with an invalid student ID
  3. One with an invalid course code
- Print the result for each enrollment.
- Do not use setters.
- Do not use loops yet.
- Do not use inheritance, interfaces, ArrayList, HashMap, or concepts
  that we have not covered yet.
*/

import java.util.Arrays;
import java.util.Scanner;

public class CourseEnrollment {

    private String name;
    private String id;
    private String course_code;
    private int credit_hours;
    String[] courses={"MATH101", "CS101", "STAT201","DS201"};

    CourseEnrollment(Scanner input){

        if (id.length()==8){
            System.out.println("Enter your name:");
            name=input.nextLine();

            if(name.length()!=0){
                System.out.println("Enter your course code , courses being offered are :\"MATH101\", \"CS101\", \"STAT201\",\"DS201\" ");
                course_code=input.nextLine();

                if(Arrays.asList(courses).contains(course_code)){
                    System.out.println("Enter credit hours 3 or 4");
                    
                }


            }else{
                System.out.println("Enter valid course code");
            }

        }else{
            System.out.println("Id should be of length 8");
        }

    }

}
