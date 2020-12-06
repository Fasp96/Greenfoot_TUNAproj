import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Violin extends Instrument
{
    // Definition of variables
    private GreenfootImage imageViolin; // Image of the instrument
    
    /**
     * Constructor for objects of class Violin
     */
    public Violin()
    {
       imageViolin = new GreenfootImage("violin.png");
       setImage(imageViolin); 
    }
    
}
