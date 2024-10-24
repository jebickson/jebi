import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleCalculator {
 public static void main(String[] args) {
 SwingUtilities.invokeLater(() -> new CalculatorFrame().setVisible(true));
 }
}
class CalculatorFrame extends JFrame {
 private JTextField display;
 private StringBuilder input;
 private double result;
 private String operator;
 private boolean calculating;
 public CalculatorFrame() {
 setTitle("Simple Calculator");
 setSize(400, 500);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new BorderLayout());
 // Initialize components
 display = new JTextField();
 display.setFont(new Font("Arial", Font.BOLD, 24));
 display.setHorizontalAlignment(JTextField.RIGHT);
 add(display, BorderLayout.NORTH);
 JPanel buttonPanel = new JPanel();
 buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
 add(buttonPanel, BorderLayout.CENTER);
 String[] buttonLabels = {
 "7", "8", "9", "/",
 "4", "5", "6", "*",
 "1", "2", "3", "-",
 "0", "C", "=", "+"
 };
 for (String label : buttonLabels) {
 JButton button = new JButton(label);
 button.setFont(new Font("Arial", Font.BOLD, 18));
 button.addActionListener(new ButtonClickListener());
 buttonPanel.add(button);
 }
 input = new StringBuilder();
 result = 0;
 operator = "";
 calculating = false;
 }
 private class ButtonClickListener implements ActionListener {
 @Override
 public void actionPerformed(ActionEvent e) {
 JButton source = (JButton) e.getSource();
 String command = source.getText();
 try {
 switch (command) {
 case "C":
 input.setLength(0);
 display.setText("");
 result = 0;
 operator = "";
 calculating = false;
 break;
 case "=":
 if (input.length() > 0) {
 double number = Double.parseDouble(input.toString());
 switch (operator) {
 case "+":
 result += number;
 break;
 case "-":
 result -= number;
 break;
 case "*":
 result *= number;
 break;
 case "/":
 if (number != 0) {
 result /= number;
 } else {
 display.setText("Error");
 return;
 }
 break;
 default:
 result = number;
 break;
 }
 display.setText(String.valueOf(result));
 input.setLength(0);
 operator = "";
 calculating = true;
 }
 break;
 case "+":
 case "-":
 case "*":
 case "/":
 if (input.length() > 0) {
 double number = Double.parseDouble(input.toString());
 if (!calculating) {
 switch (operator) {
 case "+":
 result += number;
 break;
 case "-":
 result -= number;
 break;
 case "*":
 result *= number;
 break;
 case "/":
 if (number != 0) {
 result /= number;
 } else {
 display.setText("Error");
 return;
 }
 break;
 default:
 result = number;
 break;
 }
 } else {
 result = number;
 calculating = false;
 }
 input.setLength(0);
 operator = command;
 display.setText(String.valueOf(result));
 } else {
 operator = command;
 }
 break;
 default: // Digits
 input.append(command);
 display.setText(input.toString());
 break;
 }
 } catch (NumberFormatException ex) {
 display.setText("Error");
 }
 }
 }
}
