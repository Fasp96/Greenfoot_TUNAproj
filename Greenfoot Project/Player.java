import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Player extends Actor
{
    // Definition of variables   
     private final int BETA = 3; // Variable that defines the player's distance from the wall
              
    /**
     * Boolean method that allows you to check for an obstacle when you move to the right
     */
    public boolean checkRightObstacle() 
    {
        int jogadorWidth= getImage().getWidth(); // Width of the player
        int xDistance=(int)(jogadorWidth/2); // xDistance is half the width of the object (to know the distance to the center and x is positive because it is approaching from the right)
        
        Actor obstacle = getOneObjectAtOffset(xDistance, 0, Obstacle.class); // Returns the object of the Obstacle.class category that is at a distance from the player

        if(obstacle == null) // If it does not return false
        {
            return false;
        }
        else//caso contrário
        {
            stopByRightObstacle(obstacle); // Executes this method and returns true
            return true;
        }            
    }
    
    /**
     * Boolean method that allows you to check for obstacle when moving left
     */
    public boolean checkLeftObstacle()
    {
        int jogadorWidth= getImage().getWidth();
        int xDistance=(int)(jogadorWidth/-2);
        
        Actor obstacle = getOneObjectAtOffset(xDistance, 0, Obstacle.class);

        if(obstacle== null)
        {
            return false;
        }
        else
        {
            stopByLeftObstacle(obstacle);
            return true;
        }
    }
    
    /**
     * Boolean method that allows you to check for obstacle when moving up
     */
    public boolean checkUpObstacle()
    {
        int jogadorHeight= getImage().getHeight();
        int yDistance=(int)(jogadorHeight/-2);
        
        Actor obstacle = getOneObjectAtOffset(0, yDistance, Obstacle.class);
     
        if(obstacle == null)
        {
            return false;
        }
        else
        {
            stopByUpObstacle(obstacle);
            return true;
        }        
    }        
    
    /**
     * Boolean method that lets you check for an obstacle when you move down
     */
    public boolean checkDownObstacle()
    {
        int jogadorHeight= getImage().getHeight();
        int yDistance=(int)(jogadorHeight/2);
        
        Actor obstacle = getOneObjectAtOffset(0, yDistance, Obstacle.class);
  
        
        if(obstacle == null)
        {
            return false;
        }
        else
        {
            stopByDownObstacle(obstacle);
            return true;
        }
    }
    
    /**
     * Boolean method that allows you to check if there is a player when you move to the right
     */
    public boolean checkRightPlayer() // Boolean method allows checking each act if there is a player and returns true if found...
    {
        int jogadorWidth= getImage().getWidth(); // Width of the player
        int xDistance=(int)(jogadorWidth/2); // xDistance is half the width of the object (to know the distance to the center and x is positive because it is approaching from the right)
        
        Actor player = getOneObjectAtOffset(xDistance, 0, Player.class); // Returns the object of the category Played.class that is at the distance of the player
        
        if(player == null) // If it does not return false
        {
            return false;
        }
        else // Otherwise
        {
            stopByRightObstacle(player); // Executes this method and returns true
            return true;
        }
    }
    
    /**
     * Boolean method that lets you check for obstacle when moving left
     */
    public boolean checkLeftPlayer()
    {
        int jogadorWidth= getImage().getWidth();
        int xDistance=(int)(jogadorWidth/-2);
        
        Actor player = getOneObjectAtOffset(xDistance, 0, Player.class);
        
        if(player== null)
        {
            return false;
        }
        else
        {
            stopByLeftObstacle(player);
            return true;
        }
    }
        
    /**
     * Boolean method that allows you to check for obstacle when moving up
     */
    public boolean checkUpPlayer()
    {
        int jogadorHeight= getImage().getHeight();
        int yDistance=(int)(jogadorHeight/-2);
        
        Actor player = getOneObjectAtOffset(0, yDistance, Player.class);
                
        if(player == null)
        {
            return false;
        }
        else
        {
            stopByUpObstacle(player);
            return true;
        }        
    }
      
    /**
     * Boolean method that lets you check for an obstacle when you move down
     */
    public boolean checkDownPlayer()
    {
        int jogadorHeight= getImage().getHeight();
        int yDistance=(int)(jogadorHeight/2);
        
        Actor player = getOneObjectAtOffset(0, yDistance, Player.class);
        
        if(player == null)
        {
            return false;
        }
        else
        {
            stopByDownObstacle(player);
            return true;
        }
    }
    
    ///////////////////////////////////////////////////Methods for ricoche of players on objects/////////////////////////////////////////////////
    
    /**
     *  Method that stops the player from finding an object on the right
     */
    public void stopByRightObstacle(Actor Obstacle) // Method that causes the player to stop when he encounters the obstacle
    {
        int obstacleWidth = Obstacle.getImage().getWidth(); // object width
        int newX = Obstacle.getX()-(obstacleWidth + getImage().getWidth())/2; // the player's new x is the position of the current object - (width + half the width of the player)
        setLocation(newX - BETA ,getY()); // the new position of the player 
    }  
    
     /**
     * Method that causes the player to stop when it finds an object of class Obstacle on the left
     */
    public void stopByLeftObstacle(Actor Obstacle)
    {
        int obstacleWidth = Obstacle.getImage().getWidth();
        int newX = Obstacle.getX()+(obstacleWidth + getImage().getWidth())/2;
        setLocation(newX + BETA ,getY());
    }
    
     /**
     * Method that causes the player to stop when it finds an object of class Obstacle up
     */
    public void stopByUpObstacle(Actor Obstacle)
    {
        int obstacleHeight = Obstacle.getImage().getHeight();
        int newY = Obstacle.getY()+(obstacleHeight + getImage().getHeight())/2;
        setLocation(getX(), newY+ BETA);
    }
    
    /**
     * Method that causes the player to stop when it finds an object of class Obstacle down
     */
    public void stopByDownObstacle(Actor Obstacle)
    {
        int obstacleHeight = Obstacle.getImage().getHeight();
        int newY = Obstacle.getY()-(obstacleHeight + getImage().getHeight())/2;
        setLocation(getX(), newY - BETA );
    }
}
