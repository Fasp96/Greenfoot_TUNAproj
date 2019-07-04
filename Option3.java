import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Option3 extends Option
{
    // Definition of variables
    private GreenfootImage option3;
    
    /**
     * Constructor for objects of class Option1.
     */
    public Option3()
    {
        option3 = new GreenfootImage("lab3.png");
        setImage(option3);
    }
    
    public void act() 
    {
        super.detectMouse(); // Superclass method that detects mouse movement over an object
        detectMouse();
    }
    
    /**
     * A method that detects if a mouse click has been made on an object, and creates the Maze3 world, if it has occurred.
     */
    public void detectMouse()
    {
        if(Greenfoot.mouseClicked(this)) // If click object
        {
            Greenfoot.setWorld(new Maze3()); // Creation of the world Maze3 
        }
    }
}
