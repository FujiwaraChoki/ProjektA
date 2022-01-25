import java.util.ArrayList;

public class Game {

    private static int gemCount = 0;

    public static void theGame() throws InterruptedException {
        System.out.println("You start off with "+gemCount+" Gems.");
        inGameOptions();
    }

    public static void inGameOptions() throws InterruptedException {
        String k;
        do {
            System.out.println("-> Press 1 to: Open Item Shop (You have to buy at least 1 Item)");
            System.out.println("-> Press 2 to: Game Guide");
            System.out.println("-> Press 3 to: Complete Quests");
            System.out.println("-> Press 4 to: See how many Gems you have");
            switch(Integer.parseInt(Code.scanner.nextLine())){
                case 3 -> whichQuest();
                case 1 -> itemShop();
                case 2 -> Guide.printGuide();
                case 4 -> System.out.println(gemCount);
            }
            System.out.println("Do you want to take Action again? (Yes/No)");
            k = Code.scanner.nextLine();
        }while(k.equals("Yes"));
    }


    public static void whichQuest() throws InterruptedException {
        System.out.println("Here are following Quests:");
        System.out.println("1 -> Pokémon Quest");
        System.out.println("2 -> Guess the Number correctly");
        int option = Integer.parseInt(Code.scanner.nextLine());
        if(option == 1) {
            Quest1.quest();
            gemCount += Quest1.quest();
        } else if(option == 2) {
            System.out.println("second quest");
        }
    }


    /*
    * Shows Item Shop
    * @param String option
    * Asks which Item is to be bought
    * do-while loop for the option of buying an item (must buy at least one item)
    * */
    public static void itemShop() {
        ArrayList<String> items = new ArrayList<>();
        items.add("Shield");
        items.add("Sword");
        items.add("Hat");
        items.add("Horse");
        items.add("Shirt");

        String option;
        do {
            System.out.println();
            System.out.println("Here are the current Items: ");
            System.out.println();
            for(int i=0; i<items.size(); i++) {
                System.out.println(i+"-> "+items.get(i));
            }
            System.out.println("Which Item is to be bought? (Give Index, Starts from 0)");
            int itemIndex = Integer.parseInt(Code.scanner.nextLine());
            System.out.println("Purchased the following: "+items.get(itemIndex));
            items.remove(itemIndex);
            System.out.println("Buy another Item? (Yes, No)");
            option = Code.scanner.nextLine();
        } while (option.equals("Yes"));
        System.out.println("You now have "+gemCount+" Gems.");
    }

    public int getGemCount() {
        return gemCount;
    }
}
