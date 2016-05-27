import java.awt.event.*;
import java.awt.*;
public class Bollhorst extends PhysicsElement {
    private Image speechBox;
    private final int DETECT_RADIUS = 100;
    public Bollhorst() {
        super(true);
        speechBox = Game.readImage(Game.EFFECT_SPRITE_LOCATION + "bollhorst_speech.png");
    }
    public void behave() {
        gravitate();
    }
    public void draw(Graphics g) {
        super.draw(g);
        if(villagerDetected())
            drawMessage(g);
    }
    public void drawMessage(Graphics g) {
        g.drawImage(speechBox,getX()-getWidth()/2-speechBox.getWidth(null),getY() - getHeight()/2,getWorld());
    }
    public Rectangle getDetectionBox () {
        return new Rectangle(getX()-getWidth()/2-DETECT_RADIUS,getY()-getHeight()/2,(2*DETECT_RADIUS)+getWidth(),getHeight());
    }
    public boolean villagerDetected() {
        for(WorldElement e : getWorld().getElements()) {
            if(getDetectionBox().contains(e.getLocation()) && e instanceof Villager)
                return true;    
        }
        return false;
    }
}