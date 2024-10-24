import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        //Input the lower and upper limits
        System.out.println("Enter the lower limit:");
        int lowerLimit=scanner.nextInt();
        System.out.println("Enter the upper limit:");
        int upperLimit= scanner.nextInt();
        //Generate a rando number between the lower and upper limits
        int randomNumber = random.nextInt(upperLimit-lowerLimit+1)+lowerLimit;

        //print the generated random number
        System.out.println("Generated random number:"+ randomNumber);
        //print message accoring to the range of the value generated
        if (randomNumber < lowerLimit+(upperLimit-lowerLimit)/3)
        {
            System.out.println("The number is in the lower third of the range.");
        }
        else if (randomNumber < lowerLimit+2*(upperLimit-lowerLimit)/3)
        {
            System.out.println("The number is in the middle third of the range.");
        }
        else
        {
            System.out.println("The number is in the upper third of the range.");
        }
        scanner.close();
    }
}