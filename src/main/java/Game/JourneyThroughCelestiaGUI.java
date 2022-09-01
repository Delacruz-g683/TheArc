
package Game;

import javax.swing.*;
import java.awt.*;

public class JourneyThroughCelestiaGUI {
    JFrame frame;
    JPanel mainTextPanel, selectionButtonPanel, playerPanel;
    JLabel hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton selection1, selection2, selection3, selection4;
    JTextArea mainTextArea;
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 26);

    public JourneyThroughCelestiaGUI()
    {
        frame = new JFrame();
        frame.setSize(800, 600);
        mainTextPanel = new JPanel();
        mainTextArea = new JTextArea("Add text here...");
        selectionButtonPanel = new JPanel();
        selection1 = new JButton("");
        selection2 = new JButton("");
        selection3 = new JButton("");
        selection4 = new JButton("");
        playerPanel = new JPanel();
        hpLabel = new JLabel("HP:");
        hpNumberLabel = new JLabel();
        weaponLabel = new JLabel("Weapon:");
        weaponNameLabel = new JLabel();
    }

    public void setJourneyThroughCelestia(JourneyThroughCelestiaGame.SelectionHandler sHandler){
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);

        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(gameFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        selectionButtonPanel.setBounds(250, 350, 300, 150);
        selectionButtonPanel.setBackground(Color.black);
        selectionButtonPanel.setLayout(new GridLayout(4, 1));

        selection1.setBackground(Color.darkGray);
        selection1.setForeground(Color.white);
        selection1.setFont(gameFont);
        selection1.setFocusPainted(false);
        selection1.addActionListener(sHandler);
        selection1.setActionCommand("CelestiaChoice1");
        selectionButtonPanel.add(selection1);

        selection2.setBackground(Color.darkGray);
        selection2.setForeground(Color.white);
        selection2.setFont(gameFont);
        selection2.setFocusPainted(false);
        selection2.addActionListener(sHandler);
        selection2.setActionCommand("CelestiaChoice2");
        selectionButtonPanel.add(selection2);

        selection3.setBackground(Color.darkGray);
        selection3.setForeground(Color.white);
        selection3.setFont(gameFont);
        selection3.setFocusPainted(false);
        selection3.addActionListener(sHandler);
        selection3.setActionCommand("CelestiaChoice3");
        selectionButtonPanel.add(selection3);

        selection4.setBackground(Color.darkGray);
        selection4.setForeground(Color.white);
        selection4.setFont(gameFont);
        selection4.setFocusPainted(false);
        selection4.addActionListener(sHandler);
        selection4.setActionCommand("CelestiaChoice4");
        selectionButtonPanel.add(selection4);

        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));

        hpLabel.setFont(gameFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpNumberLabel.setFont(gameFont);
        hpNumberLabel.setForeground(Color.white);
        playerPanel.add(hpNumberLabel);

        weaponLabel.setForeground(Color.white);
        weaponLabel.setFont(gameFont);
        playerPanel.add(weaponLabel);

        weaponNameLabel.setForeground(Color.white);
        weaponNameLabel.setFont(gameFont);
        playerPanel.add(weaponNameLabel);

        frame.add(mainTextPanel);
        frame.add(selectionButtonPanel);
        frame.add(playerPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}


