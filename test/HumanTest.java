import junit.framework.TestCase;

public class HumanTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testGetBMI() {
        System.out.println("getBMI");
        Human instance = new Human(70,1.7);
        assertEquals(24.22, instance.getBMI(), 0.01);
    }

    public void testGetBMI2() {
        System.out.println("getBMI");
        Human instance = new Human(60,1.75);
        assertEquals(19.59, instance.getBMI(), 0.01);
    }


    public void testSetWeight() {
        System.out.println("setWeight");
        double expResult = 54;
        Human instance = new Human(70,1.7);
        instance.setWeight(expResult);
        assertEquals(expResult, instance.getWeight(), 0.0);
    }

    public void testSetHeight() {
        System.out.println("setHeight");
        double expResult = 1.65;
        Human instance = new Human(70,1.7);
        instance.setHeight(expResult);
        assertEquals(expResult, instance.getHeight(), 0.0);
    }

    public void testGetHeight() {
        System.out.println("getHeight");
        double expResult = 1.75;
        Human instance = new Human(60,expResult);
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    public void testGetWeight() {
        System.out.println("getWeight");
        double expResult = 60;
        Human instance = new Human(expResult,1.75);
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }
}