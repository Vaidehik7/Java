import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private String operator;
    private double num1, num2;

    public SimpleCalculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));

        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        add(textField, BorderLayout.NORTH);
        add(panel);
        operator = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
            operator = "";
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            calculate();
            textField.setText(String.valueOf(num1));
            operator = "";
        } else {
            num1 = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        }
    }

    private void calculate() {
        switch (operator) {
            case "+" -> num1 += num2;
            case "-" -> num1 -= num2;
            case "*" -> num1 *= num2;
            case "/" -> {
                if (num2 != 0) {
                    num1 /= num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                    num1 = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setVisible(true);
        });
    }
}
