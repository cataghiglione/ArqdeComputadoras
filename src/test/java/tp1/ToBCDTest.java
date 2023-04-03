package tp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToBCDTest {
    BCDEnconder enconder = new BCDEnconder();

    @Test
    public void testEncode(){
        assertEquals(enconder.encode(123), "000100100011");
        assertEquals(enconder.encode(203), "001000000011");
    }
    @Test
    public void testDecode(){
        assertEquals(enconder.decode("100010"), 22);
        assertEquals(enconder.decode("001000000011"), 203);
    }
}
