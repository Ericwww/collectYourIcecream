import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IceCream_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceCream_3 extends Actor
{
    /**
     * Act - do whatever the IceCream_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int hp= 30;
    
    public IceCream_3(){
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3*2 , image.getHeight()/3*2);
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
