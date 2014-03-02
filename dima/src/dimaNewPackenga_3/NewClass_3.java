

package dimaNewPackenga_3;

import java.awt.BorderLayout;
import javax.swing.*;

public class NewClass_3 extends JFrame {
    JPanel StartPanel = new JPanel();
    NewClass_3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        this.add(StartPanel);
        StartPanel.setLayout(new BorderLayout());
    }
    
    void pushPanel(JPanel panel, BorderLayout dr){
        //BorderLayout br = (BorderLayout) where;
        this.remove(this.g);
    }
}
