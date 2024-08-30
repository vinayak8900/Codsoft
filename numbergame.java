import java.util.Scanner;
import java.util.Random;
public class numbergame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random Random=new Random();
        int Score=0;
        boolean playAgain;
        do{
            int generatedNumber=Random.nextInt(100)+1;
            int attempts=0;
            int maxAttempts=10;
            boolean guessedCorrectly=false;
            System.out.println("WELCOME TO NUMBER GUESSING GAME");
            System.out.println("guess a number between 1-100");

            while(attempts<maxAttempts && !guessedCorrectly){
                System.out.println("Enter your guess");
                int userGuess=sc.nextInt();
                attempts++;

                if (userGuess==generatedNumber){
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    Score++;
                    guessedCorrectly=true;
                }
                else if(userGuess>generatedNumber){
                    System.out.println("Too High! Try Again");
                }
                else{
                    System.out.println("Too Low! Try Again");
                }


            }
            if(!guessedCorrectly){
                System.out.println("Sorry! You used all " + maxAttempts+" attempts.\n The correct number was"+generatedNumber+".");


            }
            System.out.println("Your current score is: " + Score);
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing! Your final score is: " + Score);
        sc.close();


    }


}
