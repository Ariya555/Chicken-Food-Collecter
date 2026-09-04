import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GamePanel extends JPanel implements KeyListener{
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    Chicken chicken;
    Corn corn;
    GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.WHITE);
        this.setFocusable(true);
        chicken= new Chicken();
        corn= new Corn(400,300);
    //keyboard control
    this.addKeyListener(this);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        chicken.draw(g);
        corn.draw(g);
    }
// Keyboard controls
    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            chicken.move(-10, 0, WIDTH, HEIGHT);
        }
        if (key == KeyEvent.VK_RIGHT) {
            chicken.move(10, 0, WIDTH, HEIGHT);
        }
        if (key == KeyEvent.VK_UP) {
            chicken.move(0, -10, WIDTH, HEIGHT);
        }
        if (key == KeyEvent.VK_DOWN) {
            chicken.move(0, 10, WIDTH, HEIGHT);
        }
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Chicken Food Collector");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

public class chickenfoodcollector {
    public static void main(String[] args) {
        new GameFrame();
    }
}