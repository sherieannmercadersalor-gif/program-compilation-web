public class Weather1 {
    public static void main(String[] args) {
        int[] temps = {45, 44, 39, 48, 37, 46, 53};
        
        int total = 0;
        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
        }
        
        double average = (double) total / temps.length;
        
        int aboveCount = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                aboveCount++;
            }
        }
        
        System.out.println("Number of days' temperatures: " + temps.length);
        System.out.println("Temperatures: ");
        for (int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }
        System.out.println("\nAverage temp = " + average);
        System.out.println(aboveCount + " days were above average.");
    }
}