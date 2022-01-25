public class Quest2 {

    private static int gems = 0;

    public static int quest() {
        System.out.println("This is the Guess the Number correct, the Name is self explanatory.");
        System.out.println("The reward for this Quest is 20 Gems");
        System.out.println("Your Guess: ");
        int guess = readInt();
        if(isCorrect(guess)) {
            System.out.println("Correct!");
            gems += 20;
            System.out.println("20 Gems were added your Account, Good Job!");
        } else {
            System.out.println("Sadly, that's wrong!");
            System.out.println("0 Gems were added your Account, Good Luck next Time!");
        }
        return gems;
    }

    public static int randomInt() {
        return (int) (Math.random() * 10 + 1);
    }

    public static int readInt() {
        return Integer.parseInt(Code.scanner.nextLine());
    }
    public static boolean isCorrect(int num) {
        return num == randomInt();
    }
}
