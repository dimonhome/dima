

package dimaNewClass_2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PassPanelForClass_2 extends JPanel{
    private char[] pass1;
    private JPasswordField pass;
    
    PassPanelForClass_2(){
        add(pass);
        add(new JLabel("Text"));
    }
}
