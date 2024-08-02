package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TemperatureConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JLabel celsiusLabel = new JLabel("Celsius:");
        JTextField celsiusField = new JTextField();
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        JTextField fahrenheitField = new JTextField();
        fahrenheitField.setEditable(false);

        celsiusField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusField.getText());
                    double fahrenheit = celsius * 9/5 + 32;
                    fahrenheitField.setText(String.valueOf(fahrenheit));
                } catch (NumberFormatException ex) {
                    fahrenheitField.setText("Invalid input");
                }
            }
        });

        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);
        
        frame.setVisible(true);
    }
}
