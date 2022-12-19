
// Basics Java

import java.util.Scanner;  

public class P1_Basics 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number :  ");
        int a = sc.nextInt();
        System.out.println("\nNumber --> " + a);

        //  To chek for validity 
        System.out.print("\nEnter  any  Number   ");
        boolean b1 = sc.hasNextDouble(); 
        if(b1 == true)
        {
            System.out.println("Yes !!");
        }
        else 
        {
            System.out.println("Not an Integer !!"); 
        }

        int r1 = 78;
        int r2 = 89;
        System.out.println("sum  :  " + (r1 + r2));

        System.out.println("\nType Casting  :  " + (char)r1);
    }
}