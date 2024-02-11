import java.util.Scanner;

public class ConvertKPAtoPSI 
{
    public static void main(String [] args )
    {
        Scanner input = new Scanner(System.in);
      
        //Take value in kpa from user
        System.out.println("Enter value in kPa: ");
      
        //Using ConvertKPA2PSI method to convert user input to psi 
        double k = input.nextDouble();
        
        double r = ConvertKPA2PSI(k);
        
        System.out.println(k+" kPa is "+r+" psi");
    }
    
    
    public static double ConvertKPA2PSI(double kPa)
    {
       final double D =  6.895;
       double psi;
       psi = kPa/D; 
       
       return psi;
       
    }
}
