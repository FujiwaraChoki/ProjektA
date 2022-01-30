public class Quest1 {

    /*
    * Pokémon Quest
    * User presses Enter as many times as possible in certain amount of time to receive Gems/catch the pokémon
    * */
    public static int quest() {
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

        // If amount of Enters pressed greater than 10 User will receive gems, if not user receives 0 gems.
        if(amountOfEnters > 10) {
            System.out.println("You caught the Pokémon!");
            int gems = amountOfEnters / 2;
            System.out.println("You received "+ gems +" Gems from this Quest.");
            gems += game.getGemCount();
            return gems;
        } else {
            return 0;
        }
    }
}
