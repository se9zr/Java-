//Two dimonsinal simple game 

class Player
{
    String name;
    String feature;
    int number;
    int score;
    
    //Constructor Method
    public Player(String name, String feature, int score)
    {
        this.name = name;
        this.feature = feature;
        this.score = score;
        
    }
    //Move up method 
    public void moveUp()
    {
        System.out.println(name + " is moving up");
    }
    //Move down method
    public void moveDown()
    {
        System.out.println(name + " is moving down");
    }
    //Move right method
    public void moveRight()
    {
        System.out.println(name + " is moving right");
    }
    //Move left method
    public void moveLeft()
    {
        System.out.println(name + " is moving left");
    }
    //Fight method
    public void fight()
    {
        System.out.println(name+ " started the fight!");
    }
    //Feature activiting method 
    public void featureActivite()
    {
        System.out.println(name +" is activiting the "+feature);
    }
    //Win method
    public void win()
    {
        System.out.println(name+" Won the fight!");
    }
    //Lose method
    public void lose()
    {
        System.out.println(name+" Loses the fight");
    }
    //Score method
    public void score ()
    {
        score+=1;
    }
    //Display method
    public void disply()
    {
        System.out.println(name + " score is "+score);
    }
   
    //Main method
    public static void main(String args[])
    {
        //Creating player 
        Player Omar = new Player("Omar","Fire",0);
        Player Ahmed = new Player("Ahmed","Water",0);
        Player noor = new Player("Noor","Speed",0);
        
        //invoking methods
        Omar.moveUp();
        Ahmed.moveDown();
        Omar.fight();
        Ahmed.featureActivite();
        Omar.featureActivite();
        Omar.moveLeft();
        Ahmed.moveRight();
        Omar.win();
        Ahmed.lose();
        Omar.score();
        Omar.disply();
        Ahmed.disply();
        noor.disply();
        
        
    }//end main method
}
