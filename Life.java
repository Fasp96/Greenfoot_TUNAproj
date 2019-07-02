import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Life extends Actor
{
    // Definition of variables
    private GreenfootImage playerImage;// Image of the life
    
    /**
     * Constructor of the class Life that according to the parameter defines a certain image for the class
     */
    public Life(int player)
    {
       if(player == 1)
       {
           playerImage = new GreenfootImage("eleBear.png"); 
        }
       else if(player == 2)
       {
           playerImage = new GreenfootImage("elaOculos.png");
        }
        
       setImage(playerImage);
    }
}
