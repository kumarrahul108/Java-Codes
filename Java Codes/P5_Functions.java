
// Methods in Java  

import java.util.Scanner; 
public class P5_Functions 
{

    public static int log(int x,int y)
    {
        int z;
        if(x>y)
        {
            z = x + y;
        }
        else 
        {
            z = x*y;
        }
        return z;
    }

    int loog(int x,int y)
    {
        int z;
        if(x>y)
        {
            z = x + y;
        }
        else 
        {
            z = x*y;
        }
        return z;
    }

    // Variable Arguments 
   public static int sum(int ...arr)
   {
        int res = 0;
        for(int e : arr)
        {
            res += e;
        }
        return res;
   }

   // Methods Overloading --> same methods name but different parameters 

   public static void greet()
   {
        System.out.println("\nGood Morning , Rahul Bhaiya !!");
   }

   public static void greet(String s)
   {
        System.out.println("\nGood Morning ," + s);
   }



    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDirectly Using Static Function Call :  " + log(2, 6));

        P5_Functions obj = new P5_Functions();
        int c = obj.loog(2, 6);
        System.out.println("Function call using Object Creation :  " + c);

        System.out.println("\nSum Uisng Variable Arguments :  " +  sum(1,2,34,5));
       
        System.out.println("\n Metho Overloading :  ");
        greet();
        greet("Tanisha");
       

        
    }    
}
