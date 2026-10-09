
// Task — Student Cafeteria Order
// Build a system to record student food orders.

// Requirements:
// - Each student has an 8-character university ID.
// - Each order has a food item, quantity (>= 1), and unit price (> 0).
// - Calculate each order's total cost.
// - Reject invalid data without crashing.
// - Students can place multiple orders.
// - Demonstrate multiple valid and invalid orders.

// You decide:
// - Classes, objects, and their responsibilities.
// - Validation rules and handling.
// - How multiple orders are stored.
// - How students are linked to their orders.


import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Cafeteria {

    private String id;
    private double price;
    private int quantity;


    HashMap<String, Integer> menu = new HashMap<>(
            Map.of(
                    "burger", 250,
                    "pizza", 400,
                    "sandwich", 300,
                    "cold drink",50
            )
    );

    Cafeteria(Scanner input){
        System.out.println("Enter ID:");
        id=input.nextLine();

        if(id.length()==8){
            System.out.println("--------Welcome to the cafe--------");
            System.out.println("Here is the menu , order here :"+menu);
            String item=input.nextLine().toLowerCase(); //for now 1 person can order only 1 item with >=1 quantity

            if (menu.containsKey(item)){
                System.out.println("Enter Quantity");
                quantity=input.nextInt();
                input.nextLine();
                System.out.println("--------Reciept-------");
                System.out.println("Item ordered:"+item+"\nQuantity:"+quantity+"\nBill:"+quantity*menu.get(item));

            }else {
                System.out.println("Item unavailable");
            }


        }else {
            System.out.println("Invalid id entered");
        }
    }
}

class CafeteriaRun{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Cafeteria order_1=new Cafeteria(input);
        Cafeteria order_2=new Cafeteria(input);
        Cafeteria order_3=new Cafeteria(input);
    }
}


