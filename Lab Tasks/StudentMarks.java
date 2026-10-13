//Create an encapsulated class `Student` with the following:
//
//        **Data Members:**
//        - `String name`
//        - `int[] result_array` (marks for 5 subjects)
//
//        **Methods:**
//        - Parameterized constructor `Student(String, int[])`
//        - `Average()` — calculates and returns the average of the marks.
//
//        **Runner (`main`):**
//        - Create two `Student` objects and call `Average()` for both.
//- Compare their averages and display which student has the higher average, or if they are equal.
//- Create a third `Student` object using the first student's name and the second student's marks array.

import java.util.Arrays;
public class StudentMarks {

    private String name;
    private double[] result_array;

    StudentMarks(String name, double[] result_array){
        this.name=name;
        this.result_array=result_array;

    }

    public double average(){
        double sum=0.0;

        for(double i : result_array){
            sum+=i;
        }
        return sum/result_array.length;
    }

    public String getName() {
        return name;
    }

    public double[] getResultArray() {
        return result_array;
    }
}

class StudentRun{
    public static void main(String[] args) {
        StudentMarks s1=new StudentMarks("Abuzar",new double[]{22.4,11.5,20,22,25});
        StudentMarks s2=new StudentMarks("Safi",new double[]{22.4,11.5,22,24,11});
        StudentMarks s3 = new StudentMarks(s1.getName(), s2.getResultArray());

        double avg_1=s1.average();
        double avg_2=s2.average();

        if(avg_1>avg_2){
            System.out.println((s1.getName()+" "+"has higher average:"+avg_1));
        } else if (avg_2>avg_1) {
            System.out.println(s2.getName()+"has higher average"+avg_2);

        }else {
            System.out.println("Both students have same average:"+avg_1);
        }

    }
}




