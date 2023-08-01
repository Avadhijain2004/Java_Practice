/*Java program for rock, paper and scissors game */
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        for (int i = 0; i < 5; i++) 
        {
            int rand = ran.nextInt(1, 3);
            System.out.print("Enter your choice:\n0 for rock\n1 for paper\n2 for scissor\nEnter here:");
            int input = scan.nextInt();
            System.out.println("You entered :" + input);
            System.out.println("Computer entered :" + rand);
            if (input == 0 && rand == 0) 
            {
                System.out.println("Its a tie");
            } 
            else if (input == 0 && rand == 1) 
            {
                System.out.println("Computer wins");
            } 
            else if (input == 1 && rand == 0) 
            {
                System.out.println("You win");
            } 
            else if (input == 1 && rand == 1) 
            {
                System.out.println("Its a tie");
            } 
            else if (input == 1 && rand == 2) 
            {
                System.out.println("Computer wins");
            } 
            else if (input == 2 && rand == 0) 
            {
                System.out.println("Computer wins");
            } 
            else if (input == 2 && rand == 1) 
            {
                System.out.println("You win");
            } 
            else if (input == 2 && rand == 2) 
            {
                System.out.println("Its a tie");
            }
        }

    }
}
