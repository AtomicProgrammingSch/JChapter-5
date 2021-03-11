import java.util.Scanner;

public class Task2 {

    public static void passed(int score) {
        if (score >= 50) {
            System.out.println("You passed!");
        }
        else if (score < 0) {
            System.out.println("You can not have a negative score!");
        }
        else {
            System.out.println("You failed!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the score:");
        if (!scanner.hasNextInt()) {
            System.out.println("The score must be an integer!");
            System.exit(1);
        }
        int score = scanner.nextInt();
        passed(score);
    }
}
