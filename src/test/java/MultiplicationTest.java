
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    Multiplication benefit = new Multiplication(2,2,2);
        @Test
       public void calculation(){

        String  actual=benefit.calculation(2,2,2);
            String expected ="All benefit is "+8;
                            assertEquals(expected,actual);
        }
    }

