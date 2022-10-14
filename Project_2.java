
/* 

   Game - Rock , Paper & Scissor

   Game Rule : -->  Rock wins against scissors
                    Paper wins against rock
                    Scissors wins against paper

*/


import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Exercise_2 
{
    public static void main(String[] args) 
    {
        // Object Instatntation for Scanner Class
        Scanner sc = new Scanner(System.in);

        // Object Instatntation for Random Class
        Random r = new Random();

        int computer = r.nextInt(3);  // Random no. from 0 to 2

        System.out.print("Enter : \n0 for Rock  \n1 for Paper  \n2 for Scissor \n\nPlease Choose according to above Menu:  ");
        int user = sc.nextInt();

        System.out.println("\n");

        if(user == computer)
        {
            System.out.println("Match Tie !!");
        }

        else if(user == 0)  // Rock
        {
            if(computer == 1)  // Paper
            {
                System.out.println("You Lost the Match !!");
            }
            if(computer == 2)  // Scissor
            {
                System.out.println("You Won the Match !!");
            }
        }
        else if(user == 1)  // Paper
        {
            if(computer == 0)  // Rock 
            {
                System.out.println("You Won the Match !!");
            }
            if(computer == 2)  // Scissor
            {
                System.out.println("You Lost the Match !!");
            }
        }
        else  // user == 2  // Scissor
        {
            if(computer == 0)  // Rock
            {
                System.out.println("You Lost the Match !!");
            }
            if(computer == 1)  // Paper
            {
                System.out.println("You Won the Match !!");
            }
        }

        
        System.out.println("\n\nComputer Choose :   " + computer + " \nYou Choose :        " + user);
        
    }    
}
