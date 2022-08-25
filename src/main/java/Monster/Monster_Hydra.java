package Monster;

public class Monster_Hydra extends SuperMonster
{
    public Monster_Hydra()
    {
        name = "Hydra";
        damage = new java.util.Random().nextInt(8);
    }
}
