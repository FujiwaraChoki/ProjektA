import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    private static int gemCount = 0;

    public static void theGame() throws InterruptedException {
        System.out.println("You start off with "+gemCount+" Gems.");
        inGameOptions();
    }

    public static void inGameOptions() throws InterruptedException {
        String action;
        do {
            System.out.println("Game Menu");
            System.out.println();
            System.out.println("-> Press 1 to: Open Item Shop (You have to buy at least 1 Item)");
            System.out.println("-> Press 2 to: Complete Quests");
            System.out.println("-> Press 3 to: See how many Gems you have");
            System.out.println("-> Press 4 to: Check how fast you type");
            System.out.println("-> Press 5 to: Open Calculator");
            System.out.println("-> Press 6 to: Game Guide");
            switch(Integer.parseInt(Code.scanner.nextLine())){
                case 1 -> itemShop();
                case 2-> whichQuest();
                case 3 -> System.out.println(gemCount);
                case 4 -> addTheTwo();
                case 5 -> Calculator.calc();
                case 6 -> Guide.printGuide();
            }
            System.out.println("Do you want to take Action again? (Yes/No)");
            action = Code.scanner.nextLine().toUpperCase();
        }while(action.equals("YES"));
        
    }


    public static void whichQuest() throws InterruptedException {
        System.out.println("Here are following Quests:");
        System.out.println("1 -> Pokémon Quest");
        System.out.println("2 -> Guess the Number correctly");
        System.out.println("3 -> Exit");
        int option = Integer.parseInt(Code.scanner.nextLine());
        if(option == 1) {
            gemCount += Quest1.quest();
        } else if(option == 2) {
            gemCount += Quest2.quest();
        } else if(option == 3) {
            System.exit(0);
        }
    }

    public static void addTheTwo() {
        gemCount += (TypingTest.typingTest());
    }

    /*
    * Shows Item Shop
    * @param String option
    * Asks which Item is to be bought
    * do-while loop for the option of buying an item (must buy at least one item)
    * */
    public static void itemShop() {
        ArrayList<String> items = new ArrayList<>();
        HashMap<String, Integer> prices = new HashMap<>();
        items.add("Shield");
        items.add("Sword");
        items.add("Hat");
        items.add("Horse");
        items.add("Shirt");
        // Prices for items
        prices.put(items.get(0), 25);
        prices.put(items.get(1), 50);
        prices.put(items.get(2), 5);
        prices.put(items.get(3), 200);
        prices.put(items.get(4), 40);

        String option;
        do {
            System.out.println();
            System.out.println("Here are the current Items: ");
            System.out.println();
            for(int i=0; i<items.size(); i++) {
                System.out.println("Index: "+i+"-> "+items.get(i));
            }
            System.out.println("Which Item is to be bought? (Give Index and Product Name, Starts from 0)");
            System.out.print("Index: ");
            int itemIndex = Integer.parseInt(Code.scanner.nextLine());
            System.out.print("Name: ");
            String itemName = Code.scanner.nextLine();
            // If User has enough Gems to pay, he will buy the item/s
            if(gemCount > prices.get(itemName)) {
                gemCount -= prices.get(itemName);
                System.out.println("Purchased the following: "+items.get(itemIndex));
                // Removes purchased Item from ArrayList
                items.remove(itemIndex);
            } else {
                System.out.println("You do not have enough Gems to buy this Item yet.");
                break;
            }
            System.out.println("Buy another Item? (Yes, No)");
            option = Code.scanner.nextLine();
        } while (option.equals("Yes"));
        System.out.println("You now have "+gemCount+" Gems.");
    }

    public int getGemCount() {
        return gemCount;
    }
}