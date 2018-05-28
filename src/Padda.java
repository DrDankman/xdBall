import java.awt.*;

public class Padda {
    int x = 625;

    public void draw(Graphics g) {
        //paddan
        g.setColor(Color.GRAY);

        g.fillRect(this.x, 920, 250, 30);
        g.fillOval(this.x-15, 920, 30, 30);
        g.fillOval(this.x+235, 920, 30, 30);
    }
}
