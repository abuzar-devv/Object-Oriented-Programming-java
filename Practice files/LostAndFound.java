/*
Stage 1 — Practice 2: Campus Lost-and-Found

Build a Java console app using Scanner.

Input: Item, location, finder, days since found.

Rules:
- Reject blank/whitespace-only text.
- Days: 0–30; handle invalid numbers safely.
- Show details only for valid registrations.
- Allow repeats; -1 exits, other valid integers continue.
- Never report invalid entries as successful.

Limits: Covered Java/OOP only; no inheritance,
interfaces, collections, files, or advanced exceptions.

Ambiguity: Day 30 accepted (written) vs rejected (verbal).
Declare your chosen policy.

Before coding: Define questions, assumptions, data,
validation, object roles, edge cases, invalid states,
and design justification.
*/

import java.util.Scanner;

public class LostAndFound {
    String item_name;
    String found_location;
    String finder_name;
    int days_since_discovery;

    LostAndFound(String item_name, String found_location, String finder_name, int days_since_discovery) {
        this.item_name=item_name;
        this.found_location=found_location;
        this.finder_name=finder_name;
        this.days_since_discovery=days_since_discovery;
    }
}
class LostAndFoundRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Lost and Found!");
        int i = 0;

        while (i != -1) {

            System.out.println("Enter the Name of item:");
            String item_name = input.nextLine().strip();

            if (item_name.isBlank()) {
                System.out.println("You must enter item name:");
                break;
            }

            System.out.println("Enter location where you found the lost item:");
            String found_location = input.nextLine().strip();

            if (found_location.isBlank()) {
                System.out.println("You must enter location where you found the item");
                break;
            }

            System.out.println("Enter your name:");
            String finder_name = input.nextLine().strip();

            if (finder_name.isBlank()) {
                System.out.println("You must enter your name:");
                break;
            }

            System.out.println("Enter no days since you discovered the lost item (0-30):");

            if (!input.hasNextInt()) {
                System.out.println("Enter valid no of days (0-30):");
                break;
            }

            int days_since_discovery = input.nextInt();

            if (days_since_discovery < 0 || days_since_discovery > 30) {
                System.out.println("Enter valid no of days (0-30):");
                break;
            }

            System.out.println("Submission accepted! details are as follow:");

            System.out.println("Name:" + finder_name + "\nname of item:" + item_name + "\nLocation where item was found:"
                    + found_location + "\nDays since the discovery of item:" + days_since_discovery);

            System.out.println("Enter -1 if you do not want to register another item or enter any number to register another item!");

            i = input.nextInt();
            input.nextLine();

            LostAndFound item = new LostAndFound(item_name, found_location, finder_name, days_since_discovery);
        }
    }
}