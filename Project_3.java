



/*  Program :
               Create a class Game, which allows a user to play "Guess the Number" game until he enter the exact value.
               Also, print in how many attempts he got the exact value.

                Game should have the following methods:
                1. Constructor to generate the random number
                2. userInput() to take a user input of number
                3. isCorrect() to detect whether the number entered by the user is true
                4. getter and setter for no Of Guesses  (guesses)
                   Use Properties such as guesses(int), etc to get the task done !! 

*/



import java.util.Random;
import java.util.Scanner;


// Creating Game class
class Game 
{
    int ran_numb;
    int user;
    int guesses = 0;


    // Constructor
    Game()
    {
        // Object Instantation for Random class 
        Random r = new Random();
        this.ran_numb = r.nextInt(100);
    }

    // getter for guesses
    public int getGuess()
    {
        return guesses;
    }

    // setter for guesses
    public void setGuesses(int g)
    {
        this.guesses = g;
    }

    // func to take input from the user
    public void userInput()
    {
        // Object Instantation for Scanner class 
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess Any Number :     ");
        this.user = sc.nextInt();
    }


    // func to comapre the inputed & random number 
    public boolean isCorrect()
    {
        guesses++;
        if(user == ran_numb)
        {
            System.out.println("\n\n\nYou Gussed the Number  Right !! \nThe Number is " + ran_numb + " \n You gussed it in " + guesses + " Attempts !!");
            return true;
        }
        else if(user > ran_numb)
        {
            System.out.println("\nToo High ...\nYou have entered Number greater than random number ");
            return false;
        }
        else 
        {
            System.out.println("\nToo Low ...\nYou have entered Number smaller than random number ");
            return false;
        }
    }
}


public class Excercise_3 
{
    public static void main(String[] args) 
    {
        // Object Instantation for Game Class
        Game g = new Game();

        boolean f = false; 
        while(!f)
        {
            g.userInput();

            f = g.isCorrect();
        }
    }    
}
