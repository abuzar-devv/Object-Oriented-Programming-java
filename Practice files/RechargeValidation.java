//### Task — Recharge Card Validator
//
//Build a Java system that validates Pakistani prepaid recharge cards.
//
//A card is valid only if:
//        - Card number is exactly 12 digits and exists in the allowed card set.
//        - Denomination is `100`, `300`, `500`, or `1000`.
//        - Serial number is not empty.
//
//### Requirements
//- Take card input inside the constructor using `Scanner`.
//        - Perform all validation inside the constructor.
//        - Create at least 3 card objects in `main()`.
//        - Include valid and invalid cards and print the result for each.
//- Invalid cards must not be loaded or accepted.
//        - All card fields must be `private`.
//        - Once created, a card cannot be changed; no setters.
//        - `main()` should not directly inspect the card's fields.
//


import java.util.Arrays;
import java.util.Scanner;


public class RechargeValidation{

    private String card_number;
    private int denomination;
    private String serial_number;
    Integer[] denomination_set = {100, 300, 500, 1000};
    String[] card_set = {"123456789012", "987654321098", "555555555555"};

    RechargeValidation(Scanner input){

        System.out.println("Enter 12 digit card number:");
        card_number=input.nextLine();

        if (card_number.length()==12){

            if (Arrays.asList(card_set).contains(card_number)) {
                System.out.println("Enter denomination : 100 , 300 , 500 , 1000");
                denomination=input.nextInt();
                input.nextLine();

                if(Arrays.asList(denomination_set).contains(denomination)) {
                    System.out.println("Enter serial number:");
                    serial_number=input.nextLine();

                    if(serial_number.length()==0){
                        System.out.println("Transaction Failed :serial number cannot be left empty ");

                    }else {
                        System.out.println("Transaction done");
                    }

                }else {
                    System.out.println("Invalid denomination entered , select out of : 100,300,500,1000");
                }

            }else{
                System.out.println("Invalid card number");
            }

        }else {
            System.out.println("Incomplete card number , it should have length : 12 ");
        }


    }

}

class load{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        RechargeValidation card1 = new RechargeValidation(input);
        RechargeValidation card2 = new RechargeValidation(input);
        RechargeValidation card3 = new RechargeValidation(input);

    }
}
