import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Option2 extends Option
{
    // Definition of variables
    private GreenfootImage option2;
    
    /**
     * Constructor for objects of class Option1.
     */
    public Option2()
    {
        option2 = new GreenfootImage("lab2.png");
        setImage(option2);
    }
    
    public void act() 
    {
        super.detectMouse(); // Superclass method that detects mouse movement over an object
        detectMouse();
    }
    
    /**
     * A method that detects if a mouse click has been made on an object, and creates the Maze2 world, if it has occurred
     */
    public void detectMouse()
    {
        if(Greenfoot.mouseClicked(this)) // If click object
        {
            Greenfoot.setWorld(new Maze2()); // Creation of the world Maze2 
        }
    }
}
