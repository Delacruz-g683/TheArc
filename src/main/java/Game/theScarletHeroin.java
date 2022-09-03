package Game;

import Weapon.Weapon_BareHands;

public class theScarletHeroin {
    theScarletHeroinGui gui;
    TheScarletHeroinGame game;

    public theScarletHeroin( TheScarletHeroinGame g, theScarletHeroinGui UI)
    {
        game = g;
        gui =UI;
    }

    public void defaultSetup()
    {
        Player.hp = 10;
        gui.hpNumberLabel.setText("" + Player.hp);
        Player.celestiaGold = 0;
        Player.currentWeapon = new Weapon_BareHands();
        gui.weaponNameLabel.setText(Player.currentWeapon.name);
    }

    public void selectPosition(String nextPosition)
    {
        //CHANGE POSITION
        switch(nextPosition){
            case "The Village":VillageHome(); break;

            case "St Marys Town":StMarysTown(); break;
            case "The 2nd Store":StMarysTownStore2(); break;
            case "The 3rd Store":StMarysTownStore3(); break;
            case "The Inn":StMarysTownInn(); break;

            case "The Forbidden Forest":ForbiddenForest(); break;
            case "Mystical Mountains of Galacia":MysticalMountains(); break;
            case "Dead Man's Swamp":DeadMansSwamp(); break;
            case "King Bear Boris's Ice Tower":IceTower(); break;
            case "The Desert of Sahara":SaharaDesert(); break;
            case "Volcanous The Forgotten Volcano":ForgottenVolcano(); break;
            case "Lord V's Castle":LordVCastle(); break;

        }
    }

    public void VillageHome()
    {
        gui.mainTextArea.setText("Your village has been ransacked by villains. " +
                "\n And your family has been kidnapped by the malicious Lord V!"+
                "\n You are the only one that can save them." +
                "\n You will need to go to St Mary's Town to find your 1st clue.");

        gui.selection1.setText("Go to St Mary's Town");
        gui.selection2.setText(" ");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "St Marys Town";
        game.nextPosition2 = " ";
        game.nextPosition3 = " ";
        game.nextPosition4  = " ";
    }

    public void StMarysTown()
    {
        gui.mainTextArea.setText(" One of the villains where spotted in this town. But first you need weapons!"+
                "\n There are 3 weapon stores in town. Unfortunately, one of them has closed down." +
                "\n The other 2 stores are still open."+
                "\n Where will you go next");

        gui.selection1.setText("Go back to the village/home");
        gui.selection2.setText("Go to the 2nd store");
        gui.selection3.setText("  ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "VillageHome";  //goes home
        game.nextPosition2 = "StMarysTown store2";
        game.nextPosition3 = "stMarysTown";
        game.nextPosition4 = " ";
    }

    public void StMarysTownStore2()
    {
        gui.mainTextArea.setText(" You arrive at the 2nd weapon store. A tall, ashy looking man standing behind the counter asks if he can assist you."+
                "\n You tell him that you are looking for a weapon to use to save your family." +
                "\n He goes to the back room and brings back a weapon forged to concur. THE SWORD OF VALOUR."+
                "\n You purchase the weapon with some gold." +
                "\n The man informs you that inorder to wield the sword safely you will need THE ARMOR OF VALOUR, which he doesn't have."+
                "\n THE ARMOR OF VALOUR was last seen in the 3rd store. What is your next step?");

        gui.selection1.setText("Head to the 3rd Store");
        gui.selection2.setText("Go back to the village");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "StMarysTown store3";
        game.nextPosition2 = "VillageHome";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void StMarysTownStore3(){

        gui.mainTextArea.setText("You arrive at the 3rd weapon store. A dark scrawny man standing behind the counter asks if he can assist you."+
                "\n You tell him that you are looking for THE ARMOR OF VALOUR inorder to save your family." +
                "\n The man suspiciously looks at you, but brings you the armor."+
                "\n As you purchase the weapon with some gold, you get an unsafe feeling about the man." +
                "\n You leave the store. It's been a long day and you are feeling a little tired...");

        gui.selection1.setText("Go to an Inn to Rest");
        gui.selection2.setText("Go back to the village");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "StMarysTown Inn";
        game.nextPosition2 = "VillageHome";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void StMarysTownInn(){

        gui.mainTextArea.setText("You get a room at the towns Inn to rest."+
                "\n BANG!" +
                "\n Someone breaks into your room. It's the scrawny man from the 3rd store!"+
                "\n You quickly get up and hit the man unconscious. You tie him up to a chair and proceed to question him." +
                "\n You find out that this man works for Lord V, and knows where one of your family members is being held." +
                "\n The man tells you: To find your brother, you need to go through the Forbidden Forest");

        gui.selection1.setText("Go to: Forbidden Forest");
        gui.selection2.setText("Go back to the village");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "ForbiddenForest";
        game.nextPosition2 = "VillageHome";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void ForbiddenForest()
    {
        gui.mainTextArea.setText("You enter the Forbidden Forest. This Forest is a dark, cold and dangerous place to be. "+
                "\n To get to Mystical Mountains, which is where your bother is, you need to go through the forest. "+
                "\n CLOMP,CLOMP,CLOMP... You hear something walking in your direction." +
                "\n Its a wild beast!"+
                "\n You fight the beast and take some damage." +
                "\n With the sword, you beat the beast, made a fire,ate meat to recover." +
                "\n You continue your journey to the Mystical Mountains of Galacia");

        gui.selection1.setText("Go to: Mystical Mountains");
        gui.selection2.setText("Go to: The village");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "MysticalMountains";
        game.nextPosition2 = "VillageHome";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void MysticalMountains(){
        gui.mainTextArea.setText("You reach the Mystical Mountains of Galacia. You notice a cave and head to wards it."+
                "\n At the entrance of the cage you notice a bag with something shiny peaking through."+
                "\n You..");

        gui.selection1.setText("Open the bag");
        gui.selection2.setText("Go in the Cave");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "TreasureBag";
        game.nextPosition2 = "MountainCave";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }
    public void TreasureBag(){
        gui.mainTextArea.setText("You open the bag and find a magical silver dagger"+
                "\n The dagger is added to you weapons inventory"+
                "\n You.." );

        gui.selection1.setText("Go in the Cave");
        gui.selection2.setText(" ");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "MountainCave";
        game.nextPosition2 = " ";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void MountainCave(){
        gui.mainTextArea.setText("You enter the cave and see your brother tied up."+
                "\n To get to your brother, you need to fight the bandits that are keeping him hostage."+
                "\n You...");

        gui.selection1.setText("Fight Bandits");
        gui.selection2.setText(" ");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "BanditFight";
        game.nextPosition2 = " ";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void BanditFight(){
        gui.mainTextArea.setText("You fight the bandits, loss some heath and win" +
                "\n You free your 1st brother. And get information on where your next brother is."+
                "\n You will find your 2nd brother in Dead Mans Swamp");

        gui.selection1.setText("Go to: Dead Mans Swamp");
        gui.selection2.setText("Go to: Village");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "DeadMansSwamp";
        game.nextPosition2 = "villageHome";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }


    public void DeadMansSwamp(){
        gui.mainTextArea.setText("You travel along the muddy road of the swamp." +
                "\n It's getting dark and cold. You will have to find shelter soon inorder to be safe."+
                "\n You notice an old cottage with a with a warm fire lit inside." );

        gui.selection1.setText("Enter the Cottage");
        gui.selection2.setText(" ");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "SwampCottage";
        game.nextPosition2 = " ";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }
    public void SwampCottage(){
        gui.mainTextArea.setText("Inside the Cottage is The Swamp Witch and your 2nd brother" +
                "\n Inorder to free your 2nd brother, you need to fight the Witch with a magical object"+
                "\n You.." );

        gui.selection1.setText("Fight The Witch");
        gui.selection2.setText(" ");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "WitchFight";
        game.nextPosition2 = " ";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }
    public void WitchFight(){
        gui.mainTextArea.setText("You fight The Swamp Witch with the magical dagger and win" +
                "\n You free your2nd brother. You notice a map with a location marked. The location of your 3rd brother."+
                "\n King Bear Boris's Ice Tower is where he is held" );

        gui.selection1.setText("Go to: The Ice Tower");
        gui.selection2.setText("Go to: Village");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "IceTower";
        game.nextPosition2 = "villageHome";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }
    public void IceTower(){}
    public void SaharaDesert(){}
    public void ForgottenVolcano(){}
    public void LordVCastle(){}

}
