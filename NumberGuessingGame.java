import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
  public static void main (String args[])
  {
    int number, guess, score = 0;
    final int Max = 100;

    Scanner keyboard = new Scanner (System.in);
    Random rand = new Random ();

      number = rand.nextInt (Max) + 1;
    for (int i = 0; i < 5; i++)
      {
	System.out.println ("guess a number between 1 and 100");
	guess = keyboard.nextInt ();
	if (guess == number)
	  {
	    System.out.println ("congratulations! your answer was correct");
	    System.out.println ("you have completed the task in " + (i + 1) +
				" attempts");
	    score = (5 - i) * 10;
	    break;
	  }

	else if (guess < number)
	  {
	    System.out.println ("your guess is less than the answer");
	  }

	else
	  {
	    System.out.println ("your guess is greater than the answer");
	  }
      }
    if (score == 0)
      {
	System.out.println ("The answer is " + number);
	System.out.println ("Please Try again...");
      }
    else
      {
	System.out.println ("Wow! Your score is " + score +
			    " You have a great sixth sense have a try again.");
      }
  }
}
