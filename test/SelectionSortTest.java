import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SelectionSortTest {

    int[] data = {1, 2, 42, 45, 63};

    @Test
    void testSorted  () {
        int [] copy = data;
        SelectionSort.sort(copy);
        assertEquals(data, copy);
    }

}