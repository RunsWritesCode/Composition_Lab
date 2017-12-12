import device_management.Computer;
import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before() {
        this.mouse = new Mouse("wireless", 11);
    }

    @Test
    public void canSendData() {
        assertEquals("squeak sending squeak", mouse.sendData("sending squeak"));
    }

}
