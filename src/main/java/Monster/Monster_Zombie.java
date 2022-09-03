package Monster;

public class Monster_Zombie extends SuperMonster
{
    public Monster_Zombie()
    {
        name = "Zombie";
        damage = new java.util.Random().nextInt(2);
    }
}
