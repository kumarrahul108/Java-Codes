
// Inheritance in Java 

class Base 
{
    int x;

    public int getX()
    {
        return x;        
    }

    public void setX(int x)
    {
        System.out.println("I am in Base Class setting values for X !");
        this.x = x;
    }

    public void meth()
    {
        System.out.println("Hello Tanisha !!!");
    }
}

class Derived extends Base 
{
    int y;

    public int getY() 
    {
        return y;        
    }

    public void setY(int y)
    {
        System.out.println("I am in Derived Class setting values for Y !");
        this.y = y;
    }

    // Overridding methods 
    @Override
    public void meth()
    {
        System.out.println("Hello Pretty girl , Tanisha !!");
    }

}


public class P8_Inheritance 
{
    public static void main(String[] args) 
    {
        System.out.println("\nBase Class \n");
        Base b = new Base();
        b.setX(23);
        System.out.println(b.getX());
        b.meth();

        System.out.println("\nDerived Class \n");
        Derived d = new Derived();
        d.setX(45);
        d.setY(56);

        System.out.println(d.getX());
        System.out.println(d.getY()); 
        d.meth();

        // Polymorphism 
        System.out.println("\n Polymorphism : \n");
        Base obj = new Derived();
        obj.setX(96);
        obj.meth();

    }    
}
