import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    // Declaration of variables   
    private String direction = null; // Variable string that holds the direction the object moves
    private boolean touchedPlayer1, touchedPlayer2; // Boolean so that only the first intercession is counted
    private final int DELTA= 6; // Displacement of Enemy in each iteration
    private final int POINTS = -100; // Points taken when playing a player object
    
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
    
    /**
     * A method that defines and executes the initial movement in a random fashion and which in 
     * turn executes the move method according to the direction it is assigned 
     */
    public void go() 
    { 
        int randNum = Greenfoot.getRandomNumber(4); // Makes random from 4 to possible directions
        if(direction != null) { // If direction is moved
            move(direction);
        } else { // Otherwise randomly chooses one direction
            direction = setDir(randNum);
        }
    }
    
    /**
     * Method that takes an integer number and returns a string with the movement 
     * associated with that number
     */
    public String setDir(int randNum) 
    {
        String direction = "";
        if (randNum == 0) {
            direction = "left";
        } else if (randNum == 1) {
            direction = "right";
        } else if (randNum == 2) {
            direction = "up";
        } else{
            direction = "down";
        }
        return direction;
    }
    
    /**
     * Method that receives a string with the direction of the movement and makes a setLocation in 
     * the intended sense
     */
    public void move(String direction) 
    {
        if(direction == "right") {
            setLocation(getX()+DELTA,getY());
        }
        if(direction == "left") {
            setLocation(getX()-DELTA,getY());
        }
        if(direction == "up") {
            setLocation(getX(),getY()-DELTA);
        }
        if(direction == "down") {
            setLocation(getX(),getY()+DELTA);
        }
    }   
             
        
    /**
     * Boolean method that allows you to check for an obstacle when you move to the right 
     */
    public boolean checkRightObstacle() // The boolean method allows checking each act if there is a wall or stage and returns true in case of finding
    {
        int jogadorWidth= getImage().getWidth(); // width of the enemy
        int xDistance=(int)(jogadorWidth/2); // xDistance is half the width of the object (to know the distance to the center and x is positive because it is approaching from the right)
        int randNum = Greenfoot.getRandomNumber(4);
        Actor Obstacle = getOneObjectAtOffset(xDistance, 0, Obstacle.class); // Returns the object of the category Obstacle.class which is at a distance from the gamer
        
        if(Obstacle == null) // If there is no obstacle returns false
        {
            return false;
        }
        else //otherwise
        {
            stopByRightObstacle(Obstacle);
            direction = setDir(randNum);
            return true;
        }
    }    

    
    /**
     *  Method that causes the player to stop when it finds an object of class Obstacle to the right
     */
    public void stopByRightObstacle(Actor Obstacle) // Method that stops the player when he finds a wall or shrub
    {
        int obstacleWidth = Obstacle.getImage().getWidth(); // Object width
        int newX = Obstacle.getX()-(obstacleWidth + getImage().getWidth())/2; // The player's new x is the position of the current object - (width + half the width of the player)
        setLocation(newX,getY()); // The new position of the player 
    }
    

    /**
     * Boolean method that allows you to check for obstacle when moving left
     */
    public boolean checkLeftObstacle()
    {
        int jogadorWidth= getImage().getWidth();
        int xDistance=(int)(jogadorWidth/-2);
        int randNum = Greenfoot.getRandomNumber(4);
        Actor Obstacle = getOneObjectAtOffset(xDistance, 0, Obstacle.class);
        
        if(Obstacle== null)
        {
            return false;
        }
        else
        {
            stopByLeftObstacle(Obstacle);
            direction = setDir(randNum);
            return true;
        }
    }
    
    
    /**
     *  Method that causes the player to stop when it finds an object of class Obstacle on the left
     */
    public void stopByLeftObstacle(Actor Obstacle)
    {
        int obstacleWidth = Obstacle.getImage().getWidth();
        int newX = Obstacle.getX()+(obstacleWidth + getImage().getWidth())/2;
        setLocation(newX,getY());
    }
    
    
    /**
     * Boolean method that allows you to check for obstacle when moving up
     */
    public boolean checkUpObstacle()
    {
        int jogadorHeight= getImage().getHeight();
        int yDistance=(int)(jogadorHeight/-2);
        int randNum = Greenfoot.getRandomNumber(4);
        Actor Obstacle = getOneObjectAtOffset(0, yDistance, Obstacle.class);
                
        if(Obstacle == null)
        {
            return false;
        }
        else
        {
            stopByUpObstacle(Obstacle);
            direction = setDir(randNum);
            return true;
        }        
    }
    
    /**
     *  Method that causes the player to stop when it finds an object of class Obstacle up
     */
    public void stopByUpObstacle(Actor Obstacle)
    {
        int obstacleHeight = Obstacle.getImage().getHeight();
        int newY = Obstacle.getY()+(obstacleHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    
    
    /**
     * Boolean method that lets you check for an obstacle when you move down
     */
    public boolean checkDownObstacle()
    {
        int jogadorHeight= getImage().getHeight();
        int yDistance=(int)(jogadorHeight/2);
        int randNum = Greenfoot.getRandomNumber(4);
        Actor Obstacle = getOneObjectAtOffset(0, yDistance, Obstacle.class);
        
        if(Obstacle == null)
        {
            return false;
        }
        else
        {
            stopByDownObstacle(Obstacle);
            direction = setDir(randNum);
            return true;
        }
    }
    
    /**
     *  Method that causes the player to stop when it finds an object of class Obstacle to down
     */
    public void stopByDownObstacle(Actor Obstacle)
    {
        int obstacleHeight = Obstacle.getImage().getHeight();
        int newY = Obstacle.getY()-(obstacleHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    
    /**
     * A method that defines what happens when it intersects with an object of class Player1
     */
    public void lookForPlayer1()
    {                
        if(isTouching(Player1.class)) // If is touching Player 1
        {
            if(touchedPlayer1 == false) // If touched player1 for false 
            {
            getWorldOfType(Maze.class).addPointsPlayer1(POINTS); // Take points
            }
            touchedPlayer1 = true; // Otherwise if it has already touched, do not take points until the if is executed again
        }
        else
            touchedPlayer1 = false; // If he did not touched any player return false        
        }
  
    /**
     * A method that defines what happens when it intersects with an object of class Player2
     */
    
    public void lookForPlayer2()
    {
        if(isTouching(Player2.class)) // If is touching Player 2
        {
            if(touchedPlayer2 == false) // If touched player2 for false  
            {
                getWorldOfType(Maze.class).addPointsPlayer2(POINTS); // Take points
            }
            touchedPlayer2 = true; // Otherwise if it has already touched, do not take points until the if is executed again
        }
        else
            touchedPlayer2 = false;// If he did not touched any player return false
    }
}
