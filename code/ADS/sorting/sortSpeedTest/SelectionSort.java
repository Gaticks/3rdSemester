package ADS.sorting.sortSpeedTest;

public class SelectionSort {

    public static void selectionSort(int[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            int indexOfMin = indexOfMin(array, i);
            if (indexOfMin == -1) {
                throw new IllegalArgumentException();
            }
            if(i != indexOfMin){
                swop(array, i, indexOfMin);
            }
        }
    }

    private static void swop(int [] array, int a, int b) {

        array[a] += array[b];
        array[b] = array[a] - array[b];
        array[a] = array[a] - array[b];
        return;
    }

    private static int indexOfMin(int[] array, int startIndex) {

        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;

        for(int i = startIndex; i < array.length; i++) {
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }

        return minIndex;
    }
}
