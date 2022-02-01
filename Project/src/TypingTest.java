import java.util.*;
import java.lang.*;

public class TypingTest {

    public static int typingTest() {
        int gems = 0;
        String text = ranmdomSentence();
        System.out.println("This application will test your writing speed.");
        System.out.println("Copy the following text:");
        System.out.println();
        System.out.println(text);
        // Measures Time between before input and after input to determine how fast the User was
        // Gives back Gems (Time / 2)
        long start = System.nanoTime();
        String input = readLine();
        long end = System.nanoTime();
        long elapsedTime = end - start ;
        if(input.equals(text)) {
            long seconds = elapsedTime / 1000000000;
            gems += seconds / 2;
            System.out.println("You needed "+seconds+" Seconds to complete the Text.");
        } else {
            System.out.println("Sadly, you typed wrong.");
        }
        System.out.println("Gems received: "+gems);
        return gems;
    }

    public static String readLine() {
        return Code.scanner.nextLine();
    }

    public static String ranmdomSentence() {
        Random randomNumber = new Random();
        // Variables hold words to be chosen by program
        String article1 = "A";
        String article2 = "The";
        String article3 = "a";
        String article4 = "the";
        String noun1 = "man";
        String noun2 = "doctor";
        String noun3 = "nurse";
        String noun4 = "firefighter";
        String noun5 = "cat";
        String noun6 = "mouse";
        String noun7 = "goat";
        String nounA = "rock";
        String nounB = "rules";
        String nounC = "wall";
        String nounD = "stick";
        String nounE = "ditch";
        String nounF = "bicycle";
        String verb1 = "tested";
        String verb2 = "recited";
        String verb3 = "disregarded";
        String verb4 = "leaped";
        String verb5 = "cracked";
        String verb6 = "followed";
        String verb7 = "broke";
        //sets up variable for final sentence
        String finalSentence = " ";
        //displays title of program
        System.out.println("\n Random sentence generator \n\n");
        // sets up loop to generate number of sentences desired
        for (int i = 1; i <= 10; i++) {
            switch (1 + randomNumber.nextInt(2)) {//generates numbers 1-2 {
                case 1:
                    finalSentence = article1 + " ";
                    break;
                case 2:
                    finalSentence = article2 + " ";
            }
            switch (1 + randomNumber.nextInt(7)) {//generates numbers 1-7 {
                case 1:
                    finalSentence += noun1 + " ";
                    break;
                case 2:
                    finalSentence += noun2 + " ";
                    break;
                case 3:
                    finalSentence += noun3 + " ";
                    break;
                case 4:
                    finalSentence += noun4 + " ";
                    break;
                case 5:
                    finalSentence += noun5 + " ";
                    break;
                case 6:
                    finalSentence += noun6 + " ";
                    break;
                case 7:
                    finalSentence += noun7 + " ";
            }
            switch (1 + randomNumber.nextInt(7)) {//generates numbers 1-7 {
                case 1:
                    finalSentence += verb1 + " ";
                    break;
                case 2:
                    finalSentence += verb2 + " ";
                    break;
                case 3:
                    finalSentence += verb3 + " ";
                    break;
                case 4:
                    finalSentence += verb4 + " ";
                    break;
                case 5:
                    finalSentence += verb5 + " ";
                    break;
                case 6:
                    finalSentence += verb6 + " ";
                    break;
                case 7:
                    finalSentence += verb7 + " ";
            }
            switch (1 + randomNumber.nextInt(2)) {//generates numbers 1-3 {
                case 1:
                    finalSentence += article3 + " ";
                    break;
                case 2:
                    finalSentence += article4 + " ";
            }
            switch (1 + randomNumber.nextInt(6)) {//generates numbers 1-6 {
                case 1:
                    finalSentence += nounA + ".";
                    break;
                case 2:
                    finalSentence += nounB + ".";
                    break;
                case 3:
                    finalSentence += nounC + ".";
                    break;
                case 4:
                    finalSentence += nounD + ".";
                    break;
                case 5:
                    finalSentence += nounE + ".";
                    break;
                case 6:
                    finalSentence += nounF + ".";
            }
            return finalSentence; // Returns the random made Sentence
        }//end for
        return "";
    }
}
