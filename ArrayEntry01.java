import java.util.Arrays;
import java.util.Scanner;

public class ArrayEntry01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter how many elements you want in the array: ");
            int size = input.nextInt();
            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter Element " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
            }

            System.out.println("Your Array Content:");
            System.out.println(Arrays.toString(numbers));

        } catch (Exception e) {
            System.out.println("Invalid Input! Please enter numbers only.");
        } finally {
            input.close();
        }
    }
}
