package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
       return "Paid by PayPal service, total prise is: " + price + " dollars";
    }
}
