package Hotel.Management.System;

import javax.swing.*;
import java.awt.Image; // <-- required for Image and scaling

public class Splash extends JFrame {
    Splash() {

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/IntroImg.png"));
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(870, 710, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(0, 0, 858, 680);
        add(label);

        setLayout(null);
        setLocation(300, 80);
        setSize(858, 680);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
