public class Calculator {

    public static void calc() {
        System.out.println();
        // Currently, Calculator only uses two Numbers
        System.out.println("Welcome to the Calculator!");
        System.out.print("First Number > ");
        double num1 = readDouble();

        System.out.print("Second Number> ");
        double num2 = readDouble();

        System.out.println("+, -, /, *");
        switch(readString()) {
            case "+" -> plus(num1, num2);
            case "-" -> minus(num1, num2);
            case "*" -> multiply(num1, num2);
            case "/" -> divide(num1, num2);

        }

    }

    public static double readDouble() {
        return Double.parseDouble(Code.scanner.nextLine());
    }

    public static String readString() {
        return Code.scanner.nextLine();
    }

    public static void plus(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    public static void minus(double num1, double num2) {
        System.out.println(num1 - num2);
    }
    public static void multiply(double num1, double num2) {
        System.out.println(num1 * num2);
    }
    public static void divide(double num1, double num2) {
        System.out.println(num1 / num2);
    }
}
