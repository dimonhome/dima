

package dimaNewClass_2;

import java.awt.BorderLayout;
import javax.swing.*;


public class panel_Start extends JPanel{
    panel_Start(){
        this.setLayout(new BorderLayout());
    }
    
    void deletePanel(JPanel panel){
        this.remove(panel);
    }
    void putPanel(JPanel panel, BorderLayout bl){
        this.add(panel, bl);
    }
}