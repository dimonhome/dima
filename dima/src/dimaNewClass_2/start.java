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

class form extends JFrame{
    private JPanel UpPanel;
    private JPanel DownPanel;
    private JPanel StartPanel;
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
        add(StartPanel, BorderLayout.CENTER);
        JButton startButton = new JButton("Розпочнем");
        JButton exitProgram = new JButton("Закінчити");
        exitProgram.addActionListener(new CloseProgram());
        startButton.addActionListener(new CloseStartPanel());
        StartPanel.add(startButton);
        StartPanel.add(exitProgram);
    }
    void CreateUpPanel()
        {
            UpPanel = new JPanel();
            JButton h1 = new JButton("Привіт");
            UpPanel.add(h1);
            add(UpPanel, BorderLayout.NORTH);
            setVisible(true);
            
        }
    void CreateDownPanel()
        {
            DownPanel = new JPanel();
            add(DownPanel, BorderLayout.SOUTH);
            JButton exitProgram = new JButton("Вийти");
            DownPanel.add(exitProgram);
            //exitProgram.setSize((DownPanel.getSize().height)-5, (DownPanel.getSize().width)-5);
            exitProgram.addActionListener(new CloseProgram());
            setVisible(true);
        }
    
    
    
    void ClosePanel(JPanel panel){
        panel.getName();
        System.out.println("Панель "+ panel.getName() + ", закрита");
    }
    class CloseProgram implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
        }
    class CloseStartPanel implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
            ClosePanel(StartPanel);
            StartPanel.setVisible(false);
            CreateUpPanel();
            CreateDownPanel();
        }
    }
}

