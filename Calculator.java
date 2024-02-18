
import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner Scanner = new Scanner(System.in);
        double Fvalue;
        double Svalue;
        double Result;
        int choice;
     do
     {
        System.out.print("\n***Calculator***"
                + "\n"
                + "\n1.Addition"
                + "\n2.Subtraction"
                + "\n3.Multiplication"
                + "\n4.Division"
                + "\n0.Exit"
                + "\n"
                + "Your choice: ");
        choice = Scanner.nextInt();
        
        if(choice == 0) 
        {
            System.out.println("Exiting the program.");
            break;
        }
        
        
        if(choice == 1)
        {
            System.out.println("\n**Your choice is Addition***");
            System.out.print("Enter the first Vaule: ");
            Fvalue = Scanner.nextDouble();
            
            System.out.print("Enter the second Vaule: ");
            Svalue = Scanner.nextDouble();
            
            Result = Fvalue + Svalue;
            
            System.out.println(Fvalue + " + "+Svalue +" = "+Result);
            
        }else if (choice == 2)
        {
            System.out.println("\n**Your choice is subtraction***");
            System.out.print("Enter the first Vaule: ");
            Fvalue = Scanner.nextDouble();
            
            System.out.print("Enter the second Vaule: ");
            Svalue = Scanner.nextDouble();
            
            Result = Fvalue - Svalue;
            
            System.out.println(Fvalue + " - "+Svalue +" = "+Result);
        }else if (choice == 3)
        {
            System.out.println("\n**Your choice is Multiplication***");
            System.out.print("Enter the first Vaule: ");
            Fvalue = Scanner.nextDouble();
            
            System.out.print("Enter the second Vaule: ");
            Svalue = Scanner.nextDouble();
            
            Result = Fvalue * Svalue;
            
            System.out.println(Fvalue + " * "+Svalue +" = "+Result);
        }else if (choice == 4)
        {
            System.out.println("\n***Your choice is Division***");
            System.out.print("Enter the first Vaule: ");
            Fvalue = Scanner.nextDouble();
            
            System.out.print("Enter the second Vaule: ");
            Svalue = Scanner.nextDouble();
            
            Result = Fvalue / Svalue;
            
            System.out.println(Fvalue + " / "+Svalue +" = "+Result);
        }else 
        {
            System.out.println("Invalid Option");
        }
        
     }while(choice!=0);
    }
}
