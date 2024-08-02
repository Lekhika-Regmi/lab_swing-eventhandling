package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SumDifferenceCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum and Difference Calculator");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JTextField number1Field = new JTextField();
        JTextField number2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result:");

        frame.add(number1Field);
        frame.add(number2Field);
        frame.add(resultLabel);

        number1Field.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }

            public void mouseReleased(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());
                    int diff = num1 - num2;
                    resultLabel.setText("Difference: " + diff);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        frame.setVisible(true);
    }
}
