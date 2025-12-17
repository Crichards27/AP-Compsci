public class Player
{
    private String name;
    private int health;
    private int shield;
    private int eliminations;

    // ----- Constructors -----
    public Player()
    {
        name = "DefaultPlayer";
        health = 100;
        shield = 50;
        eliminations = 0;
    }

    public Player(String n, int h, int s)
    {
        name = n;
        health = h;
        shield = s;
        eliminations = 0;
    }

    // ----- Accessors -----
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getShield() { return shield; }
    public int getEliminations() { return eliminations; }

    // ----- Mutators and Behaviors -----
    public void takeDamage(int dmg)
    {
        // Damage applies to shield first
        if (shield > 0)
        {
            if (dmg <= shield)
            {
                shield -= dmg;
                dmg = 0;
            }
            else
            {
                dmg -= shield;
                shield = 0;
            }
        }

        // Remaining damage hits health
        if (dmg > 0)
        {
            health -= dmg;
            if (health < 0)
                health = 0;
        }
    }

    public void addElimination()
    {
        eliminations++;
    }

    public void heal(int amount)
    {
        health += amount;
        if (health > 100)
            health = 100;
    }

    public void addShield(int amount)
    {
        shield += amount;
        if (shield > 100)
            shield = 100;
    }

    // ----- toString -----
    public String toString()
    {
        return name + " (HP: " + health +
               ", Shield: " + shield +
               ", Elims: " + eliminations + ")";
    }
}
