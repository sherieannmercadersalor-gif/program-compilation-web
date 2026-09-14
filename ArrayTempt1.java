import java.util.Scanner;

public class ArrayTempt1{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int days;
        
        System.out.print("How many days' temperature:");
        days = input.nextInt();
        
        int[] temperature = new int[days];
        int total = 0;
        
        for (int i = 0; i < days; i++){
            System.out.print("Day " + (i+1) + "'s high temperature: ");
            temperature[i] = input.nextInt();
            total += temperature[i];
        }
        double average = (double) total / days;
        
        int countDays = 0;
        for (int temp : temperature){
            if (temp > average){
                countDays++;
            }
        }
        System.out.println("Average temperature = " + average);
        System.out.println(countDays + " days were above average.");
    }
}