package Monster;

public class Monster_Dragon extends SuperMonster
{
    public Monster_Dragon()
    {
        name = "Dragon";
        damage = new java.util.Random().nextInt(9);
    }
}


