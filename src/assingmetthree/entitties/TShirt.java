/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmetthree.entitties;

/**
 *
 * @author George
 */
public class TShirt {
    
    private Color Color; 
    private Size Size; 
    private Fabric Fabric; 
    private double price; 

    public TShirt() {
    }
    

    public TShirt(Color Color, Size Size, Fabric Fabric) {
        this.Color = Color;
        this.Size = Size;
        this.Fabric = Fabric;
        
        this.price = 
                10 + (double)(this.getColor().ordinal()) + 
                (double)(this.getSize().ordinal()) + 
                (double)(this.getFabric().ordinal())
                ;                
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public Size getSize() {
        return Size;
    }

    public void setSize(Size Size) {
        this.Size = Size;
    }

    public Fabric getFabric() {
        return Fabric;
    }

    public void setFabric(Fabric Fabric) {
        this.Fabric = Fabric;
    }

    @Override
    public String toString() {
        return "TShirt{" + "Color=" 
                + Color + ", Size=" 
                + Size + ", Fabric=" 
                + Fabric + ", price="
                + price + '}';
    }

 

 

}
    
    
    
   