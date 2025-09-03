import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField t1=new JTextField(10), t2=new JTextField(10), out=new JTextField(15);
    public SimpleCalculator(){
        setTitle("Calculator"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel();
        JButton add=new JButton("+"), sub=new JButton("-"), mul=new JButton("*"), div=new JButton("/");
        for(JButton b: new JButton[]{add,sub,mul,div}) b.addActionListener(this);
        p.add(new JLabel("A:")); p.add(t1); p.add(new JLabel("B:")); p.add(t2);
        p.add(add); p.add(sub); p.add(mul); p.add(div);
        p.add(new JLabel("Result:")); out.setEditable(false); p.add(out);
        setContentPane(p); pack();
    }
    public void actionPerformed(ActionEvent e){
        double a=Double.parseDouble(t1.getText()), b=Double.parseDouble(t2.getText());
        String cmd=e.getActionCommand(); double r=0;
        if(cmd.equals("+")) r=a+b; else if(cmd.equals("-")) r=a-b; else if(cmd.equals("*")) r=a*b; else r=a/b;
        out.setText(String.valueOf(r));
    }
    public static void main(String[] args){ new SimpleCalculator().setVisible(true); }
}
