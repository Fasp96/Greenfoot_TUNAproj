import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Option extends Actor
{
    /**
     * A method that detects whether the mouse is moving over an object, and sets the transparency to 100 if it is.
     */
    public void detectMouse()
    {
        if(Greenfoot.mouseMoved(this)) // if mouse moves on object
        {
            getImage().setTransparency(100); // change the transparency of the image to 100
        }
        else // back out of transparency if the mouse is not moving on the object
        {
            getImage().setTransparency(255); // change the transparency of the image to 255
        }
    }
}
