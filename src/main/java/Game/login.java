package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
    private JFrame frame;
    private JPanel centerPanel, southPanel;
    private JLabel  usernameLbl, passwordLbl, cmbLbl;
    private  JTextField  usernameTxt, passwordTxt;
    private JButton btnLogin, btnExit;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public login()
    {
        frame = new JFrame("Login");
        centerPanel = new JPanel();
        southPanel = new JPanel();

        usernameLbl = new JLabel("Username");
        usernameLbl.setFont(gameFont);
        usernameTxt = new JTextField(20);
        passwordLbl = new JLabel("Password");
        passwordLbl.setFont(gameFont);
        passwordTxt = new JTextField(20);
        cmbLbl = new JLabel("Select user:");
        String[] options = {"User", "Role"};
        btnLogin = new JButton("Login");
        btnExit = new JButton("Exit");
    }

    public void setGUI() {
        centerPanel.setLayout(new GridLayout(4, 1));
        /*centerPanel.setBounds(250, 350, 300, 150);
        centerPanel.setBackground(Color.black);*/
        southPanel.setLayout(new FlowLayout());

        centerPanel.add(usernameLbl);
        centerPanel.add(usernameTxt);
        centerPanel.add(passwordLbl);
        centerPanel.add(passwordTxt);

        southPanel.add(btnLogin);
        southPanel.add(btnExit);

        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);

        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);

        frame.setPreferredSize(new Dimension(800, 600));
        // TODO: 2022/08/22 sort out the color scheme of the gui's    
       /* frame.setBackground(Color.black);*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       /* if (e.getActionCommand().equals("Login")) {

            String username = usernameTxt.getText();
            String password = passwordTxt.getText();

            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(centerPanel, "Please enter user details ", "Error", 1);
            } else {
                User user = new User(username,password);

                if (options.equalsIgnoreCase("Admin") && clientUser.getOptions().equals("Admin") && clientUser.getIsActive().equals("Yes")) {

                    AdminGUI admingui = new AdminGUI();
                    admingui.setGui();
                }
                if (options.equalsIgnoreCase("Agent") && clientUser.getOptions().equals("Agent") && clientUser.getIsActive().equals("Yes")) {

                    AgentGUI ag = new AgentGUI();
                    ag.setGUI();

                }else if (!clientUser.getIsActive().equals("Yes")){
                    JOptionPane.showMessageDialog(centerPanel, "User is no longer active", "Error", 1);
                }
            }

        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }*/
    }

    public static void main(String[] args)
    {
        new login().setGUI();
    }
}
