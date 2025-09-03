import javax.swing.*;
import java.awt.*;
public class HouseDoorAnimation extends JPanel {
    private boolean open=false;
    public HouseDoorAnimation(){
        new Timer(1000, e->{ open=!open; repaint(); }).start();
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int w=getWidth(), h=getHeight();
        g.setColor(new Color(200,200,200)); g.fillRect(100,150,200,150); // house
        g.setColor(Color.DARK_GRAY); int[] x={100,200,300}; int[] y={150,70,150}; g.fillPolygon(x,y,3);
        g.setColor(new Color(150,75,0)); // door
        if(open){ g.fillRect(190,200,5,100); } else { g.fillRect(180,200,40,100); }
    }
    public static void main(String[] args){
        JFrame f=new JFrame("House Door Animation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new HouseDoorAnimation());
        f.setSize(420,360);
        f.setVisible(true);
    }
}
