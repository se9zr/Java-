package AnimalDet;
public class Dog extends Animal
{
    private String smellSense = "none";
    private String behavior = "none";
    
    //Constructors methods 
    public Dog()
    {
        
    }
    public Dog(String smellSense , String behavior,String movement,boolean alive)
    {
        this.behavior = behavior;
        this.smellSense = smellSense;
       
        setMovement(movement);
        setAlive(alive);
    }
    public Dog(String behavior)
    {
        this.behavior = behavior;
    }
    public Dog(boolean alive)
    {
        setAlive(alive);
    }
    public Dog(String smellSense , String behavior)
    {
        this.behavior = behavior;
        this.smellSense = smellSense;
    }
    
    //Getter methods 
    public String getSmellSense()
    {
        return smellSense;
    }
    public String getBehavior()
    {
        return behavior;
    }
    
    //Setter methods 
    public void setSmellSense(String smellSense)
    {
        this.smellSense = smellSense;
    }
    public void setBehavior(String behavior)
    {
        this.behavior = behavior;
    }
    
}
