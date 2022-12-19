
// File Handling in Java 

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class P17_File_Handling 
{
    public static void main(String[] args) 
    {
        File f = new File("rkk.txt");

        // File Creation 
        try 
        {
            f.createNewFile();
            System.out.println("File Created !!");
        }
        catch(Exception e)  
        {
            e.printStackTrace();
        }

        // Writing a File 
        try 
        {
            FileWriter fw = new FileWriter("rkk.txt");
            fw.write("File in Java !!");
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Reading File in Java 
        try 
        {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                String st = sc.nextLine();
                System.out.println(st);
            }
            sc.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File NOt Found !!");
            e.printStackTrace();
        }


        // Deleting file in Java 
        
        if(f.delete())
        {
            System.out.println("File Deleted");
        }
        else 
        {
            System.out.println("Error Ocuured !!");
        }
        

    }    
}
