
import java.util.Random;
import java.util.Scanner;

public class numguesser {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String playAgain = "y";
        do {
            System.out.println("Welcome to the guessing game.\nPlease guess a number beween 1 to 100");
            System.out.println("You have 7 guesses to guess the number");
            System.out.println("Picking a number ....\n");

            int guess = sc.nextInt();
            int correct_num = rand.nextInt(100) + 1;
            int guess_count = 1;

            while (guess != correct_num && guess_count <= 6) {
                guess_count++;

                if (guess < correct_num) {
                    System.out.println(" !Wrong! Need to guess higher :");
                } else {
                    System.out.println(" !Wrong! Need to guess lower :");
                }
                guess = sc.nextInt();
            }
            System.out.printf("The right answer is %d\n", correct_num);

            if (guess_count > 7) {
                System.out.println("You exhausted all the trials");
                System.out.printf("Score:00 ");
            } else {
                System.out.printf("Score:%d ", (7 - guess_count) * 10);
            }

            System.out.printf("Points:%d ", (7 - guess_count) * 15);

            System.out.println("Want to Play again?(y/n)");
            playAgain = sc.next();
        } while (playAgain.equals("y") || playAgain.equals("Y"));

    }

}