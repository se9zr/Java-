import java.util.Scanner;

public class MethodsTest 
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
        //calling Maximum method 
        System.out.println("Maximum: "+Maximum(numbers));
        //calling Minimum method 
        System.out.println("Minimum: "+Minimum(numbers));
        //calling Sum method 
        System.out.println("Sum: "+Sum(numbers));
        //calling Mean method 
        System.out.println("Mean: "+Mean(numbers));
        
        
    }
    
    //Creating double method max double from an array
    public static double Maximum(double [] numbers )
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
    
   
     //Creating double method to return Minimum double from an array
    public static double Minimum(double [] numbers )
    {
        
        double low = numbers[0];
        
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i]<low)
            {
                low = numbers[i];
            }
        }
        
        return low;
    }

    //Creating double method return the sum of elements in array
    public static double Sum(double [] numbers )
    {
        double sum =0;
        
        for(int i=0; i<numbers.length; i++)
        {
            sum+=numbers[i];
        }
       
        return sum;
    }
    
    //Creating double method returns mean of elements in array
    public static double Mean(double [] numbers )
    {
        double sum =0;
        
        for(int i=0; i<numbers.length; i++)
        {
            sum+=numbers[i];
        }
        double mean = sum/numbers.length;
       
        return mean;
    }
    
}

