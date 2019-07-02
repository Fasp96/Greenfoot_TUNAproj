import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stage extends Obstacle
{
    // Definition of variables
    private GreenfootImage image1, image2;
    
    /**
     * Constructor for objects of class Stage
     */
    public Stage()
    {
        // Assigning images
        image1 = new GreenfootImage("palco_fehado.png");
        image2 = new GreenfootImage("palco_luzes.png");
        setImage(image1);
    }
    
    /**
     * Method that changes the "conditions" of the stage, the image, reproduces sound and creates objects of class Robot
     */
    public void changeStage()
    {
        if(getImage() == image1)
        {
            setImage(image2);
            Greenfoot.playSound("taDa.wav"); 
            getWorldOfType(Maze.class).addRobot();
        }
    }   
}
