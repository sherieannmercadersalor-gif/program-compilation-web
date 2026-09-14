import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 12, 9, 45, 33, 7};
        
        ArrayList<Integer> foundDupes = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && !foundDupes.contains(nums[i])) {
                    foundDupes.add(nums[i]);
                }
            }
        }

        if (foundDupes.isEmpty()) {
            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Array: " + Arrays.toString(nums));
            System.out.println("Duplicates found: " + foundDupes);
        }
    }
}
