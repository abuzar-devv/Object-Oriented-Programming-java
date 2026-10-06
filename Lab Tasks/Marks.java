//Lab 3 - Task 1
//
//Create an Encapsulated class Marks with three data members to store three marks. Create set and get
//methods for all data members. Test the class in runner
//

public class Marks {

    private double m1,m2,m3;

    public void setMarks(double m1 , double m2 , double m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    public void getMarks(){
        if (m1<0 || m2<0 || m3<0){
            System.out.println("Marks cannot be -ve");

        }else{
            System.out.println("Marks 1: "+m1+"\nMarks 2: "+m2+"\nMarks 3: "+m2);
        }

    }

}

class MarksRun{
    public static void main(String[] args) {

        Marks m=new Marks();
        m.setMarks(22.4,44.5,41.5);
        m.getMarks();
    }
}