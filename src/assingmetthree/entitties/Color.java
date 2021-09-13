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
public enum Color {
    
    RED(2), ORANGE(1), YELLOW(1), GREEN(3), BLUE(4), INDIGO(6), VIOLET(2);
    
    private int value;  
    
    private Color(int value){
        this.value=value;
    }
}
