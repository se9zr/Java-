
import java.util.Scanner; 
public class NestedLoop 
{
    public static void main(String args [])
    {
        
        Scanner Scanner = new Scanner(System.in);
        
        int cols;
        int row; 
        String symbol = "";
        
        //take a number of columns from the user
        System.out.print("Enter number of Colunms: ");
        cols = Scanner.nextInt();
        
        //take a number of rows from user 
        System.out.print("Enter number of Rows: ");
        row = Scanner.nextInt();
        
        //take a symbol from user to repreasent the 2D array
        System.out.print("Enter a symbol: ");
        symbol = Scanner.next();
        
        //Starting nested for loop
        
        for(int i=1; i<=cols; i++)
        {
            for(int j=1; j<=row; j++)
            {
                System.out.print(symbol + "");
            }
            System.out.println();
        }
        
        
        
        
    }
}
