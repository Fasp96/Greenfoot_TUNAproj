import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Maze extends World
{
    // Definition of variables
    private int scorePlayer1, scorePlayer2; // Save the player score
    private final int ZELDA = 197; // Lateral labyrinth distance
    private int player1Lives = 3; // Lifes to start of player1
    private int player2Lives = 3; // Lifes to start of player2
    private GreenfootImage background;
    
     /**
     * Constructor for objects of class Maze
     */
    public Maze()
    {
        // Create a world with 1300x846 cells with a size of 1x1 pixels
        super(1300, 846, 1);
        
        background = new GreenfootImage("paper.jpg");
        setBackground(background); // World background statement
        
        scorePlayer1();
        scorePlayer2();
        
        // To make the Enemy object over BonusPoints and Instruments
        setPaintOrder(Enemy.class, Instrument.class, BonusPoint.class);
    }
    
    /**
     * Método para construir o labirinto com os objetos que pretendemos
     */
    public void buildMaze(String maze)
    {               
        int x = ZELDA, y = 23;
        for (int p = 0; p < maze.length(); p++){
            // If the character is 'E' insert a Bush object
            if(maze.charAt(p) == 'E' ){
                addObject(new Bush(),x ,y);
            }
            // If the character is 'W' insert a Brick object
            if(maze.charAt(p) == 'W' ){
                addObject(new Brick(),x ,y);
            }
            // If the character is 'P' insert a Stage object
            if(maze.charAt(p) == 'P'){
                addObject(new Stage(),x ,y);
            }
            // If the character is 'B' insert a Beer object
            if(maze.charAt(p) == 'B'){
                addObject(new Beer(),x ,y);
            }
            // If the character is 'G' insert a BeerBoutle object
            if(maze.charAt(p) == '-'){
                addObject(new BeerBoutle(),x ,y);
            }
            // If the character is 'M' insert a Mandolin object
            if(maze.charAt(p) == 'M'){
                addObject(new Mandolin(),x ,y);
            }
            // If the character is 'S' insert a Saxophone object
            if(maze.charAt(p) == 'S'){
                addObject(new Saxophone(),x ,y);
            }
            // If the character is 'T' insert a Tamborine object
            if(maze.charAt(p) == 'T'){
                addObject(new Tambourine(),x ,y);
            }
            // If the character is 'V' insert a Violin object
            if(maze.charAt(p) == 'V'){
                addObject(new Violin(),x ,y);
            }
            // If the character is 'C' insert a Conga object
            if(maze.charAt(p) == 'C'){
                addObject(new Conga(),x ,y);
            }
            // If the character is '1' insert a Player1 object
            if(maze.charAt(p) == '1'){
                addObject(new Player1(),x ,y);
            }
            // If the character is '2' insert a Player2 object
            if(maze.charAt(p) == '2'){
                addObject(new Player2(),x ,y);
            }
            // If the character is '3' insert a ElReitor object
            if(maze.charAt(p) == '3'){
                addObject(new Reitor(),x ,y);
            }
            
            x += 40;// The offset given between the center of each character (x + 40)
            
            // If it reaches the maximum width to pass to the bottom line
            if(x>getWidth()){
                x = ZELDA; // Initial wall spacing
                y += 40; // Spacing between rows (and + 40)
            }
        }
    }
         
    /**
     * Method that allows adding Robot class objects
     */
    public void addRobot()
    {
        addObject( new Robot(), 717,543); // Below the stage
        addObject( new Robot(), 597,423); // Left side of the stage
        addObject( new Robot(), 717,303); // Above the stage
        addObject( new Robot(), 837,423); // Right side of the stage
    }
    
    /**
     * Method that defines the score and objects picked up by player 1
     */
    public void scorePlayer1()
    {
        // Call methods to add points
        addPointsPlayer1(0); // Initializes player1 score at zero
        
        // Define the objects to use
        Violin Violin1= new Violin();
        Tambourine Tambourine1= new Tambourine();
        Mandolin Mandolin1= new Mandolin();
        Conga Conga1 = new Conga();
        Saxophone Saxophone1 = new Saxophone();
        Life Life11 = new Life(1);
        Life Life12 = new Life(1);
        Life Life13 = new Life(1);
        
        // Legend of the player
        showText("Player 1", 85, 50);
        
        // Add objects to catch
        addObject(Violin1, 20,170);
        addObject(Tambourine1, 50,170);
        addObject(Mandolin1, 85,170);
        addObject(Conga1, 120,170);
        addObject(Saxophone1, 150,170);
        
        // Add the lives of the player        
        addObject(Life11, 50,90);
        addObject(Life12, 85,90);
        addObject(Life13, 120,90);
        
        // Transparency of objects 
        objectTransparency(Violin1,50);
        objectTransparency(Tambourine1,50);
        objectTransparency(Mandolin1,50);
        objectTransparency(Conga1,50);
        objectTransparency(Saxophone1,50);
    }
    
    
    /**
     * Method that defines the score and the objects caught by the player 2
     */
    public void scorePlayer2()
    {
        // Call methods to add points
        addPointsPlayer2(0); // Initializes player2 score at zero
       
        // Define the objects to use
        Violin Violin2= new Violin();
        Tambourine Tambourine2= new Tambourine();
        Mandolin Mandolin2= new Mandolin();
        Conga Conga2 = new Conga();
        Saxophone Saxophone2 = new Saxophone();
        Life Life21 = new Life(2);
        Life Life22 = new Life(2);
        Life Life23 = new Life(2);        
        
        // Legend of the player
        showText("Player 2", 85,getHeight()-170);
        
        // Add objects to catch
        addObject(Violin2, 20,getHeight()-130);
        addObject(Tambourine2, 50,getHeight()-130);
        addObject(Mandolin2, 85,getHeight()-130);
        addObject(Conga2, 120,getHeight()-130);
        addObject(Saxophone2, 150,getHeight()-130);
        
        // Add the lives of the player        
        addObject(Life21, 50,getHeight()-50);
        addObject(Life22, 85,getHeight()-50);
        addObject(Life23, 120,getHeight()-50);
       
        // Transparency of objects 
        objectTransparency(Violin2,50);
        objectTransparency(Tambourine2,50);
        objectTransparency(Mandolin2,50);
        objectTransparency(Conga2,50);
        objectTransparency(Saxophone2,50);            
    }    
    
    /**
     * Method that puts objects in the Instruments class with transparency
     */
    public void objectTransparency(Actor Instrument,int t)
    {
       Instrument.getImage().setTransparency(t);
    }
    
    /**
     * Method to add points to player1
     */
    public void addPointsPlayer1(int pontos)
    {
        scorePlayer1 = scorePlayer1 + pontos;
        showText("Score: " + scorePlayer1, 85, 130);
    }
    
    /**
     * Method that allows access to Player1's score from another part of the project
     */
    public int getPontuacao1()
    {
        return scorePlayer1;
    }
    
    /**
     * Method to add points to player2
     */
    public void addPointsPlayer2(int pontos)
    {
        scorePlayer2 = scorePlayer2 + pontos;
        showText("Score: " + scorePlayer2, 85,getHeight()-90);
    }
    
    /**
     * Method that allows access to Player2's score from another part of the project
     */
    public int getPontuacao2()
    {
        return scorePlayer2;
    }
    
    /**
     * Method that counts the lives of Player1
     */
    public void livesPlayer1()
    {
       if (player1Lives != 0)
        {
            player1Lives = player1Lives - 1;
            removePlayer1Life();
            gameOverWorld();
        }       
    }
    
     /**
     * Method that removes life from Player1 
     */
    public void removePlayer1Life()
    {          
        if(player1Lives == 2)
        {
            addObject(new Dead(), 120,90);
        }
        
        if(player1Lives == 1)
        {
            addObject(new Dead(), 85,90);
        }
        
         if(player1Lives == 0)
        {
            addObject(new Dead(), 50,90);            
        }
    }
    
    /**
     * Method that allows access to the lives of Player1, from another part of the project.
     */
    public int getLivesPlayer1()
    {
        return player1Lives;
    }
    
    /**
     * Method that counts the lives of Player2
     */
    public void livesPlayer2()
    {
        if (player2Lives != 0)
        {
            player2Lives = player2Lives - 1;
            removePlayer2Life();
            gameOverWorld();
        }
    }    
    
     /**
     * Method that removes life from Player2 
     */
    public void removePlayer2Life()
    {          
        if(player2Lives == 2)
        {
            addObject(new Dead(), 120,getHeight()-50);
        }
        
        if(player2Lives == 1)
        {
            addObject(new Dead(), 85,getHeight()-50);
        }
        
         if(player2Lives == 0)
        {
            addObject(new Dead(), 50,getHeight()-50);
        }
    }
    
    /**
     * Method that allows access to the lives of Player2, from another part of the project
     */
    public int getLivesPlayer2()
    {
        return player2Lives;
    }
    
    /**
     * Method that creates the GameOver world where a defeat message is displayed in case both 
     * Players lose 3 life.
     */
    public void gameOverWorld()
    {
        if(player2Lives == 0 && player1Lives == 0)
        {
           Greenfoot.setWorld(new GameOver("bothPlayers", 0));
        }
    }
}
