import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    IOutput monitor;
    IInput mouse;
    IInput keyboard;


    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("wireless", 4);
        computer = new Computer(8, 512, monitor, mouse);
        keyboard = new Keyboard("wireless", "English");
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(11);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: " + "sound", computer.outputData("sound"));
    }

    @Test
    public void canSetOutputDevice() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataFromMouse() {
        IInput realMouse = new Mouse("wireless", 4);
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(6, 200, printer, realMouse);
        assertEquals("Squeak", computer.outputSendData("Squeak"));
    }

    @Test
    public void canOutputDataFromKeyboard() {
        IInput keyboard1 = new Keyboard("wireless", "English");
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(6, 200, printer, keyboard1);
        assertEquals("Click", computer.outputSendData("Click"));
    }

    @Test
    public void 

}
