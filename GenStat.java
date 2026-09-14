import javax.swing.*;
import java.awt.*;

public class GenStat {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender and Civil Status");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel genderLabel = new JLabel("Gender:");
        JCheckBox maleBox = new JCheckBox("Male");
        JCheckBox femaleBox = new JCheckBox("Female");
        
        JLabel statusLabel = new JLabel("Civil Status:");
        JCheckBox singleBox = new JCheckBox("Single");
        JCheckBox marriedBox = new JCheckBox("Married");
        JCheckBox widowBox = new JCheckBox("Widow/er");

        frame.add(genderLabel);
        frame.add(maleBox);
        frame.add(femaleBox);

        frame.add(statusLabel);
        frame.add(singleBox);
        frame.add(marriedBox);
        frame.add(widowBox);

        frame.setVisible(true);
    }
}