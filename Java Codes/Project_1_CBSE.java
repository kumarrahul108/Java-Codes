
/*
    Project 1 : 
    
    CBSE Percentage Calculator 

*/

import java.util.*; 

public class Project_1_CBSE 
{
    public static void main(String[] args) 
    {
        System.out.print("** Welcome to the CBSE Percenatge Calculator **\n");
        Scanner sc = new Scanner(System.in);
        String name ;
        System.out.print("Enter Your Name :  ");
        name = sc.nextLine();

        // array to store 5 subj marks
        double marks[] = new double[5];
        double sum =0.0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter marks for Subject : " + (i+1) + " =  ");
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }

        System.out.println("\nName of the Student :   " + name);
        System.out.println("Sum of his/her Marks :  " + sum);
        System.out.println("Percentage of his/her Marks  :  " + (sum/5));

       
    }    
}
