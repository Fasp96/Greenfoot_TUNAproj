import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Maze2 extends Maze
{
   // Declaration of variables
   // String that has the length of the labyrinth
   private String maze2 =
       "WWWWWWWWWWWWWWWWWWWWWWWWWWWW"+
       "W1------B---T--BW---------BW"+
       "WWWWW-WWWWWWWWW-W-WWWWWWWW-W"+
       "W--B-----B-----B--B-----B--W"+
       "WSWWWWWWW-WWWWWWWWWWW-WWWW3W"+
       "W-------B------B------W--B-W"+
       "W-WWWW-WWWWWW-WWWWWWWWW-WW-W"+
       "W-----B--C---B----V-B------W"+
       "W-WWWWWWWW-.....WWWWW-WWWWBW"+
       "W--B---B--B.....B-B-------MW"+
       "WBWWWWWWWW-..P..-WWWWWWWWWWW"+
       "W----B-----.....-----------W"+
       "WWWW-W-WWW-.....-WWWWWW-WWBW"+
       "W--B-W----B---3-B---B------W"+
       "W-WWWWWWWWW-WWWWWWW-WWWWWW-W"+
       "W-------B----B-----V--B----W"+
       "WWWWWWWW-WWWWW-W-WWWWWW-WWWW"+
       "W--B-C------B--W-----M--B-3W"+
       "W-WWWWWWWWWWWWWWWWWWWWWWWW-W"+
       "W2-----B--T-------------S-BW"+
       "WWWWWWWWWWWWWWWWWWWWWWWWWWWW";
    /**
     * Constructor for objects of class Maze2
     */
    public Maze2()
    {
        super.buildMaze(maze2);
    }
}
