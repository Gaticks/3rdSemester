package ADS.kenneth.backtrack;

import java.util.Arrays;

public class AcendingNumbers {
    public static void main(String... args) {
        int[] a = {1, 2, 3, 4};
        backTrack(a, new int[0]);

    }


    public static void backTrack(int[] input, int[] result) {
        if (result.length > 0) {
            String tempString = "";
            for (int item : result) {
                tempString += item;
            }
            System.out.println(tempString);
        }

        for (int item : input) {
            if (isValid(result, item)) {
                //build new result arrray
                int[] temp = Arrays.copyOf(result, result.length + 1);
                temp[temp.length - 1] = item;
                backTrack(input, temp);
            }
        }
    }

    private static boolean isValid(int[] result, int next) {
        if (result.length == 0)
            return true;
        return result[result.length - 1] < next;
    }
}
