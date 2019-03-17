import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int totalCount = 0;

    public Counter(){
        setImage(new GreenfootImage("0",20,Color.WHITE,Color.BLACK));
    }

    public void bumpCount1(){
        totalCount=totalCount+1;
        setImage(new GreenfootImage("score:"+totalCount,20,Color.WHITE,Color.BLACK));
    }

    public void bumpCount2(){
        totalCount=totalCount+2;
        setImage(new GreenfootImage("score:"+totalCount,20,Color.WHITE,Color.BLACK));
    }

    public void bumpCount3(){
        totalCount=totalCount+3;
        setImage(new GreenfootImage("score:"+totalCount,20,Color.WHITE,Color.BLACK));
    }

    public void bumpCountB(){
        totalCount=totalCount-5;
        setImage(new GreenfootImage("score:"+totalCount,20,Color.WHITE,Color.BLACK));
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
