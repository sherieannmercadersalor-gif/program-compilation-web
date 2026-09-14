import javax.swing.*;
import java.awt.*;

public class ComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Info");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);

        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"BS Computer Science", "BS Information Technology", "BS Information Systems"};
        JComboBox<String> courseCombo = new JComboBox<>(courses);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(ageLabel);
        frame.add(ageField);

        frame.add(courseLabel);
        frame.add(courseCombo);

        frame.setVisible(true);
    }
}