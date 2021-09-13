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
public class CreditCard implements PaymentMethod{
    
    private String cardType; 
    private String cardholderName; 
    private String cardNumber; 
    private String cardExpDate; 
    private String cardCVV;

    public CreditCard() {
    }

    public CreditCard(String cardType, String cardholderName, String cardNumber, String cardExpDate, String cardCVV) {
        this.cardType = cardType;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
        this.cardCVV = cardCVV;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }
    
    
    
    @Override
    public void pay(double amount) {
        
        System.out.println("Your payment with Card"
        + this.cardNumber + 
                " is successful"+" You payed : " + amount);
    }
    
    
    
    
    
    
}
