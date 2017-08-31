package ADS.sorting.sortSpeedTest;

import java.util.Arrays;

public class SortAlgorithmSpeedTest {

    private static final int arraySize = 100000;

    public static void main(String[] args) {
        int[] unsortedArray = generateRandomArray( arraySize );
        int[] unsortedSelectionArray = Arrays.copyOf( unsortedArray, unsortedArray.length );
        int[] unsortedBubbleArray = Arrays.copyOf( unsortedArray, unsortedArray.length );
        int[] unsortedInsertionArray = Arrays.copyOf( unsortedArray, unsortedArray.length );
        int[] unsortedMergeArray = Arrays.copyOf( unsortedArray, unsortedArray.length );
        int[] sortedArray = Arrays.copyOf( unsortedArray, unsortedArray.length );
        Arrays.sort( sortedArray );
        System.out.println("Warming up");
        warmup();
        System.out.println("Done warm up");

        long startSelectionTime = System.currentTimeMillis();
        SelectionSort.selectionSort( unsortedSelectionArray );
        printTime( "Selection", startSelectionTime );

        long startBubbleTime = System.currentTimeMillis();
        BubbleSort.bubbleSort( unsortedBubbleArray );
        printTime( "Bubble", startBubbleTime );

        long startInsertionTime = System.currentTimeMillis();
        InsertionSort.insertionSort( unsortedInsertionArray );
        printTime( "Insertion", startInsertionTime );

        long startMergeTime = System.currentTimeMillis();
        MergeSort.mergeSort( unsortedMergeArray );
        printTime( "Merge", startMergeTime );

        System.out.println(Arrays.equals( sortedArray, unsortedSelectionArray ));
        System.out.println(Arrays.equals( sortedArray, unsortedBubbleArray ));
        System.out.println(Arrays.equals( sortedArray, unsortedInsertionArray ));
        System.out.println(Arrays.equals( sortedArray, unsortedMergeArray ));
    }

    public static int[] generateRandomArray(int length) {
        int[] unsortedArray = new int[length];
        for (int a = 0; a < unsortedArray.length; a++) {
            int sign = Math.random() > 0.5 ? 1 : -1;
            unsortedArray[a] = (int)(Math.random() * Integer.MAX_VALUE) * sign;
        }
        return unsortedArray;
    }

    public static void printTime(String sort, long startingTime) {
        System.out.println(sort +" sort took: " + (System.currentTimeMillis() - startingTime) + "ms");
    }

    public static void warmup(){
        for(int a = 0; a < 10; a++) {
            int[] unsortedArray = generateRandomArray( 20000 );
            BubbleSort.bubbleSort( unsortedArray );
            System.out.print( unsortedArray[15] );
        }
        System.out.println();
    }
}
