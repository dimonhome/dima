package dima;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NewClass_1 {
    public NewClass_1(){
        EventQueue.invokeLater(new Runnable(){ 
            @Override
            public void run(){
                forma f1 = new forma();
            }
        });
    }
    
}
class forma extends JFrame{
    public forma(){
        setVisible(true);
        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        add(panel);
        makebutton("green", Color.GREEN);
        makebutton("red", Color.red);
        makebutton("yellow", Color.yellow);
    }
    final void makebutton(String name, Color c)
    {
        final Color backgraund;
        backgraund = c;
        JButton b1 = new JButton(name);
        panel.add(b1);
        b1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
              panel.setBackground(backgraund);
            }
        }
        );
    }
     JPanel panel;
}
