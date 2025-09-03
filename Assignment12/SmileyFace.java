import javax.swing.*;
import java.awt.*;
public class SmileyFace extends JPanel {
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int w=getWidth(), h=getHeight();
        int d=Math.min(w,h)-20;
        int x=(w-d)/2, y=(h-d)/2;
        g.fillOval(x,y,d,d);
        g.setColor(Color.YELLOW); g.fillOval(x,y,d,d);
        g.setColor(Color.BLACK);
        g.fillOval(x+d/3, y+d/3, d/10, d/10);
        g.fillOval(x+d - d/3 - d/10, y+d/3, d/10, d/10);
        g.drawArc(x+d/4, y+d/3, d/2, d/2, 200, 140);
    }
    public static void main(String[] args){
        JFrame f=new JFrame("Smiley Face");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new SmileyFace());
        f.setSize(400,400);
        f.setVisible(true);
    }
}
