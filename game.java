import java.util.Scanner;
import java.util.Random;
public class game{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int random = rd.nextInt(101);
        int input = 0;
        int count = 0;
        boolean decision = true;

        System.out.println("Welcome to the number guessing game");
        System.out.println("You have to guess for a number between 0 - 100 and you have three trys");
        System.out.println("Pick a number");
        while(count < 3)
        {
            input = sc.nextInt();
            if(input == random)
            {
                System.out.println("SUCCESS!!!");
                decision = false;
                break;
            }
            else{
                System.out.println("Unlucky");
            }
            count++;
            if(count == 1)
            {
                System.out.println("You have 2 more trys Guess again");
            }
            else if(count == 2){
                System.out.println("This is your last try Guess again");
            }
            else{
                break;
            }
        }
        if(decision)
        {
            System.out.println("The random number was "+ random +".");
        }
    }
}