package Game;

import javax.swing.*;
import java.awt.*;

public class gameSelectionScreen {
    JFrame gameSelectionScreen;
    JPanel storyTitlePanel,storyButtonPanel;
    JLabel storyTitleLabel;
    JButton storySelection1,storySelection2,storySelection3;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public gameSelectionScreen(){
        gameSelectionScreen = new JFrame();
        gameSelectionScreen.setSize(800, 600);
        storyButtonPanel= new JPanel();
        storyTitleLabel = new JLabel("PLEASE SELECT A STORY:");
        storySelection1 = new JButton("Journey Through Celestia");
        storySelection2 = new JButton("The Scarlet Heroin");
        storySelection3 = new JButton("Lutho and Siphiwe's story");
    }

    public void setGameSelectionScreenGUI(){

        storyTitlePanel = new JPanel();
        storyTitlePanel.setBounds(100, 100, 600, 500);
        storyTitlePanel.setBackground(Color.black);
        storyTitleLabel.setForeground(Color.white);
        storyTitleLabel.setFont(gameFont);
        storyTitlePanel.add(storyTitleLabel);

        storyButtonPanel = new JPanel();
        storyButtonPanel.setBounds(230, 350, 350, 150);
        storyButtonPanel.setBackground(Color.black);
        storyButtonPanel.setLayout(new GridLayout(3, 1));

        storySelection1.setBackground(Color.darkGray);
        storySelection1.setForeground(Color.white);
        storySelection1.setFont(gameFont);
        storySelection1.setFocusPainted(false);
        storyButtonPanel.add(storySelection1);

        storySelection2.setBackground(Color.darkGray);
        storySelection2.setForeground(Color.white);
        storySelection2.setFont(gameFont);
        storySelection2.setFocusPainted(false);
        storyButtonPanel.add(storySelection2);

        storySelection3.setBackground(Color.darkGray);
        storySelection3.setForeground(Color.white);
        storySelection3.setFont(gameFont);
        storySelection3.setFocusPainted(false);
        storyButtonPanel.add(storySelection3);

        gameSelectionScreen.add(storyTitlePanel);
        gameSelectionScreen.add(storyButtonPanel);

        gameSelectionScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameSelectionScreen.getContentPane().setBackground(Color.black);
        gameSelectionScreen.setLayout(null);
        gameSelectionScreen.setVisible(true);

    }

    public static void main(String[] args)
    {
        new gameSelectionScreen().setGameSelectionScreenGUI();
    }
}
