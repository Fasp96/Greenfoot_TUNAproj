import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
   // Declaration of instance variables
    private GreenfootImage background;
    
    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {    
        // Create a world with 1300x846 cells with a size of 1x1 pixels.
        super(1300, 846, 1);
        buildMenu();
        background = new GreenfootImage("menu.png");
        setBackground(background); // Statement for the world background
    }
        
    /**
    * Method that creates and positions the menu objects
    */
    private void buildMenu()
    {
        // Creating the options for the different mazes      
        Option option1 = new Option1();
        addObject(option1, 919, 236);
        
        Option option2 = new Option2();
        addObject(option2, 919, 345);
        
        Option option3 = new Option3();
        addObject(option3, 919, 462);
    }
}
