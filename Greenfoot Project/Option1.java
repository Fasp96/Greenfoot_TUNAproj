import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Option1 extends Option
{
    // Definition of variables
    private GreenfootImage option1;
    
    /**
     * // Definition of variables Option1.
     */
    public Option1()
    {
        option1 = new GreenfootImage("lab1.png");
        setImage(option1);
    }
    
    public void act() 
    {
        super.detectMouse(); // Superclass method that detects mouse movement over an object
        detectMouse();
    }
    
    /**
     * A method that detects if a mouse click has been made on an object, and creates the Maze1 world, if it has occurred
     */
    public void detectMouse()
    {
        if(Greenfoot.mouseClicked(this)) // If click object
        {
            Greenfoot.setWorld(new Maze1()); // Creation of the world Maze1
        }
    }
}
