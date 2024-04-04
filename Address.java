package StudentAddress;
//class for Address
 public class Address 
{
    private String street;
    private String city;
    private String state;
    private int zipCode;
    
    public static void main(String args[])
    {
        Address a1 = new Address("King Fasil","Abha","Asir",2552);
        Student s1 = new Student(a1,"Ahmed");
        Address a2 = new Address("King Abdullah","Rabigh","Meccah",2552);
        Student s2 = new Student(a2,"Ali");
        
        System.out.println("Student info: \n"
                + "name: "+s1.getName()+"\n"
                        + "Street: "+s1.getAddress().getStreet()+"\n"
                                + "City: "+s1.getAddress().getCity()+"\n"
                                        + "zip Code: "+s1.getAddress().getZipCode());
    }
    
    public Address()
    {
        
    }
    public Address(String street ,String city ,String state, int zipCode)
    {
       this.street = street;
       this.city = city;
       this.state = state;
       this.zipCode = zipCode;
       
    }
    
    //Street setter & getter
    public void setStreet(String street)
    {
        this.street = street;
    }
    
    public String getStreet()
    {
        return street;
    }
    //City setter & getter 
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getCity()
    {
        return city;
    }
    //State setter & getter 
    public void setState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }
    //zipCode setter & getter 
    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }
    public int getZipCode()
    {
        return zipCode;
    }
    
}
