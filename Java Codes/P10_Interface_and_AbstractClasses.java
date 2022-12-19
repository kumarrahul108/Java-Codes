
// Abstract Classes & Intefaces in Java 


abstract class Parent 
{
    public void greet()
    {
        System.out.println("Hello !! I am a Parent Class !!");
    }

    abstract public void sayHello();

    abstract public void greet2();

}


class Child extends Parent
{
    public void greetChild()
    {
        System.out.println("Hello !! I am a Child Class Extending from Parent Class !!");
    }

    @Override
    public void sayHello()
    {
        System.out.println("Hello , Mr.Rahul !!");
    }

    @Override
    public void greet2()
    {
        System.out.println("Hello , Mrs.Tanisha !!");
    }
}

//  Interfaces 

interface Horn 
{
    int a = 56;
    public void blowHorn();
}

interface Speed
{
    public void increaseSpeed();
}

class Bicycle implements Horn , Speed  
{
    public void blowHorn()
    {
        System.out.println("Pee..Pee...Pooo...Pooo !!");
    }

    public void increaseSpeed()
    {
        System.out.println("Incresing the Speed !!");
    }

    public void display()
    {
        System.out.println("I am riding Avon Bicycle !!");
    }
}


public class P10_Interface_and_AbstractClasses  
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        Parent p = new Child();

        /*
         * Parent p = new Parent()  --> throws an Error --> abstract class object can't be created 
         */


        Bicycle b = new Bicycle();
        
        b.display();
        b.increaseSpeed();
        b.blowHorn();  

        //  Value in any Interface is Final 
        // b.a = 78; --> throws an Error 
    }    
}
