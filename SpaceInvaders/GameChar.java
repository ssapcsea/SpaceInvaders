import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
public class GameChar
{
    // instance variables - replace the example below with your own
    static int x;
    static int y;
    static int type;
    static Graphics g; 
    /**
     * Constructor for objects of class GameChar
     */
    public GameChar()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public GameChar(int x, int y, Graphics g) {
        this.x = x; 
        this.y = y;
        this.g = g;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void createObject(int typeOf)
    {
        type = typeOf;
        if (typeOf == 0) { //ALIEN
            Alien al = new Alien();
            al.putAlien(x, y, g);
        }
    }
}
