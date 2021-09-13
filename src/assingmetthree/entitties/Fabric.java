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
public enum Fabric {
    WOOL(5), COTTON(3), POLYESTER(10), RAYON(1), LINEN(4), CASHMERE(2), SILK(2);
    
    private int value;

    private Fabric(int value) {
        this.value = value;
    }
    
    
}
