
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TrafficLightSimulation {
 public static void main(String[] args) {
 SwingUtilities.invokeLater(() -> new TrafficLightFrame().setVisible(true));
 }
}
class TrafficLightFrame extends JFrame {
 private JLabel messageLabel;
 private JRadioButton redButton;
 private JRadioButton yellowButton;
 private JRadioButton greenButton;
 private ButtonGroup buttonGroup;
 public TrafficLightFrame() {
 setTitle("Traffic Light Simulation");
 setSize(300, 200);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new BorderLayout());
 // Initialize the message label
 messageLabel = new JLabel("", SwingConstants.CENTER);
 messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
 add(messageLabel, BorderLayout.NORTH);
 // Create the panel for radio buttons
 JPanel buttonPanel = new JPanel();
 buttonPanel.setLayout(new GridLayout(3, 1, 5, 5));
 // Initialize radio buttons
 redButton = new JRadioButton("Red Light");
 yellowButton = new JRadioButton("Yellow Light");
 greenButton = new JRadioButton("Green Light");
 // Add action listeners
 redButton.addActionListener(new LightButtonListener());
 yellowButton.addActionListener(new LightButtonListener());
 greenButton.addActionListener(new LightButtonListener());
 // Group the radio buttons
 buttonGroup = new ButtonGroup();
 buttonGroup.add(redButton);
 buttonGroup.add(yellowButton);
 buttonGroup.add(greenButton);
 // Add buttons to panel
 buttonPanel.add(redButton);
 buttonPanel.add(yellowButton);
 buttonPanel.add(greenButton);
 add(buttonPanel, BorderLayout.CENTER);
 }
 private class LightButtonListener implements ActionListener {
 @Override
 public void actionPerformed(ActionEvent e) {
 JRadioButton source = (JRadioButton) e.getSource();
 if (source == redButton) {
 updateMessage("STOP", Color.RED);
 } else if (source == yellowButton) {
 updateMessage("READY", Color.YELLOW);
 } else if (source == greenButton) {
 updateMessage("GO", Color.GREEN);
 }
 }
 }
 private void updateMessage(String message, Color color) {
 messageLabel.setText(message);
 messageLabel.setForeground(color);
 }
}
