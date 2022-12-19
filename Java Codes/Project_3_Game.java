/* 
    Project 3 :

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
import java.util.random.*;


class Game 
{
    int user;
    int ranNum;
    int guesses;

    Game()
    {
        Random r = new Random();
        ranNum = r.nextInt(100);
        System.out.print("\nRandom Number Genetrated by the Computer =  " + ranNum);
    }

    public void userInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGuess Any Number   :  ");
        user = sc.nextInt();
    }

    // getter - setter 
    public void setVal(int guesses)
    {
        this.guesses = guesses;
    }

    public int getVal()
    {
        return guesses;
    }

    // function to comapre the value
    public boolean isCorrect()
    {
        guesses++;

        if(user == ranNum)
        {
            System.out.println("Congrats ! You guessed it Right in  " + guesses + "  attempts !!");
            return true;
        }
        else if(user > ranNum)
        {
            System.out.println("Opps ! You Guessed it Wrong");
            System.out.println("Please enter a lower value than this !!");
            return false;
        }
        else
        {
            System.out.println("Opps ! You Guessed it Wrong");
            System.out.println("Please enter a Higher value than this !!");
            return false;
        }
    }
}


public class Project_3_Game 
{
    public static void main(String[] args) 
    {
        Game g = new Game();

        boolean f = false;

        while(!f)
        {
            g.userInput();

            f = g.isCorrect();
        }
    }    
}
