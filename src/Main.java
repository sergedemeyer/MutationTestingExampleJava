import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {

    public static void main(String[] args) {
        int[] data = {1, 2, 42, 42, 63};
        int[] toFind = {99, 63, 42, 2, 1, 0};

        System.out.println("data = " + Arrays.toString(data));
        for (int j : toFind) {
            System.out.print("Find " + j + ": ");
            System.out.println(FindLast.findLast(data, j));
        }

        int[] data2 = {};
        System.out.println("data = " + Arrays.toString(data2));
        for (int i = 0; i < toFind.length; i++) {
            System.out.print("Find " + toFind[i] + ": ");
            System.out.println(FindLast.findLast(data2, toFind[i]));
        }
    }
}