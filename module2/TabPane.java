import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TabPane{
    TabPane(){
        JFrame jf=new JFrame("tabs");
        jf.setSize(300,200);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane jp=new JTabbedPane();
        jp.setPreferredSize(new Dimension(200, 80));
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JRadioButton b1=new JRadioButton("A");
        JRadioButton b2=new JRadioButton("B");
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        p1.add(b2);
        p1.add(b1);
        JCheckBox c1=new JCheckBox("C++");
        JCheckBox c2=new JCheckBox("JAVA");
        p2.add(c2);
        p2.add(c1);
        jp.addTab("section", p1);
        jp.addTab("languages", p2);
        jf.add(jp);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){new TabPane();}  
        });
        
    }
}
