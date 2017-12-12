import device_management.Computer;
import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before() {
        this.keyboard = new Keyboard("wireless", "English");
    }

    @Test
    public void canSendData() {
        assertEquals("sending keystrokes", keyboard.sendData("sending keystrokes"));
    }


}
