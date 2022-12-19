
// Advanced Java Functions 

class KeyPhone
{
    @Deprecated
    void sendMess()
    {
        System.out.println("Text Message sent !!");
    }
}

class Android extends KeyPhone
{
    @Override
    void sendMess()
    {
        System.out.println("Mess sent via telegram !!");
    }
}
interface DemoAnoo
{
    void meth1();

    void meth2();
}

// Functional Interface ---> Only 1 method in the interface 
@FunctionalInterface
interface myfunc
{
    void method1(int a);
}


public class P18_Advanced_Java 
{
    public static void main(String[] args) 
    {
        // Anoonomous Class --> creating directly object for the Interface 
        DemoAnoo obj = new DemoAnoo() 
        {
            @Override
            public void meth1()
            {
                System.out.println(" I am meth 1");
            }  
            
            @Override
            public void meth2()
            {
                System.out.println("I am in Meth 2");
            }
        };

        obj.meth1();
        obj.meth2();


        myfunc objj = (a) ->
        {
            System.out.println("i AM lAMBDA fUNCTION with value of a : -> " + a);
        };
        objj.method1(67);


        @SuppressWarnings("deprecation")
        Android a = new Android();
        a.sendMess();



    }    
}
