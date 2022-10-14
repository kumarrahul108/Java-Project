


// CBSE - Percentage Calculator


import java.util.Scanner;;

public class Project_1 
{
    public static void main(String[] args) 
    {
        System.out.println("** Welcome to CBSE Percentage Calculator **\n");
        String name;

        // Object Instantation for Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name :   ");
        name = sc.nextLine();  // Taking Student Name from User

        // Creating Array for storing 5 Subjects Marks
        int arr[] = new int[5];  
        int sum = 0;
        System.out.println();

        // Loop to input % Subjects Marks & Calculate their sum
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Marks for Subject " + (i+1) + " :   ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
       
        // calculating percentage of marks
        int avg = sum/5;

        // displaying output
        System.out.println("\n\nName of the Student:        "   + name);
        System.out.println("Total Marks of the Student :    "   + sum);
        System.out.println("Percentage Got by the Student:  "   + avg + " %");


    }    
}
