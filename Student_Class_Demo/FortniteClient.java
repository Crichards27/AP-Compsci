public class FortniteClient
{
    public static void main(String[] args)
    {
        // Create Player objects
        Player p1 = new Player("SweatyGuy", 100, 50);
        Player p2 = new Player("ChillPlayer", 100, 25);

        // Create FortniteGame objects
        FortniteGame game1 = new FortniteGame(p1, 1, 100, 100, false);
        FortniteGame game2 = new FortniteGame(p2, 0, 50, 100, true);

        // Call multiple methods on game1
        game1.advanceStorm();
        game1.damageLeadPlayer(30);

        // Call multiple methods on game2
        game2.setIsEvent(false);
        game2.stormTick(); // applies storm damage

        // Print results
        System.out.println(game1);
        System.out.println(game2);

        // Demonstrate static variable
        System.out.println("Total games created: " + FortniteGame.getTotalGames());
    }
}
