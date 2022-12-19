
// Constructor Inheritance In Java 


class Ek 
{
    int a;

    Ek(int a)
    {
        this.a = a;
        System.out.println("I am a Constructor in Ek Class");
    }

    public int getA()
    {
        return a;
    }
}


class Do extends Ek  
{
    Do(int b)
    {
        super(b);
        System.out.println("I am a Constructor in Do Class");
    }

    /* 
        --> Throws Error bcz there is no constructor in parent / base class without parameter 
    Do()
    {
        System.out.println("Hello !!");
    }

    */
}


public class P9_Constructor   
{
    public static void main(String[] args) 
    {
        System.out.println("\nEk Class Object Creation\n ");
        Ek e = new Ek(5);
        System.out.println(e.getA());

        System.out.println("\nDo Class Object Creation\n ");
        Do d = new Do(7);
        System.out.println(d.getA());  
    }    
}
