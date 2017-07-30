import javax.swing.*;
import java.net.*;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    public static void main(String[] args) {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        JFrame frame = new JFrame("Display CD Covers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        URL initialURL = new URL("www.google.com");
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
    }
}