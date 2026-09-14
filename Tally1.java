import java.util.Scanner;

public class Tally1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many numbers you will input: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid number of inputs!");
            input.close();
            return;
        }
        
        int[] numbers = new int[n];
        System.out.println("Enter the numbers one by one:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        
        int[] frequencies = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    frequencies[j] = -1; 
                }
            }
            if (frequencies[i] != -1) {
                frequencies[i] = count;
            }
        }
        
        int maxFreq = 0;
        for (int freq : frequencies) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        
        System.out.println("\nMost frequent number(s) with frequency " + maxFreq + ":");
        for (int i = 0; i < n; i++) {
            if (frequencies[i] == maxFreq) {
                System.out.println(numbers[i]);
            }
        }
        
        input.close();
    }
}