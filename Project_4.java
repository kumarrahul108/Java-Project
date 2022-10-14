


/*  Program : Implement a Libraray using Java Class Library

             Methods     :-> addBook , issueBook , returnBook , displayBook ,  
             Properties  :-> Array to store the available books 
                             Array to store the issued books 


*/


import java.util.Scanner;

class Library 
{
    String books[];
    int no_book;

    // constructor
    Library()
    {
        this.books = new String[100];
        this.no_book = 0;
    }

    // func to add books
    public void addBook(String book)
    {
        books[no_book] = book;
        no_book++;
        System.out.println(book + " has been added to the Library .\n");
        
    }


    // func. to  display all the books 
    public void displayBook()
    {
        System.out.println("\n\nBooks Present in the Library :    \n");
        for(String e:books)
        {
            if(e == null)
            {
                continue;
            }
            System.out.println(" * " + e);
        }
    }


    // func. to return book
    public void returnBook(String book)
    {
        addBook(book);
        System.out.println("\n Thanks for returning this Book. \nHope you enjoyed reading it. Have a great day ahead !!!");
    }


    // func to issue book
    public void issueBook(String book)
    {
        for(int i = 0;i<books.length;i++)
        {
            if(books[i] == book)
            {
                System.out.println("The book " + book +" has been Issued . \nPlease keep it safe And return it within 15 days.");
                System.out.println("Have a Great day ahead !!\n");
                books[i] = null;
                return ;
            }
        }
        System.out.println("Opps !! Currently , This Book is not present in the library !!");
    }

}


public class Project_4 
{
    public static void main(String[] args) 
    {
        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("HTML");
        lib.addBook("C++");
        lib.addBook("Data Structure");
        lib.addBook("Power BI");
        lib.addBook("Intro to GIT");
        lib.addBook("Advanced Excel");

        lib.displayBook();

        lib.issueBook("C++");
        lib.issueBook("Power BI");

        System.out.println();
        lib.returnBook("C++");

    }    
}
