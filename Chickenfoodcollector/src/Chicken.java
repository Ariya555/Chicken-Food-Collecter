import java.awt.*;

public class Chicken {

    int x = 100;
    int y = 100;

    public void draw(Graphics g) {

        // Body
        g.setColor(new Color(245, 166, 70));
        g.fillOval(x, y + 20, 85, 55);

        // Head
        g.setColor(new Color(255, 205, 80));
        g.fillOval(x + 55, y, 45, 45);

        // Comb
        g.setColor(new Color(220, 60, 50));
        g.fillOval(x + 65, y - 10, 12, 15);
        g.fillOval(x + 77, y - 12, 12, 17);

        // Eye
        g.setColor(Color.BLACK);
        g.fillOval(x + 84, y + 12, 6, 6);

        // Beak
        g.setColor(new Color(240, 140, 40));
        int[] beakX = {x + 98, x + 112, x + 98};
        int[] beakY = {y + 17, y + 23, y + 29};
        g.fillPolygon(beakX, beakY, 3);

        // Wing
        g.setColor(new Color(225, 135, 45));
        g.fillOval(x + 15, y + 35, 45, 28);

        // Legs
        g.setColor(new Color(210, 130, 40));
        g.fillRect(x + 30, y + 70, 5, 22);
        g.fillRect(x + 60, y + 70, 5, 22);

        // Feet
        g.setColor(new Color(235, 145, 40));
        g.fillOval(x + 23, y + 88, 20, 7);
        g.fillOval(x + 53, y + 88, 20, 7);
    }
// Movement
    public void move(int dx, int dy, int width, int height) {

        x += dx;
        y += dy;

        // Boundary
        if (x < 0)
            x = 0;

        if (y < 15)
            y = 15;

        if (x > width - 115)
            x = width - 115;

        if (y > height - 100)
            y = height - 100;
    }
}