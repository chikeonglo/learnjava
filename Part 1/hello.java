import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // Create a tool for reading user input and name it scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        
        // read string and save to variable
        String message_print = scanner.nextLine();

        // print message
        System.out.println("Hello " + message_print);
    }
}