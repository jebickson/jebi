import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseEventHandler extends JFrame
{
private JLabel eventLabel;
public MouseEventHandler()
{
setTitle ("Mouse Event Handler");
setSize (400, 300);
setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
setLayout (new BorderLayout());
eventLabel = new JLabel("", SwingConstants.CENTER);
eventLabel.setFont (new Font("Arial", Font. BOLD, 24));
add (eventLabel, BorderLayout.CENTER);
// Adding mouse event listeners using adapter classes
addMouseListener (new MouseAdapter ()
{ 
    public void mouseClicked (MouseEvent e)
{
    eventLabel.setText("Mouse Clicked");
}
public void mousePressed (MouseEvent e)
{
eventLabel.setText("Mouse Pressed");
}
public void mouseReleased (MouseEvent e)
{
eventLabel.setText ("Mouse Released");
}
public void mouseEntered (MouseEvent e)
{
eventLabel.setText ("Mouse Entered");
}
public void mouseExited (MouseEvent e)
{
eventLabel.setText ("Mouse Exited");
}
});
addMouseMotionListener (new MouseMotionAdapter()
{
public void mouseMoved (MouseEvent e)
{
eventLabel.setText ("Mouse Moved");
}
public void mouseDragged (MouseEvent e)
{
eventLabel.setText("Mouse Dragged");
}
});
}
public static void main(String[] args)
{
SwingUtilities.invokeLater (() ->
{
MouseEventHandler frame= new MouseEventHandler();
frame.setVisible(true);
});
}
}