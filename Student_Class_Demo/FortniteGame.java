public class FortniteGame
{
    // ----- Attributes -----
    private Player leadPlayer;
    private int stormPhase;
    private int playersAlive;
    private int maxPlayers;
    private boolean isEvent;

    private static int totalGames = 0;

    // ----- Constructors -----
    public FortniteGame()
    {
        leadPlayer = new Player();
        stormPhase = 0;
        playersAlive = 0;
        maxPlayers = 100;
        isEvent = false;
        totalGames++;
    }

    public FortniteGame(Player p, int phase, int alive, int max, boolean event)
    {
        leadPlayer = p;
        stormPhase = phase;
        playersAlive = alive;
        maxPlayers = max;
        isEvent = event;
        totalGames++;
    }

    // ----- Accessors -----
    public int getStormPhase() { return stormPhase; }
    public int getPlayersAlive() { return playersAlive; }
    public int getMaxPlayers() { return maxPlayers; }
    public boolean getIsEvent() { return isEvent; }
    public Player getLeadPlayer() { return leadPlayer; }
    public static int getTotalGames() { return totalGames; }

    // ----- Mutators -----
    public void setStormPhase(int phase)
    {
        stormPhase = phase;
    }

    public void setIsEvent(boolean e)
    {
        isEvent = e;
    }

    // ----- Non-trivial method using Player object -----
    public void damageLeadPlayer(int dmg)
    {
        int beforeHealth = leadPlayer.getHealth();

        leadPlayer.takeDamage(dmg);

        // If health just hit zero → an elimination
        if (beforeHealth > 0 && leadPlayer.getHealth() == 0)
        {
            playersAlive--;
        }
    }

    // Storm damage gets stronger each phase (Phase 1 = 5 dmg, Phase 2 = 10 dmg, etc.)
    public void stormTick()
    {
        int damage = stormPhase * 5;
        damageLeadPlayer(damage);
    }

    // Method that updates static variable
    public void resetGame()
    {
        totalGames++;
        stormPhase = 0;
        playersAlive = maxPlayers;
        leadPlayer = new Player();
    }

    // Extra behavior
    public void advanceStorm()
    {
        if (stormPhase < 5)
            stormPhase++;
    }

    // ----- toString -----
    public String toString()
    {
        return "Storm Phase: " + stormPhase +
               ", Players Alive: " + playersAlive +
               ", Max Players: " + maxPlayers +
               ", Event Mode: " + isEvent +
               ", Lead Player: " + leadPlayer;
    }
}
