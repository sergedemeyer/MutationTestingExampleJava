import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {1, 2, 42, 42, 63};
        int[] toFind = {99, 63, 42, 2, 1, 0};

        System.out.println("data = " + Arrays.toString(data));
        for (int i : toFind) {
            System.out.print("Find " + i + ": ");
            System.out.println(FindLast.findLast(data, i));
        }

        int[] data2 = {};
        System.out.println("data = " + Arrays.toString(data2));
        for (int i : toFind) {
            System.out.print("Find " + i + ": ");
            System.out.println(FindLast.findLast(data2, i));
        }
    }
}