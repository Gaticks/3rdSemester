package ADS.sorting.sortSpeedTest;

public class BubbleSort {

    public static void bubbleSort(int array[]) {
        int endIndex = array.length-1;
        boolean didSwap;
        do {
            didSwap = bubbleSortPass( array, endIndex );
            endIndex--;
        } while ( didSwap );
    }

    private static boolean bubbleSortPass(int[] array, int endIndex) {
        boolean swapped = false;
        for (int a = 0; a < endIndex; a++) {
            if ( array[a] > array[a + 1] ) {
                swapped = true;
                swap( array, a, a + 1 );
            }
        }
        return swapped;
    }

    private static void swap(int[] array, int a, int b) {
        array[a] += array[b];
        array[b] = array[a] - array[b];
        array[a] -= array[b];
    }
}
