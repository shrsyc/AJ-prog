import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TabPane{
    TabPane(){
        JFrame jf=new JFrame("tabs");
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new TabPane();
    }
}
