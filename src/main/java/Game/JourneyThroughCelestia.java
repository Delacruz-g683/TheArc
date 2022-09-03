package Game;

import Weapon.Weapon_BareHands;


//Jesse Hiebner Story Code here.
//Progression as follows:

/** 20/05/2022 -> Brainstorming what to write for story and getting updated on what entities I should help or do
 * 21/05/2022 -> Coding Player class, Superweapon class(including weapon bare hands, weapon bow and arrow, wepon knife),JourneyThroughCelestia class for Brandon and Jesse's game.
 *               Adding a gold system later to buy items from a market.store or potions for health.
 *               Changing default weapon to fists/bare hands as to obtain a weapon or choose a weapon
 * 22/05/2022 -> adding random number generation for damage output from monsters or from the amount of gold dropped. (maybe even item rarity???)
 **/



public class JourneyThroughCelestia
{
    JourneyThroughCelestiaGUI gui;
    JourneyThroughCelestiaGame game;

    public JourneyThroughCelestia(JourneyThroughCelestiaGame g, JourneyThroughCelestiaGUI UI)
    {
        game = g;
        gui = UI;
    }

    public void defaultSetup()
    {
        Player.hp = 10;
        gui.hpNumberLabel.setText("" + Player.hp);
        Player.celestiaGold = 0; //taking out and also extra could be elemental. rarity.
        Player.xp = 0;
           /* Player.attack = 0 + Player.currentWeapon.damage; //increases every level*/
        Player.lvl = 0;
        Player.currentWeapon = new Weapon_BareHands();
        gui.weaponNameLabel.setText(Player.currentWeapon.name);
    }

    //Handling stat gain
    public void LevelUp()
    {
        if (Player.xp >= 100)
        {
            Player.lvl++;
            Player.attack = Player.attack + 2;
            Player.hp = Player.hp + 2;

        }
    }

    public void selectPosition(String nextPosition)
    {
        switch(nextPosition)
        {
            //PLACES
                case "The TownGate":TownGate(); break;
                case "Town Square":TownSquare(); break;
                case "The Armoury":TheArmoury(); break;
                case "Healing Tent":HealingTent(); break;
                case "The Food Store":TheFoodStore(); break;
                case "The Corrupted Dungeons":TheCorruptedDungeons(); break;
                case "The Mines of Middle Earth":TheMinesOfMiddleEarth (); break;
                case "The Forest of Darkness":TheForestOfDarkness();

            //ACTIONS
                case "Speak To The Guard": SpeakToTheGuard();break;
                case "Attack Guard": AttackGuard(); break;
                case "Rest": Rest(); break;
                /*case "Shop": Shop(); break;*/

            //PEOPLE(NPCs)

            //

        }
    }

   public void TownGate()
    {
        gui.mainTextArea.setText("You get to the town gate. Guard:There is a  guard looking at you. /n Guard: Can I help you there?");
        gui.selection1.setText("Speak to the Guard");
        gui.selection2.setText("Search the area");
        gui.selection3.setText("Go to the Corrupted Dungeons");
        gui.selection4.setText("Rest till Tomorrow");

        game.nextPosition1 = "Speak To The Guard";
        game.nextPosition2 = "Search";
        game.nextPosition3 = "The Corrupted Dungeons";
        game.nextPosition4 = "Rest";
    }

    public void TownSquare()
    {
        gui.mainTextArea.setText("The streets are quiet, but scuttling with feet and the sound of mechants here and there." + "\n Where would you like to go?");
        gui.selection1.setText(" Walk over to the armoury");
        gui.selection2.setText("Walk to the healing tent");
        gui.selection3.setText("Go to the Food Store");
        gui.selection4.setText("Go back to the town's gates");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The TownGate";
    }

    public void TheArmoury()
    {

            gui.mainTextArea.setText("A long-bearded man looks at you with sweat dripping from his forehead." +
                    "\n His muscles could probably kill you in 1 flick of his finger. It sends shivers down your spine " +
                    "\n man: What do you need weakling?");
            gui.selection1.setText("Look at whats for sale...");
            gui.selection2.setText("fight the shop keeper");
            gui.selection3.setText("Ask the shopkeeper about his awesome beard and huge muscles");
            gui.selection4.setText("Leave to the Town gate");

            game.nextPosition1 = "ShopArmoury";  //get ready to implement the string items which do different things in their own descriptions.
            game.nextPosition2 = "TownSquare";
            game.nextPosition3 = "Ask the shopkeeper about his awesome beard and huge muscles";
            game.nextPosition4 = "townGate"; //back to townGate

    }
    public void HealingTent()
    {
        if(Player.celestiaGold == 0)
        {
            gui.mainTextArea.setText("You enter the healing tent but realize you have no money. You can stand here, or go back to the town square");
            gui.selection1.setText("Back to the Towngate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "The TownGate";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else
        {
            gui.selection1.setText("back to the Towngate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("Head to Town Square");

            game.nextPosition1 = "The Armoury";
            game.nextPosition2 = "Healing Tent";
            game.nextPosition3 = "The Food Store";
            game.nextPosition4 = "The TownGate";
        }

    }

    public void TheDecayingCave()
    {
        gui.mainTextArea.setText("A sign reads: 'Viatores cavent quaerentes thesaurum sanitatis suae spoliabuntur!' " +
       "\n "+ "You take a second to compose yourself and let your eyes adjust to the low light."+
       "\n "+ "As you walk ahead the path forks into three, what do you do?");
        gui.selection1.setText("Head towards the Corrupted dungeons");
        gui.selection2.setText("Head towards the Mines of Middle Earth");
        gui.selection3.setText("Head towards the Forest of Darkness");
        gui.selection4.setText("Head back to the town");

        game.nextPosition1 = "The Corrupted dungeons";
        game.nextPosition2 = "Head back to the town";
    }

    public void TheCorruptedDungeons()
        //boss should deal significantly more dmg compared to the other monsters. maybe X2 or X3?
        //Dungeon Story.
        {
            gui.mainTextArea.setText("The entrance to the dungeon bellows a warm gust of air, almost as if its alive."+
                               "\n "+ "There are several unexplored chambers in the decaying cave." +
                              "\n "+ "What do you do?");
            gui.selection1.setText("Head towards the Big boss");
            gui.selection2.setText("Head down into the Mines of Middle Earth");
            gui.selection3.setText("Head back to the Decaying Cave");

            game.nextPosition1 = "The Big Boss.";
            game.nextPosition2 = "The Mines of Middle Earth.";
            game.nextPosition3 = "The Decaying Cave";
        }

    public void TheMinesOfMiddleEarth()
        {
            gui.mainTextArea.setText("The mines is home to a monster, nobody has seen the beast and lived to tell the tale!" +
                       "\n " + "You grab the torch and make your way down the steps."+
                   "\n "+ "Its completely silent, you hear a rumble."+ "\n "+ "The beast slumbers."+  "\n "+ "As you walk ahead the path forks into three, what do you do?");

            gui.selection1.setText("Enter the mines");
            gui.selection2.setText("Look around");
            gui.selection3.setText("Head back to the x");

        game.nextPosition1 = "The Corrupted dungeons";
//Guy tried getting hold of you
        game.nextPosition2 = "Head back to the town";
        }

    public void TheForestOfDarkness()
        {
            gui.mainTextArea.setText("Mother nature has created gateways into every realm, including this one."+
                    "\n " + "You can hear the sound of birds and insects flapping there wings. "+
                    "\n " + "You grab the torch hanging on the wall.");
            gui.selection1.setText("");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

        game.nextPosition1 = "The Corrupted dungeons";
        game.nextPosition2 = "The Mines of Middle Earth";
        game.nextPosition2 = "Head back to the decaying cave";
        }

//ACTIONS
 public void AttackGuard()
    {
        gui.mainTextArea.setText("Guard: Hey! Don't be crazy! /n You are hit by the guard and scuttle away. ");
        gui.selection1.setText("Your silly mistake lead to you waking up feeling sore on the head, " +
                                "/n and a bruised finger mark on your forehead. You need to rest");
        Player.hp = 3;
        gui.hpNumberLabel.setText("" + Player.hp);

        game.nextPosition1 = "The TownGate";
    }
//PLACES
    public void TheFoodStore()
    {
        if(Player.celestiaGold == 0)
        {
            gui.mainTextArea.setText("Woman: nice to see you again Traveller. \n What Would you like to buy today?");
            gui.selection1.setText("townGate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");
        }
        else
        {
            gui.mainTextArea.setText("Woman: nice to see you again Traveller. \n What Would you like to buy today?");
            gui.selection1.setText("");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("back to the Towngate");

            game.nextPosition1 = "The Armoury";
            game.nextPosition2 = "Healing Tent";
            game.nextPosition3 = "The Food Store";
            game.nextPosition4 = "The Corrupted dungeons";
        }
    }
//PEOPLE

    public void TownGuardActions()
    {
        gui.mainTextArea.setText("You get to the town gate. Guard: Oi!, stop right there!");
        gui.selection1.setText("fight guard");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Attack guard";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
    }

    public void SpeakToTheGuard()
    {
        gui.mainTextArea.setText("You approach the Guard. /n Guard: what can I help you with?");
        gui.selection1.setText("Attack the guard");
        gui.selection2.setText("Ask if he has some money");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "Attack Guard";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void Rest()
    {
        gui.mainTextArea.setText("You find a place to rest and feel refreshed afterward");
        gui.selection1.setText("Head on out");
        Player.hp = Player.hp + 2;
        gui.hpNumberLabel.setText("" + Player.hp);
        gui.selection2.setText("Search around before leaving");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "The TownGate";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
