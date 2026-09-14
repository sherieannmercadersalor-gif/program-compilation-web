import java.util.Scanner;

public class ArrayLargest {
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

            double max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.print("Array Elements: [");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
            }
            System.out.println("]");
            System.out.println("The Largest Number is: " + max);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers only.");
        } finally {
            input.close();
        }
    }
}