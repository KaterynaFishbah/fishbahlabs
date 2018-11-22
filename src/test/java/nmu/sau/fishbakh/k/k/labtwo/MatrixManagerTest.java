package nmu.sau.fishbakh.k.k.labtwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MatrixManagerTest {

    private static MatrixManager matrixManager = new MatrixManager();
    private static Matrix matrix = matrixManager.createArray(50, 4, 4);
    private static int[][] testArray = {{0, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}};

    @Before
    public void init() {
        matrix.setArr(testArray);
    }

    @Test
    public void sumOfArray() {

        int actual = matrixManager.sumOfArray(matrix);
        int expected = 12;

        assertEquals("Test sum of array", expected, actual);
    }

    @Test
    public void findMaxOfArray() {

        int actual = matrixManager.findMaxOfArray(matrix);
        int expected = 1;

        assertEquals("Test max of array", expected, actual);
    }

    @org.junit.Test
    public void findMinOfArray() {

        int actual = matrixManager.findMinOfArray(matrix);
        int expected = 0;

        assertEquals("Test min of array", expected, actual);
    }
}