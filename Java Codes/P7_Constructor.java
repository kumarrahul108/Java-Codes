
// Constructors & Getter-Setter in Java 

class MyEmployee 
{
    private int id;
    private String name;

    // getter
    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    // setter
    public void  setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}

class MyEmployee2 
{
    int id;
    String name;

    MyEmployee2()
    {
        id =  5353;
        name = "Rahul Aryan";
    }
}


class MyEmployee3 
{
    int id;
    String name;

    MyEmployee3(int id , String name)
    {
        this.id = id;
        this.name = name;        
    }

    MyEmployee3(String name)
    {
        this.name = name;
    }
}



public class P7_Constructor 
{
    public static void main(String[] args) 
    {
        MyEmployee me1 = new MyEmployee();

        System.out.println("\nUsing Getter - Setter :");
        me1.setId(5235);
        me1.setName("Tanisha is very Preety .");

        System.out.println("Name :  " + me1.getName());
        System.out.println("ID : " + me1.getId());


        System.out.println("\nUsing Simple Constructor : ");
        MyEmployee2 me2 = new MyEmployee2();
        System.out.println("ID : " + me2.id);
        System.out.println("Name : " + me2.name);

        System.out.println("\nUsing Parametrised  +  Overloading Constructor : ");
        MyEmployee3 me3 = new MyEmployee3(5643, "Tanisha is very Cute");
        System.out.println("ID : " + me3.id);
        System.out.println("Name : " + me3.name);

        MyEmployee3 me4 = new MyEmployee3("Tanisha is very Hot");
        System.out.println("\noverloading constructor : Name --> " + me4.name);

        

    }   
}
