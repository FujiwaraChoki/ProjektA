import java.util.HashMap;
import java.util.Scanner;

/*
* Author: Sami Hindi
* Version: 0.5
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
        System.out.println("TEST ACCOUNT");
        System.out.println("USERNAME: -");
        System.out.println("PASSWORD: -");
        addCombo("-", "-");
        System.out.println("Hello.");
        System.out.println("Oce upon a time...");
        System.out.println("Login (1) or create Account (2) > ");
        switch(Integer.parseInt(scanner.nextLine())) {
            case 1 -> something();
            case 2 -> createUser();
        }
    }

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
        something();
    }

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

    private void fehlerMeldung() {
        System.out.println("Fehler!");
    }

    private boolean checkLogin() {
        if(loginAction()) {
            return true;
        } else {
            fehlerMeldung();
            return false;
        }
    }

    private void something() throws InterruptedException {
        if(checkLogin()) {
            Game.theGame();
        }
    }
}
