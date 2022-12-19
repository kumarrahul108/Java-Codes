
//  Inheritance in Interfaces


interface Ek 
{
    public void meth1();

    public void meth2();

    private void greet()
    {
        System.out.println("Good Morning !!");
    }

    // Default Methods  
    default void meth22()
    {
        greet();

        System.out.println("Hi ! Rahul Bhaiya !!");
    }
}

interface DO extends Ek 
{
    public void meth3();

    public void meth4();
}


class Sample implements DO 
{
    public void meth3()
    {
        System.out.println("I am Meth 3");
    }

    public void meth4()
    {
        System.out.println("I am Meth 4");
    }

    // Inheritance of interfaces 

    public void meth1()
    {
        System.out.println("I am Meth 1");
    }

    public void meth2()
    {
        System.out.println("I am Meth 2");
    }
}


public class P11_Inheritance_in_Interfaces 
{
    public static void main(String[] args) 
    {
        Sample s = new Sample();

        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }    
}
