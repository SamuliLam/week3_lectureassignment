import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 8 };
        assertArrayEquals(a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 16, 13 } };
        assertArrayEquals(a11, a12);
    }

    @Test
    public void testDifferentTypesOfArrayEquality() {
        // This test checks if an array of Strings and an array of doubles are equal.
        // The String array contains numbers in string format, and the double array contains the same numbers as doubles.
        // The test will pass if the arrays are equal, and fail if they are not.

        String[] a1 = { "2.0", "3.0", "5.0", "7.0" };
        double[] a2 = { 2.0, 3.0, 5.0, 7.0 };

        // Convert the String array to a double array for comparison
        double[] a1AsDoubles = Arrays.stream(a1).mapToDouble(Double::parseDouble).toArray();

        assertArrayEquals(a1AsDoubles, a2, 0.0);
    }
}