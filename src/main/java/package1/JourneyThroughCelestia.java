package package1;


import WeaponPackage.Weapon_BareHands;

//Jesse Hiebner Story Code here.
//Progression as follows:
/*
* 20/05/2022 -> Brainstorming what to write for story and getting updated on what entities I should help or do
* 21/05/2022 -> Coding Player class, Superweapon class(including weapon bare hands, weapon bow and arrow, weapon knife),JourneyThroughCelestia class for Brandon and Jesse's game.
*               Adding a gold system later to buy items from a market.store or potions for health.
*               Changing default weapon to fists/bare hands as to obtain a weapon or choose a weapon
* 22/05/2022 -> Adding random number generation for damage output from monsters or from the amount of gold dropped. (maybe even item rarity???)
* 03/08/2022 -> Adding Monster class and super monster class.
*  --/00/00 -->
*
* */

public class JourneyThroughCelestia
{

    Game game;
    UI gui;
    VisibilityManager vm;

    public JourneyThroughCelestia(Game g, UI userInterface, VisibilityManager vManager)
        {
            game = g;
            gui = userInterface;
            vm = vManager;
        }

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

            TownSquare();
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

    //METHODS OF THE PLACES
    public void selectPosition(String nextPosition)
        {
            switch(nextPosition)
            {
                case "The TownGate":TownGate(); break;
                case "Town Square":TownSquare(); break;
                case "The Armoury":TheArmoury(); break;
                case "Healing Tent":HealingTent(); break;
                case "The Food Store":TheFoodStore(); break;
                case "The Corrupted Dungeons":TheCorruptedDungeons(); break;
                case "Speak To The Guard": SpeakToTheGuard(); break;
                case "Rest": Rest(); break;
                case "Attack Guard": AttackGuard(); break;
                case "Shop":Shop(); break;
            }
        }

    //AREAS OR PLACES
    public void TownGate()
    {
        gui.mainTextArea.setText("You get to the town gate. Guard:There is a  guard looking at you. /n Guard: Can I help you there?");
        gui.selection1.setText("Speak to the guard");
        gui.selection2.setText("Search the area");
        gui.selection3.setText("Go to the Corrupted Dungeons");
        gui.selection4.setText("Rest till Tomorrow");

        game.nextPosition1 = "Speak To The Guard";
        game.nextPosition2 = "Search Area";
        game.nextPosition3 = "The Corrupted Dungeons";
        game.nextPosition4 = "Rest";
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
            game.nextPosition1 = "ArmouryShop";  //get ready to implement the string items which do different things in their own descriptions.
            game.nextPosition2 = "Town Square";
            game.nextPosition3 = "Your kind words make the man grin. For your kindness He gives you a Sword";
            game.nextPosition4 = "townGate"; //back to townGate
        }
    }

    public void TheFoodStore()
    {
        if(Player.celestiaGold == 0)
        {
            gui.mainTextArea.setText("Woman: Hi there traveller. I see you have no moneys with you. Come back when you are able to buy something.");
            gui.selection1.setText("townGate");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "The TownGate";
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

    public void HealingTent()
    {
        if(Player.celestiaGold == 0)
        {
            gui.mainTextArea.setText("");
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
            game.nextPosition4 = "The Corrupted dungeons";
        }

    }

    public void Shop()
    {
            gui.mainTextArea.setText("The shop is filled with different items. What do you take??");
            gui.selection1.setText("Browse the Shop");
            gui.selection2.setText("");
            gui.selection3.setText("");
            gui.selection4.setText("");

            game.nextPosition1 = "The Armoury";
            game.nextPosition2 = "Browse";
            game.nextPosition3 = "The Food Store";
            game.nextPosition4 = "The Corrupted dungeons";
    }

    public void TheCorruptedDungeons()
    {
        gui.mainTextArea.setText("You reach the entrance of a decaying, smelly cave. /nThe eerie noises make you want to leave, but you are brave and stay. /n What do you want to do?");
        gui.selection1.setText("fight guard");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
        // 3 to X Levels before Boss.
        //boss should deal significantly more dmg compared to the other monsters. maybe X2 or X3?
    } //Dungeon Story.

    public void TownSquare()
    {
        gui.mainTextArea.setText("You are in the centre of the town.There is a buzz and many people around selling and trading their goods and services. \n You can go to... ");
        gui.selection1.setText("The Armoury");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
    }

    //PEOPLES
    public void SpeakToTheGuard()
    {
        gui.mainTextArea.setText("You approach the Guard. /n Guard: what can I help you with?");
        gui.selection1.setText("Attack the guard");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "Attack Guard";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
    }

    //ACTION
    public void TownGateActions()
    {
        gui.mainTextArea.setText("You get to the town gate. Guard: Oi!, stop right there!");
        gui.selection1.setText("fight guard");
        gui.selection2.setText("Healing Tent");
        gui.selection3.setText("Food Store");
        gui.selection4.setText("The Corrupted dungeons");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
    }

    public void AttackGuard()
    {
        gui.mainTextArea.setText("Guard: Hey! Don't be crazy! /n You are hit by the guard and scuttle away. ");
        gui.selection1.setText("Your silly mistake lead to you waking up feeling sore on the head, " +
                                "/n and a bruised finger mark on your forehead. You need to rest");
        Player.hp = 3;
        gui.hpNumberLabel.setText("" + Player.hp);

        game.nextPosition1 = "The TownGate";
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
        game.nextPosition2 = "Search";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}
