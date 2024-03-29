//Dog(String smellSense , String behavior,String movement,boolean alive)
//Fish(String type, double depth , double weight, String movement, boolean alive)
//Animal(String movement, boolean alive)
package AnimalDet;
public class Zoo 
{
    public static void main(String args[])
    {   //Dogs 
        Dog Lucy = new Dog("Weak","aggressive","three legs",false);
        Dog max = new Dog("Strong","Friendly","four legs",true);
        
        //Fish
        Fish nemo = new Fish("Tuna",500,49,"Horizontal Migration",true);
        Fish splash = new Fish("Salmon",5,0.900,"Feeding Migration",true);
      
        System.out.println("Dogs: ");
        System.out.println("[Max] has a ["+max.getSmellSense()+"] smell sense"
                + "\nand its behavior is ["+max.getBehavior()+
                "] he has ["+ max.getMovement()+"] and he is alive: "+max.isAllive());
        System.out.println();
        System.out.println("[Lucy] has a ["+Lucy.getSmellSense()+"] smell sense"
                + "\nand its behavior is ["+Lucy.getBehavior()+
                "] she has ["+ Lucy.getMovement()+"] and she is alive: "+Lucy.isAllive());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Fish: ");
        System.out.println("[nemo] is a ["+nemo.getType()
                +"] type it lives in depth ["+nemo.getDepth()+"m] "+"\nits movement"
                + " is ["+nemo.getMovement()+"] and it is alive: "+nemo.isAllive());
        System.out.println();
        System.out.println("[splash] is a ["+splash.getType()+
                "] type it lives in depth ["+splash.getDepth()+"m] "+"\nits movement"
                + " is ["+splash.getMovement()+"] and it is alive: "+splash.isAllive());
        
        
        
    }
    
    
}
