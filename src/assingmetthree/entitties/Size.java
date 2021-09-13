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
public enum Size {
    XS(4), S(1), M(2), L(3), XL(5), XXL(6), XXXL(7);
    
    private int value;

    private Size(int value) {
        this.value = value;
    }
    
    
}
