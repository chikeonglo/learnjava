import java.util.Scanner;

public class types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string");
        String string = scanner.nextLine();
        System.out.println("Give an integer");
        String stringInteger = scanner.nextLine();
        int integer = Integer.valueOf(stringInteger);
        System.out.println("Give a double");
        String stringDouble = scanner.nextLine();
        double doubleString = Double.valueOf(stringDouble);
        System.out.println("Give a boolean");
        String stringBoolean = scanner.nextLine();
        boolean booleanString = Boolean.valueOf(stringBoolean);
        System.out.println("String: " + string);
        System.out.println("Integer: " + integer);
        System.out.println("Double: " + stringDouble);
        System.out.println("Boolean: " + booleanString);
    }
}