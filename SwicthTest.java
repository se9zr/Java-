import java.util.Scanner;
public class SwitchTest
{
    public static void main(String args[])
    {
        Scanner Scanner = new Scanner(System.in);
        int choice;
        
        do 
        {
            System.out.print("Enter a number beteen 1 - 7 (0 to exit) : ");
            choice = Scanner.nextInt();
            
           if(choice == 0) 
           {
               System.out.println("Exit program.");
               break;
           }
           
           switch(choice)
           {
               case 1:
                   System.out.println("ألاحد");
                   break;
               case 2:
                   System.out.println("الأثنين");
                   break;
               case 3: 
                   System.out.println("الثلاثاء");
                   break;
               case 4:
                   System.out.println("ألاربعاء");
                   break;
               case 5:
                   System.out.println("الخميس");
                   break;
               case 6:
                   System.out.println("الجمعة");
                   break;
               case 7:
                   System.out.println("السبت");
                   break;
               default:
                   System.out.println("Invalid Chice");
                   
           }
        }while(choice!=0);
       
    }
}
