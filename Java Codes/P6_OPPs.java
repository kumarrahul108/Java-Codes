
// Class & Objects In Java 

class Employee 
{
    int id;
    String name;
    int salary;
} 

class Employeee 
{
    int id;
    String name;

    public void printDetails()
    {
        System.out.println("My ID is : " + id);
        System.out.println("My name is : " + name + "\n");
    } 

}


public class P6_OPPs 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.id = 5353;
        e1.name = "Rahul Kumar";
        e1.salary = 1500;

        System.out.println("\n" + e1.id + " \n" + e1.salary + "  \n" + e1.name );

        Employeee e2 = new Employeee();
        e2.id = 5354;
        e2.name = "Tanisha";

        System.out.println("\nClasss Using Methods :  \n");
        e2.printDetails();
    }    
}
