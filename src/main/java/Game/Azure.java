package Game;

import Weapon.SuperWeapon;
import Weapon.Weapon_Katana;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Azure {
    AzureGame game;
    AzureGUI gui;
    Player player = new Player();
    public int ready = 0;
    public int azureHealth = 100;
    public int count = 1;
    public int damage = 20;
    Random random = new Random();
    public int eq1, eq2, eq3, symbolFinder;
    String symbols[] = {"*", "/", "+", "-"};

    public Azure(AzureGame g, AzureGUI graphicUserInterface){
        game = g;
        gui = graphicUserInterface;
    }

    public void defaultSetUp(){
        player.hp = 10;
        gui.hpNumberLabel.setText(""+player.hp);

        player.currentWeapon = new Weapon_Katana();
        gui.weaponNameLabel.setText(player.currentWeapon.name);

        gui.selection1.setText("North");
        gui.selection2.setText("South");
        gui.selection3.setText("West");
        gui.selection4.setText("East");
    }

    public void selectPosition(String nextPosition){
        switch (nextPosition){
            case "North":north();
                break;
            case "South":south();
                break;
            case "West":west();
                break;
            case "East":east();
                break;
            case "Home Town":homeTownAzure();
                break;
            case "Ghoul":ghoul();
                break;
            case "Lose":lose();
                break;
            case "Win":win();
                break;
            case "Fishman":fishman();
                break;
            case "Fighter":fighter();
                break;
            case "City of Champions": championCity();
                break;
            case "Azure Dragon": dragon();
                break;
            case "loseAzure": loseAzure();
                break;
            case "winAzure": winAzure();
                break;
/*case "Game Over": toStorySelection();*/

        }
    }

    public void homeTownAzure(){
        gui.mainTextArea.setText("You are at your home town at the moment. \n\nWhere do you wish do go?");
        gui.selection1.setText("North");
        gui.selection2.setText("South"); //this is not selection 2
        gui.selection3.setText("West");  //this is not selection 3
        gui.selection4.setText("East");  //this is not selection 4 //next position is pointing to North,South,East and West(Due to all being in selection1)

        game.nextPosition1 = "North"; //all of these are pointing to the same selection
        game.nextPosition2 = "South";
        game.nextPosition3 = "West";
        game.nextPosition4 = "East";
    }

    public void north(){
        gui.mainTextArea.setText("You meet an old lady with a Weapon Damage Booster. \nYou must help the old lady defeat a ghoul that's been killing people in her town. \nTo gain Weapon Damage booster you must help.");

        gui.selection1.setText("Help");
        gui.selection2.setText("Leave");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Ghoul";
        game.nextPosition2 = "Home Town";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void ghoul(){
        int display[] = new int[4];
        int eq1Ans, eq2Ans, eq3Ans;

        eq1 = random.nextInt(100);
        eq2 = random.nextInt(100);
        eq3 = random.nextInt(100);
        System.out.println(" Randoms created "+eq1+", "+eq2+", "+eq3);

        int eqAns = eq1 + eq2 + eq3;

        eq1Ans = random.nextInt(500);
        eq2Ans = random.nextInt(300);
        eq3Ans = random.nextInt(300);

        int answers[] = { eqAns, eq1Ans, eq2Ans, eq3Ans};
        display=answersRandom(answers);

        gui.mainTextArea.setText("You must answer a math question to fight the ghoul. \n\nWhich is the answer to the equation: "+eq1+"+"+eq2+"+"+eq3);

        gui.selection1.setText(Integer.toString(display[0]));
        gui.selection2.setText(Integer.toString(display[1]));
        gui.selection3.setText(Integer.toString(display[2]));
        gui.selection4.setText(Integer.toString(display[3]));

        game.nextPosition1 = "Lose";
        game.nextPosition2 = "Lose";
        game.nextPosition3 = "Lose";
        game.nextPosition4 = "Lose";

        for (int i = 0; i < 4; i++)
        {
            if (display[i] == eqAns)
            {
                game.nextPosition1 = "Win";
            }
            if (display[i] == eqAns)
            {
                game.nextPosition2 = "Win";
            }
            if (display[i] == eqAns)
            {
                game.nextPosition3 = "Win";
            }
            if (display[i] == eqAns)
            {
                game.nextPosition4 = "Win";
            }
        }


    }

    public void south(){
        gui.mainTextArea.setText("You meet a Fisherman called Lief. He tells you about the City of Champions. \nLief: I have a Weapon Damage Booster. If you wish to get it then you must defeat the Shark-Fishman that has been sinking our boats.");

        gui.selection1.setText("Fight");
        gui.selection2.setText("Leave");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Fishman";
        game.nextPosition2 = "Home Town";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void fishman(){
        gui.mainTextArea.setText("You must answer trivia questions to fight the fishman. \n\nWhich part of Africa is Algeria located in?");

        gui.selection1.setText("North");
        gui.selection2.setText("South");
        gui.selection3.setText("West");
        gui.selection4.setText("East");

        game.nextPosition1 = "Win";
        game.nextPosition2 = "Lose";
        game.nextPosition3 = "Lose";
        game.nextPosition4 = "Lose";
    }

    public void west(){
        gui.mainTextArea.setText("You meet a champion fighter with a good Weapon Damage Booster. \nIf you wish to obtain that Weapon Damage Booster, you must fight.");

        gui.selection1.setText("Fight");
        gui.selection2.setText("Leave");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Fighter";
        game.nextPosition2 = "Home Town";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void fighter(){
        gui.mainTextArea.setText("You must answer trivia questions to fight the champion. \n\nWho was Nelson Mandela's second wife?");

        gui.selection1.setText("Winnie Madikizela");
        gui.selection2.setText("Evelyn Mase");
        gui.selection3.setText("Gloria Mkhize");
        gui.selection4.setText("Graca Machel");

        game.nextPosition1 = "Lose";
        game.nextPosition2 = "Lose";
        game.nextPosition3 = "Lose";
        game.nextPosition4 = "Win";
    }

    public void east(){
        gui.mainTextArea.setText("You meet a blind man in the East. \n He tells you: Be careful of the Elements. Your future is of fulfillment yet it is very grim");

        gui.selection1.setText("Continue");
        gui.selection2.setText("");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Home Town";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void championCity(){
        gui.mainTextArea.setText("You arrive at the City of Champions and find it destroyed. An Enormous Azure Dragon has destroyed it.\nYou must defeat the Azure Dragon.");

        gui.selection1.setText("Fight");
        gui.selection2.setText("Leave");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Azure Dragon";
        game.nextPosition2 = "Home Town";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void dragon(){
        switch (count){
            case 1:
                ++count;
                question1();
                break;
            case 2:
                ++count;
                question2();
                break;
            case 3:
                ++count;
                question3();
                break;
            case 4:
                ++count;
                question4();
                break;
        }
    }

    public void question1(){
        //gui.playerPanel.add(gui.azureLabel);
        //gui.playerPanel.add(gui.azureHpLabel);

        gui.mainTextArea.setText("You must answer trivia questions to defeat the Azure Dragon. \n Which country is known as the Land of the Rising Sun?");

        gui.selection1.setText("New Zealand");
        gui.selection2.setText("Australia");
        gui.selection3.setText("China");
        gui.selection4.setText("Japan");

        game.nextPosition1 = "loseAzure";
        game.nextPosition2 = "loseAzure";
        game.nextPosition3 = "loseAzure";
        game.nextPosition4 = "winAzure";
    }

    public void question2(){
        gui.mainTextArea.setText("You must answer trivia questions to defeat the Azure Dragon. \n Which country is know for loosing a war against Imu?");

        gui.selection1.setText("USA");
        gui.selection2.setText("Australia");
        gui.selection3.setText("Turkey");
        gui.selection4.setText("Chile");

        game.nextPosition1 = "loseAzure";
        game.nextPosition2 = "winAzure";
        game.nextPosition3 = "loseAzure";
        game.nextPosition4 = "loseAzure";
    }

    public void question3(){
        gui.mainTextArea.setText("You must answer trivia questions to defeat the Azure Dragon. \n Which country is the Taj Mahal located in?");

        gui.selection1.setText("Pakistan");
        gui.selection2.setText("United Arabic Emirates");
        gui.selection3.setText("Saudi Arabia");
        gui.selection4.setText("India");

        game.nextPosition1 = "loseAzure";
        game.nextPosition2 = "loseAzure";
        game.nextPosition3 = "loseAzure";
        game.nextPosition4 = "winAzure";
    }

    public void question4(){
        gui.mainTextArea.setText("You must answer trivia questions to defeat the Azure Dragon. \n Which is the longest river in South Africa?");

        gui.selection1.setText("Vaal River");
        gui.selection2.setText("Limpopo River");
        gui.selection3.setText("Orange River");
        gui.selection4.setText("Cweza River");

        game.nextPosition1 = "loseAzure";
        game.nextPosition2 = "loseAzure";
        game.nextPosition3 = "winAzure";
        game.nextPosition4 = "loseAzure";
    }


    public void lose(){
        gui.mainTextArea.setText("You lost the fight.\nYou are wounded");
        player.hp = player.hp - 4;
        gui.hpNumberLabel.setText(""+player.hp);

        gui.selection1.setText("Continue");
        gui.selection2.setText("");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Home Town";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void win() {
        ++ready;

        if (ready >= 3){
            gui.mainTextArea.setText("You won the fight and received the Weapon Damage Booster.\nYour health also improves.\n You are ready for City of Champions.");
            player.hp = player.hp + 4;
            SuperWeapon weapon = new Weapon_Katana();
            weapon.damage = weapon.damage + 5;
            gui.hpNumberLabel.setText(""+player.hp);

            gui.selection1.setText("Go to Home Town");
            gui.selection2.setText("City of Champions");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "Home Town";
            game.nextPosition2 = "City of Champions";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else {
            gui.mainTextArea.setText("You won the fight and received the Weapon Damage Booster.\nYour health also improves.");
            player.hp = player.hp + 4;
            SuperWeapon weapon = new Weapon_Katana();
            weapon.damage = weapon.damage + 5;
            gui.hpNumberLabel.setText(""+player.hp);

            gui.selection1.setText("Continue");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "Home Town";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    public void loseAzure(){
        player.hp = player.hp - damage;
        if (player.hp > 0){
            gui.mainTextArea.setText("INCORRECT ANSWER. \nYou took serious damage.\nYou still have a chance to fight");
            gui.hpNumberLabel.setText(""+player.hp);

            gui.selection1.setText("Fight");
            gui.selection2.setText("Retreat");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "Azure Dragon";
            game.nextPosition2 = "Home Town";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else {
            gui.mainTextArea.setText("INCORRECT ANSWER. \nYOU LOST THE FIGHT.\nGAME OVER");
            gui.hpNumberLabel.setText(""+player.hp);

            gui.selection1.setText(">");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "Game Over";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";

        }
    }

    public void winAzure(){
        azureHealth = azureHealth - player.currentWeapon.damage;
        player.currentWeapon.damage = player.currentWeapon.damage + 50;

        if (azureHealth > 0){
            gui.mainTextArea.setText("CORRECT ANSWER. \nYou Hit The Dragon With A Mighty Blow.\nYou still have a chance to fight  you can do this.");
            gui.hpNumberLabel.setText(""+player.hp);

            gui.selection1.setText("Fight");
            gui.selection2.setText("Retreat");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "Azure Dragon";
            game.nextPosition2 = "Home Town";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        } else {
            gui.mainTextArea.setText("CORRECT ANSWER. \nYOU WON THE FIGHT.\nYOU ARE OFFICIALLY THE STRONGEST IN THE LAND. YOU HAVE COMPLETED THE GAME.");
            gui.hpNumberLabel.setText(""+player.hp);
            player.hp = 10;
            player.currentWeapon.damage = 5;

            gui.selection1.setText(">");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "Game Over";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }
    public int[] answersRandom(int answers[]){
        int answersFinal[] = {1000, 1000, 1000, 1000};

        int pos;

        int nPicked = 0, i = 0, nLeft = answers.length;
        int samplesNeeded = answers.length - 1;
        List<Integer> list = new ArrayList();

        while (samplesNeeded > -0)
        {
            pos = random.nextInt(nLeft)+1;
            System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
            i++;

            if (list.contains(pos))
            {
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            } else
            {
                answersFinal[pos] = answers[samplesNeeded];
                System.out.println("Print final answers array items:"+answersFinal[pos]);
                samplesNeeded--;
                list.add(pos);
                System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
                nLeft--;
            }
        }
        return answersFinal;
    }
}
