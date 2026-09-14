import java.util.Scanner;

public class ArrayTwoAverage{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter any number of row entry in the list: ");
        int n1 = input.nextInt();
        
        System.out.print("Enter any number of column entry in the list: ");
        int n2 = input.nextInt();
        
        int[][] array = new int [n1][n2];
        System.out.print("Enter" + (n1*n2) + "integer values: ");
        
        for (int i 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                array[i][j] = input.nextInt();
            }
        }
        System.out.print
    }
}