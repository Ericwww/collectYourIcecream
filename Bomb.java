import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int hp=20;
    
    public Bomb(){
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() , image.getHeight());
        setImage(image);
        
    }
    
    public void act() 
    {
        hp = hp - 1;
        
        if(hp <= 0){
            
            MyWorld currentworld = (MyWorld)getWorld();
            currentworld.removeObject(this);
        }
        
        
        
    }    
}
