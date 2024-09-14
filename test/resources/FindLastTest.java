import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLastTest {

    int[] data = {1, 2, 42, 42, 63};

    @Test
    void testNoOccurrence() {
        assertEquals(-1, FindLast.findLast(data, 99));
    }

    @Test
    void testDoubleOccurrence() {
        assertEquals(3, FindLast.findLast(data, 42));
    }


    @Test
    void testEmptyVector() {
        assertEquals(-1, FindLast.findLast(new int[]{}, 3));
    }


    @Test
    void testOccurrenceOnBoundary() {
        assertEquals(0, FindLast.findLast(data, 1));
    }



    @Test
    void testNoOccurrenceMutated() {
        assertEquals(-1, FindLast.findLastMutated(data, 99));
    }

    @Test
    void testDoubleOccurrenceMutated() {
        assertEquals(3, FindLast.findLastMutated(data, 42));
    }

    @Test
    void testEmptyVectorMutated() {
        assertEquals(-1, FindLast.findLastMutated(new int[]{}, 3));
    }

    @Test
    void testOccurrenceOnBoundaryMutated() {
        assertEquals(0, FindLast.findLastMutated(data, 1));
    }


}