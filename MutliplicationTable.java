
package com.mycompany.fortraining;

public class MutliplicationTable
{
   
    public static void main (String [] args)
    {
     System.out.print("              Multiplication Table     \n     ");
     
     for(int i =1; i<=9; i++)
     System.out.print("  "+i+"  ");
     System.out.println("\n-------------------------------------------------");
     
     for (int i =1; i<=9; i++)
     {
     System.out.print(i+" | ");
     for(int j =1; j<=9; j++)
         System.out.printf("%4d ",j*i);
            
     System.out.println();
     }
    }
}


