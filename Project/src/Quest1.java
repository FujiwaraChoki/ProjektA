public class Quest1 {

    private static int gems;

    /*
    * Pokémon Quest
    * Measures Time between Start and End of while loop (Dunk)
    * */
    public static int quest() throws InterruptedException {
        Game game = new Game();
        int amountOfEnters = 0;
        System.out.println("This Quest is about catching a Pokémon.");
        System.out.println("Press [Enter] as many times as you can, in a matter of 5 Seconds"+
                ", to catch the Pokémon.");

        double s = 5000;

        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() < start+s){
            System.out.print("[Enter]");
            if(Code.scanner.hasNextLine()) {
                amountOfEnters++;
                Code.scanner.nextLine();
            }
        }

        if(amountOfEnters > 10) {
            System.out.println("You've successfully pressed [Enter] " +
                    amountOfEnters + " times, in under 5 Seconds.");
            gems = amountOfEnters / 2;
            System.out.println("You received "+gems+" Gems from this Quest.");
            gems += game.getGemCount();
            return gems;
        } else {
            return 0;
        }
    }

    public int getGems() {
        return gems;
    }
}
