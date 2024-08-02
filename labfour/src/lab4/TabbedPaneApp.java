package lab4;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Home Tab
        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to the Home Tab!"));
        tabbedPane.addTab("Home", homePanel);

        // Profile Tab
        JPanel profilePanel = new JPanel(new GridLayout(2, 2));
        profilePanel.add(new JLabel("Name:"));
        profilePanel.add(new JTextField());
        profilePanel.add(new JLabel("Email:"));
        profilePanel.add(new JTextField());
        tabbedPane.addTab("Profile", profilePanel);

        // Settings Tab
        JPanel settingsPanel = new JPanel();
        settingsPanel.add(new JLabel("Settings"));
        settingsPanel.add(new JButton("Apply"));
        tabbedPane.addTab("Settings", settingsPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
