/*
package Game;

public class theScarletHeroin {

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
        gui.mainTextArea.setText("The Into Story Line" +
                "\n " +
                "\n " +
                "\n ");

        gui.selection1.setText("Go to St Mary's Town");
        gui.selection2.setText(" ");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "St Marys Town";
        game.nextPosition2 = " ";
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";

    }



    public void StMarysTown()
    {
        gui.mainTextArea.setText("This is the town your 1st brother was last seen. He had come to ths small town to find weapons in order to defeat the evil Lord V." +
                "\n There are 3 weapon stores in the town. The 1st store is not operational. But outside the store is a vender selling some food. You ask the vender about the closed store: " +
                "\n You/Scarlet: Pardon me, may I ask if this store is still open?" +
                "\n Vender: No dear. This store closed down days ago." +
                "\n You/Scarlet: Oh, okay. (sounding a little disappointed) Do you perhaps know where I can find another weapons store?" +
                "\n Vender: Indeed I do. There are 2 weapons stores in the town. One is down the road, the other is in an area not suited for a young lady." +
                "\n The vender gives you the directions to the 2nd weapons store in town, but was too hesitant to give you the 3rd one." +
                "\n You/Scarlet: Thank you for the assistance. I will be on my way now." +
                "\n It is up to you to decide what to do next");

        gui.selection1.setText("Go back to the village/home");
        gui.selection2.setText("Go to the 2nd store");
        gui.selection3.setText("Ask the vender for the 3rd stores location");
        gui.selection4.setText(" ");

        game.nextPosition1 = "VillageHome";  //goes home
        game.nextPosition2 = "StMarysTown store2";
        game.nextPosition3 = "stMarysTown";
        game.nextPosition4 = " ";
    }

    public void StMarysTownStore2()
    {
        gui.mainTextArea.setText("After following the venders directions, you find the 2nd store.Upon entering, you are greeted with a burnt metallic scent. Weapons covering almost every inch of the store wall." +
                "\n After browsing through the store, you head towards the pay counter. Where a tall, ashy looking man stands" +
                "\n Man: This is no place for a lady! (with a look of distaste on his face)" +
                "\n Man: What do you want here girl?! " +
                "\n You/Scarlet: I'm looking for a weapon." +
                "\n Man: A weapon Huh? What kind of weapon would a pretty little thing like you be looking for? (As he looks you up and down as if to assess your frame)" +
                "\n You/Scarlet: I need a strong weapon. One that can kill, destroy and defeat anything. A weapon fit for a warrior! (Passion and conviction in your voice)" +
                "\n Man: I may have the weapon you seek, but Such a weapon will cost you quite a bit. You might not have the gold for to purchase it " +
                "\n You/Scarlet: Don't worry, I have enough gold. I would like to purchase the weapon from you. (Taking out your coin sack, filled with gold coins.)" +
                "\n The man notices you taking out your gold and he retrieves the the weapon for you" +
                "\n Man: This is the SWORD OF VALOUR. A weapon forged to concur! A weapon made for a True Warrior! (Pride filled his voice)" +
                "\n Man: In order to safely wield this sword, you will need the attire made for endurance. The Armor of something..." +
                "\n You/Scarlet: I will purchase the amor as well." +
                "\n Man: The armor I do not have, I know where you may find it. But! Beware of this store, it is not a place of safety. " +
                "\n The man hands you the Sword of Valour and directs you to the 3rd store.");

        gui.selection1.setText("Head to the 3rd Store");
        gui.selection2.setText("Go back to the village/home");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "StMarysTown store3";
        game.nextPosition2 = "VillageHome"; //goes home
        game.nextPosition3 = " ";
        game.nextPosition4 = " ";
    }

    public void StMarysTownStore3(){

        gui.mainTextArea.setText("You follow the directions to the 3rd store" +
                "\n You notice how the store is in a very secluded area. With scary and murderous looking men in every corner." +
                "\n You finally find the store and  enter it." +
                "\n You are immediately greeted with the smell of old dried animal skin. The smell of pure leather" +
                "\n You don't bother browsing around the store. You go straight to the pay counter. Where a dark scrawny man stands" +
                "\n You/Scarlet: Hello there. I would like to purchase some of your amor" +
                "\n Man: Amor? What amor does a woman like you need? I do not have amor for women" +
                "\n You/Scarlet: I am not looking for amor for women.I am looking amor fit for a warrior!" +
                "\n Man: What amor might that be? (With a sarcastic tone to his voice)" +
                "\n You/Scarlet: The Amor of something...!" +
                "\n Man: What does a small woman like you want with the fortified Amor of something...? (as a full belly laugh leaves his cracked lips) " +
                "\n So you tell him how your family was kidnapped and your intentions to save them." +
                "\n After hearing your story the man seemed more attentive and alert to what you had to say." +
                "\n He goes to a small room at the back of the store. While he is there, you hear him talking, whispering, to someone in a very suspicious manner"+
                "\n The man finally returns to the counter with the Amor of Something..."+
                "\n Man: How do you intend on paying for the amor? This amor does not come cheap."+
                "\n You/Scarlet: I am certain I shall have enough gold for it. Worry not."+
                "\n You proceed to pay for the amor, but as you are about to leave the store you notice how the man was now looking at you suspiciously."+
                "\n Little did you know that the man was a spy for Lord V"+
                "\n " +
                "\n After the long doy you had, you realise that you are very tired and would do with some rest before continuing on with your journey." +
                "\n You...");

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

        gui.mainTextArea.setText("You pay for a room at the Inn so that you may sleep and get some rest." +
                "\n While sleeping, you get startled awake by noise coming from the door of your room" +
                "\n You realise that someone is trying to break into your room! So you quickly and quietly ready yourself to fight! " +
                "\n The door finally gives way and the man sneaks into your room and closes the door." +
                "\n BOMB!" +
                "\n You hit the man on the back of his head. Rendering him unconscious." +
                "\n It is the scrawny man from the 3rd store" +
                "\n While he is unconscious, you tie his hands and feet together so that he can not escape while you question him." +
                "\n A few minutes later he comes to." +
                "\n You interrogate him,using your sword as a means of persuasion" +
                "\n The man eventually tells you the information you need." +
                "\n He gives you the location of your 1st brother");

        gui.selection1.setText("Go back to the village/home");
        gui.selection2.setText("Go to the 2nd store");
        gui.selection3.setText(" ");
        gui.selection4.setText(" ");

        game.nextPosition1 = "villageHome";  //goes home
        game.nextPosition2 = "StMarysTown store2";
        game.nextPosition3 = "stMarysTown";
        game.nextPosition4 = " ";
    }

    public void ForbiddenForest()
    {
        gui.mainTextArea.setText("You enter the shop but have no money..");
        gui.selection1.setText("Action Button");
        gui.selection2.setText("Action Button ");
        gui.selection3.setText("Action Button");
        gui.selection4.setText("Action Button");

        game.nextPosition1 = "The Armoury";
        game.nextPosition2 = "Healing Tent";
        game.nextPosition3 = "The Food Store";
        game.nextPosition4 = "The Corrupted dungeons";
    }

    public void MysticalMountains(){}
    public void DeadMansSwamp(){}
    public void IceTower(){}
    public void SaharaDesert(){}
    public void ForgottenVolcano(){}
    public void LordVCastle(){}

}
*/
