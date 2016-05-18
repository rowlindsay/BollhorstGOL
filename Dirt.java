import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
public class Dirt extends WorldElement {
    public Dirt () {
        super("images/element_sprites/dirt.png",true);
    }
    
    public void behave() {
        gravitate();
    }
    
    public Image getThumbnail() {
           return Game.readImage("images/toolbar_sprites/dirt.png");
    }
}