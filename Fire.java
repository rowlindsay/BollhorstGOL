import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;

public class Fire extends NonPhysicsElement
{
    private int age;
    private final int MAX_AGE = 10;
    public Fire() {
        super(false);
        int fireVar = (int)(Math.random()*3) + 1;
        setSprite(Game.readImage(Game.DEFAULT_SPRITE_LOCATION + "fire" + fireVar + ".png"));
        age = 0;
    }
    
    public void behave() {
        age++;
        if(age == MAX_AGE)
            setLocation(10000,10000);
        for(WorldElement e : getTouching()) {
            if(!(e instanceof Liquid || e instanceof Island || e instanceof Fire))
                burn(e);
        }
    }
    
    public void burn(WorldElement e) {
        //e.setSprite(Game.readImage("images/element_sprites/villager_forward_fire.png"));
        //e.addEffect("fire");
        e.setBurning(true);
    }
}