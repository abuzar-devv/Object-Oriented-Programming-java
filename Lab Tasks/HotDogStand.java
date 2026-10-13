//Suppose you operate several hot dog stands across a town.
//
//Create an encapsulated class named `HotDogStand` with two instance variables:
//        - The stand's ID number.
//        - The number of hot dogs sold by that stand during the day.
//
//Create a constructor to initialize both instance variables.
//
//Create a method named `justSold()` that increases the number of hot dogs sold by one each time it is called.
//
//In the `main` method, test your class by creating at least three hot dog stand objects. Simulate each stand selling different numbers of hot dogs by calling `justSold()` multiple times.
//
//Finally, display the number of hot dogs sold by each stand.

public class HotDogStand {
    private String stand_id;
    private int no_of_sale;


    HotDogStand(String stand_id,int no_of_sale){
        this.stand_id=stand_id;
        this.no_of_sale=no_of_sale;
    }

    public void JustSold(){
        no_of_sale+=1;
        System.out.println(stand_id+" Sold hotdogs:"+no_of_sale);
    }
}

class HotDogStandRun{
    public static void main(String[] args) {
        HotDogStand stand_1=new HotDogStand("A1",10);
        HotDogStand stand_2=new HotDogStand("A2",11);
        HotDogStand stand_3=new HotDogStand("A3",100);

        stand_1.JustSold();
        stand_2.JustSold();
        stand_3.JustSold();
    }
}
