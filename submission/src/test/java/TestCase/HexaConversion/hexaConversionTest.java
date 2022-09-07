
package TestCase.HexaConversion;

import com.mycompany.hexadecimal.HexadecimalConversion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author meshack
 */
public class hexaConversionTest {

    HexadecimalConversion objHex = new HexadecimalConversion();
    //constructor
    @Test
    public void Constructor() {
    HexadecimalConversion objHex = new HexadecimalConversion();

        assertEquals(7690, objHex.getNum(), 0.0);
    }
     @Test
    public void validValues() {
        objHex.setNum(8490);
        assertEquals(8490, objHex.getNum(), 0.0);
    }
     @Test
        //(expected = IllegalArgumentException.class)
    public void invalidValues() {
        objHex.setNum(-9090);
        assertEquals(-9090, objHex.getNum(), 0.0);
    }
     
    
    
}
