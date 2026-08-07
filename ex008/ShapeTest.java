import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
    
public class ShapeTest {
    private static final double DELTA = 1e-9;

    //TODO: should this be two exercises
    // 2. students create the totalArea method

    @Test
    public void testToString() {

        Shape c = new Circle(1.2);        // area = Math.PI
        Shape r = new Rectangle(3.4, 5.6); // area = 6.0
        Shape t = new Triangle(7.8, 9.0);  // area = 6.0

        assertEquals("Circle: radius = 1.2", c.toString());
        assertEquals("Rectangle: width = 3.4; height = 5.6", r.toString());
        assertEquals("Triangle: base = 7.8; height = 9.0", t.toString());

    }

    @Test
    public void testNonNegativeAreaContract() {

        // ----- Verify correct area calculations -----
    
        // Circle
        assertEquals(Math.PI, new Circle(1.0).area(), DELTA);
        assertEquals(4.0 * Math.PI, new Circle(2.0).area(), DELTA);
    
        // Rectangle
        assertEquals(6.0, new Rectangle(2.0, 3.0).area(), DELTA);
        assertEquals(20.0, new Rectangle(4.0, 5.0).area(), DELTA);
    
        // Triangle
        assertEquals(6.0, new Triangle(3.0, 4.0).area(), DELTA);
        assertEquals(15.0, new Triangle(5.0, 6.0).area(), DELTA);
        
        try {
            new Circle(-1.0);
            fail("Expected IllegalArgumentException for negative radius");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        try {
            new Rectangle(-1.0, 2.0);
            fail("Expected IllegalArgumentException for negative width");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        try {
            new Rectangle(2.0, -1.0);
            fail("Expected IllegalArgumentException for negative height");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        try {
            new Triangle(-1.0, 2.0);
            fail("Expected IllegalArgumentException for negative base");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        try {
            new Triangle(2.0, -1.0);
            fail("Expected IllegalArgumentException for negative height");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testTotalAreaAdditiveAndLiskov() {
        Shape c = new Circle(1.0);        // area = Math.PI
        Shape r = new Rectangle(2.0, 3.0); // area = 6.0
        Shape t = new Triangle(3.0, 4.0);  // area = 6.0

        List<Shape> shapes = Arrays.asList(c, r, t);
        double expected = c.area() + r.area() + t.area();

        // Use the consumer that accepts Shape references
        assertEquals("totalArea should equal sum of individual areas", expected, ShapeUtils.totalArea(shapes), DELTA);
    }
    
    @Test
    public void testShapeAndAreaMethodAreAbstract() throws Exception {
    
        // Verify Shape is abstract
        assertTrue(
            "Shape class should be abstract",
            Modifier.isAbstract(Shape.class.getModifiers())
        );
    
        // Verify area() exists
        Method areaMethod = Shape.class.getDeclaredMethod("area");
    
        // Verify area() is abstract
        assertTrue(
            "area() should be abstract",
            Modifier.isAbstract(areaMethod.getModifiers())
        );
    
        // Verify return type
        assertEquals(
            "area() should return double",
            double.class,
            areaMethod.getReturnType()
        );
    }    

}