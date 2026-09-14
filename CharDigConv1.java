import java.util.Scanner;

public class CharDigConv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a radix: ");
        int radix = input.nextInt();
        
        System.out.println("Please choose one:");
        System.out.println("1 -- Convert digit to character");
        System.out.println("2 -- Convert character to digit");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter a digit: ");
            int digit = input.nextInt();
            
            char result;
            if (digit < 10) {
                result = (char) ('0' + digit); 
            } else {
                result = (char) ('A' + (digit - 10)); 
            }
            
            System.out.println("Convert digit to character: " + result);
            
        } else if (choice == 2) {
            System.out.print("Enter a character: ");
            char ch = input.next().toUpperCase().charAt(0); 
            
            int result;
            if (ch >= '0' && ch <= '9') {
                result = ch - '0'; 
            } else {
                result = 10 + (ch - 'A'); 
            }
            
            System.out.println("Convert character to digit: " + result);
            
        } else {
            System.out.println("Invalid choice!");
        }
        
        input.close();
    }
}