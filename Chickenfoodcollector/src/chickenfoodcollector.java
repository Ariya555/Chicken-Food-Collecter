import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class GamePanel extends JPanel implements KeyListener {

    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    Chicken chicken;
    Corn corn;

    int score = 0;
    int targetScore = 10;

    boolean gameWon = false;

    Random random = new Random();

    GamePanel() {

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);

        chicken = new Chicken();
        corn = new Corn(400, 300);

        setFocusable(true);
        addKeyListener(this);
    }

    void generateCorn() {

        // Keep corn completely inside the game area
        corn.x = random.nextInt(WIDTH - 80) + 40;
        corn.y = random.nextInt(HEIGHT - 140) + 50;
    }

    void checkCollision() {

        if (gameWon) {
            return;
        }

        /*
         * Chicken beak:
         *
         * Facing right:
         * x + 98 to x + 112
         *
         * Facing left:
         * x - 12 to x
         */

        int beakX;
        int beakY = chicken.y + 17;

        int beakWidth = 14;
        int beakHeight = 12;

        if (chicken.facingRight) {
            beakX = chicken.x + 98;
        } else {
            beakX = chicken.x - 12;
        }

        /*
         * Corn is drawn approximately from:
         *
         * x - 2 to x + 28
         * y to y + 43
         */

        int cornX = corn.x - 2;
        int cornY = corn.y;

        int cornWidth = 30;
        int cornHeight = 43;

        // Rectangle collision
        if (beakX < cornX + cornWidth &&
            beakX + beakWidth > cornX &&
            beakY < cornY + cornHeight &&
            beakY + beakHeight > cornY) {

            score++;

            if (score >= targetScore) {

                gameWon = true;

            } else {

                generateCorn();
            }

            repaint();
        }
    }

    @Override
protected void paintComponent(Graphics g) {

    super.paintComponent(g);

    // Draw chicken and corn only while the game is running
    if (!gameWon) {
        chicken.draw(g);
        corn.draw(g);
    }

    // Score
    g.setColor(Color.BLACK);
    g.setFont(new Font("Arial", Font.BOLD, 20));

    g.drawString(
        "Score: " + score + " / " + targetScore,
        20,
        30
    );

    // Winning message
    if (gameWon) {

        g.setColor(new Color(0, 130, 0));

        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("YOU WIN!", 300, 280);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(
            "You collected 10 corn!",
            280,
            320
        );
    }
}


    @Override
    public void keyPressed(KeyEvent e) {

        if (gameWon) {
            return;
        }

        switch (e.getKeyCode()) {

            case KeyEvent.VK_LEFT:
                chicken.facingRight = false;
                chicken.move(-10, 0, WIDTH, HEIGHT);
                break;

            case KeyEvent.VK_RIGHT:
                chicken.facingRight = true;
                chicken.move(10, 0, WIDTH, HEIGHT);
                break;

            case KeyEvent.VK_UP:
                chicken.move(0, -10, WIDTH, HEIGHT);
                break;

            case KeyEvent.VK_DOWN:
                chicken.move(0, 10, WIDTH, HEIGHT);
                break;

            default:
                return;
        }

        checkCollision();
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

    GamePanel panel;

    GameFrame() {

        panel = new GamePanel();

        add(panel);

        setTitle("Chicken Food Collector");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        pack();

        setLocationRelativeTo(null);

        setVisible(true);

        // Give keyboard control to the game
        panel.requestFocusInWindow();
    }
}


public class chickenfoodcollector {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new GameFrame();
        });
    }
}
