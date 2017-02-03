package learn;
import java.awt.Color;

public class ColoredItem extends Item
{
    private Color myCol;
    public ColoredItem(String name, int quantity, String loc, Color col)
    {
        super(name, quantity, loc);
        myCol = col;
    }
    public void setColor(Color col)
    {
        myCol = col;
    }
    public Color getColor()
    {
        return myCol;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " & color: " + myCol;
    }
}