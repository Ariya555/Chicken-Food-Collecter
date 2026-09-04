import java.awt.*;

class Corn {

    int x;
    int y;

    Corn(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        // Husk leaves
        g2.setColor(new Color(55, 140, 45));

        Polygon left = new Polygon();
        left.addPoint(x + 8, y + 42);
        left.addPoint(x - 2, y + 5);
        left.addPoint(x + 11, y + 20);
        g2.fillPolygon(left);

        Polygon right = new Polygon();
        right.addPoint(x + 17, y + 42);
        right.addPoint(x + 28, y + 5);
        right.addPoint(x + 15, y + 20);
        g2.fillPolygon(right);

        // Corn cob
        g2.setColor(new Color(255, 195, 35));
        g2.fillRoundRect(x + 3, y, 19, 43, 10, 10);

        // Kernels
        g2.setColor(new Color(245, 180, 25));

        for (int row = 0; row < 5; row++) {

            int yy = y + 5 + row * 7;

            g2.fillOval(x + 9, yy, 6, 6);
            g2.fillOval(x + 15, yy + 2, 5, 6);
            
            // Tiny tip at bottom
        g.setColor(new Color(200, 145, 15));
        g.fillOval(x + 10, y + 37, 5, 4);

        }
        
    }
}