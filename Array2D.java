public class Array2D 
{
    public static void main(String args [])
    {
        int [][] Array = 
        {
            {8,2,3,8,9,4},
            {3,2,5,7,9,1},
            {3,4,2,1,6,7}
        };
        
        for(int i = 0; i<Array.length; i++)
        {
            for(int j=0; j<Array[i].length; j++)
            {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
