import java.util.Arrays;

public class SortDuplicateMethod {
    public static String sortAndFindDuplicatesSimple(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "Array is empty or null.";
        }

        Arrays.sort(numbers);

        StringBuilder result = new StringBuilder();
        result.append("Sorted Array: ").append(Arrays.toString(numbers)).append("\n");

        StringBuilder duplicatesFound = new StringBuilder();
        boolean foundDuplicate = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                if (!foundDuplicate || duplicatesFound.indexOf(String.valueOf(numbers[i])) == -1) {
                    if (foundDuplicate) {
                        duplicatesFound.append(", ");
                    }
                    duplicatesFound.append(numbers[i]);
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            result.append("No duplicate elements found.");
        } else {
            result.append("Duplicate Elements: ").append(duplicatesFound.toString());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] data1 = {5, 2, 8, 1, 9, 5, 3, 2, 8, 8};
        System.out.println("Processing data1:");
        System.out.println(sortAndFindDuplicatesSimple(data1));
        System.out.println("--------------------");

        int[] data2 = {10, 20, 30, 40, 50};
        System.out.println("Processing data2:");
        System.out.println(sortAndFindDuplicatesSimple(data2));
        System.out.println("--------------------");

        int[] data3 = {7, 7, 7, 7};
        System.out.println("Processing data3:");
        System.out.println(sortAndFindDuplicatesSimple(data3));
        System.out.println("--------------------");

        int[] data4 = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Processing data4:");
        System.out.println(sortAndFindDuplicatesSimple(data4));
        System.out.println("--------------------");

        int[] data5 = {};
        System.out.println("Processing data5:");
        System.out.println(sortAndFindDuplicatesSimple(data5));
        System.out.println("--------------------");

        int[] data6 = null;
        System.out.println("Processing data6:");
        System.out.println(sortAndFindDuplicatesSimple(data6));
        System.out.println("--------------------");
    }
}