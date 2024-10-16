import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    private JTextArea textArea;

    // Constructor to create content pane and text area
    public MouseEvents() {
        // Set up the frame
        setTitle("Mouse Events Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create content pane and text area
        Container contentPane = getContentPane();
        textArea = new JTextArea();
        textArea.setEditable(false);

        // Add mouse listener and motion listener to text area
        textArea.addMouseListener(this);
        textArea.addMouseMotionListener(this);

        // Add text area to content pane
        contentPane.add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        display("Mouse Clicked at: " + e.getPoint());
    }

    public void mouseEntered(MouseEvent e) {
        display("Mouse Entered the area");
    }

    public void mouseExited(MouseEvent e) {
        display("Mouse Exited the area");
    }

    public void mousePressed(MouseEvent e) {
        display("Mouse Pressed at: " + e.getPoint());
    }

    public void mouseReleased(MouseEvent e) {
        display("Mouse Released at: " + e.getPoint());
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        display("Mouse Dragged at: " + e.getPoint());
    }

    public void mouseMoved(MouseEvent e) {
        display("Mouse Moved at: " + e.getPoint());
    }

    // Method to display messages in the text area
    private void display(String message) {
        textArea.append(message + "\n");
    }

    // Main method to create the frame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseEvents frame = new MouseEvents();
            frame.setVisible(true);
        });
    }
}
