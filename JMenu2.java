import javax.swing.*;

public class JMenu2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View Activities");
        JMenu aboutMenu = new JMenu("About");

        JMenu activitiesSubMenu = new JMenu("Activities");
        JMenuItem act1 = new JMenuItem("Activity 1");
        JMenuItem act2 = new JMenuItem("Activity 2");

        activitiesSubMenu.add(act1);
        activitiesSubMenu.add(act2);

        viewMenu.add(activitiesSubMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(aboutMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}