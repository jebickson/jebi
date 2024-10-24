import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TextStyler extends JFrame implements ActionListener {
private JTextField inputTextField;
private JLabel displayLabel;
private JComboBox<String>fontComboBox;
private JComboBox<Integer>sizeComboBox;
private JCheckBox boldCheckBox, italicCheckBox; 
private static final String[] FONTS=GraphicsEnvironment.
getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
private static final Integer []SIZES = {8, 10, 12, 14, 16, 18, 20, 22, 24,26, 28, 30, 32, 34, 36};
public TextStyler()
{
setTitle ("Text Styler");
setSize (500, 300);
setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
setLayout (new FlowLayout());
inputTextField= new JTextField(20);
displayLabel = new JLabel ("Your styled text will appear here");
displayLabel.setFont(new Font ("Arial", Font. PLAIN, 14));
fontComboBox=new JComboBox (FONTS);
sizeComboBox = new JComboBox(SIZES);
boldCheckBox=new JCheckBox ("Bold");
italicCheckBox=new JCheckBox ("Italic");
JButton applyButton=new JButton ("Apply");
applyButton.addActionListener(this); 
add(new JLabel ("Enter Text:"));
add (inputTextField);
add (new JLabel ("Font:"));
add (fontComboBox);
add(new JLabel("Size:"));
add(sizeComboBox);
add (boldCheckBox);
add (italicCheckBox);
add (applyButton);
add (displayLabel);
}
public void actionPerformed (ActionEvent e)
{
String text= inputTextField.getText();
String selectedFont= (String) fontComboBox.getSelectedItem();
int selectedSize= (Integer) sizeComboBox.getSelectedItem();
int style= Font.PLAIN;
if (boldCheckBox.isSelected())
{
style |= Font.BOLD;
}
if (italicCheckBox.isSelected()) {
style |= Font.ITALIC;
}
Font font = new Font (selectedFont, style, selectedSize);
displayLabel.setText(text);
displayLabel.setFont(font);
}
public static void main(String[] args) {
SwingUtilities.invokeLater (() -> {
TextStyler frame = new TextStyler();
frame.setVisible(true);
});
}
}