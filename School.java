
    public class School 
    {
        public static void main(String [] args) throws java.io.IOException
      {
        java.io.File file = new java.io.File("Students.txt");
        
        if(file.exists())
        {
            System.out.println("File already exists. ");
            System.exit(1);
        }
        
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        output.println("Malik ");
        output.print("age: ");
        output.println(17);
        output.print("Mathmatics ");
        output.println(90);
        output.print("History ");
        output.println(89);
        output.print("English ");
        output.print(92);
        
        output.close();
        
        
        
        java.io.File file2 = new java.io.File("Subjects.txt");
        
         if(file2.exists())
        {
            System.out.println("File already exists. ");
            System.exit(1);
        }
        
        java.io.PrintWriter output2 = new java.io.PrintWriter(file2);
        
        output2.print("Mathmatics ");
        output2.println("348 pages");
        output2.print("History ");
        output2.println("345 pages");
        output2.print("English ");
        output2.print("234 pages");
        
        output2.close();
      }
    } 
    
    
