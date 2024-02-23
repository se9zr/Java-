
public class Star 
{
    public static void main(String args[])
    {
        
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
