
// Errors in Java 

import java.util.Scanner;

public class P14_Errors_and_Exception 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Simple try - catch Block
        int a = 6790;
        int b = 0;

        try 
        {
            int c = a/b;
            System.out.println("Result : " + c);
        }
        catch(Exception e)
        {   
            System.out.println("We failed to divide Reason : \n");
            System.out.println(e); 
        }

        finally
        {
            System.out.println("End of thgis part !!");
        }


        System.out.println("\n\n Quick Quiz Nested try-Catch Block ::  \n");
        // Quiz Quiz nested try - catch Block

        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 26;
        arr[4] = 27; 

        while(true)
        {
            System.out.print("Enter any number for Index :  ");
            int idx = sc.nextInt();

            try 
            {
                System.out.println("\nWelcme to nested try-catch block :  \n");
                try 
                {
                    System.out.println(arr[idx]);
                    break;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("\nOpps ! Please give a valid index !!\n");
                }
            }
            catch(Exception e)
            {
                System.out.println("\nError  :  " + e);
            }
        }

    }    
}
