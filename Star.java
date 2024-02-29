
public class Star 
{
    public static void main(String args[])
    {
        /*lets say outer loop is in 3 the outer loop will enter the inner loop,
        the inner loop will excute as long as j is less then three in a simple way
        the statement will be excuted 3 times and exit, and return to the outer loop which 
        is now 4 and do that as long as i is less than 9 and so on*/ 
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print((char)('a'+Math.random()*('z'-'a')));
                
            }
            System.out.println();
        }
        for(int i=0; i<9; i++)
        {
            for(int j=9; j>i; j--)
            {        
               System.out.print((char)('a'+Math.random()*('z'-'a')));
            }
            System.out.println();
        }
            
        
    }
}
