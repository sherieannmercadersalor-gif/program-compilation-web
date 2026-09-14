import java.util.Scanner;

public class ArraySearch{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter any number of entry in the list: ");
        int size = input.nextInt();
        
        int[]array = new int[size];
        
        for (int i = 0; i < size; i++){
            System.out.print("Array" + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.print("\n Enter a no. to find the arrays in the list: ");
        int search = input.nextInt();
        
        boolean found = false;
        
        for (int i = 0; i < size; i++){
            if (array[i] == search){
                found = true;
                
                System.out.println(search + " is found in Array no. 0" + (i+1) + ":");
            }
        }
    if (!found){
        System.out.println(search + " is not found in the list.");
       }
        input.close();
    }
}