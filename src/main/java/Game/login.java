package Game;

import DbConnection.dbGenerator;
import com.mysql.cj.xdevapi.SqlStatement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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
      if (e.getActionCommand().equals("LOGIN")) {

            String username = usernameTxt.getText();
            String password = passwordTxt.getText();

            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(panelCenter, "Please enter user details", "Error", 1);
            } else if (username.equals(username) && password.equals(password)) {
                try {

                    final Connection con = dbGenerator.DBConnection();
                    //String sqlString = "SELECT * FROM USER WHERE USERNAME = " + username + "AND PASSWORD = " + password; //Original
                    String sqlString = "SELECT * FROM USER WHERE USERNAME = '" + username + " ' " + "AND PASSWORD = ' " + password + " ' "; //Other one
                    JOptionPane.showMessageDialog(null,"I have read the sql string");

                    ResultSet rs;
                    Statement Stmt = con.createStatement();
                    rs = Stmt.executeQuery(sqlString);

                    if (rs != null)
                    {
                        while (rs.next())
                        {

                        }
                    }
                    new gameScreen().setGameScreenGUI();
                    frame.setVisible(false);


                } catch (SQLException ex) {
                    throw new RuntimeException(ex);

                }
            } else if (!username.equals(username) || password.equals(password)) {

                JOptionPane.showMessageDialog(panelCenter, "The username or password does not match", "Error", 1);

            }  else if (e.getActionCommand().equals("CREATE ACCOUNT")) {

              createAccountGui createaccountgui = new createAccountGui();
              createaccountgui.setCreateAccountGui();

              if(username.isEmpty() || password.isEmpty())
              {
                  
              }
          } else if (e.getActionCommand().equals("EXIT")) {
                System.exit(0);
            }
        }
    }
}
