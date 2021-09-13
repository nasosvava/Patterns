/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmetthree.paymethods;

/**
 *
 * @author George
 */
public class Cash implements PaymentMethod{

    @Override
    public void pay(double amount) {
        
        System.out.println("Please pay the amount of:"
        + amount + "€ upon receipt of order.");
        
    }

    
    
    
}
