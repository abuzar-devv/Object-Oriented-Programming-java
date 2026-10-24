// Lab 4 - Task 1

//Create a class ― Distance‖ with two constructors (no argument, and two argument), two data members
//( feet and inches) . Create setter, getter and display method. Create a method that adds two Distance
//Objects and returns the added Distance Object.

public class Distance {
    double feet;
    double inches;

    Distance(){
        feet=2.5;
        inches=5;
    }

    Distance(double feet,double inches){
        this.feet=feet;
        this.inches=inches;
    }
    void setFeet(double feet){
        this.feet=feet;
    }
    void setInches(double inches){
        this.inches=inches;
    }
    double getFeet(){
        return feet;
    }
    double getInches(){
        return inches;
    }

    void display(){
        System.out.println(feet+inches);
    }

}

class DistanceRun{
    public static void main(String[] args) {
        Distance d1=new Distance();
        Distance d2=new Distance(22.5,9.1);

        d1.display();
        d2.display();

        d1.setFeet(8.1);
        d1.setInches(1.1);
        d1.getFeet();
        d1.getInches();
        d1.display();
    }
}