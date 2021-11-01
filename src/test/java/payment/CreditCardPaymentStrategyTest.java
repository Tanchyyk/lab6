package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();

    @BeforeEach
    void setUp() {
    }

    @Test
    void pay() {
        assertEquals("Paid by credit card, total price is: 100.0 dollars", creditCardPaymentStrategy.pay(100));
        assertEquals("Paid by credit card, total price is: 50.0 dollars", creditCardPaymentStrategy.pay(50));
    }
}