import java.util.Scanner;

public class ArraySort{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number in the list: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++){
            System.out.print("Array" + (i+1) + ":");
            arr[i] = input.nextInt();
        }
        System.out.print(" In ordered list: (Ascending) ");
        for (int i = 0; i < size; i++){
            System.out.println("Array" + (i=1) + ":" + arr[i]);
        }
        input.close();
    }
}