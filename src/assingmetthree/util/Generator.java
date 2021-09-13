/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmetthree.util;


import assingmetthree.entitties.Color;
import assingmetthree.entitties.Fabric;
import assingmetthree.entitties.Size;
import java.util.Random;

/**
 *
 * @author George
 */
public class Generator {
    
    private static Random random = new Random(); 
    
    public Generator() {
    }
    
    public Color randomColor(){
        Color randomColor; 
        randomColor = Color.values()[random.nextInt(Color.values()
                                                    .length)];      
        return randomColor;        
    }
            
      public Size randomSize(){       
        Size randomSize; 
        randomSize = Size.values()[random.nextInt(Size.values()
                                                    .length)];
        return randomSize;        
    }          
            
       public Fabric randomFabric(){  
        Fabric randomFabric; 
        randomFabric = Fabric.values()[random.nextInt(Fabric.values()
                                                    .length)];
        return randomFabric;        
    }   
       
     public int randomNumber(){
     int i=random.nextInt();
     return i;
     }
            
 
}
