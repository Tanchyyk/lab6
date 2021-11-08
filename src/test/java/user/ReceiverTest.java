package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiver = new Receiver();

    @BeforeEach
    void setUp() {
        receiver.setUniqueId();
        receiver.update("new status");
    }

    @Test
    void getStatus() {
        assertEquals(receiver.getStatus(), "new status");
    }
}