public class Quest1 {

    public static int quest() {
        int counter = 0;
        int amountOfEnters = 0;
        long start = System.nanoTime();
        System.out.println("This Quest is about catching a Pokémon.");
        System.out.println("Press [Enter] as many times as you can, in a matter of 2.5 Seconds");

        while (counter < 20) {
            counter++;
            Code.scanner.nextLine();
            amountOfEnters++;
        }

        long end = System.nanoTime();
        long elapsedTime = end - start;
        final double s = 2.5;

        if(elapsedTime < s) {
            if(amountOfEnters > 7) {
                System.out.println("You've successfully pressed [Enter] " + amountOfEnters + " in under 2.5 Seconds.");
                return amountOfEnters / 2;
            } else {
                System.out.println("You weren't fast enough 1");
                return 0;
            }
        } else {
            return amountOfEnters / 2;
        }
    }
}
