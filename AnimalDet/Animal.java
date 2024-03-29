package AnimalDet;
public class Animal
{
    
    private String movement = "none";
    private boolean alive = false;
    
    //Constructor methods 
    public Animal()
    {  
    }
    public Animal(String movement, boolean alive)
    {
        this.movement = movement;
        this.alive = alive;
    }
    
    //setter method
    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }
    //getter method
    public boolean isAllive()
    {
        return alive;
    }
    //getter method 
    public String getMovement()
    {
        return movement;
    }
    //setter method
    public void setMovement(String movement)
    {
        this.movement = movement;
    }
    
}
