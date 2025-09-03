import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NameResize extends JPanel implements ActionListener {
    int fontSize=24; String name="Your Name";
    JButton enlarge=new JButton("Enlarge"), contract=new JButton("Contract");
    public NameResize(){
        enlarge.addActionListener(this); contract.addActionListener(this);
        setLayout(new BorderLayout());
        JPanel top=new JPanel(); top.add(enlarge); top.add(contract); add(top,BorderLayout.NORTH);
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setFont(new Font("Serif", Font.BOLD, fontSize));
        g.drawString(name, 50, 150);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Enlarge")) fontSize+=2; else fontSize=Math.max(8,fontSize-2);
        repaint();
    }
    public static void main(String[] args){
        JFrame f=new JFrame("Name Resize");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new NameResize()); f.setSize(400,300); f.setVisible(true);
    }
}
