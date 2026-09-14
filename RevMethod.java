public class RevMethod {
    public static void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};

        reverseArray(word);

        System.out.print("Reversed: ");
        for (char c : word) {
            System.out.print(c);
        }
        System.out.println();
    }
}