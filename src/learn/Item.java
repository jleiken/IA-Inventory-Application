package learn;

public class Item 
{
    private String myName;
    private int myQuantity;
    private String myLoc;
    public Item(String name, int quantity, String location)
    {
        myName = name;
        myQuantity = quantity;
        myLoc = location;
    }
    
    public void setName(String name)
    {
        myName = name;
    }
    
    public void setQuantity(int quant)
    {
        myQuantity = quant;
    }
    
    public void setLoc(String loc)
    {
        myLoc = loc;
    }
    
    public String getLoc()
    {
        return myLoc;
    }
    
    public String getName()
    {
        return myName;
    }
    
    public int getQuantity()
    {
        return myQuantity;
    }
    
    @Override
    public String toString()
    {
        return myQuantity + "# " + myName + " @ " + myLoc;
    }
}
