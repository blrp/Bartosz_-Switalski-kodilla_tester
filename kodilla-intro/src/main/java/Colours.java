import java.util.Scanner;
public class Colours {
    enum ColoursName {
        B, /* Blue */
        Y, /* Yellow */
        G, /* Green */
    }
    public static String ColoursName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter colour name: ");
            String UserRespond = scanner.nextLine().trim();
            if (UserRespond.length() >= 1) {
                return UserRespond;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (B-Blue, Y-Yelow, G-Green):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B": return "BLUE";
                case "Y": return "Yellow";
                case "G": return "Green";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colour number:");
        int val = scanner.nextInt();
        return val;
    }
    public double calculate() {
        String colourSelected = Colours.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (colourSelected) {
            case "BLUE": return a + b;
            case "Yellow": return a - b;
            case "Green": return a / b;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Colours colours = new Colours();
        double result = colours.calculate();
        System.out.println("Result: " + result);
    }
}
