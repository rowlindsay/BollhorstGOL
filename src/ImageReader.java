package src;

import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;

public class ImageReader
{
    public static final String DEFAULT_SPRITE_LOCATION = "images/element_sprites/";
    public static final String MENU_THUMBNAIL_LOCATION = "images/toolbar_sprites/";
    public static final String BACKGROUND_IMAGE_LOCATION = "images/backgrounds/";
    public static final String EFFECT_SPRITE_LOCATION = "images/effect_sprites/";
    
    public static Image readImage(String imagePath) {
        return new ImageReader().findImage(imagePath);
    }
    
    public Image findImage(String imagePath) {
        try {
           return ImageIO.read(getClass().getResource(imagePath));
       } catch (IOException e) {
           throw new RuntimeException(e);
       }    
    }
}
