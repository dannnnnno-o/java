import java.util.Scanner;
import java.util.Random;

public class ScannerPractice{
    public static void main(String[] args){
        //Guessing Game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Hi! This is a Guessing Game!");
        System.out.println("Guess the number between 1-100 to get out of the loop.");
        int guess = 0;
        char choice = 'y';
        int randomNum = random.nextInt(11);
        while(choice == 'y'){
            System.out.print("Guess (1-10): ");
            guess = scanner.nextInt();
            if(guess == randomNum){
                System.out.println("The number was " + randomNum + "!");
            }
            else{
                System.out.println("Wrong! it's not " + guess);
                continue;
            }
            System.out.print("Would you like to guess again? (y/n): ");
            choice = scanner.next().charAt(0);
            if(choice == 'n'){
                break;
            }
            else if(choice == 'y'){
                randomNum = random.nextInt(11);
                continue;
            }
        }
        System.out.println("Thanks for playing!");
        scanner.close();    
    }
}