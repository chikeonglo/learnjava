import java.util.Scanner;

// create a program that only calculate the average of all the positive numbers
public class repeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // placeholders
        int sum = 0;
        int count = 0;

        while(true) {
            System.out.println("Number?");
            int value = Integer.valueOf(scanner.nextLine());
            
            // stop program if number is 0
            if (value == 0) {
                break;
            } 

            // return back to beginning if value less than 0
            if (value <= 0) {
                continue;
            }

            // increment counters
            sum += value;
            count += 1;
        }

        // if no positive numbers
        if (count == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }

        System.out.println("Average is " + (sum/count));
    }
}