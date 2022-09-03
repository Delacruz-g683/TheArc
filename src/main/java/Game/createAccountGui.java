package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createAccountGui implements ActionListener {
    private JFrame frame;
    private JLabel namelbl, srnamelbl, usernamelbl, passwordlbl;
    private JPanel panelCenter,panelNorth,panelWest,panelEast, panelSouth;
    private JTextField nameTxt, srnameTxt, usernameTxt, passwordTxt;
    private JButton btnSubmit,btnBack;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public createAccountGui(){
        frame = new JFrame();
        panelCenter = new JPanel();
        panelNorth = new JPanel();
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelSouth = new JPanel();

        namelbl = new JLabel("Name:");
        srnamelbl = new JLabel("Surname:");
        usernamelbl = new JLabel("Username:");
        passwordlbl = new JLabel("Password:");

        nameTxt = new JTextField();
        srnameTxt = new JTextField();
        usernameTxt = new JTextField();
        passwordTxt = new JTextField();

        btnSubmit = new JButton("GENERATE");
        btnBack = new JButton("BACK");
    }

    public void setCreateAccountGui(){
        panelCenter.setLayout(new GridLayout(2, 1));
        panelNorth.setLayout(new GridLayout(2,1));
        panelWest.setLayout(new GridLayout(1,1));
        panelEast.setLayout(new GridLayout(1,1));
        panelSouth.setLayout(new FlowLayout());

        panelCenter.add(namelbl);
        panelCenter.add(nameTxt);
        panelCenter.add(srnamelbl);
        panelCenter.add(srnameTxt);
        panelCenter.add(usernamelbl);
        panelCenter.add(usernameTxt);
        panelCenter.add(passwordlbl);
        panelCenter.add(passwordTxt);

        panelSouth.add(btnSubmit);
        panelSouth.add(btnBack);

        frame.getContentPane().add(panelNorth);
        frame.getContentPane().add(panelEast);
        frame.getContentPane().add(panelWest);
        frame.getContentPane().add(panelCenter);
        frame.getContentPane().add(panelSouth);

        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelSouth, BorderLayout.SOUTH);

        frame.setLocation(100, 50);

        panelNorth.setPreferredSize(new Dimension(50,100));
        panelCenter.setPreferredSize(new Dimension(800,800));
        panelWest.setPreferredSize(new Dimension(50,30));
        panelEast.setPreferredSize(new Dimension(50,30));
        panelSouth.setPreferredSize(new Dimension(30,50));

        btnSubmit.addActionListener(this);
        btnBack.addActionListener(this);

        frame.setPreferredSize(new Dimension(600, 500));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        /*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("BACK")) {

            frame.dispose();

        }
    }



}
