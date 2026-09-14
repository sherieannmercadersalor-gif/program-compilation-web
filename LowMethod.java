public class LowMethod {
    public static int findLowest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int lowest = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i]; 
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        int[] num1 = {5, 2, 8, 1, 9, 4};
        int[] num2 = {-10, -5, -20, -2};
        int[] num3 = {100};

        try {
            int min1 = findLowest(num1);
            System.out.println("The lowest number in numbers1 is: " + min1); 

            int min2 = findLowest(num2);
            System.out.println("The lowest number in numbers2 is: " + min2); 

            int min3 = findLowest(num3);
            System.out.println("The lowest number in numbers3 is: " + min3); 

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
