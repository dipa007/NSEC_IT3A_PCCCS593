import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ResizableRectangle extends JPanel implements MouseListener, MouseMotionListener {
    Rectangle rect = new Rectangle(50,50,150,100);
    Point dragStart;
    public ResizableRectangle(){ addMouseListener(this); addMouseMotionListener(this); }
    protected void paintComponent(Graphics g){ super.paintComponent(g); g.drawRect(rect.x,rect.y,rect.width,rect.height); }
    public void mousePressed(MouseEvent e){ if(rect.contains(e.getPoint())) dragStart=e.getPoint(); }
    public void mouseReleased(MouseEvent e){ dragStart=null; }
    public void mouseDragged(MouseEvent e){ if(dragStart!=null){ rect.width = Math.max(10, e.getX()-rect.x); rect.height=Math.max(10, e.getY()-rect.y); repaint(); } }
    public void mouseMoved(MouseEvent e){} public void mouseClicked(MouseEvent e){} public void mouseEntered(MouseEvent e){} public void mouseExited(MouseEvent e){}
    public static void main(String[] args){ JFrame f=new JFrame("Resizable Rectangle"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.add(new ResizableRectangle()); f.setSize(500,400); f.setVisible(true); }
}
