package tp1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ASCIITest {
    AsciiEncoder asciiEncoder = new AsciiEncoder();
    @Test
    public void fromBinaryToAsciiTest(){
        assertEquals("hola",asciiEncoder.encode("01101000011011110110110001100001"));
    }
    @Test
    public void fromAsciiToBinaryTest(){
        assertEquals("01101000 01101111 01101100 01100001 ",asciiEncoder.decode("hola"));
    }
}
