import javax.swing.*;
import java.awt.*;
public class IconButtons extends JFrame {
    JPanel canvas = new JPanel(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            if(sel==0){ g.drawString("Home",50,50); g.drawRect(40,60,80,60); }
            else if(sel==1){ g.drawString("Cup",50,50); g.drawOval(40,60,80,40); g.drawRect(80,70,20,20); }
            else { g.drawString("Indian Flag",40,50); g.setColor(Color.ORANGE); g.fillRect(40,60,120,20); g.setColor(Color.WHITE); g.fillRect(40,80,120,20); g.setColor(Color.GREEN); g.fillRect(40,100,120,20); g.setColor(Color.BLUE); g.drawOval(95,80,10,10); }
        }
    };
    int sel=0;
    public IconButtons(){
        setTitle("Icon Buttons"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttons=new JPanel();
        JButton home=new JButton("Home"), cup=new JButton("Cup"), flag=new JButton("Indian Flag");
        home.addActionListener(e->{ sel=0; canvas.repaint(); });
        cup.addActionListener(e->{ sel=1; canvas.repaint(); });
        flag.addActionListener(e->{ sel=2; canvas.repaint(); });
        buttons.add(home); buttons.add(cup); buttons.add(flag);
        setLayout(new BorderLayout()); add(buttons,BorderLayout.NORTH); add(canvas,BorderLayout.CENTER);
        setSize(300,250);
    }
    public static void main(String[] args){ new IconButtons().setVisible(true); }
}
