import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Option extends Actor
{
    /**
     * A method that detects whether the mouse is moving over an object, and sets the transparency to 100 if it is.
     */
    public void detectMouse()
    {
        if(Greenfoot.mouseMoved(this)) //caso rato se movimento no objeto
        {
            getImage().setTransparency(100); //muda a transparência da imagem para 100
        }
        else //voltar a ficar sem transparência caso o rato não esteja a mover sobre o objeto
        {
            getImage().setTransparency(255); //muda a transparência da imagem para 255
        }
    }
}
