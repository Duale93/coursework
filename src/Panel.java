import javax.swing.*;
import java.awt.*;
public class Panel extends JPanel {
    public void paintComponent(Graphics g) {
        ImageIcon image = new ImageIcon("space.jpg");
        g.drawImage(image.getImage(), 0, 0, 600, 382, null);

        ImageIcon image2 = new ImageIcon("spaceship.png");
        g.drawImage(image2.getImage(),275 , 300, 50, 50, null);

        ImageIcon image3 = new ImageIcon("alien.png");
        g.drawImage(image3.getImage(),0 , 0, 30, 30, null);



    }
}
