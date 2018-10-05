import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    public RectangleTest() {
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
     * Test of getPerimeter method, of class Rectangle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        Rectangle instance = new Rectangle(3,4);
        double expResult = 14;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getArea method, of class Rectangle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Rectangle instance = new Rectangle(4,5);
        double expResult = 20;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double x = 5.0;
        Rectangle instance = new Rectangle(3,4);
        instance.setWidth(x);
        double expResult = 5.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHeight method, of class Rectangle.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double x = 5.0;
        Rectangle instance = new Rectangle(3,4);
        instance.setHeight(x);
        double expResult = 5.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getWidth method, of class Rectangle.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = new Rectangle(7,4);
        double expResult = 7.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getHeight method, of class Rectangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Rectangle instance = new Rectangle(10, 13);
        double expResult = 13.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

}