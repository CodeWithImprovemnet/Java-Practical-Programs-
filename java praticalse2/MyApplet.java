// 22) Program to demonstrate Applet life cycle in java 

import java.applet.Applet;
import java.awt.Graphics;

// Define an applet named "MyApplet"
public class MyApplet extends Applet {
    // This method is called when the applet is first created
    public void init() {
        System.out.println("Initializing applet...");
    }

    // This method is called when the applet is started
    public void start() {
        System.out.println("Starting applet...");
    }

    // This method is called when the applet is stopped
    public void stop() {
        System.out.println("Stopping applet...");
    }

    // This method is called when the applet is destroyed
    public void destroy() {
        System.out.println("Destroying applet...");
    }

    // This method is called when the applet needs to be painted
    public void paint(Graphics g) {
        System.out.println("Painting applet...");
        g.drawString("Hello, World!", 50, 50);
    }
}
