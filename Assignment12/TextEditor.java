import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class TextEditor extends JFrame implements ActionListener {
    JTextArea area = new JTextArea(20,60);
    JMenuItem open=new JMenuItem("Open"), save=new JMenuItem("Save");
    public TextEditor(){
        setTitle("Simple Text Editor"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); add(new JScrollPane(area), BorderLayout.CENTER);
        JMenuBar mb=new JMenuBar(); JMenu file=new JMenu("File"); file.add(open); file.add(save); mb.add(file); setJMenuBar(mb);
        open.addActionListener(this); save.addActionListener(this); pack();
    }
    public void actionPerformed(ActionEvent e){
        try {
            if(e.getSource()==open){
                JFileChooser fc=new JFileChooser(); if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
                    area.setText(new String(java.nio.file.Files.readAllBytes(fc.getSelectedFile().toPath())));
                }
            } else {
                JFileChooser fc=new JFileChooser(); if(fc.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
                    try (FileWriter fw=new FileWriter(fc.getSelectedFile())){ fw.write(area.getText()); }
                }
            }
        } catch(Exception ex){ JOptionPane.showMessageDialog(this, ex.toString()); }
    }
    public static void main(String[] args){ new TextEditor().setVisible(true); }
}
