import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeaterTest {

    public HeaterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of warmer method, of class Heater.
     */
    @Test
    public void testWarmer() {
        System.out.println("warmer");
        Heater instance = new Heater(10,20);
        instance.setIncrement(10);
        instance.warmer();
        assertEquals(15, instance.getTemperature(), 0.0);
    }

    /**
     * Test of warmer method, of class Heater.
     */
    @Test
    public void testWarmer2() {
        System.out.println("warmer");
        Heater instance = new Heater(10,20);
        instance.setIncrement(2);
        instance.warmer();
        assertEquals(17, instance.getTemperature(), 0.0);
    }

    /**
     * Test of colder method, of class Heater.
     */
    @Test
    public void testColder() {
        System.out.println("colder");
        Heater instance = new Heater(10,20);
        instance.setIncrement(10);
        instance.colder();
        assertEquals(15, instance.getTemperature(), 0.0);
    }

    /**
     * Test of colder method, of class Heater.
     */
    @Test
    public void testColder2() {
        System.out.println("colder");
        Heater instance = new Heater(10,20);
        instance.setIncrement(3);
        instance.colder();
        assertEquals(12, instance.getTemperature(), 0.0);
    }

    /**
     * Test of setIncrement method, of class Heater.
     */
    @Test
    public void testSetIncrement() {
        System.out.println("setIncrement");
        double increment = 4;
        Heater instance = new Heater(10,20);
        instance.setIncrement(increment);
        instance.warmer();
        assertEquals(19, instance.getTemperature(), 0.0);
    }

    /**
     * Test of setIncrement method, of class Heater.
     */
    @Test
    public void testSetIncrement2() {
        System.out.println("setIncrement");
        double increment = -4;
        Heater instance = new Heater(10,20);
        instance.setIncrement(increment);
        instance.warmer();
        instance.warmer();
        if (instance.getTemperature() == 7) {
            fail("temperature out of bounds");
        }
    }

}