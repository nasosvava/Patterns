/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingmetthree;

import assingmetthree.entitties.TShirt;
import assingmetthree.paymethods.Cash;
import assingmetthree.paymethods.CreditCard;
import assingmetthree.util.Generator;
import assingmetthree.util.Validation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nasos
 */
public class Assingmet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cart cart1 = new Cart();
        CreditCard card = new CreditCard();
        
        int y = 0;
        ArrayList<TShirt> allTshirts = new ArrayList();
        Generator gen = new Generator();
        for (int i = 0; i < 10; i++) {
            TShirt er = new TShirt(
                    gen.randomColor(),
                    gen.randomSize(),
                    gen.randomFabric());
            allTshirts.add(er);
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("code: " + i + " ) " + allTshirts.get(i));

        }
        System.out.println("Add item to Cart.By pressing the code");
        while (true) {
            int x = Validation.checkingIntegers(0, 9);
            while (x > 9 || x < 0) {
                System.out.println("Try again.");
                x = Validation.checkingIntegers(0, 9);
            }
            cart1.addItem(allTshirts.get(x));
            allTshirts.remove(x);
            System.out.println("Do you want to add more");
            System.out.println("Press 1 For Yes");
            System.out.println("Press 2 For No");
            if (Validation.optionsTrueOrFalse()) {
                for (int i = 0; i < allTshirts.size(); i++) {
                    System.out.println("code: " + i + " ) " + allTshirts.get(i));
                }
                continue;
            } else {
                break;
            }

        }
        System.out.println("Choose Your Payment Method");
        System.out.println("For Cash Press 1");
        System.out.println("For Credit Card Press 2");
        boolean choice = Validation.optionsTrueOrFalse();
        if(choice){
        cart1.executePayment(new Cash());
        }else{
            System.out.println("Give Card Type");
        card.setCardType(scanner.next());
            System.out.println("Give The Name Of The Owner Of The Card");
            card.setCardholderName(scanner.next());
            System.out.println("Give Card Number");
            card.setCardNumber(scanner.next());
            System.out.println("Give Card Expiration Date");
            card.setCardExpDate(scanner.next());
            System.out.println("Give CVV");
            card.setCardCVV(scanner.next());
            cart1.executePayment(card);
            
        }
    }

}
