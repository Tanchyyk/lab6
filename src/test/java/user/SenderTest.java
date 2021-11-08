package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender sender = new Sender();
    @BeforeEach
    void setUp() {
        sender.setUniqueId();
        sender.update("new status");
    }

    @Test
    void getStatus() {
        assertEquals(sender.getStatus(), "new status");
    }

    @Test
    void getId() {
        assertEquals(sender.getId(), "0");
    }
}