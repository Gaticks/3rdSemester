package ADS.sorting.sortSpeedTest;


import java.util.ArrayList;

public class InsertionSort {


    private static ArrayList<Integer> theArray;
    public static void insertionSort(int[] array)
    {

        for (int i = 1; i < array.length; i++)
        {
            if (array[i - 1] > array[i]) {
                backwardPass(array, i);
            }
        }
    }

    private static void backwardPass(int [] array, int i) {
        boolean doAction = false;
        boolean notBroken = true;
        int a = i;
        while (array[a - 1] > array[i]) {
            doAction = true;
            if (a == 1) {
                swap(array,0,i);
                notBroken = false;
                break;
            }
            a--;
        }
        if (doAction && notBroken) {
            notBroken = true;
            swap(array, a, i);
            doAction = false;
        }

    }

    private static void swap(int [] array, int a, int b) {

        int tmp = array[b];
        for(int i = b; i > a; i--) {
            array[i] = array[i-1];
        }
        array[a] = tmp;
    }
}
