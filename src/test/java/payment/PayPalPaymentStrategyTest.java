package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();

    @BeforeEach
    void setUp() {
    }

    @Test
    void pay() {
        assertEquals("Paid by PayPal service, total prise is: 100.0 dollars", payPalPaymentStrategy.pay(100));
    }
}