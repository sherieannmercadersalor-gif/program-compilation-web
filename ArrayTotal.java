import java.util.Scanner;

public class ArrayTotal{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int size;
        int total = 0;
        
        System.out.print("Enter any number of entry in the list: ");
        size = input.nextInt();
        
        int[] array = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.print("Array0" + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
            total = total + array[i];
        }
        System.out.print("Total" + total);
    }
}