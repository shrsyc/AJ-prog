import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxButton {
    CheckBoxButton(){
        JFrame jf=new JFrame("tabs");
        jf.setSize(300,200);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox c1=new JCheckBox("C++");
        JCheckBox c2=new JCheckBox("JAVA");
        JCheckBox c3=new JCheckBox("C");
        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new CheckBoxButton();
                
            }
        });
    }
}
