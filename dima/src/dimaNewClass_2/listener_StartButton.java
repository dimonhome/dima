/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dimaNewClass_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Dima
 */
public class listener_StartButton implements ActionListener{
    JPanel panel;
    listener_StartButton(JPanel panel){
        this.panel=panel;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        panel.setVisible(false);
        
    }
}
