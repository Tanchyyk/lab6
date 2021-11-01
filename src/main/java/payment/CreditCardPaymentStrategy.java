package payment;

import flowers.Flower;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "Paid by credit card, total price is: " + price + " dollars";
    }
}
