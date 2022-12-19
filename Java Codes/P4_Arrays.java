
// Arrays in Java 


import java.util.Scanner;

public class P4_Arrays 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    

        //  Array 
        int arr1[] = {1,2,3,4,5};
        System.out.println("Length of arrray arr1 :   " + arr1.length);
        System.out.println("At Position 3  --> " + arr1[2]);

        int arr2[] = new int[5];

        int arr3[];
        arr3 = new int[5]; 

        // Take Input 
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter value for arr2 of index " + (i+1) + " = ");
            arr2[i] = sc.nextInt();
        }

        // Display
        System.out.println("\n");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr2[i] + "   ");
        }

        //  for each loop : 
        System.out.print("\n Displaying Using For Each Lopp :    ");
        int [] marks = {70,100,90,86,95};

        for(int e : marks)
        {
            System.out.print(e + "    ");
        }


        System.out.println("\n\n2-D Array : ");
        int a[][] = new int[3][3]; 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter value for position of Matrix : -> Row : " + (i+1) + " Column : " + (j+1) + "  ");
                a[i][j] = sc.nextInt();
                
            }
        }

        System.out.println("\n\nDisplay Matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }


    }
}