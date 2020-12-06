import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Maze1 extends Maze
{
   // Declaration of variables
   // String that has the length of the labyrinth
   private String maze1 =
       "EEEEEEEEEEEEEEEEEEEEEEEEEEEE"+
       "E1------B---T--B----------BE"+
       "E-EEEEE-EEEEEEEE-E-EEE-EEE-E"+
       "E-EB-----B--E--B-EB-----BE-E"+
       "ESE-E-EEEEE-E-EEEE-EEEEE-E3E"+
       "E---E---B------B-------E-B-E"+
       "E-ECE-EEEE-EEEE-EE-EEE-E-E-E"+
       "E-E-E-B------B----V-BE---E-E"+
       "E---E-EEEE-.....-EEE-E-E-EBE"+
       "E-EB--EB--B.....B-BE-E-E-EME"+
       "EBE-E-E-EE-..P..-E-E--BE---E"+
       "E-E-EB-----.....-E-E-E---E-E"+
       "E-E---EBEE-.....-EBE-E-E-EBE"+
       "E--BE-E---B---3-B---BE-E-E-E"+
       "E-E-E-EEE-EEE-EEE-EEEE-E-B-E"+
       "E-E-E---B---EB-----V--BE-E-E"+
       "E-E-EEE-EEE-EE-EEE-EEEEE-E-E"+
       "E-EB-C------B--------M--BE3E"+
       "E-EEEEE-EEEEE-E-EEEEE-EEEE-E"+
       "E2-----B--T---E---------S-BE"+
       "EEEEEEEEEEEEEEEEEEEEEEEEEEEE";
       
    /**
     * Constructor for objects of class Maze1
     */
    public Maze1()
    {
        super.buildMaze(maze1);        
    }
    
    
}
