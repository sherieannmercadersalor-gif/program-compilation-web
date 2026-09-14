public class Arr2DisplayAve {
    public static void main(String[] args) {
        double[][] grades = {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}
        };

        System.out.println("CS101 Introduction to Java Programming!");
        System.out.println("The grades are:\n");
        System.out.println("Student\tTest 1\tTest 2\tTest 3\tAverage");

        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
                sum += grades[i][j];
            }
            double average = sum / grades[i].length;
            System.out.printf("%.2f", average);
            System.out.println();
        }
    }
}