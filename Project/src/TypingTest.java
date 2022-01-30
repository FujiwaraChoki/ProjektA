public class TypingTest {

    public static int typingTest() {
        int gems = 0;
        String text = "This is a random text";
        System.out.println("This application will test your writing speed.");
        System.out.println("Copy the following text:");
        System.out.println();
        System.out.println(text);
        long start = System.nanoTime();
        String input = readLine();
        long end = System.nanoTime();
        long elapsedTime = end - start ;
        if(input.equals(text)) {
            long time = elapsedTime / 1000000000;
            gems += time / 10;
            System.out.println("You needed "+time+" Seconds to complete the Text.");
        } else {
            System.out.println("Sadly, you typed wrong.");
        }
        System.out.println("Gems received: "+gems);
        return gems;
    }

    public static String readLine() {
        return Code.scanner.nextLine();
    }
}
