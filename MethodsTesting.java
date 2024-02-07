import java.util.Scanner;

public class MethodsTesting 
    {
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            
            
            System.out.println("the sum from : ");
            
            int i = input.nextInt();
            System.out.println("to : ");
            int j = input.nextInt();
            
            
        
            int k = sum(i,j);
            
            if(j>50)
             {
            System.out.println(" TO MUCH RUN AGAIN ");
            System.exit(1);
            
             }
            System.out.println("sum from "+i+" to "+ j +" is "+k);
        }
        
        
        
        public static int sum(int i1, int i2)
        {
            int sum = 0;
            
            for(int i=i1; i<=i2; i++)
            {
               sum +=i;
            }
            return sum;
        }
    }