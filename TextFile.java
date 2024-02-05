
public class TextFile
{
    public static void main(String [] args) throws Exception
    {
        
        
        java.io.File file = new java.io.File("TextFile.txt");
        if(file.exists())
        {
          System.out.println("File already exists");
          System.exit(1);
          //Creat a File
          java.io.PrintWriter output = new java.io.PrintWriter(file);
          
          output.print("Sun is larger than moon?");
          output.println("True");
          output.print("Earth is smaller than moon?");
          output.print("False");
          
          output.close();
        }
        
        
        
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        System.out.println("Does it exist? "+ file.exists());
        System.out.println("The file has "+ file.length()+" bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written "+file.canWrite());
        System.out.println("Is it a directory? "+file.isDirectory());
        System.out.println("Is it a file? "+ file.isFile());
        System.out.println("Is it absolute? "+file.isAbsolute());
        System.out.println("Is it hidden? "+file.isHidden());
        System.out.println("Absolute path is "+ file.getAbsolutePath());
        System.out.println("Last modified on "+ new java.util.Date(file.lastModified()));
    }
}
