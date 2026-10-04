/*
Task 2 — Student Course Enrollment

Build a university enrollment system.

Student data:
- Name
- 8-character ID
- Course code
- Credit hours

Offered courses: MATH101, CS101, STAT201, DS201
Credit hours: 3 or 4

An enrollment is valid only when all data is valid.
Invalid enrollments must be rejected without crashing.

Test at least 3 valid/invalid enrollment cases and report each result.
Keep enrollment data private and preserve its validity state.

Do not use setters, loops, inheritance, interfaces, ArrayList, or HashMap.
*/

import java.util.Arrays;
import java.util.Scanner;

public class CourseEnrollment {

    private String name;
    private String id;
    private String course_code;
    private int credit_hours;
    String[] courses={"MATH101", "CS101", "STAT201","DS201"};
    String[] rollNumbers_set = {"CS-25001", "DS-25002", "AI-25003", "SE-25004", "EE-25005", "ME-25006", "CE-25007", "MT-25008", "PH-25009", "CH-25010"};

    CourseEnrollment(Scanner input){

        System.out.println("-------Course Registration-------");
        System.out.println("Enter id:");
        id=input.nextLine().toUpperCase();

        if (id.length()==8){

            if (Arrays.asList(rollNumbers_set).contains(id)){
                System.out.println("Enter your name:");
                name=input.nextLine();

                if(name.length()!=0){
                    System.out.println("Enter your course code , courses being offered are :\"MATH101\", \"CS101\", \"STAT201\",\"DS201\" ");
                    course_code=input.nextLine().toUpperCase();

                    if(Arrays.asList(courses).contains(course_code)){
                        System.out.println("Enter credit hours (3 or 4)");
                        credit_hours=input.nextInt();
                        input.nextLine();

                        if(credit_hours==3 || credit_hours==4){
                            System.out.println("Course registered");
                            System.out.println("Name:"+name+"\nRoll no:"+id+"\nCourse code:"+course_code+"\nCredit hours:"+credit_hours);

                        }else {
                            System.out.println("Credit hours can be 3 or 4 only");
                        }

                    }else {
                        System.out.println("Course not found!");
                    }

                }else{
                    System.out.println("Must enter name to register a course!");
                }
            }else {
                System.out.println("ID no not found!");
            }
        }else{
            System.out.println("Id should be of length 8");
        }

    }

}

class CourseEnrollmentRun{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        CourseEnrollment Student_1=new CourseEnrollment(input);
        CourseEnrollment Student_2=new CourseEnrollment(input);
        CourseEnrollment Student_3=new CourseEnrollment(input);

    }
}
