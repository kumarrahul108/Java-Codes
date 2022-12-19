
// Strings in Java 


import java.util.*;

public class P2_Strings  
{
    public static void main(String[] args) 
    {
        String name = new String("Rahul Kumar");
        
        System.out.println("My Name is :  " + name);

        String st = "Mohan Bhatiya";

        float f2 = 675.678f;
        double d2 = 675.897;
        int d = 76;
        char ch = 'A';
        System.out.printf("\nThe value of d is %d  ",d); 
        System.out.printf("\nThe value of f2 is %f  ",f2);
        System.out.printf("\nThe value of character ch is %c ",ch);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter any String :   ");
        String str = sc.nextLine();
        System.out.println("\nInputed String :   " + str);

        // String Methods  
        System.out.println("Length  :  " + str.length());
        String ss = "Software Developer";
        System.out.println(ss);

        String s1 = ss.toLowerCase();
        System.out.println(s1); 
        char c = s1.charAt(3);

    }    
}
