//Task: Coffee Shop Order System
//
//A small coffee shop tracks its drink orders. Every order has a drink name, size (small/medium/large), price, and whether it's iced or hot.
//
//Here's what the shop needs:
//
//When a customer orders a regular black coffee, the barista just hits a button — no details needed. It defaults to: "Black Coffee", medium, 350 rupees, hot.
//When a customer orders something specific, the barista enters all four details.
//The system prints a receipt line for any order.
//
//Write a class CoffeeOrder with:
//
//Both types of constructors (figure out which ones from the description above)
//A method that prints the order as a receipt line
//A main that creates at least 3 orders — one default, two custom — and prints all receipts
//
//Constraints:
//
//Fields must be private
//No setters. Once an order is created, it cannot be changed. The constructor is the only way data gets in.

class CoffeeOrder{

    private String coffee_type;
    private String size;
    private double price;
    private String serving_temperature;

    CoffeeOrder(){
        coffee_type="Black Coffee";
        size="medium";
        price=350;
        serving_temperature="hot";
    }

    CoffeeOrder(String a,String b, double c, String d ){

        coffee_type=a;
        size=b;
        price=c;
        serving_temperature=d;

    }

    void reciept(){

        System.out.println("Coffee : "+coffee_type);
        System.out.println("Size: "+size);
        System.out.println("Price: "+price);
        System.out.println("Serving temperature: "+serving_temperature);
    }
}

class CoffeeOrdered{
    public static void main(String[] args) {
        CoffeeOrder order_1=new CoffeeOrder();
        CoffeeOrder order_2=new CoffeeOrder("Expresso","Large",400,"Cold");
        CoffeeOrder order_3=new CoffeeOrder("latte","Large",450,"Cold");

        order_1.reciept();
        System.out.println("-----------New order------------");
        order_2.reciept();
        System.out.println("-----------New order------------");
        order_3.reciept();
    }
}