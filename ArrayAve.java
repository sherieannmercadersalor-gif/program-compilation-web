import java.util.Scanner;

public class ArrayAve{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);        
        double average;
        
        System.out.print("Enter any number of entry in the list: ");
        int size = input.nextInt();
        
        int[] array = new int[size];
        int total;
        
        for(int i = 0; i < size; i++){
            System.out.print("Array" + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
            total = total + array[i];
        }
    }
}