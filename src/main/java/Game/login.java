package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
    private JFrame frame;
    private JPanel panelCenter,panelNorth,panelWest,panelEast, panelSouth;
    private JLabel  usernameLbl, passwordLbl, cmbLbl;
    private  JTextField  usernameTxt, passwordTxt;
    private JButton btnLogin,btnCreateAccount, btnExit;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public login()
    {
        frame = new JFrame("Login");
        panelCenter = new JPanel();
        panelNorth = new JPanel();
        panelWest = new JPanel();
        panelEast = new JPanel();
        panelSouth = new JPanel();

        usernameLbl = new JLabel("Username");
        usernameLbl.setFont(gameFont);
        usernameTxt = new JTextField(20);
        passwordLbl = new JLabel("Password");
        passwordLbl.setFont(gameFont);
        passwordTxt = new JTextField(20);
cmbLbl = new JLabel("Select user:");
        String[] options = {"User", "Role"};

        btnLogin = new JButton("LOGIN");
        btnCreateAccount = new JButton("CREATE ACCOUNT");
        btnExit = new JButton("EXIT");
    }

    public void setLoginGUI() {
        panelCenter.setLayout(new GridLayout(4, 1));
        panelNorth.setLayout(new GridLayout(2,1));
        panelWest.setLayout(new GridLayout(1,1));
        panelEast.setLayout(new GridLayout(1,1));
        panelSouth.setLayout(new FlowLayout());

        panelCenter.add(usernameLbl);
        panelCenter.add(usernameTxt);
        panelCenter.add(passwordLbl);
        panelCenter.add(passwordTxt);

        panelSouth.add(btnLogin);
        panelSouth.add(btnCreateAccount);
        panelSouth.add(btnExit);

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

        btnLogin.addActionListener(this);
        btnCreateAccount.addActionListener(this);
        btnExit.addActionListener(this);

        frame.setPreferredSize(new Dimension(800, 600));
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("CREATE ACCOUNT")) {

            createAccountGui createaccountgui = new createAccountGui();
            createaccountgui.setCreateAccountGui();

            }
 /*if (e.getActionCommand().equals("Login")) {

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
        }
*/
    }

    public static void main(String[] args)
    {
        new login().setLoginGUI();
    }
}
