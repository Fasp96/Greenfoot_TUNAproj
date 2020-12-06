import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Brick extends Wall
{
    // Definition of variables
    private GreenfootImage imageBrick; // Image of the brick
    
    /**
     * Constructor for objects of class Brick
     */
    public Brick()
    {
       imageBrick = new GreenfootImage("brick.jpg");
       setImage(imageBrick); 
    }
    
}
