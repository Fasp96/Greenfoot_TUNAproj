import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Saxophone extends Instrument
{
    // Definition of variables
    private GreenfootImage imageSaxophone; // Image of the instrument
    
    /**
     * Constructor for objects of class Saxophone
     */
    public Saxophone()
    {
       imageSaxophone = new GreenfootImage("saxophone.png");
       setImage(imageSaxophone); 
    }
    
}
