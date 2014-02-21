package dimaNewClass_2;

import java.awt.BorderLayout;
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
    private JPanel UpPanel;
    private JPanel DownPanel;
    private JPanel StartPanel;
    //--------------------------------------------------------------------------
    JButton startButton = new JButton("Розпочнем");
    JButton exitProgram = new JButton("Закінчити");
    JButton h1 = new JButton("Привіт");
    JButton test = new JButton("TEST");
    //--------------------------------------------------------------------------
    
    private final int W=500,H=250;
    
    public form(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(H,W);
        CreateStartPanel();
    }
    
    void CreateStartPanel()
    {
        StartPanel = new JPanel();
        System.out.println("Star Panel is started");
        add(StartPanel, BorderLayout.CENTER);
        
        exitProgram.addActionListener(new CloseProgram());
        startButton.addActionListener(new ClosePanel(StartPanel));
        
        StartPanel.add(startButton);
        StartPanel.add(exitProgram);
    }
    
    
    
    void CreateUpPanel()
    {
        UpPanel = new JPanel();
        System.out.println("UpPanel is started");
        UpPanel.add(h1);
        add(UpPanel, BorderLayout.NORTH);
        setVisible(true);
        test.addActionListener(new ClosePanel(DownPanel));
        UpPanel.add(test);
    }
    
    
    
    
    
    void CreateDownPanel()
    {
        DownPanel = new JPanel();
        System.out.println("DownPanel is started");
        add(DownPanel, BorderLayout.SOUTH);
        DownPanel.add(exitProgram);
        //exitProgram.addActionListener(new CloseProgram()); <---- Переглянути і убрать
        setVisible(true);
    }
    
    
    
    
    
    class CloseProgram implements ActionListener // тут гуд
    {
    @Override
    public void actionPerformed(ActionEvent e)
        {
            System.out.println("Program has Exit");
            System.exit(0);
        }
    }
    
    
    
    
    
    class ClosePanel implements ActionListener
    {
        JPanel panel;
        ClosePanel(JPanel panel)
        {
           this.panel=panel;
        }
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panel.setVisible(false);
        }
    }   
}

