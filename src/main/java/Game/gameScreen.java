package Game;

import javax.swing.*;
import java.awt.*;

public class gameScreen
{
    JFrame gameScreen;
    JPanel gameTitlePanel, startButtonPanel, loadButtonPanel;
    JLabel gameTitleLabel;
    JButton newGameButton, loadGameButton;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public gameScreen(){
        gameScreen = new JFrame();
        gameScreen.setSize(800, 600);
        gameTitlePanel = new JPanel();
        startButtonPanel = new JPanel();
        loadButtonPanel = new JPanel();
        gameTitleLabel = new JLabel("THE ARC");
        newGameButton = new JButton("NEW GAME");
        loadGameButton = new JButton("LOAD GAME");
    }

    public void setGameScreenGUI(){

        gameTitlePanel = new JPanel();
        gameTitlePanel.setBounds(100, 100, 600, 500);
        gameTitlePanel.setBackground(Color.black);
        gameTitleLabel.setForeground(Color.white);
        gameTitleLabel.setFont(titleFont);
        gameTitlePanel.add(gameTitleLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.darkGray);
        newGameButton.setBackground(Color.darkGray);
        newGameButton.setForeground(Color.white);
        newGameButton.setFont(gameFont);
        newGameButton.setFocusPainted(false);
        startButtonPanel.add(newGameButton);

        loadButtonPanel = new JPanel();
        loadButtonPanel.setBounds(300, 450, 200, 100);
        loadButtonPanel.setBackground(Color.darkGray);
        loadGameButton.setBackground(Color.darkGray);
        loadGameButton.setForeground(Color.white);
        loadGameButton.setFont(gameFont);
        loadGameButton.setFocusPainted(false);
        loadButtonPanel.add(loadGameButton);

        gameScreen.add(gameTitlePanel);
        gameScreen.add(startButtonPanel);
        gameScreen.add(loadButtonPanel);

        gameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameScreen.getContentPane().setBackground(Color.black);
        gameScreen.setLayout(null);
        gameScreen.setVisible(true);

    }

    public static void main(String[] args)
    {
        new gameScreen().setGameScreenGUI();
    }

}
