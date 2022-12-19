/* 
    Project 4 : Implement a Libraray using Java Class Library

             Methods     :-> addBook , issueBook , returnBook , displayBook 

             Properties  :-> Array to store the available books 
                             Array to store the issued books 

*/


class Library 
{
    int no_books;
    String books[];

    Library()
    {
        books = new String[100];
        no_books = 0;
    }

    public void addBook(String book)
    {
        books[no_books] = book;
        no_books++;
    }

    public void displayBook()
    {
        System.out.println("\nBooks Present in the Library  :    ");
        for(String book : books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println("  * " + book);
        }
    }

    public void issueBook(String book)
    {
        for(int i=0;i<books.length;i++)
        {
            if(books[i] == book)
            {   
                System.out.println("\nYou have been issues the Book ! Please keep it Safe !!");
                books[i] = null;
                return;
            }
           
        }
        System.out.println("\nThis book is Currently out of stock ,...Please revisit after 1 week !!");
        System.out.println("Thanks for your Visist Sir ! Have a good day sir !!");
    }

    public void returnBook(String book)
    {
        addBook(book);
        System.out.println("\nThanks for returning this Book .\nHope u enjoyed reading it Sir .\nHave a good day ahead !!");
    }

}


public class Project_4_Library 
{
    public static void main(String[] args) 
    {
        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("MySql");
        lib.addBook("Power Bi");
        lib.addBook("PowerPoint");
        lib.addBook("Excel");
        lib.addBook("Word");
        lib.addBook("Operating system");
        lib.addBook("DBMS");
        lib.addBook("GitHub");
        lib.addBook("Data Structure & Algorithms"); 


        lib.displayBook();

        lib.issueBook("Java");
        lib.issueBook("Django");

        lib.returnBook("NumpY");
        
        lib.displayBook();

    }    
}
