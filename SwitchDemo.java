import java.util.Scanner;
  
  public class SwitchDemo 
  {
    public static void main(String [] args)
    {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a year : ");
      int year = input.nextInt();
      
      System.out.println(year % 12);
      
      switch (year % 12)
      {
        case 0 : System.out.println("Dog"); break; 
        case 1 : System.out.println("Sheep"); break; 
        case 2 : System.out.println("Snake"); break; 
        case 3 : System.out.println("Turtle"); break; 
        case 4 : System.out.println("Elephent"); break; 
        case 5 : System.out.println("Horse"); break; 
        case 6 : System.out.println("Tiger"); break; 
        case 7 : System.out.println("Lion"); break; 
        case 8 : System.out.println("Monkey"); break; 
        case 9 : System.out.println("Cat"); break; 
        case 10 : System.out.println("Fox"); break; 
        case 11 : System.out.println("Rabbit"); break; 

      }
      
      
    }
  }