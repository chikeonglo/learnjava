import java.util.Scanner;

public class repeating2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Numbers: ");
        
        // counters
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            // inputs
            int number = Integer.valueOf(scanner.nextLine());
            // check input == -1
            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            // add number to total
            sum += number;
            counter++;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        // sum of numbers
        System.out.println("Sum of inputs is: " + sum);
        // number of numbers
        System.out.println("Number of inputs is: " + counter);
        // average of numbers
        System.out.println("Average of inputs is: " + (sum/counter));
        // print even and odd
        System.out.println("Inputs that are EVEN: " + even);
        System.out.println("Inputs that are ODD: " + odd);
    }
}