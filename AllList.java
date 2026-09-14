import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Reverse");
            System.out.println("4. Sort");
            System.out.println("5. Remove");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch(choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String item = input.nextLine();
                    list.add(item);
                    System.out.println("List: " + list);
                    break;

                case 2:
                    System.out.print("Enter index to edit: ");
                    int index = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter new value: ");
                    String newValue = input.nextLine();
                    list.set(index, newValue);
                    System.out.println("List: " + list);
                    break;

                case 3:
                    Collections.reverse(list);
                    System.out.println("Reversed List: " + list);
                    break;

                case 4:
                    Collections.sort(list);
                    System.out.println("Sorted List: " + list);
                    break;

                case 5:
                    System.out.print("Enter element to remove: ");
                    String removeItem = input.nextLine();
                    list.remove(removeItem);
                    System.out.println("List: " + list);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 6);

        input.close();
    }
}