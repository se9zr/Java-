package StudentAddress;
public class PrintSI 
{
    public static void main(String args[])
    {
        Address a1 = new Address("King Fasil","Abha","Asir",24432);
        Student s1 = new Student(a1,"Ahmed");
        Address a2 = new Address("King Abdullah","Jeddah","Meccah",23422);
        Student s2 = new Student(a2,"Ali");
        
        System.out.println("Student info: \n"
                + "Name: "+s1.getName()+"\n"
                        + "Street: "+s1.getAddress().getStreet()+"\n"
                                + "City: "+s1.getAddress().getCity()+"\n"
                                        + "Zip Code: "+s1.getAddress().getZipCode());
    }
}
