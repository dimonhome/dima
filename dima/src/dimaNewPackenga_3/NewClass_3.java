

package dimaNewPackenga_3;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.*;

public class NewClass_3 extends JFrame {
    JPanel StartPanel = new JPanel();
    public NewClass_3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        this.add(StartPanel);
        StartPanel.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        StartPanel.add(p,BorderLayout.CENTER);
        JButton b= new JButton("ку ку");
        p.add(b);
    }
    
    //@SuppressWarnings("empty-statement")
    void pushPanel(JPanel panel, String dr){
        BorderLayout br = new BorderLayout();
        JPanel currentCenterPanel = (JPanel) br.getLayoutComponent(dr);
    }
}
