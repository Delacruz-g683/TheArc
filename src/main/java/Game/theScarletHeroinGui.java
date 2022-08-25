package Game;

import javax.swing.*;
import java.awt.*;

public class theScarletHeroinGui {
        JFrame startWindow;
        JPanel gameTitlePanel, startButtonPanel, loadButtonPanel, mainTextPanel, selectionButtonPanel, playerPanel,storyTitlePanel,storyButtonPanel;
        JLabel gameTitleLabel,storyTitleLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
        JButton startButton, loadButton,storySelection1,storySelection2,storySelection3, selection1, selection2, selection3, selection4;
        JTextArea mainTextArea;
        Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
        Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

       public theScarletHeroinGui() {
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        startWindow.add(mainTextPanel);

        mainTextArea = new JTextArea("Add text here...");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(gameFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        selectionButtonPanel = new JPanel();
        selectionButtonPanel.setBounds(250, 350, 300, 150);
        selectionButtonPanel.setBackground(Color.black);
        selectionButtonPanel.setLayout(new GridLayout(4, 1));
        startWindow.add(selectionButtonPanel);

        selection1 = new JButton("s1");
        selection1.setBackground(Color.darkGray);
        selection1.setForeground(Color.white);
        selection1.setFont(gameFont);
        selection1.setFocusPainted(false);
        //selection1.addActionListener(this);
        selection1.setActionCommand("s1");
        selectionButtonPanel.add(selection1);

        selection2 = new JButton("s2");
        selection2.setBackground(Color.darkGray);
        selection2.setForeground(Color.white);
        selection2.setFont(gameFont);
        selection2.setFocusPainted(false);
        //selection2.addActionListener(this);
        selection2.setActionCommand("s2");
        selectionButtonPanel.add(selection2);

        selection3 = new JButton("s3");
        selection3.setBackground(Color.darkGray);
        selection3.setForeground(Color.white);
        selection3.setFont(gameFont);
        selection3.setFocusPainted(false);
        //selection3.addActionListener(this);
        selection3.setActionCommand("s3");
        selectionButtonPanel.add(selection3);

        selection4 = new JButton("s4");
        selection4.setBackground(Color.darkGray);
        selection4.setForeground(Color.white);
        selection4.setFont(gameFont);
        selection4.setFocusPainted(false);
        //selection4.addActionListener(this);
        selection4.setActionCommand("s4");
        selectionButtonPanel.add(selection4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));

        hpLabel = new JLabel("HP:");
        hpLabel.setFont(gameFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpNumberLabel = new JLabel();
        hpNumberLabel.setFont(gameFont);
        hpNumberLabel.setForeground(Color.white);
        playerPanel.add(hpNumberLabel);

        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(gameFont);
        playerPanel.add(weaponLabel);

        weaponNameLabel = new JLabel();
        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(gameFont);
        playerPanel.add(weaponNameLabel);
       }
}
