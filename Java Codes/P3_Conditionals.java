
// Conditionals in Java 


import java.util.Scanner;
public class P3_Conditionals 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter any NUmber :   ");
        int a = sc.nextInt();
        if(a >70)
        {
            System.out.println("\nYess");
        }
        else if(a<70 && a>50)
        {
            System.out.println("\nSmall YEes");
        }
        else 
        {
            System.out.println("\nNoo ");
        }

        System.out.print("Enter Your age :   ");
        int age = sc.nextInt();

        switch(age)
        {
            case 18:
                System.out.println("Adult");
                break;

            case 21:
                System.out.println("a1");
                break;
                
            case 45:
                System.out.println("A2");
                break;
                
            default:
                System.out.println("bYE");    
        }

        System.out.println("Thanks for Using Switch case in Java !!");


        // Enhanced Switch case :
        System.out.println("Enhanced Switch Case ");
        switch(age)
        {
            case 21  -> System.out.println("A1");
            case 45  -> System.out.println("A2");
            default  -> System.out.println("Bye"); 
        }
        
    }    
}
