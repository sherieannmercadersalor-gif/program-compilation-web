import java.awt.*;
import javax.swing.*;
import java.util.*;

class StudentData {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }
}

class CustomButton extends JButton {
    private boolean isClicked = false;

    public CustomButton(String text) {
        super(text);
        setFont(new Font("Arial", Font.BOLD, 14));
        setForeground(Color.WHITE);
        setOpaque(true);
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(110, 40));
    }

    public void toggleClicked() {
        isClicked = !isClicked;
        repaint();
    }

    public boolean isActive() {
        return isClicked;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (isClicked) {
            g2.setColor(Color.BLACK);
        } else {
            g2.setColor(new Color(120, 0, 30)); 
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);

        g2.setColor(Color.WHITE);
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() + fm.getAscent()) / 2 - 2;
        g2.drawString(getText(), x, y);
    }
}

public class salorFinalMCO {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 500);
            frame.setLayout(new BorderLayout());

            JPanel topMenu = new JPanel(new BorderLayout());
            topMenu.setBackground(new Color(80, 0, 20));

            JLabel menuLabel = new JLabel("MENU", SwingConstants.CENTER);
            menuLabel.setForeground(Color.WHITE);
            menuLabel.setFont(new Font("Arial", Font.BOLD, 16));
            menuLabel.setBorder(BorderFactory.createEmptyBorder(8, 0, 5, 0));
            topMenu.add(menuLabel, BorderLayout.NORTH);

            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 5));
            buttonPanel.setBackground(new Color(80, 0, 20));

            CustomButton btnAbout = new CustomButton("About");
            CustomButton btnMod1 = new CustomButton("Module 1");
            CustomButton btnMod2 = new CustomButton("Module 2");
            CustomButton btnMod3 = new CustomButton("Module 3");
            CustomButton btnExit = new CustomButton("Exit");

            buttonPanel.add(btnAbout);
            buttonPanel.add(btnMod1);
            buttonPanel.add(btnMod2);
            buttonPanel.add(btnMod3);
            buttonPanel.add(btnExit);

            topMenu.add(buttonPanel, BorderLayout.CENTER);
            frame.add(topMenu, BorderLayout.NORTH);

            JPanel mainDisplay = new JPanel();
            mainDisplay.setBackground(Color.BLACK);
            frame.add(mainDisplay, BorderLayout.CENTER);

            JPopupMenu menuMod1 = new JPopupMenu();
            menuMod1.setBackground(new Color(50, 0, 15));
            menuMod1.setForeground(Color.WHITE);

            JMenuItem select = new JMenuItem("Select Activity");
            select.setBackground(new Color(70, 0, 20));
            select.setForeground(Color.WHITE);

            JMenuItem Arr2Display = new JMenuItem("1. Arr2Display.java");
            Arr2Display.setBackground(new Color(70, 0, 20));
            Arr2Display.setForeground(Color.WHITE);

            JMenuItem arrayDuplicate = new JMenuItem("2. ArrayDuplicate.java");
            arrayDuplicate.setBackground(new Color(70, 0, 20));
            arrayDuplicate.setForeground(Color.WHITE);

            JMenuItem arrayEntry01 = new JMenuItem("3. ArrayEntry01.java");
            arrayEntry01.setBackground(new Color(70, 0, 20));
            arrayEntry01.setForeground(Color.WHITE);

            JMenuItem ArrayDisplay2 = new JMenuItem("4. ArrayDisplay2.java");
            ArrayDisplay2.setBackground(new Color(70, 0, 20));
            ArrayDisplay2.setForeground(Color.WHITE);

            JMenuItem arrLargest = new JMenuItem("5. ArrLargest.java");
            arrLargest.setBackground(new Color(70, 0, 20));
            arrLargest.setForeground(Color.WHITE);

            JMenuItem arrLowest = new JMenuItem("6. ArrLowest.java");
            arrLowest.setBackground(new Color(70, 0, 20));
            arrLowest.setForeground(Color.WHITE);

            JMenuItem aveReverse = new JMenuItem("7. AveReverse.java");
            aveReverse.setBackground(new Color(70, 0, 20));
            aveReverse.setForeground(Color.WHITE);

            JMenuItem charDigConv1 = new JMenuItem("8. CharDigConv1.java");
            charDigConv1.setBackground(new Color(70, 0, 20));
            charDigConv1.setForeground(Color.WHITE);

            JMenuItem compCon1 = new JMenuItem("9. CompCon1.java");
            compCon1.setBackground(new Color(70, 0, 20));
            compCon1.setForeground(Color.WHITE);

            JMenuItem Object1 = new JMenuItem("10. Object1.java");
            Object1.setBackground(new Color(70, 0, 20));
            Object1.setForeground(Color.WHITE);

            JMenuItem object2 = new JMenuItem("11. Object2.java");
            object2.setBackground(new Color(70, 0, 20));
            object2.setForeground(Color.WHITE);

            JMenuItem object4 = new JMenuItem("12. Object4.java");
            object4.setBackground(new Color(70, 0, 20));
            object4.setForeground(Color.WHITE);

            JMenuItem stringMethod = new JMenuItem("13. StringMethod.java");
            stringMethod.setBackground(new Color(70, 0, 20));
            stringMethod.setForeground(Color.WHITE);

            JMenuItem totalItem = new JMenuItem("14. Total.java");
            totalItem.setBackground(new Color(70, 0, 20));
            totalItem.setForeground(Color.WHITE);

            JMenuItem Weather1 = new JMenuItem("15. Weather1.java");
            Weather1.setBackground(new Color(70, 0, 20));
            Weather1.setForeground(Color.WHITE);

            menuMod1.add(select);
            menuMod1.add(Arr2Display);
            menuMod1.add(arrayDuplicate);
            menuMod1.add(arrayEntry01);
            menuMod1.add(ArrayDisplay2);
            menuMod1.add(arrLargest);
            menuMod1.add(arrLowest);
            menuMod1.add(aveReverse);
            menuMod1.add(charDigConv1);
            menuMod1.add(compCon1);
            menuMod1.add(Object1);
            menuMod1.add(object2);
            menuMod1.add(object4);
            menuMod1.add(stringMethod);
            menuMod1.add(totalItem);
            menuMod1.add(Weather1);

            JPopupMenu menuMod2 = new JPopupMenu();
            menuMod2.setBackground(new Color(50, 0, 15));
            menuMod2.setForeground(Color.WHITE);

            JMenuItem select1 = new JMenuItem("Select Activity");
            select1.setBackground(new Color(70, 0, 20));
            select1.setForeground(Color.WHITE);

            JMenuItem linkedListOp = new JMenuItem("1. LinkedListOperations.java");
            linkedListOp.setBackground(new Color(70, 0, 20));
            linkedListOp.setForeground(Color.WHITE);

            JMenuItem queueOp = new JMenuItem("2. QueueOperations.java");
            queueOp.setBackground(new Color(70, 0, 20));
            queueOp.setForeground(Color.WHITE);

            JMenuItem stackOp = new JMenuItem("3. StackOperation.java");
            stackOp.setBackground(new Color(70, 0, 20));
            stackOp.setForeground(Color.WHITE);

            JMenuItem jmenu1Item = new JMenuItem("4. JMenu1.java");
            jmenu1Item.setBackground(new Color(70, 0, 20));
            jmenu1Item.setForeground(Color.WHITE);

            menuMod2.add(select1);
            menuMod2.add(linkedListOp);
            menuMod2.add(queueOp);
            menuMod2.add(stackOp);
            menuMod2.add(jmenu1Item);

            JPopupMenu menuMod3 = new JPopupMenu();
            menuMod3.setBackground(new Color(50, 0, 15));
            menuMod3.setForeground(Color.WHITE);

            JMenuItem select2 = new JMenuItem("Select Activity");
            select2.setBackground(new Color(70, 0, 20));
            select2.setForeground(Color.WHITE);

            JMenuItem encapsulationItem = new JMenuItem("1. Encap1.java");
            encapsulationItem.setBackground(new Color(70, 0, 20));
            encapsulationItem.setForeground(Color.WHITE);

            JMenuItem inheritanceItem = new JMenuItem("2. Inheritance.java");
            inheritanceItem.setBackground(new Color(70, 0, 20));
            inheritanceItem.setForeground(Color.WHITE);

            JMenuItem polymorphismItem = new JMenuItem("3. Polymorphism.java");
            polymorphismItem.setBackground(new Color(70, 0, 20));
            polymorphismItem.setForeground(Color.WHITE);

            menuMod3.add(select2);
            menuMod3.add(encapsulationItem);
            menuMod3.add(inheritanceItem);
            menuMod3.add(polymorphismItem);

            btnMod1.addActionListener(e -> {
                btnMod1.toggleClicked();
                if (btnMod1.isActive()) {
                    menuMod1.show(btnMod1, 0, btnMod1.getHeight());
                } else {
                    menuMod1.setVisible(false);
                }
            });

            btnMod2.addActionListener(e -> {
                btnMod2.toggleClicked();
                if (btnMod2.isActive()) {
                    menuMod2.show(btnMod2, 0, btnMod2.getHeight());
                } else {
                    menuMod2.setVisible(false);
                }
            });

            btnMod3.addActionListener(e -> {
                btnMod3.toggleClicked();
                if (btnMod3.isActive()) {
                    menuMod3.show(btnMod3, 0, btnMod3.getHeight());
                } else {
                    menuMod3.setVisible(false);
                }
            });

            btnAbout.addActionListener(e -> {
                btnAbout.toggleClicked();
                if (btnAbout.isActive()) {
                    JOptionPane.showMessageDialog(frame, "Name: Sherie Ann M. Salor\nSection: BSCS 1B");
                    btnAbout.toggleClicked();
                }
            });

            btnExit.addActionListener(e -> System.exit(0));
            
            Arr2Display.addActionListener(e -> {
                 try {
                    int rows = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Number of Rows:"));
                    int cols = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Number of Columns:"));
                    
                    double[][] table = new double[rows][cols];
                    double sum = 0;
                    StringBuilder display = new StringBuilder("Table Content:\n");

                    for (int r = 0; r < rows; r++) {
                        for (int c = 0; c < cols; c++) {
                            table[r][c] = Double.parseDouble(JOptionPane.showInputDialog(frame, 
                                "Enter value for Row " + r + ", Column " + c + ":"));
                            sum += table[r][c];
                            display.append(table[r][c]).append("  ");
                        }
                        display.append("\n");
                    }

                    double average = sum / (rows * cols);
                    display.append("\nTotal Average: ").append(average);
                    
                    JOptionPane.showMessageDialog(frame, display.toString());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input! Please enter numbers only.");
                }
            });

            arrayDuplicate.addActionListener(e -> {
                try {
                    int size = Integer.parseInt(JOptionPane.showInputDialog(frame, "How many numbers to check?"));
                    int[] nums = new int[size];
                    for (int i = 0; i < size; i++) {
                        nums[i] = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter number " + (i+1) + ":"));
                    }

                    ArrayList<Integer> foundDupes = new ArrayList<>();
                    for (int i = 0; i < nums.length; i++) {
                        for (int j = i + 1; j < nums.length; j++) {
                            if (nums[i] == nums[j] && !foundDupes.contains(nums[i])) {
                                foundDupes.add(nums[i]);
                            }
                        }
                    }

                    String msg = foundDupes.isEmpty() ? "No duplicates found." : "Duplicates found: " + foundDupes;
                    JOptionPane.showMessageDialog(frame, "Array: " + Arrays.toString(nums) + "\n" + msg);
                } catch (Exception ex) { JOptionPane.showMessageDialog(frame, "Please enter integers only!"); }
            });

            arrayEntry01.addActionListener(e -> {   
                try {
                    String sizeInput = JOptionPane.showInputDialog(frame, "Enter how many elements you want in the array:");
                    if (sizeInput == null) return; 
        
                    int size = Integer.parseInt(sizeInput);
                    int[] numbers = new int[size];

        
                    for (int i = 0; i < size; i++) {
                        String valInput = JOptionPane.showInputDialog(frame, "Enter Element " + (i + 1) + ":");
                        if (valInput == null) return; 
                        numbers[i] = Integer.parseInt(valInput);
                    }

        
                    JOptionPane.showMessageDialog(frame, "Your Array Content:\n" + Arrays.toString(numbers));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input! Please enter numbers only.");
                }
            });

            ArrayDisplay2.addActionListener(e -> {
                try {
                    String sizeInput = JOptionPane.showInputDialog(frame, "How many elements do you want to store?");
                    if (sizeInput == null) return;
                    int size = Integer.parseInt(sizeInput);
                    int[] numbers = new int[size];
                    for (int i = 0; i < size; i++) {
                        String valInput = JOptionPane.showInputDialog(frame, "Enter value for element " + (i + 1) + ":");
                        if (valInput == null) return;
                        numbers[i] = Integer.parseInt(valInput);
                    }
                    JOptionPane.showMessageDialog(frame, "You entered " + size + " elements:\n" + Arrays.toString(numbers));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid integers only.");
                }
            });
            
            arrLargest.addActionListener(e -> {
                try {
                    String sizeInput = JOptionPane.showInputDialog(frame, "How many numbers do you want to compare?");
                    if (sizeInput == null) return;
                    
                    int size = Integer.parseInt(sizeInput);
                    double[] numbers = new double[size];

                    for (int i = 0; i < size; i++) {
                        String valInput = JOptionPane.showInputDialog(frame, "Enter Number " + (i + 1) + ":");
                        if (valInput == null) return;
                        numbers[i] = Double.parseDouble(valInput);
                    }

                    double max = numbers[0]; 
                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] > max) {
                            max = numbers[i];
                        }
                    }

                    JOptionPane.showMessageDialog(frame, 
                        "Array Elements: " + Arrays.toString(numbers) + 
                        "\n\nThe Largest Number is: " + max);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid numbers!");
                }
            });
            arrLowest.addActionListener(e -> {
                try {
                    String sizeInput = JOptionPane.showInputDialog(frame, "How many numbers do you want to compare?");
                    if (sizeInput == null) return;
                    
                    int size = Integer.parseInt(sizeInput);
                    double[] numbers = new double[size];

                    for (int i = 0; i < size; i++) {
                        String valInput = JOptionPane.showInputDialog(frame, "Enter Number " + (i + 1) + ":");
                        if (valInput == null) return;
                        numbers[i] = Double.parseDouble(valInput);
                    }
 
                    double min = numbers[0]; 
                    for (int i = 1; i < numbers.length; i++) {
                        if (numbers[i] < min) {
                            min = numbers[i];
                        }
                    }

                    JOptionPane.showMessageDialog(frame, 
                        "Array Elements: " + Arrays.toString(numbers) + 
                        "\n\nThe Lowest Number is: " + min);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid numbers!");
                }
            });
            aveReverse.addActionListener(e -> {
                try {
                    String sizeInput = JOptionPane.showInputDialog(frame, "Enter Array Size:");
                    if (sizeInput == null) return;
                    
                    int size = Integer.parseInt(sizeInput);
                    double[] numbers = new double[size];
                    double sum = 0;

                    for (int i = 0; i < size; i++) {
                        String valInput = JOptionPane.showInputDialog(frame, "Enter Number " + (i + 1) + ":");
                        if (valInput == null) return;
                        numbers[i] = Double.parseDouble(valInput);
                        sum += numbers[i];
                    }

                    double average = sum / size;
                   
                    StringBuilder reverseStr = new StringBuilder();
                    for (int i = size - 1; i >= 0; i--) {
                        reverseStr.append(numbers[i]).append(i == 0 ? "" : ", ");
                    }

                    JOptionPane.showMessageDialog(frame, 
                        "Original: " + Arrays.toString(numbers) + 
                        "\nReversed: [" + reverseStr.toString() + "]" +
                        "\n\nAverage: " + average);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input!");
                }
            });
            charDigConv1.addActionListener(e -> {
                try {
                    String[] options = {"Digit to Character", "Character to Digit"};
                    int choice = JOptionPane.showOptionDialog(frame, "Select Conversion Type:", 
                            "CharDigConv1", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                            null, options, options[0]);

                    if (choice == 0) { 
                        int digit = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter a single digit (0-9):"));
                        if (digit >= 0 && digit <= 9) {
                            char convertedChar = Character.forDigit(digit, 10);
                            JOptionPane.showMessageDialog(frame, "The digit " + digit + " as a character is: '" + convertedChar + "'");
                        } else {
                            JOptionPane.showMessageDialog(frame, "Please enter 0 to 9 only.");
                        }
                    } else if (choice == 1) { 
                        String input = JOptionPane.showInputDialog(frame, "Enter a single character digit:");
                        if (input != null && input.length() == 1) {
                            char ch = input.charAt(0);
                            if (Character.isDigit(ch)) {
                                int convertedDigit = Character.getNumericValue(ch);
                                JOptionPane.showMessageDialog(frame, "The character '" + ch + "' as a digit is: " + convertedDigit);
                            } else {
                                JOptionPane.showMessageDialog(frame, "That character is not a digit.");
                            }
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input!");
                }
            });
            compCon1.addActionListener(e -> {
                String str1 = JOptionPane.showInputDialog(frame, "Enter First String:");
                if (str1 == null) return;
                
                String str2 = JOptionPane.showInputDialog(frame, "Enter Second String:");
                if (str2 == null) return;

                String comparisonResult;
                if (str1.equals(str2)) {
                    comparisonResult = "The strings are EQUAL.";
                } else {
                    comparisonResult = "The strings are NOT EQUAL.";
                }

                String combined = str1 + " " + str2;

                JOptionPane.showMessageDialog(frame, 
                    "First String: " + str1 + 
                    "\nSecond String: " + str2 + 
                    "\n\nComparison: " + comparisonResult + 
                    "\nConcatenated: " + combined);
            });
            Object1.addActionListener(e -> {   
                class Student {
                    String name;
                    int age;

                    Student(String n, int a) {
                        this.name = n;
                        this.age = a;
                    }

                    String displayInfo() {
                        return "Student Name: " + name + "\nAge: " + age;
                    }
                }

                try {
                    String nameInput = JOptionPane.showInputDialog(frame, "Enter Student Name:");
                    if (nameInput == null) return;

                    String ageInput = JOptionPane.showInputDialog(frame, "Enter Student Age:");
                    if (ageInput == null) return;
                    int age = Integer.parseInt(ageInput);

                    Student s1 = new Student(nameInput, age);

                    JOptionPane.showMessageDialog(frame, "Object Created Successfully!\n\n" + s1.displayInfo());

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input! Please check your data.");
                }
            });
            object2.addActionListener(e -> {               
                class Car {
                    String brand;
                    String color;

                    Car(String b, String c) {
                        this.brand = b;
                        this.color = c;
                    }

                    String getDetails() {
                        return "Brand: " + brand + " | Color: " + color;
                    }
                }

                try {
                    String b1 = JOptionPane.showInputDialog(frame, "Enter Brand for Car 1:");
                    String c1 = JOptionPane.showInputDialog(frame, "Enter Color for Car 1:");
                    Car car1 = new Car(b1, c1);

                    String b2 = JOptionPane.showInputDialog(frame, "Enter Brand for Car 2:");
                    String c2 = JOptionPane.showInputDialog(frame, "Enter Color for Car 2:");
                    Car car2 = new Car(b2, c2);

                    String result = "Object 1: " + car1.getDetails() + 
                                  "\nObject 2: " + car2.getDetails();
                    
                    JOptionPane.showMessageDialog(frame, "Car Objects Created:\n\n" + result);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Operation Cancelled or Invalid Input.");
                }
            });
            object4.addActionListener(e -> {
                class Animal {
                    String name;
                    void setName(String n) { this.name = n; }
                }

                class Dog extends Animal {
                    String breed;
                    Dog(String n, String b) {
                        setName(n); 
                        this.breed = b;
                    }
                    String bark() {
                        return name + " (" + breed + ") says: Woof! Woof!";
                    }
                }

                try {
                    String dogName = JOptionPane.showInputDialog(frame, "Enter Dog's Name:");
                    if (dogName == null) return;

                    String dogBreed = JOptionPane.showInputDialog(frame, "Enter Dog's Breed:");
                    if (dogBreed == null) return;

                    Dog myDog = new Dog(dogName, dogBreed);

                    JOptionPane.showMessageDialog(frame, "Inheritance Demo:\n\n" + myDog.bark());

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input!");
                }
            });
            stringMethod.addActionListener(e -> {
                String input = JOptionPane.showInputDialog(frame, "Enter any text:");
                
                if (input != null && !input.isEmpty()) {
                    String reversed = new StringBuilder(input).reverse().toString();

                    String upper = input.toUpperCase();
                    int length = input.length();

                    String result = "Original: " + input +
                                   "\nReversed: " + reversed +
                                   "\nUpper Case: " + upper +
                                   "\nLength: " + length;

                    JOptionPane.showMessageDialog(frame, "String Analysis:\n\n" + result);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid text!");
                }
            });
             totalItem.addActionListener(e -> {
                try {
                    String sizeInput = JOptionPane.showInputDialog(frame, "How many numbers do you want to add?");
                    if (sizeInput == null) return;
                    
                    int size = Integer.parseInt(sizeInput);
                    double[] numbers = new double[size];
                    double total = 0;

                    for (int i = 0; i < size; i++) {
                        String valInput = JOptionPane.showInputDialog(frame, "Enter Number " + (i + 1) + ":");
                        if (valInput == null) return;
                        numbers[i] = Double.parseDouble(valInput);
                        total += numbers[i]; // Ina-add ang bawat input sa total
                    }

                    JOptionPane.showMessageDialog(frame, 
                        "Numbers entered: " + Arrays.toString(numbers) + 
                        "\n\nThe Total Sum is: " + total);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid numbers!");
                }
            });
            Weather1.addActionListener(e -> {
                try {
                    String daysInput = JOptionPane.showInputDialog(frame, "How many days' temperatures?");
                    if (daysInput == null) return;
                    
                    int days = Integer.parseInt(daysInput);
                    int[] temperatures = new int[days];
                    int sum = 0;

                    
                    for (int i = 0; i < days; i++) {
                        String tempVal = JOptionPane.showInputDialog(frame, "Day " + (i + 1) + "'s high temp:");
                        if (tempVal == null) return;
                        temperatures[i] = Integer.parseInt(tempVal);
                        sum += temperatures[i];
                    }

                    double average = (double) sum / days;

                    int aboveAverageCount = 0;
                    for (int temp : temperatures) {
                        if (temp > average) {
                            aboveAverageCount++;
                        }
                    }

                    String result = String.format("Average temp = %.1f\n%d days were above average.", 
                                                  average, aboveAverageCount);
                    JOptionPane.showMessageDialog(frame, "Weather Analysis:\n\n" + result);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Please enter valid integers!");
                }
            });
            linkedListOp.addActionListener(e -> {
                LinkedList<String> list = new LinkedList<>();
                list.add("Java");
                
                boolean running = true;
                while (running) {
                    String menu = "Current LinkedList: " + list + "\n\n" +
                                 "1. Add Element\n" +
                                 "2. Remove Element\n" +
                                 "3. Clear All\n" +
                                 "4. Exit";
                    
                    String choice = JOptionPane.showInputDialog(frame, menu, "LinkedList Operations", JOptionPane.PLAIN_MESSAGE);
                    
                    if (choice == null || choice.equals("4")) {
                        running = false;
                    } else {
                        switch (choice) {
                            case "1":
                                String newElem = JOptionPane.showInputDialog(frame, "Enter element to add:");
                                if (newElem != null) list.add(newElem);
                                break;
                            case "2":
                                String remElem = JOptionPane.showInputDialog(frame, "Enter index to remove (0 to " + (list.size()-1) + "):");
                                try {
                                    if (remElem != null) list.remove(Integer.parseInt(remElem));
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(frame, "Invalid Index!");
                                }
                                break;
                            case "3":
                                list.clear();
                                JOptionPane.showMessageDialog(frame, "List Cleared!");
                                break;
                            default:
                                JOptionPane.showMessageDialog(frame, "Invalid Choice!");
                        }
                    }
                }
            });
            queueOp.addActionListener(e -> {
                Queue<String> queue = new LinkedList<>();
                queue.add("Joanna");
                queue.add("Rhein ");

                boolean running = true;
                while (running) {
                    String status = queue.isEmpty() ? "Queue is Empty" : "Current Queue: " + queue;
                    String nextInLine = queue.isEmpty() ? "None" : queue.peek();

                    String menu = status + "\n" +
                                 "Next in Line: " + nextInLine + "\n\n" +
                                 "1. Enqueue (Add to Rear)\n" +
                                 "2. Dequeue (Remove from Front)\n" +
                                 "3. Peek (View Front)\n" +
                                 "4. Exit";
                    
                    String choice = JOptionPane.showInputDialog(frame, menu, "Queue Operations", JOptionPane.PLAIN_MESSAGE);
                    
                    if (choice == null || choice.equals("4")) {
                        running = false;
                    } else {
                        switch (choice) {
                            case "1": 
                                String newElem = JOptionPane.showInputDialog(frame, "Enter name to add to queue:");
                                if (newElem != null && !newElem.isEmpty()) {
                                    queue.add(newElem);
                                    JOptionPane.showMessageDialog(frame, newElem + " added to the queue.");
                                }
                                break;
                            case "2": 
                                if (!queue.isEmpty()) {
                                    String removed = queue.poll();
                                    JOptionPane.showMessageDialog(frame, "Served: " + removed);
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Queue is already empty!");
                                }
                                break;
                            case "3": 
                                if (!queue.isEmpty()) {
                                    JOptionPane.showMessageDialog(frame, "The person at the front is: " + queue.peek());
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Queue is empty.");
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(frame, "Invalid Choice!");
                        }
                    }
                }
            });
            stackOp.addActionListener(e -> {
                Stack<String> stack = new Stack<>();
                stack.push("Base Layer");
                stack.push("Middle Layer");

                boolean running = true;
                while (running) {
                    String status = stack.isEmpty() ? "Stack is Empty" : "Current Stack (Top to Bottom): " + stack;
                    String topItem = stack.isEmpty() ? "None" : stack.peek();

                    String menu = status + "\n" +
                                 "Top Item: " + topItem + "\n\n" +
                                 "1. Push (Add to Top)\n" +
                                 "2. Pop (Remove from Top)\n" +
                                 "3. Peek (View Top)\n" +
                                 "4. Exit";
                    
                    String choice = JOptionPane.showInputDialog(frame, menu, "Stack Operations", JOptionPane.PLAIN_MESSAGE);
                    
                    if (choice == null || choice.equals("4")) {
                        running = false;
                    } else {
                        switch (choice) {
                            case "1": 
                                String newElem = JOptionPane.showInputDialog(frame, "Enter item to push to stack:");
                                if (newElem != null && !newElem.isEmpty()) {
                                    stack.push(newElem);
                                    JOptionPane.showMessageDialog(frame, newElem + " pushed to stack.");
                                }
                                break;
                            case "2": 
                                if (!stack.isEmpty()) {
                                    String removed = stack.pop();
                                    JOptionPane.showMessageDialog(frame, "Popped: " + removed);
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Stack is already empty!");
                                }
                                break;
                            case "3": 
                                if (!stack.isEmpty()) {
                                    JOptionPane.showMessageDialog(frame, "The item at the top is: " + stack.peek());
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Stack is empty.");
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(frame, "Invalid Choice!");
                        }
                    }
                }
            });
            
            encapsulationItem.addActionListener(e -> {
                try {
                    StudentData s = new StudentData();
                    String name = JOptionPane.showInputDialog(frame, "Enter Student Name:");
                    String ageStr = JOptionPane.showInputDialog(frame, "Enter Student Age:");
                    
                    if (name != null && ageStr != null) {
                        s.setName(name);
                        s.setAge(Integer.parseInt(ageStr));
                        
                        JOptionPane.showMessageDialog(frame, "Data Saved via Encapsulation:\n" +
                                "Name: " + s.getName() + "\nAge: " + s.getAge());
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: Invalid Input!");
                }
            });
            inheritanceItem.addActionListener(e -> {
                class Animal {
                    String species = "Canine";
                }
                class Dog extends Animal {
                    String breed;
                    void display() {
                        JOptionPane.showMessageDialog(frame, "Species: " + species + "\nBreed: " + breed + "\nAction: Barking!");
                    }
                }
                Dog myPet = new Dog();
                String breed = JOptionPane.showInputDialog(frame, "Enter Dog Breed (Inheritance):");
                if (breed != null) {
                    myPet.breed = breed;
                    myPet.display();
                }
            });
            polymorphismItem.addActionListener(e -> {
                class Animal {
                    void makeSound() {
            jmenu1Item.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, 
                    "Component: JMenuBar\n" +
                    "Description: Ito ang container para sa iyong mga JMenu.\n" +
                    "Current Structure:\n" +
                    "- Menu (FileMenu)\n" +
                    "   - Module 1\n" +
                    "   - Module 2\n" +
                    "   - Module 3", 
                    "JMenuBar Info", JOptionPane.INFORMATION_MESSAGE);
            
            
            });            JOptionPane.showMessageDialog(frame, "The animal makes a sound");
                    }
                }
                class Dog extends Animal {
                    @Override
                    void makeSound() {
                        JOptionPane.showMessageDialog(frame, "The Dog says: Arf! Arf! 🐶");
                    }
                }
                class Cat extends Animal {
                    @Override
                    void makeSound() {
                        JOptionPane.showMessageDialog(frame, "The Cat says: Meow! Meow! 🐱");
                    }
                }

                String[] options = {"Dog", "Cat", "Generic Animal"};
                int choice = JOptionPane.showOptionDialog(frame, 
                    "Choose an animal to hear its sound (Polymorphism):", 
                    "Polymorphism Demo", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, options, options[0]);

                Animal myAnimal; 

                if (choice == 0) {
                    myAnimal = new Dog(); 
                } else if (choice == 1) {
                    myAnimal = new Cat(); 
                } else {
                    myAnimal = new Animal();
                }

                myAnimal.makeSound(); 
            });

            
            btnAbout.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Name: Sherie Ann M. Salor\nSection: BSCS 1B");
            });
            btnExit.addActionListener(e -> System.exit(0));

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}