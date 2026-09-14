/*
Filename: JMenu2.java

Java Menu Program with:
File
Edit
View
Activities
About


SubMenu for Activities:
Activity 1
Activity 2

*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenu3 implements ActionListener {

    JFrame frame;
    JTextArea area;

    JMenuBar menuBar;

    JMenu fileMenu, editMenu, viewMenu, activityMenu, aboutMenu;

    JMenuItem newFile, openFile, saveFile, exitFile;
    JMenuItem cutEdit, copyEdit, pasteEdit;
    JMenuItem zoomIn, zoomOut;
    JMenuItem act1, act2;
    JMenuItem aboutItem;

    public JMenu3() {

        frame = new JFrame("Java Menu Program");
        area = new JTextArea();

        menuBar = new JMenuBar();

        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        activityMenu = new JMenu("Activities");
        aboutMenu = new JMenu("About");

        
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        exitFile = new JMenuItem("Exit");

        
        cutEdit = new JMenuItem("Cut");
        copyEdit = new JMenuItem("Copy");
        pasteEdit = new JMenuItem("Paste");

        
        zoomIn = new JMenuItem("Zoom In");
        zoomOut = new JMenuItem("Zoom Out");

        
        act1 = new JMenuItem("Activity 1");
        act2 = new JMenuItem("Activity 2");

        
        aboutItem = new JMenuItem("About Program");

        
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(exitFile);

        
        editMenu.add(cutEdit);
        editMenu.add(copyEdit);
        editMenu.add(pasteEdit);

        
        viewMenu.add(zoomIn);
        viewMenu.add(zoomOut);

        
        activityMenu.add(act1);
        activityMenu.add(act2);

        
        aboutMenu.add(aboutItem);

        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(activityMenu);
        menuBar.add(aboutMenu);

        
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exitFile.addActionListener(this);

        cutEdit.addActionListener(this);
        copyEdit.addActionListener(this);
        pasteEdit.addActionListener(this);

        zoomIn.addActionListener(this);
        zoomOut.addActionListener(this);

        act1.addActionListener(this);
        act2.addActionListener(this);

        aboutItem.addActionListener(this);

        
        frame.setJMenuBar(menuBar);
        frame.add(new JScrollPane(area));

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        
        if (e.getSource() == newFile) {
            area.setText("");
        }

        else if (e.getSource() == openFile) {
            area.setText("Opening file...");
        }

        else if (e.getSource() == saveFile) {
            area.setText("File saved!");
        }

        else if (e.getSource() == exitFile) {
            System.exit(0);
        }

        
        else if (e.getSource() == cutEdit) {
            area.cut();
        }

        else if (e.getSource() == copyEdit) {
            area.copy();
        }

        else if (e.getSource() == pasteEdit) {
            area.paste();
        }

        
        else if (e.getSource() == zoomIn) {
            area.setFont(new Font("Arial", Font.PLAIN, 20));
        }

        else if (e.getSource() == zoomOut) {
            area.setFont(new Font("Arial", Font.PLAIN, 12));
        }

        
        else if (e.getSource() == act1) {
            area.setText(
                "Activity 1\n\n" +
                "Java Array Example:\n" +
                "int[] num = {1,2,3,4,5};"
            );
        }

        else if (e.getSource() == act2) {
            area.setText(
                "Activity 2\n\n" +
                "Java Loop Example:\n" +
                "for(int i=1; i<=5; i++)"
            );
        }

        
        else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(frame,
                    "Java Menu Program\nCreated using Swing GUI");
        }
    }

    public static void main(String[] args) {
        new JMenu3();
    }
}
