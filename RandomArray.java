
public class RandomArray 
{
    public static void main(String args [])
    {
        int random [][] = new int [5][5];
        
        //show to user the random Array
        for(int i = 0; i<random.length; i++)
        {
            for(int j = 0; j<random[i].length; j++)
            {
                random[i][j] = (int)(Math.random()*10);
                System.out.print(random[i][j]+" ");
            }
            System.out.println();
        }
        
        //Sum Array
        int sum = 0;
        for(int i = 0; i<random.length; i++)
        {
            for(int j = 0; j<random[i].length; j++)
            {
                sum += random[i][j];
                        
            }
        }
        System.out.println("\nsum of array is "+sum);
        System.out.println();
        //sum of each row 
        for(int i = 0; i<random.length; i++)
        {
            int rowsum = 0;
            for(int j = 0; j<random[i].length; j++)
            {
                rowsum += random[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" is "+rowsum);
        }
        
    }
}
