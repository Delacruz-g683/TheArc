package Monster;

public class Monster_Bogeyman extends SuperMonster
{
    public Monster_Bogeyman()
    {
        name = "Bogeyman";
        damage = new java.util.Random().nextInt(3);
    }
}
