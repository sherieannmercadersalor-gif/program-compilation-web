public class HighMethod {
    public static int findHighest(int[] numbers) {
        int highest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int[] myNumbers = {10, 5, 25, 8, 15};
        int maxNumber = findHighest(myNumbers);
        System.out.println("The highest number in the array is: " + maxNumber);

        int[] anotherArray = {-3, -1, -7, -2};
        int maxOfAnother = findHighest(anotherArray);
        System.out.println("The highest number in the other array is: " + maxOfAnother);
    }
}