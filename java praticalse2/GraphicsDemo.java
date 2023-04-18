// 24) Program to demonstrate Graphics class in java

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDemo extends JPanel {
    // This method is used to draw graphics on the panel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle with red border and blue fill
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 100);
        g.setColor(Color.BLUE);
        g.fillRect(51, 51, 99, 99);

        // Draw a line with green color
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, getWidth(), getHeight());

        // Draw a string with black color and font size 24
        g.setColor(Color.BLACK);
        g.setFont(g.getFont().deriveFont(24f));
        g.drawString("Shantanu", 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        GraphicsDemo panel = new GraphicsDemo();
        frame.add(panel);

        frame.setVisible(true);
    }
}
