package Monster;

public class Monster_Banshee extends SuperMonster
{
    public Monster_Banshee()
    {
        name = "Banshee";
        damage = new java.util.Random().nextInt(4);
    }
}
