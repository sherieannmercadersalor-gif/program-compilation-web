import java.util.Arrays;
import java.util.Scanner;

public class ArrayLowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("How many numbers do you want to compare? ");
            int size = input.nextInt();
            double[] numbers = new double[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Enter Number " + (i + 1) + ": ");
                numbers[i] = input.nextDouble();
            }

            double min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            System.out.println("Array Elements: " + Arrays.toString(numbers));
            System.out.println("The Lowest Number is: " + min);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers!");
        } finally {
            input.close();
        }
    }
}
