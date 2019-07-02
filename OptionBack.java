import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OptionBack extends Option
{
    // Definition of variables
    private GreenfootImage optionBack;
    
    /**
     * Constructor for objects of class Option1.
     */
    public OptionBack()
    {
        optionBack = new GreenfootImage("retornar.png");
        setImage(optionBack);
    }
    
    public void act() 
    {
        super.detectMouse(); /// Superclass method that detects mouse movement over an object
        detectMouse();
    }
    
    /**
     * A method that detects if a mouse click has been made on an object, and creates the Menu world, if it has occurred
     */
    public void detectMouse()
    {
        if(Greenfoot.mouseClicked(this)) //caso haja clique no objeto
        {
            Greenfoot.setWorld(new Menu()); //criação do mundo Menu
        }
    }
}
