public class AveMethod {
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; 
        }
        return sum / numbers.length; 
    }

    public static void main(String[] args) {
        double[] data = {10.5, 20.0, 30.5, 40.0, 50.5};

        double avg = calculateAverage(data);

        System.out.println("The average is: " + avg);
    }
}