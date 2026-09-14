import java.util.Arrays;
import java.util.Scanner;

public class ArrayDisplay2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("How many elements do you want to store? ");
            int size = input.nextInt();
            
            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter value for element " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            System.out.println("You entered " + size + " elements:");
            System.out.println(Arrays.toString(numbers));

        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers only.");
        } finally {
            input.close();
        }
    }
}