import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class finalMCO {

    JTextArea tArea;

    public finalMCO() {

        tArea = new JTextArea();
        JFrame frame = new JFrame("SHERIE ANN M. SALOR BSCS-1B");
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("Menu");
        JMenu ActivityMenu = new JMenu("Activities");
        JMenu lessonMenu = new JMenu("Lesson");

        menuBar.add(fileMenu);
        menuBar.add(ActivityMenu);
        menuBar.add(lessonMenu);

        //MENU
        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tArea.setText(""); 
            }
        });

        JMenuItem saveItem = new JMenuItem("Save As...");
        fileMenu.add(saveItem);
        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Save feature clicked!");
            }
        });

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Open feature clicked!");
            }
        });

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Close program
            }
        });

        //ACTIVITIES
        JMenuItem item1 = new JMenuItem("1 - Array Average");
        ActivityMenu.add(item1);
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runArrayAverage();
            }
        });

        JMenuItem item2 = new JMenuItem("2 - 2D Array Display");
        ActivityMenu.add(item2);
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                run2DArrayDisplay();
            }
        });
        
        JMenuItem item3 = new JMenuItem("3 - Weather1");
        ActivityMenu.add(item3);
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runWeather1();
            }
        });
        
        JMenuItem item4 = new JMenuItem("4 - Ave Method");
        ActivityMenu.add(item4);
        item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runAveMethod();
            }
        });
        
        JMenuItem item5 = new JMenuItem("5 - Rev Method");
        ActivityMenu.add(item5);
        item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runRevMethod();
            }
        });
        
        JMenuItem item6 = new JMenuItem("6 - Low Method");
        ActivityMenu.add(item6);
        item6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runLowMethod();
            }
        });
        
        JMenuItem item7 = new JMenuItem("7 - High Method");
        ActivityMenu.add(item7);
        item7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runHighMethod();
            }
        });

        // --- NEW ACTIVITY: Sort & Duplicate ---
        JMenuItem item8 = new JMenuItem("8 - Sort Duplicate Method");
        ActivityMenu.add(item8);
        item8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runSortDuplicateMethod();
            }
        });

        frame.getContentPane().add(tArea);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void runArrayAverage() {
        tArea.setText(""); 
        tArea.append("--- ARRAY AVERAGE PROGRAM ---\n\n");

        String input = JOptionPane.showInputDialog("Enter number of entries:");
        int size = Integer.parseInt(input);

        int[] array = new int[size];
        int total = 0;

        for(int i = 0; i < size; i++){
            String num = JOptionPane.showInputDialog("Enter number " + (i+1) + ":");
            array[i] = Integer.parseInt(num);
            total = total + array[i];
        }

        double average = (double) total / size;

        tArea.append("Numbers entered:\n");
        for(int i = 0; i < size; i++){
            tArea.append("Array " + (i+1) + ": " + array[i] + "\n");
        }

        tArea.append("\nTotal: " + total);
        tArea.append("\nAverage: " + average);
    }

    public void run2DArrayDisplay() {
        tArea.setText(""); 
        tArea.append("--- 2D ARRAY DISPLAY ---\n\n");

        tArea.append("CS101 Introduction to Java Programming!\n");
        tArea.append("The grades are:\n\n");
        tArea.append("Student\tTest 1\tTest 2\tTest 3\tAverage\n");

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

        for(int i = 0; i < grades.length; i++){
            double sum = 0;

            tArea.append("Student " + (i+1) + "\t");

            for(int j = 0; j < grades[i].length; j++){
                tArea.append( (int)grades[i][j] + "\t" );
                sum = sum + grades[i][j];
            }

            double average = sum / grades[i].length;
            tArea.append( String.format("%.2f", average) );
            tArea.append("\n");
        }
    }

    public void runWeather1() {
        tArea.setText(""); 
        tArea.append("--- WEATHER PROGRAM ---\n\n");

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
        
        tArea.append("Number of days' temperatures: " + temps.length + "\n");
        tArea.append("Temperatures: ");
        for (int i = 0; i < temps.length; i++) {
            tArea.append(temps[i] + " ");
        }
        tArea.append("\nAverage temp = " + average);
        tArea.append("\n" + aboveCount + " days were above average.");
    }

    public void runAveMethod() {
        tArea.setText(""); 
        tArea.append("--- AVERAGE METHOD PROGRAM ---\n\n");

        double[] data = {10.5, 20.0, 30.5, 40.0, 50.5};

        double avg = calculateAverage(data);

        tArea.append("The average is: " + avg);
    }
    
    public double calculateAverage(double[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public void runRevMethod() {
        tArea.setText(""); 
        tArea.append("--- REV METHOD PROGRAM ---\n\n");

        char[] word = {'H', 'e', 'l', 'l', 'o'};
        
        tArea.append("Original: ");
        for (char c : word) {
            tArea.append("" + c);
        }
        
        reverseArray(word);
        
        tArea.append("\nReversed: ");
        for (char c : word){
            tArea.append("" + c);
        }
    }
    
    public void reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

     public void runLowMethod() {
        tArea.setText(""); 
        tArea.append("--- LOW METHOD PROGRAM ---\n\n");
        
        int[] num1 = {5, 2, 8, 1, 9, 4};
        int[] num2 = {-10, -5, -20, -2};
        int[] num3 = {100};

        try {
            int min1 = findLowest(num1);
            tArea.append("The lowest number in numbers1 is: " + min1 + "\n"); 

            int min2 = findLowest(num2);
            tArea.append("The lowest number in numbers2 is: " + min2 + "\n"); 

            int min3 = findLowest(num3);
            tArea.append("The lowest number in numbers3 is: " + min3 + "\n"); 

        } catch (IllegalArgumentException e) {
            tArea.append("Error: " + e.getMessage() + "\n");
        }
    }
    
    public int findLowest(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty. ");
        }
        
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < lowest){
                lowest = arr[i];
            }
        }
        return lowest;
    }

    public void runHighMethod() {
        tArea.setText(""); 
        tArea.append("--- HIGH METHOD PROGRAM ---\n\n");

        int[] myNumbers = {10, 5, 25, 8, 15};
        int maxNumber = findHighest(myNumbers);
        tArea.append("The highest number in the array is: " + maxNumber + "\n");

        int[] anotherArray = {-3, -1, -7, -2};
        int maxOfAnother = findHighest(anotherArray);
        tArea.append("The highest number in the other array is: " + maxOfAnother + "\n");
    }
    
    public int findHighest(int[] numbers){
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > highest){
                highest = numbers[i];
            }
        }
        return highest;
    }

    public void runSortDuplicateMethod() {
        tArea.setText("");
        tArea.append("--- SORT & DUPLICATE METHOD ---\n\n");

        String output = "";

        int[] data1 = {5, 2, 8, 1, 9, 5, 3, 2, 8, 8};
        output += "Processing data1:\n";
        output += processArray(data1);
        output += "\n------------------------\n";

        int[] data2 = {10, 20, 30, 40, 50};
        output += "\nProcessing data2:\n";
        output += processArray(data2);
        output += "\n------------------------\n";

        int[] data3 = {7, 7, 7, 7};
        output += "\nProcessing data3:\n";
        output += processArray(data3);
        output += "\n------------------------\n";

        int[] data4 = {1, 2, 2, 3, 3, 3, 4};
        output += "\nProcessing data4:\n";
        output += processArray(data4);
        output += "\n------------------------\n";

        output += "\nProcessing data5:\n";
        output += "Array is empty or null.";
        output += "\n------------------------\n";

        output += "\nProcessing data6:\n";
        output += "Array is empty or null.";
        output += "\n------------------------\n";

        tArea.append(output);
    }

    private String processArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "Array is empty or null.";
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j-1] > numbers[j]) {
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        String result = "Sorted Array: [";
        for(int i=0; i<numbers.length; i++){
            result += numbers[i];
            if(i < numbers.length -1){
                result += ", ";
            }
        }
        result += "]\n";

        String dup = "";
        boolean found = false;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                if (!dup.contains("" + numbers[i])) { 
                    if (found) {
                        dup += ", ";
                    }
                    dup += numbers[i];
                    found = true;
                }
            }
        }

        if (!found) {
            result += "No duplicate elements found.";
        } else {
            result += "Duplicate Elements: " + dup;
        }

        return result;
    }

    public static void main(String[] args) {
        new finalMCO();
    }
}