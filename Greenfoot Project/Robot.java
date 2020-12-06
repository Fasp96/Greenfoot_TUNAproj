import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Robot extends Enemy
{
    // Definition of variables
    private GreenfootImage image1, image2; // Two images for Player1 to simulate motion
    private final int DELTA= 6; // Displacement of Player1 in each iteration
    
    /**
     * Constructor for objects of class Robot
     */
    public Robot(){
       // Assigning images
        image1 = new GreenfootImage("robot.png");
        image2 = new GreenfootImage("robot_move.png");
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
