package StudentAddress;
public class PrintSI 
{
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
}
