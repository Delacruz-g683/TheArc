/*package Game;

import weaponPackage.Weapon_BareHands;

//Jesse Hiebner Story Code here.
//Progression as follows:
/*
 * 20/05/2022 -> Brainstorming what to write for story and getting updated on what entities I should help or do
 * 21/05/2022 -> Coding Player class, Superweapon class(including weapon bare hands, weapon bow and arrow, wepon knife),JourneyThroughCelestia class for Brandon and Jesse's game.
 *               Adding a gold system later to buy items from a market.store or potions for health.
 *               Changing default weapon to fists/bare hands as to obtain a weapon or choose a weapon
 * 22/05/2022 -> adding random number generation for damage output from monsters or from the amount of gold dropped. (maybe even item rarity???)
 * */

/*public class JourneyThroughCelestia
{

    public void defaultSetup()
    {
        Player.hp = 10;
        gui.hpNumberLabel.setText("" + Player.hp);
        Player.celestiaGold = 0; //taking out and also extra could be elemental. rarity.
        Player.xp = 0;
        Player.attack = 0 + Player.currentWeapon.damage; //increases every level
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
                case "The Mines of Middle Earth":TheMinesOfMiddleEarth
                case "The Forest of Darkness":TheForestOfDarkness

            //ACTIONS
                case "Speak To The Guard": SpeakToTheGuard();break;
                case "Attack Guard": AttackGuard(); break;
                case "Rest": Rest(); break;
                case "Shop":Shop(); break;

            //PEOPLE(NPCs)






            //

        }
    }

   public void TownGate()
    {
        gui.mainTextArea.setText("You get to the town gate. Guard:There is a  guard looking at you. /n Guard: Can I help you there?");
        gui.selection1.setText("Speak to the guard");
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
        gui.mainTextArea.setText("The streets are buzzing with ");
        gui.selection1.setText("The Armoury");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
    }

    public void TheArmoury()
    {
        if(Player.celestiaGold == 0)
        {
            gui.mainTextArea.setText("A long-bearded man looks at you with sweat dripping from his forehead." +
                    "\n His muscles could probably kill you in 1 flick of his finger. It sends shivers down your spine " +
                    "\n man: What do you need weakling?");
            gui.selection1.setText("Look at whats for sale...");
            gui.selection2.setText("fight the shop keeper");
            gui.selection3.setText("Ask the shopkeeper about his awesome beard and huge muscles");
            gui.selection4.setText("Leave to the Towngate");
        }
        else
        {
            game.nextPosition1 = "ArmoryShop";  //get ready to implement the string items which do different things in their own descriptions.
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "townGate"; //back to townGate
        }
    }
    public void HealingTent()
    {
        if(Player.celestiaGold == 0)
        {
            gui.mainTextArea.setText("You enter the healing tent but realize you have no money. You can stand here, or go back to the town square");
            gui.selection1.setText("townGate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");
        }
        else
        {
            gui.selection1.setText("back to the Towngate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "The Armoury";
            game.nextPosition2 = "Healing Tent";
            game.nextPosition3 = "The Food Store";
            game.nextPosition4 = "The TownGate";
        }

    }

    public void TheDecayingCave(){

        gui.mainTextArea.setText("Write something about a smelly cave!");
        gui.selection1.setText("Enter the Corrupted dungeons");
        gui.selection2.setText("Enter the Mines of Middle Earth");
        gui.selection3.setText("Enter the Forest of Darkness");
        gui.selection4.setText("Head back to the town");

        game.nextPosition1 = "The Corrupted dungeons";
        game.nextPosition2 = "The Mines of Middle Earth";
        game.nextPosition3 = "The Forest Darkness";
        game.nextPosition4 = "Head back to the town";
    }

    public void TheCorruptedDungeons()
         // 3 to X Levels before Boss.
        //boss should deal significantly more dmg compared to the other monsters. maybe X2 or X3?
        //Dungeon Story.
        {
        gui.mainTextArea.setText("As you approach the !");
        gui.selection1.setText("fight guard");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "The Corrupted dungeons";
        game.nextPosition2 = "Head back to the town";
        }

    public void TheMinesOfMiddleEarth()
        {
        gui.mainTextArea.setText("The mines is home to a monster, nobody has seen the beast and lived to tell the tale!");
        gui.selection1.setText("Enter the mines");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("");

        game.nextPosition1 = "The Corrupted dungeons";
        game.nextPosition2 = "Head back to the town";
        }

    public void TheForestOfDarkness()
        {
        gui.mainTextArea.setText("Its rumoured that a witch looms in the darkness, waiting on unsuspecting prey to wander in.");
        gui.selection1.setText("");
        gui.selection2.setText("");
        gui.selection3.setText("");
        gui.selection4.setText("");

        game.nextPosition1 = "The Corrupted dungeons";
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
            gui.selection1.setText("back to the Towngate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

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


}*/
