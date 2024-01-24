import java.util.Scanner;
 
    public class Taxes 
    {
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter the price: ");
            
            double OriginalPrice = input.nextDouble();
            
            double TaxValue = 0.15;
            
            double PriceWithTax = (OriginalPrice * TaxValue ) + OriginalPrice; 
            
            System.out.println("Original Price of The Product : "+OriginalPrice);
            System.out.println("Price With Tax Added : "+ PriceWithTax);
        }
    }