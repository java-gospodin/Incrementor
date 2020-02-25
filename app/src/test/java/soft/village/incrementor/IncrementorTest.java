package soft.village.incrementor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IncrementorTest {

    Incrementor incrementor;

    @Before
    public void setUp() throws Exception {
        incrementor = new Incrementor();
    }

    @Test
    public void increment_isCorrect() {
        incrementor.incrementNumber();
        incrementor.incrementNumber();
        assertEquals(2, incrementor.getNumber());
    }

    @Test
    public void setMaxValue_isCorrect() {
        incrementor.setMaximumValue(4);
        incrementor.incrementNumber();
        incrementor.incrementNumber();
        incrementor.incrementNumber();
        assertEquals(3, incrementor.getNumber());
        incrementor.incrementNumber();
        assertEquals(0, incrementor.getNumber());
    }

}
