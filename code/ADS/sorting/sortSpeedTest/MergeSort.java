package ADS.sorting.sortSpeedTest;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int array[]) {
        if ( array.length <= 1 ) {
            return;
        }
        int middle = array.length/2;
        int [] leftArray = new int[middle];
        int [] rightArray = new int[array.length-middle];
        System.arraycopy( array, 0, leftArray, 0, middle );
        System.arraycopy( array, middle, rightArray, 0, array.length-middle );
        mergeSort( leftArray );
        mergeSort( rightArray );
        merge( array, leftArray, rightArray );
    }

    public static void merge(int[] newArray, int[] leftArray, int[] rightArray) {
        int leftIndex = 0;
        int rightIndex = 0;
        for (int a = 0; a < newArray.length; a++) {
            if ( rightIndex >= rightArray.length || leftIndex < leftArray.length && leftArray[leftIndex] < rightArray[rightIndex] ) {
                newArray[a] = leftArray[leftIndex];
                leftIndex++;
            }else{
                newArray[a] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String [] args){
        int [] unsortedArray = {3, 2, 1, 6, 5, 4};
        int [] sortedArray = Arrays.copyOf( unsortedArray, unsortedArray.length );
        mergeSort( unsortedArray );
        System.out.println( Arrays.toString( unsortedArray ) );
    }
}
