package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTestMutant {


    @Test
    public void testAllZero() {
        Type actual = Triangle.classify(0, 0, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test1() {
        Type actual = Triangle.classify(1, 1, 1);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

     @Test
    public void testBAZero() {
        Type actual = Triangle.classify(0, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testBZero() {
        Type actual = Triangle.classify(10, 0, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testCZero() {
        Type actual = Triangle.classify(10, 10, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testABZero() {
        Type actual = Triangle.classify(0, 0, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testNegative() {
        Type actual = Triangle.classify(-1, -1, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testANEg() {
        Type actual = Triangle.classify(-1, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testBNEg() {
        Type actual = Triangle.classify(10, -1, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    @Test
    public void testCNEg() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testAB() {
        Type actual = Triangle.classify(10, 10, 20);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testAC() {
        Type actual = Triangle.classify(10, 20, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testBC() {
        Type actual = Triangle.classify(20, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testABEqC() {
        Type actual = Triangle.classify(10, 20, 30);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScalene() {
        Type actual = Triangle.classify(3, 4, 5);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void testScalInv1() {
        Type actual = Triangle.classify(11, 10, 21);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScalInv2() {
        Type actual = Triangle.classify(10, 21, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testScalInv3() {
        Type actual = Triangle.classify(21, 10, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv4() {
        Type actual = Triangle.classify(11, 10, 30);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv5() {
        Type actual = Triangle.classify(11, 30, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    @Test
    public void testInv6() {
        Type actual = Triangle.classify(11, 10, 21);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv7() {
        Type actual = Triangle.classify(10, 21, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv8() {
        Type actual = Triangle.classify(21, 10, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv9() {
        Type actual = Triangle.classify(5, 6, 12);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv10() {
        Type actual = Triangle.classify(5, 5, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testInv11() {
        Type actual = Triangle.classify(5, 5, 11);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testLargeA() {
        Type actual = Triangle.classify(100, 10, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testModulo() {
        Type actual = Triangle.classify(10, 2, 9);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void testAllEqual() {
        Type actual = Triangle.classify(3, 3, 3);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoc1() {
        Type actual = Triangle.classify(3, 3, 4);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
    @Test
    public void testIsoc2() {
        Type actual = Triangle.classify(3, 4, 3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoc3() {
        Type actual = Triangle.classify(4, 3, 3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoc4() {
        Type actual = Triangle.classify(5, 11, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsoc5() {
        Type actual = Triangle.classify(11, 5, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
}
