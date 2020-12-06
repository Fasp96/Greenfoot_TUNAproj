import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Reitor extends Enemy
{
    // Definition of variables
    private GreenfootImage image1, image2; // Two images for Player1 to simulate motion
    private final int DELTA= 6; // Displacement of Player1 in each iteration
    
    /**
     * Constructor for objects of class Reitor
     */
    public Reitor()
    {
        // Assigning images
        image1 = new GreenfootImage("prof.png");
        image2 = new GreenfootImage("prof_move.png");
        setImage(image1);
    }
    
    public void act() 
    {
        go();
        checkRightObstacle();
        checkLeftObstacle();
        checkUpObstacle();
        checkDownObstacle();
        lookForPlayer1();
        lookForPlayer2();
    } 
}
