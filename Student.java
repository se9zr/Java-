package StudentAddress;
public class Student
{
    private String name;
    private Address address;
    
    public Student()
    {
        
    }
    public Student(Address address , String name)
    {
       this.name = name;
       this.address = address; 
    }
    public Address getAddress()
    {
        return address;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
