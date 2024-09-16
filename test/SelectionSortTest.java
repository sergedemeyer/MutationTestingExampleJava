import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class SelectionSortTest {

    int[] sorted = {1, 2, 42, 45, 63};
    int[] reversesorted = {63, 45, 42, 2, 1};
    int[] doubles = {63, 45, 45, 2, 1};

    @Test
    void testSorted  () {
        int [] copy = sorted;
        SelectionSort.sort(copy);
        assertTrue(Arrays.equals(sorted, copy));
    }

    @Test
    void testReverseSorted  () {
        int [] copy = reversesorted;
        SelectionSort.sort(copy);
        assertTrue(Arrays.equals(sorted, copy));
    }

    @Test
    void testDoubles  () {
        int [] copy = doubles;
        SelectionSort.sort(copy);
        assertTrue(Arrays.equals(new int[]{1, 2, 45, 45, 63}, copy));
    }

}