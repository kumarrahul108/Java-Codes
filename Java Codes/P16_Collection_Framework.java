
// Collections Framework

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class P16_Collection_Framework 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(67);
        l1.add(78);
        l1.add(2, 89);

        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }


        // Date - Class
        System.out.println("\n Date class :  \n");
        Date d = new Date();
        System.out.println(d);

        System.out.println("Current Time in miliseconds :   " + System.currentTimeMillis());

        System.out.println(d.getDate() + " " + d.getSeconds());
        System.out.println("Time in Digital Format -->  " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());


        // Calender Class
        System.out.println("\n Calender Class \n "); 
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("Time in Digital Format -->   " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        
        // Date Time Formatting 
        System.out.println("\nDate Time Formatting   :  \n");
        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        LocalTime tt = LocalTime.now();
        System.out.println(tt);

        LocalDateTime dtt = LocalDateTime.now();
        System.out.println(dtt);  

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dtt.format(df);
        System.out.println(myDate);



    }    
}
