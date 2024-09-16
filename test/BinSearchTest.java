import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinSearchTest {
    int[] data = {1, 2, 42, 45, 63};
    int[] emptydata = {};
    int[] onecell = {1};

    @Test
    void testPath1  () {
        assertEquals(-1, BinSearch.binSearchR(emptydata, 99, 1, 0));
    }

    @Test
    void testPath2  () {
        assertEquals(2, BinSearch.binSearchR(data, 42, 0, data.length));
    }

    @Test
    void testPath3  () {
        assertEquals(1, BinSearch.binSearchR(data, 2, 0, data.length));
    }

    @Test
    void testPath4  () {
        assertEquals(3, BinSearch.binSearchR(data, 45, 0, data.length));
    }

    @Test
    void testMutant1  () {
        assertEquals(-1, BinSearch.binSearchR(onecell, 99, 0, onecell.length));
    }

    /*@Test
    void testNoOccurrence() {
        assertEquals(-1, BinSearch.binSearchR(data, 99, 0, data.length));
    }

    @Test
    void testDoubleOccurrence() {
        assertEquals(2, BinSearch.binSearchR(data, 42, 0, data.length));
    }

    @Test
    void testLast() {
        assertEquals(4, BinSearch.binSearchR(data, 63, 0, data.length));
    }

    @Test
    void testFirst() {
        assertEquals(0, BinSearch.binSearchR(data, 1, 0, data.length));
    }
*/
/*    int[] longdata = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    @Test
    void testHalfwayRight() {
        assertEquals(9, BinSearch.binSearchR(longdata, 10, 0, longdata.length));
    }

    @Test
    void testHalfwayLeft() {
        assertEquals(2, BinSearch.binSearchR(longdata, 3, 0, longdata.length));
    }

    @Test
    void testLongData() {
        for (int i : longdata) {
            assertEquals(i - 1, BinSearch.binSearchR(longdata, i, 0, longdata.length));
        }
    }*/

}