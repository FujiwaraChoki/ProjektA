/*
* MAIN CLASS OF THIS PROGRAM
* WRITTEN BY SAMI HINDI
* INCLUDES 6 CLASSES (FOR THE TIME BEING)
* */


/*
* MAIN CLASS OF THIS PROGRAM
* WRITTEN BY SAMI HINDI
* INCLUDES 7 CLASSES (FOR THE TIME BEING)
* SOFTWARE HAS APPROX. 500 LINES
* */

import java.util.HashMap;
import java.util.Scanner;

/*
* Author: Sami Hindi
* Version: 0.83
* */

public class Code {

    static Scanner scanner;

    static HashMap<String, String> logins = new HashMap<>();

    public Code() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) throws InterruptedException {
        new Code().run();
    }

    private void run() throws InterruptedException {
        addCombo("Sami", "p@ssw0rd123");
        addCombo("Nikita", "p@ssw0rd123");
        addCombo("-", "-");
        System.out.println("TEST ACCOUNT:");
        System.out.println(returnLoginData());
        System.out.println("Hello.");
        System.out.println("Text Based Game");
        System.out.println("Login (1) or create Account (2) > ");
        switch(Integer.parseInt(scanner.nextLine())) {
            case 1 -> checkLogin2();
            case 2 -> createUser();
        }
    }


    // Adds new User to HashMap <Login>
    private void addCombo(String username, String password) {
        logins.put(username, password);
    }

    // Creates User and adds him to HashMap <Login>
    private void createUser() throws InterruptedException {
        System.out.println("R: Username > ");
        String username = scanner.nextLine();
        System.out.println("R: Password > ");
        String password = scanner.nextLine();
        addCombo(username, password);
        checkLogin2();
    }

    // Makes User login to Account
    private boolean loginAction() {
        System.out.println("L: Username > ");
        String username = scanner.nextLine();
        if (logins.containsKey(username)) {
            System.out.println("L: Password > ");
            String password = scanner.nextLine();
            if(password.equals(logins.get(username))) {
                System.out.println("Successfully logged in, Choose next Options.");
                return true;
            } else
                return false;
        } else {
            return false;
        }
    }

    // Shows up if either Username doesn't exist, or password wrong
    private void fehlerMeldung() {
        System.out.println("Fehler!");
    }

    // Checks the Login
    private boolean checkLogin() {
        if(loginAction()) {
            return true;
        } else {
            fehlerMeldung();
            return false;
        }
    }

    // Final Login Check
    private void checkLogin2() throws InterruptedException {
        if(checkLogin()) {
            Game.theGame();
        }
    }
    public static String returnLoginData() {
        return "Username: -"+"\n"+
                "Password: -";
    }
}