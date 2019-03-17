import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Car(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3 , image.getHeight()/3);
        setImage(image);
    }
    
    public void act() 
    {
        setKeyDirection();
        Actor collide1 = getOneObjectAtOffset(0, 0, IceCream_1.class);
        Actor collide2 = getOneObjectAtOffset(0, 0, IceCream_2.class);
        Actor collide3 = getOneObjectAtOffset(0, 0, IceCream_3.class);
        Actor collide4 = getOneObjectAtOffset(0, 0, Bomb.class);
        if(collide1 != null ){
             
            MyWorld currentworld = (MyWorld)getWorld();
            
            currentworld.removeObject(collide1);
            currentworld.counter.bumpCount1();
             
        }
        
        if(collide2 != null ){
             
            MyWorld currentworld = (MyWorld)getWorld();
            
            currentworld.removeObject(collide2);
            currentworld.counter.bumpCount2();
             
        }
        
        if(collide3 != null ){
             
            MyWorld currentworld = (MyWorld)getWorld();
            
            currentworld.removeObject(collide3);
            currentworld.counter.bumpCount3();
             
        }

        if(collide4 != null ){
             
            MyWorld currentworld = (MyWorld)getWorld();
            
            currentworld.removeObject(collide4);
            currentworld.counter.bumpCountB();
             
        }
    }
    
    public void setKeyDirection(){
    if (Greenfoot.isKeyDown("left")){
       
        setLocation(this.getX()+(-1 * 1), this.getY());
        
    }else if (Greenfoot.isKeyDown("right")){
         setLocation(this.getX()+(1 * 1), this.getY());
        
    }else if (Greenfoot.isKeyDown("up")){
        setLocation(this.getX(), this.getY()+(-1 * 1));
        
    }else if (Greenfoot.isKeyDown("down")){
        
        setLocation(this.getX(), this.getY()+(1 * 1));
    }
         
    }
}
