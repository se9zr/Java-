import java.util.Scanner;

public class findLargest 
{
    public static void main(String args[])
    {
        Scanner Scanner = new Scanner(System.in);
        //Creating array of double inputs
        double [] numbers = new double[10];
        //Starting loop to get 10 doubles from user
        for(int i = 0; i<numbers.length; i++)
        {
            System.out.println("Enter number "+(1+i)+" : ");
            numbers[i] = Scanner.nextDouble();
            
        }
        //calling method 
        System.out.println("Largest number in Array is "+Largest(numbers));
        
    }
    
    
    
    //Creating double method returns max 
    public static double Largest(double [] numbers )
    {
        
        double max = numbers[0];
        
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i]>max)
            {
                max = numbers[i];
            }
        }
        
        return max;
    }
}
