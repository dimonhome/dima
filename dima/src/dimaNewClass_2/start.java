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
    private JPanel UpPanel = new JPanel();
    private JPanel DownPanel = new JPanel();
    private JPanel StartPanel = new JPanel();
    //--------------------------------------------------------------------------
    JButton startButton = new JButton("Розпочнем");
    JButton exitProgram = new JButton("Закінчити");
    JButton h1 = new JButton("Привіт");
    JButton test = new JButton("Сховати");
    //--------------------------------------------------------------------------
    
    private final int W=500,H=250;
    
    public form()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(H,W);
        CreateStartPanel();
    }
    
    void CreateStartPanel()
    {
        System.out.println("Star Panel is started");
        add(StartPanel, BorderLayout.CENTER);
        
        exitProgram.addActionListener(new CloseProgram());
        startButton.addActionListener(new CloseStartPanel(StartPanel));
        
        StartPanel.add(startButton);
        StartPanel.add(exitProgram);
    }
    void CreateUpPanel()
    {
        System.out.println("UpPanel is started");
        UpPanel.add(h1);
        add(UpPanel, BorderLayout.NORTH);
        setVisible(true);
        test.addActionListener(new ChangeVisible(DownPanel));
        UpPanel.add(test);
    }
    void CreateDownPanel()
    {
        System.out.println("DownPanel is started");
        add(DownPanel, BorderLayout.SOUTH);
        DownPanel.add(exitProgram);
        exitProgram.addActionListener(new CloseProgram()); //<---- Переглянути і убрать
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
    class CloseStartPanel extends ClosePanel implements ActionListener
    {
        CloseStartPanel(JPanel panel)
        {
           super(panel);
        }
        @Override
        public void actionPerformed(ActionEvent e)
        {
           panel.setVisible(false);
           CreateUpPanel();
           CreateDownPanel();
        }
    }    
    class ChangeVisible implements ActionListener
    {
        JPanel panel = new JPanel();
        ChangeVisible(JPanel panel){
            this.panel=panel;
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(panel.isVisible()){
                panel.setVisible(false);
                test.setText("Показати");  
            }
            else{
                panel.setVisible(true);
                test.setText("<html><body><b>Сховати</b></body></html>");    
            }        
        }
    }
}