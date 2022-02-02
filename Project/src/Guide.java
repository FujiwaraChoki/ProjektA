public class Guide {

    // To be made in the near Future...
    public static void printGuide() {
        System.out.println();
        System.out.println("Guide:");
        System.out.println("The defintion of Guide is to lead or direct another one's way.");
        System.out.println();
        System.out.println("What do you need Help with?");
        System.out.println("Quest (Q), Typing Test (TT)");
        switch(readLine()) {
            case "Q" -> questHelp();
            case "TT" ->typingHelp();
        }
        System.out.println("Pokémon Quest = 1 ");
        System.out.println("Number Guessing Quest = 1 ");
    }

    public static String readLine() {
        return Code.scanner.nextLine();
    }

    public static void questHelp() {
        System.out.println("Which Quest?");
        System.out.println("Pokémon Quest = 1");
        System.out.println("Number Guessing Quest = 2");
        switch(readLine()) {
            case "1" -> System.out.println("You have to catch a Pokémon, by spamming [Enter] as fast as possible.");
            case "2" -> numberHelp();

        }
        System.out.println("Pokémon Quest = 1 ");
        System.out.println("Number Guessing Quest = 1 ");
    }

    public static void typingHelp() {
        System.out.println("You have to write down the given Text as fast as possible.");
    }
    public static void numberHelp() {
        System.out.println("You have to guess the correct number between 1 and 10.");
        System.out.println("ATTENTION: YOU WILL LOSE 1 GEM FOR EVERY WRONG ANSWER!");
    }
}