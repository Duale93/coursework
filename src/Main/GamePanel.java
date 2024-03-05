package Main;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private int xDelta = 0, yDelta = 0;
    public GamePanel(){
        mouseInputs = new MouseInputs();
  addKeyListener(new KeyboardInputs(this));
 addMouseListener(mouseInputs);
 addMouseMotionListener(mouseInputs);
    }
public void changeXDelta(int value){
        this.xDelta +=value;
}
    public void changeYDelta(int value){
        this.yDelta +=value;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100 + xDelta,100 + yDelta,200,50);
    }
}
