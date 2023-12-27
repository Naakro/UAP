import java.util.Arrays;
import java.util.Random;

public class Search {
    public static void main(String[] args) {
        int size = 10000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = i + 1;
        }

        int searchValue = new Random().nextInt(size) + 1;

        long startTime = System.nanoTime();
        sequentialSearch(data, searchValue);
        long endTime = System.nanoTime();
        System.out.println("Sequential Search: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        binarySearch(data, searchValue);
        endTime = System.nanoTime();
        System.out.println("Binary Search: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        interpolationSearch(data, searchValue);
        endTime = System.nanoTime();
        System.out.println("Interpolation Search: " + (endTime - startTime) + " ns");
    }

    public static int sequentialSearch(int[] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int value) {
        return Arrays.binarySearch(data, value);
    }

    public static int interpolationSearch(int[] data, int value) {
        int low = 0, high = (data.length - 1);
        while (low <= high && value >= data[low] && value <= data[high]) {
            if (low == high) {
                if (data[low] == value) return low;
                return -1;
            }
            int pos = low + (((high - low) / (data[high] - data[low])) * (value - data[low]));
            if (data[pos] == value)
                return pos;
            if (data[pos] < value)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1;
    }
}
