import javax.swing.*;
import java.awt.*;
public class Panel extends JPanel {
    public void paintComponent(Graphics g) {
        ImageIcon image = new ImageIcon("space.jpg");
        g.drawImage(image.getImage(), 0, 0, 600, 600, null);
    }
}
