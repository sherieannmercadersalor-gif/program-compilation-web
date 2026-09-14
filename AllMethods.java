import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMethods {

   
    public static int total(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum = sum + number;
        }
        return sum;
    }

    public static double average(int[] arr) {
        int sum = total(arr);
        double avg = (double) sum / arr.length;
        return avg;
    }

    public static void sortAlgorithm(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static List<Integer> duplicate(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        sortAlgorithm(sortedArr); 

        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i] == sortedArr[i + 1]) {
                if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != sortedArr[i]) {
                    duplicates.add(sortedArr[i]);
                }
            }
        }
        return duplicates;
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 8, 3, 5};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int sum = total(numbers);
        System.out.println("Total: " + sum);

        double avg = average(numbers);
        System.out.println("Average: " + avg);

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        sortAlgorithm(sortedNumbers);
        System.out.println("Sorted Array: " + Arrays.toString(sortedNumbers));

        int[] reversedNumbers = Arrays.copyOf(numbers, numbers.length);
        reverse(reversedNumbers);
        System.out.println("Reversed Array: " + Arrays.toString(reversedNumbers));

        int max = largest(numbers);
        System.out.println("Largest: " + max);

        int min = smallest(numbers);
        System.out.println("Smallest: " + min);

        List<Integer> dups = duplicate(numbers);
        System.out.println("Duplicates: " + dups);

        int target1 = 8;
        int index1 = search(numbers, target1);
        System.out.println("Index of " + target1 + ": " + index1); 

        int target2 = 10;
        int index2 = search(numbers, target2);
        System.out.println("Index of " + target2 + ": " + index2); 
    }
}