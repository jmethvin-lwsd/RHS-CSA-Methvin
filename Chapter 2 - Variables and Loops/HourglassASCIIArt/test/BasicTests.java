import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

public class BasicTests {
    @Test
    public void testdrawHourglassASCIIArtBasicLines() {
        HourGlass.size = 3;
        String res = runMethodGetConsoleOut( () -> HourGlass.drawHourglassASCIIArt() );
        String[] lines = res.split("\r\n");
        assertTrue(lines.length == 8);
        assertEquals("+------+", lines[0]);
        assertEquals("+------+", lines[7]);
    }

    @Test
    public void testdrawHourglassASCIIArtBasicTop() {
        HourGlass.size = 3;
        String res = runMethodGetConsoleOut( () -> HourGlass.drawHourglassASCIIArt() );
        String[] lines = res.split("\r\n");
        assertTrue(lines.length == 8);
        assertEquals("|\\..../|", lines[1]);
        assertEquals("| \\../ |", lines[2]);
        assertEquals("|  \\/  |", lines[3]);
    }

    @Test
    public void testdrawHourglassASCIIArtBasicBottom() {
        HourGlass.size = 3;
        String res = runMethodGetConsoleOut( () -> HourGlass.drawHourglassASCIIArt() );
        String[] lines = res.split("\r\n");
        assertTrue(lines.length == 8);
        assertEquals("|  /\\  |", lines[4]);
        assertEquals("| /..\\ |", lines[5]);
        assertEquals("|/....\\|", lines[6]);
    }

    // Console output helper methods
    private ByteArrayOutputStream consoleStringOutput = null;
    private PrintStream consoleStringOutputPrev = null;
    private void consoleToString_Push() {
        if (consoleStringOutput != null) {
            consoleToString_Pop();
        }

        // Stream to hold the output
        consoleStringOutput = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(consoleStringOutput);

        // Save the old system out
        consoleStringOutputPrev = System.out;

        // Set the new output
        System.setOut(ps);
    }
    private String consoleToString_Pop() {
        // restore
        System.out.flush();
        System.setOut(consoleStringOutputPrev);

        return consoleStringOutput.toString();
    }
    private String runMethodGetConsoleOut(Runnable method) {
        consoleToString_Push();
        method.run();
        return consoleToString_Pop();
    }
}
