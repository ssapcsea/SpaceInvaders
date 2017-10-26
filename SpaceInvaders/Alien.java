
/**
 * Write a description of class Alien here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
public class Alien
{
    BufferedImage img;
    int myX;
    int myY;
    
    public Alien()
    {
    }

    public void putAlien(int x, int y, Graphics g)
    {
        try {
            img = ImageIO.read(this.getClass().getResource("alien.png"));
        } catch (IOException e) {
            System.out.println("Image could not be read");
        }
        g.drawImage(img, x, y, 30, 30, null);
        this.myX = x;
        this.myY = y; 
    }
}
