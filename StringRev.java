import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any string: ");
        String original = input.nextLine();
        
        String reversed = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);
        
        input.close();
    }
}
