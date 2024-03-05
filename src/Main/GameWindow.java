package Main;
import city.cs.engine.World;

import javax.swing.JFrame;
import java.awt.*;
public class GameWindow{
    World world = new World();

    private JFrame jframe;
    public GameWindow(GamePanel gamePanel){
        jframe = new JFrame();
        jframe.setSize(600, 382);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setVisible(true);



    }
}
