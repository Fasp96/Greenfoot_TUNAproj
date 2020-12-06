import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends Player
{
    // Definition of variables
    private final int DELTA = 5; // Displacement of Player1 on each iteration
    private GreenfootImage image1, image2; // Two images for Player1 to simulate motion
    private int beerPoint = 10; // Points of each Beer.class object
    private int boutlePoint = 5; // Points of each object BeerBoutle.class
    private int instrumentPoint = 20; // Points of each object Instruments.class
    private int violin, tambourine, mandolin ,conga ,saxophone; // Store value 1 in the instrument if Player1 takes
    private boolean enemy; // Boolean so that only the first intercession is counted
    
    /**
     * Constructor for objects of class Player1
     */
    public Player1(){
        // Assigning images
        image1 = new GreenfootImage("eleBear.png");
        image2 = new GreenfootImage("eleBear_move.png");
        setImage(image1);        
    }
    
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        lookForPoints();
        lookForIntruments();
        lookForEnemy();
        checkRightObstacle();
        checkLeftObstacle();
        checkUpObstacle();
        checkDownObstacle();
        checkRightPlayer();
        checkLeftPlayer();
        checkUpPlayer();
        checkDownPlayer();
    }   
    
    /**
     * Method that defines the movement of Player 1 when a certain key is pressed
     */ 
    public void checkKeyPress()
    {
        if(getWorldOfType(Maze.class).getLivesPlayer1() != 0)
        {
            // Shift left
            if(Greenfoot.isKeyDown("a"))
            {
                setLocation(getX()- DELTA, getY());
                switchImage(); // Call this method
            }
            // Shift right
            if(Greenfoot.isKeyDown("d"))
            {
                setLocation(getX() + DELTA, getY());
                switchImage();
            }
            //Shift up
            if(Greenfoot.isKeyDown("w"))
            {
                setLocation(getX(), getY() - DELTA);
                switchImage();
            }
            //Shift down
            if(Greenfoot.isKeyDown("s"))
            {
                setLocation(getX(), getY() + DELTA);
                switchImage();
            }
        }
    }
    
    /**
     * Method to switch image
     */
    public void switchImage()
    {
        if (getImage() == image1)
            setImage(image2);
        else
            setImage(image1);
    }
       
    /**
     * Method that allows to eliminate the cases in case the player touches 
     * and adds the punctuation
     */        
    public void lookForPoints()
    {
        if(isTouching(Beer.class))
        {
            getWorldOfType(Maze.class).addPointsPlayer1(beerPoint); 
            removeTouching(Beer.class);
            Greenfoot.playSound("drink.wav");
        }
        if(isTouching(BeerBoutle.class))
        {
            getWorldOfType(Maze.class).addPointsPlayer1(boutlePoint); 
            removeTouching(BeerBoutle.class);
        }                
    }
    
    /**
     * Method that allows you to check if you have already picked up an instrument of a certain type, and if it does not, add
     * points at the rate of Player1 and eliminates the size of the instrument, the instrument on the side of the world, to inform the player.
     * Check if all objects are picked up if yes, adopt method changeStage () of Stage class.
     * Also executes the commands of class GameOver if the required ones are confirmed. 
     */       
    public void lookForIntruments()
    {        
        if(isTouching(Instrument.class))
        {
            getWorldOfType(Maze.class).addPointsPlayer1(instrumentPoint); // Add points to Player1's score
        }
        
        if(isTouching(Violin.class) && violin == 0) // If you are playing the violin instrument and have not yet
        {
            Maze world = getWorldOfType(Maze.class);
            removeTouching(Violin.class); // Remove this instrument
            world.addObject(new Violin(), 20,170); // Insert an instrument in this lateral position
            violin = 1; // The variable becomes 1
        }
        
        if(isTouching(Tambourine.class) && tambourine == 0) // If you are playing the tamborine instrument and have not yet
        {
            Maze world = getWorldOfType(Maze.class);
            removeTouching(Tambourine.class); 
            world.addObject(new Tambourine(),50,170);
            tambourine = 1;
        }
        
        if(isTouching(Mandolin.class) && mandolin == 0) 
        {         
             Maze world = getWorldOfType(Maze.class);
             removeTouching(Mandolin.class); 
             world.addObject(new Mandolin(),85,170);
             mandolin = 1;
        }
        
        if(isTouching(Conga.class) && conga == 0)
        {
            Maze world = getWorldOfType(Maze.class);
            removeTouching(Conga.class); 
            world.addObject(new Conga(),120,170);
            conga = 1;
        }
        
        if(isTouching(Saxophone.class) && saxophone == 0)
        {
         Maze world = getWorldOfType(Maze.class);
         removeTouching(Saxophone.class);
         world.addObject(new Saxophone(),150,170);
         saxophone = 1;
        }
        
        if(violin == 1 && tambourine == 1 && mandolin == 1 && conga == 1 && saxophone == 1) // If player1 has picked up all objects
        {
           (getWorldOfType(Maze.class).getObjects(Stage.class).get(0)).changeStage(); // call method in Stage class
           
           if(isTouching(Stage.class) && Greenfoot.isKeyDown("w") && getWorldOfType(Maze.class).getLivesPlayer2() != 0) // If you play on the stage in the positive direction (low up)
           { 
               Greenfoot.setWorld(new GameOver(getWorldOfType(Maze.class).getPontuacao1(), getWorldOfType(Maze.class).getPontuacao2()));               
           }
           else if(isTouching(Stage.class) && Greenfoot.isKeyDown("w"))
           {
               Greenfoot.setWorld(new GameOver("player2", getWorldOfType(Maze.class).getPontuacao1()));
           }
       }
    }
    
    /**
     * Method that checks if the Player is playing on an Enemy.class object and executes the livesPlayer1 () method 
     * of the Maze class if it is.
     */
    public void lookForEnemy()
    {                
        if(isTouching(Enemy.class) && getWorldOfType(Maze.class).getLivesPlayer1() > 1) // if is touching an Enemy.class with more that 1 life
        {
            if(enemy == false) // If touched an enemy is false
            {
                Greenfoot.playSound("au.wav");
                getWorldOfType(Maze.class).livesPlayer1();               
            }
            enemy = true; // Otherwise if it has already touched does not take life until the if is executed again
        }
        else if(isTouching(Enemy.class) && getWorldOfType(Maze.class).getLivesPlayer1() == 1) // If is touching and Enemy.class with one life
        {
            if(enemy == false) // If touched an Enemy
            {
                Greenfoot.playSound("au.wav");
                getWorldOfType(Maze.class).livesPlayer1();
                getWorldOfType(Maze.class).addObject(new Dead(), getX(), getY());
            }
            enemy = true; // Otherwise if it has already touched does not take life until the if is executed again
        }
        else
            enemy = false;// If did not touch any enemy return false
        }
}
