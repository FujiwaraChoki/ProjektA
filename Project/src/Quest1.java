public class Quest1 {

    private static int gems;

    /*
    * Pokémon Quest
    * Measures Time between Start and End of while loop (Dunk)
    * */
    public static int quest() throws InterruptedException {
        int counter = 0;
        int amountOfEnters = 0;
        long start = System.nanoTime();
        System.out.println("This Quest is about catching a Pokémon.");
        System.out.println("Press [Enter] as many times as you can, in a matter of 5 Seconds"+
                ", to catch the Pokémon.");

        Dunk:
        while (counter <= 2) {
            counter++;
            if(Code.scanner.hasNextLine()) {
                amountOfEnters++;
            }
        }

        long end = System.nanoTime();
        long elapsedTime = end - start;
        double s = 500000000D;
        Game game = new Game();

        if(amountOfEnters > 1 && elapsedTime < s ) {
            System.out.println("You've successfully pressed [Enter] " +
                    amountOfEnters + " in under 5 Seconds.");
            gems = amountOfEnters / 2;
            System.out.println("You received "+gems+" Gems from this Quest.");
            gems += game.getGemCount();
            return gems;
        } else if (elapsedTime > s){
            System.out.println("You weren't fast enough.");
            return 0;
        } else {
            return 0;
        }
    }

    public int getGems() {
        return gems;
    }
}
