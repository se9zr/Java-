package AnimalDet;
public class Fish extends Animal
{
    private String type = "none";
    private double depth = 5;
    private double weight = 3;
    
    //Constructors methods 
    public Fish()
    {
        super();
    }
    
    public Fish(String type, double depth , double weight, String movement, boolean alive)
    {
        super();
        this.type = type;
        this.depth = depth;
        this.weight = weight;
        setMovement(movement);
        setAlive(alive);
    }
    
    //Setter methods 
    public void setType(String type)
    {
        this.type = type;
    }
    
    public void setDepth(double depth)
    {
        this.depth = depth;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    //Getter methods 
    public String getType()
    {
        return type;
    }
    
    public double getDepth()
    {
        return depth;
    }
    
    public double getWeight()
    {
        return weight;
    }
 
}
