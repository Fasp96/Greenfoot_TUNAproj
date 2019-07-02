import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Maze3 extends Maze
{
   // Declaration of variables
   // String that has the length of the labyrinth
   private String maze3 =
       "WWEEEEEWWWEEWWWEEEEWWWWWEEWW"+
       "W1-----WSW-----B-----W--B-CW"+
       "E-WEEE-E---EEEEEMEEE-E-EWW-E"+
       "E-E-B----W-----B---------W-E"+
       "E-E-E-EE-E-EEE-EEE-E-WEE-E-W"+
       "W---W----E---B-----E-E-----W"+
       "WW-WWEETWW-WW-EEWW-E---EEE-W"+
       "W---B-------3----W-E-E--B--W"+
       "W-EEE-EW-E3.....---E---E-E-W"+
       "W--SW-EV-W-.....-E---E-V-EBW"+
       "WW-WW-EW-W-..P..-WBE-W-E-E-W"+
       "W---B----WB.....-E-E-E---E-E"+
       "W-WWEE-E-E-.....-W-----E---E"+
       "W-W----E---B---3---E-E-WEE-E"+
       "W-E-WE-E-EETEE-EE-E--E--B--W"+
       "W-EBE------B------E-EVE-EEWW"+
       "E---E-WEEW-WEEW-W----------E"+
       "E-W---B-----EB----EEEE-EEE-E"+
       "E-WW-EEEEME---EEE---E----E-E"+
       "W2----B-----E--B--E-C-EE--BW"+
       "WWWWWWWWWWWWWWWWWWWWWWWWWWWW";
       
    /**
     * Constructor for objects of class Maze3
     */
    public Maze3()
    {
        super.buildMaze(maze3);        
    }
}
