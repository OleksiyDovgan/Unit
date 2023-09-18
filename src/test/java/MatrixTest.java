import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIsSquareMatrixWithNull() {
        int[][] testMatrix = null;
        boolean result = new Matrix().isSquareMatrix(testMatrix);
        assertFalse(result);
    }

    @Test
    void testIsSquareMatrixWithEmptyMatrix() {
        int[][] testMatrix = new int[0][0];
        boolean result = new Matrix().isSquareMatrix(testMatrix);
        assertFalse(result);
    }


    @Test
    void isSquareMatrix() {
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean result = new Matrix().isSquareMatrix(testMatrix);
        assertTrue(result);

    }

    @Test
    void testIsSquareMatrixWithJaggedArray() {
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        boolean result = new Matrix().isSquareMatrix(testMatrix);
        assertFalse(result);
    }

    @Test
    void testIsSquareMatrixWithNonSquareMatrix() {
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        boolean result = new Matrix().isSquareMatrix(testMatrix);
        assertFalse(result);
    }

    @Test
    void averageArrayElements() {

        int[] testArray = {1, 2, 3, 4, 5};
        double result = new Matrix().averageArrayElements(testArray);
        assertEquals(3.0, result, 0.001);

    }
}