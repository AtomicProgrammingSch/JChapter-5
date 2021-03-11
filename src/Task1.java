import java.util.Scanner;

public class Task1 {

    public static int highest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Please enter your first integer:");
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
        }
        else {
            System.out.println("You did not enter a valid integer!");
            System.exit(1);
        }
        System.out.println("Please enter your second integer:");
        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        }
        else {
            System.out.println("You did not enter a valid integer!");
            System.exit(1);
        }
        int highest = highest(num1, num2);
        System.out.println("The biggest number you entered was: " + highest);
    }
}
