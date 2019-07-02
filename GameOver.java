import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    // Definition of variables
    private int score1, score2, score;
    private GreenfootImage background, text1, text2, text3;
    private String player1, player2, bothPlayers;
    
    /**
     * The GameOver world has two different constructors, so that it is possible to create two different worlds depending on 
     * the situation.
     */
    /**
     * Constructor used, after the Maze worlds, when it is necessary to display the scores of the players, which player came 
     * to the stage and who won the game.
     */
    public GameOver(int score1, int score2)
    {    
        // Create a world with 1300x846 cells with a size of 1x1 pixels.
        super(1300, 846, 1);
        
        this.score1 = score1;
        this.score2 = score2;
        
        Greenfoot.playSound("cheer.wav"); 
        addObject(new OptionBack(), getWidth()/2, getHeight()-getHeight()/5); // Sound reproduction of applause
        buildGameOver();
    }
    
    /**
     * Constructor used when, after the Maze worlds, both players lose all three lives and displays a gameover 
     * message.
     */
    public GameOver(String lost, int score)
    {
        // Create a world with 1300x846 cells with a size of 1x1 pixels. 
        super(1300, 846, 1);
        
        this.score = score;
        buildGameOver(lost);
        addObject(new OptionBack(), getWidth()/2, getHeight()-getHeight()/5); // Creation of an option
    }
    
    /**
     * Method used in conjunction with the GameOver counter (int score1, int score2), which compares the scores of both players 
     * in order to return the winners' information.
     */
    public void buildGameOver()
    {
        background = new GreenfootImage("azul.png");
        
        // Greenfoot image with message of the scores
        text2 = new GreenfootImage("Player 1\nScore: " + score1, 50, Color.BLACK, Color.WHITE);
        text3 = new GreenfootImage("Player 2\nScore: " + score2, 50, Color.BLACK, Color.WHITE);
        
        // Greenfoot Image Creation with Winner Message 
        if(score1 > score2)
        {
            text1 = new GreenfootImage("Player 1 ganhou!!", 100, Color.BLACK, Color.WHITE);
        }
        else if(score1 < score2)
        {
            text1 = new GreenfootImage("Player 2 ganhou!!", 100, Color.BLACK, Color.WHITE);
        }  
        else
        {
            text1 = new GreenfootImage("Draw!!", 100, Color.BLACK, Color.WHITE);
        }
                
        // Greenfoot images with message on the background image
        background.drawImage(text1,getWidth()/2-300, getHeight()/2);
        background.drawImage(text2,getWidth()/2-300, getHeight()/2-150);
        background.drawImage(text3,getWidth()/2+100, getHeight()/2-150);
        
        setBackground(background);
    }
    
    /**
     * Method used simultaneously with the Game Over (String lost) constructor, which provides a certain message 
     * according to the player who has lost all 3 lives.
     */
    public void buildGameOver(String lost)
    {
        background = new GreenfootImage("azul.png");
        
        // Greenfoot image with information from the player and the player taken by Enemy 3 times
        if(lost == "player1")
        {
            Greenfoot.playSound("cheer.wav"); // Sound reproduction of applause
            text1 = new GreenfootImage("Player 2 won!!\nScore: " + score, 100, Color.BLACK, Color.WHITE);
            text2 = new GreenfootImage("Player 1 got caught!", 50, Color.BLACK, Color.WHITE);
        }
        else if(lost == "player2")
        {
            Greenfoot.playSound("cheer.wav"); // Sound reproduction of applause
            text1 = new GreenfootImage("Player 1 ganhou!!\nScore: " + score, 100, Color.BLACK, Color.WHITE);
            text2 = new GreenfootImage("Player 2 got caught!", 50, Color.BLACK, Color.WHITE);
        }
        else if(lost == "bothPlayers")
        {
            Greenfoot.playSound("fail.wav"); // Play sound of defeat
            text1 = new GreenfootImage("GameOver", 100, Color.BLACK, Color.WHITE);
            text2 = new GreenfootImage("Try again", 100, Color.BLACK, Color.WHITE);
        }
        
        // Greenfoot images with message on the background image
        background.drawImage(text1,getWidth()/2-250, getHeight()/2-300);
        background.drawImage(text2,getWidth()/2-300, getHeight()/2);
        
        setBackground(background);
    }
}