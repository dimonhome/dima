package dimaNewClass_2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;

public class start {
    public start(){
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                form f1 = new form();
            }
        }
        );
    }
}

final class form extends JFrame{
    pane_lStart FirstPanel = new pane_lStart();
    panel_NorthPanel northPanel;
    //--------------------------------------------------------------------------
    JButton StartButton = new JButton("Розпочнем");
    JButton ExitButton = new JButton("Вийти");
    //--------------------------------------------------------------------------
    
    private final int W=500,H=550;
    
    public form()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(H,W);
        add(FirstPanel);
        FirstPanel.add(new panel_NorthPanel(StartButton,ExitButton), BorderLayout.NORTH);
        ExitButton.addActionListener(new listener_ExitProgram());
        StartButton.addActionListener(new listener_StartButton(northPanel));
    }
}