import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Car player;
    Counter counter; 
    int ranx_1; 
    int rany_1; 
    int ranx_2; 
    int rany_2;
    int ranx_3; 
    int rany_3;
    int ranx_4;
    int rany_4; 
    public MyWorld()
    {    
        // Create a new world with 8x8 cells with a cell size of 60 pixels.
        super(10, 10, 60); 
        player = new Car();
   
        addObject(player, 3,4);
        counter = new Counter();
        addObject(counter,9,0);
        
    }
    
    public void act(){
        
        if(Greenfoot.getRandomNumber(1000) < 50) {
            ranx_1 = Greenfoot.getRandomNumber(9);
            rany_1 = Greenfoot.getRandomNumber(9);
            IceCream_1 ice1 = new IceCream_1();
            addObject(ice1, ranx_1, rany_1);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 50) {
            ranx_2 = Greenfoot.getRandomNumber(9);
            rany_2 = Greenfoot.getRandomNumber(9);
            while(ranx_2==ranx_1 && rany_2==rany_1){
                ranx_2 = Greenfoot.getRandomNumber(9);
                rany_2 = Greenfoot.getRandomNumber(9);
            }
            IceCream_2 ice2 = new IceCream_2();
            addObject(ice2, ranx_2, rany_2);
        }
        
        if(Greenfoot.getRandomNumber(1000) < 50) {
            ranx_3 = Greenfoot.getRandomNumber(9);
            rany_3 = Greenfoot.getRandomNumber(9);
            while(ranx_3==ranx_2 && rany_3==rany_2 && ranx_3==ranx_1 && rany_3==rany_1){
                ranx_3 = Greenfoot.getRandomNumber(9);
                rany_3 = Greenfoot.getRandomNumber(9);
            }
            IceCream_3 ice3 = new IceCream_3();
            addObject(ice3, ranx_3, rany_3);
        }

        if(Greenfoot.getRandomNumber(1000) < 30) {
            ranx_4 = Greenfoot.getRandomNumber(9);
            rany_4 = Greenfoot.getRandomNumber(9);
            while(ranx_4==ranx_3 && rany_4==rany_3 && ranx_4==ranx_2 && rany_4==rany_2 && ranx_4==ranx_1 && rany_4==rany_1){
                ranx_4 = Greenfoot.getRandomNumber(9);
                rany_4 = Greenfoot.getRandomNumber(9);
            }
            Bomb bomb = new Bomb();
            addObject(bomb, ranx_4, rany_4);
        }
        
    }
    
}













