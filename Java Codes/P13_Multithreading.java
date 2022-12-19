
// Multi-Threading in Java 



// Creating Thread extending Thread Class 

class MyThread1 extends Thread 
{

    // Constructor in Thread 
    MyThread1(String name)
    {
        super(name); 
    }

    public void run()
    {
        int i = 0;
        while(i<20)
        {
            System.out.println("Cooking Thread !!");
            i++;
        }
    }
}

class MyThread2 extends Thread
{
    @Override 
    public void run()
    {
        int i = 0;
        while(i<20)
        {
            System.out.println("Playing Music Thread !!");
            i++;
        }
    }
}


// Creating Thread using Interface

class MyThread3 implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i<20)
        {
            System.out.println("Dancing Thraed !!");
            i++;
        }
    }
}


class MyThread4 implements Runnable
{
    public void run()
    {
        int i = 0;
        while(i<20)
        {
            System.out.println("Coding Thread !!");
            i++;
        }
    }
}

// Implementing Methods in Thread 
class MyThread5 extends Thread 
{
    public void run()
    {
        int i = 0;
        while(i<20)
        {
            System.out.println("Methods In Thared !!");
            try 
            {
                Thread.sleep(100); 
            }
            catch(Exception e)
            {
                System.out.println(e); 
            }
            i++;
        }
    }
}



public class P13_Multithreading 
{
    public static void main(String[] args) 
    {
        System.out.println("\n\n Extending Thread Class Thread :  "); 
        MyThread1 t1 = new MyThread1("Rahul");
        MyThread2 t2 = new MyThread2();

        t1.start();
        System.out.println("name of the Thread :  " + t1.getName()); 
        System.out.println("ID of the Thread :  " + t1.getId()); 
        


        System.out.println("\n\n\n  Runnable Interface Thread :   ");
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t4);

        tt3.start();
        tt4.start();

        MyThread5 t5 = new MyThread5();
        t5.start();

        try 
        {
            t5.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();

    }
}