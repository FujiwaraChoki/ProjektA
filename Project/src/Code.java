import java.util.HashMap;
import java.util.Scanner;

public class Code {

    static Scanner scanner;

    static HashMap<String, String> logins = new HashMap<>();

    public Code() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Code().run();
    }

    private void run() {
        addCombo("Sami", "sami6344!");
        addCombo("Nikita", "nikita1@");
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
    private void createUser() {
        System.out.println("R: Username > ");
        String username = scanner.nextLine();
        System.out.println("R: Password > ");
        String password = scanner.nextLine();
        addCombo(username, password);
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

    private void something() {
        if(checkLogin()) {
            Game.theGame();
        }
    }
}
