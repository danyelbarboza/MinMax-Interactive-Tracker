import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int count = 0;

        outerLoop: while (true) {
            try {
            System.out.println("Enter an integer to update the current min and max (or '000' to stop the program): ");
            int n = Scanner.nextInt();
            if (n == 000) {
                System.out.println("Exiting the program.");
                break;
            }
            if (count == 0) {
                min = n;
                max = n;
            }
            if (n <= min || min == n) {
                min = n;
            } else if (n >= max || max == n) {
                max = n;
            }
            } catch (Exception e) {
                while (true) {
                Scanner.nextLine();
                System.out.println("Invalid input. To continue, write 'continue' or 'exit' to stop the program.");
                String decision = Scanner.nextLine();
                if (decision.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the program.");
                    break;
                } if (decision.equalsIgnoreCase("continue")) {
                    System.out.println("Continuing the program.");
                    continue outerLoop;
                } else {
                    continue;
                }
            }
            }
            count++;
            System.out.println("Min: " + min + ", Max: " + max);
        }
        

    }
}