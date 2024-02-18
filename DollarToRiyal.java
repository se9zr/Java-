import java.util.Scanner;
public class DollarToRiyal 
{
    public static void main(String args [])
    {
        Scanner Scanner = new Scanner(System.in);
        double D;
        double R;
        double P;
        int c;
      do
      {
        System.out.print("\nEnter a number"
                + "\n1.from Dollar to Riyal."
                + "\n2.from Riyal to Dollar."
                + "\n0.Exit program"
                + "\nyour choice: ");
         
        
           c = Scanner.nextInt();
        
        if(c==0)
        {
               System.out.println("Exiting the program.");
               break;
        }
        if(c==1)
        {
           System.out.print("Enter price in Dollar: ");
           D = Scanner.nextDouble();
           
           P = D*3.75;
           System.out.println(D+ " Dollar is "+P+" Riyal");
           
        }else if(c==2)
        {
            System.out.print("Enter price in Riyal: ");
           R = Scanner.nextDouble();
           
           P = R/3.75;
           System.out.println(R+ " Riyal is "+P+" Dollar");
           
        }else 
        {
            System.out.println("Not a choice.");
        }
        
      }while(c != 0);  
    }
}
