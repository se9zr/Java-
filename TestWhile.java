import java.util.Scanner;

public class TestWhile 
{
    public static void main(String [] args )
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("***Welcom To Convert Machine***\n"
                + " 1.from kPa to psi\n"
                + " 2.from psi to Kpa\n"
                + " 0.exit\n"
                + " your choice: ");
        int c = input.nextInt();
        
        
        while (c!=0)
        {
           if (c==1)
           {
               System.out.println("Enter value in kPa: ");
               double k = input.nextDouble();
        
               double r = ConvertKPA2PSI(k);
        
               System.out.println(k+"kPa is "+r+" psi");
               System.exit(1);
              
           } else if (c==2) 
           
              {
                    System.out.println("Enter value in psi: ");
                    double psi = input.nextDouble();
        
                    double r = ConvertPSI2KPA(psi);
        
                    System.out.println(psi+" psi is "+r+" kPa");
                    System.exit(1);
              } else 
              
                {
                    System.out.println("Invalid input!");
                        
                }
                
                
           
        }     
        
        
    }
    
    
    public static double ConvertKPA2PSI(double kPa)
    {
       final double D =  6.895;
       double psi;
       psi = kPa/D; 
       
       return psi;
       
    }
    
    public static double ConvertPSI2KPA(double psi)
    {
       final double D =  6.895;
       double kPa;
       kPa = psi*D; 
       
       return kPa;
       
    }
}
