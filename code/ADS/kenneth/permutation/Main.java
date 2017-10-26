package ADS.kenneth.permutation;

import java.util.ArrayList;

/**
 * Created by kenneth on 26-10-2017.
 */
public class Main {
    public static void main(String... args) {

        printPermutation("abasdc");

    }

    public static void printPermutation(String text) {
        for (int i = 0; i < text.length(); i++) {
            ArrayList<Character> tempList = new ArrayList<>();
            for (char c : text.toCharArray()) {
                tempList.add(c);
            }
            tempList.remove(i);
            printPermutation(String.valueOf(text.toCharArray()[i]),tempList);
        }
    }

    private static void printPermutation(String pre, ArrayList<Character> text) {
        if (text.size() == 0) {
            System.out.println(pre);
            return;
        }
        for (int i = 0; i < text.size(); i++) {
            ArrayList<Character> tempList = new ArrayList<>();
            for (char c : text) {
                tempList.add(c);
            }
            String other = pre;
            other += tempList.get(i);
            tempList.remove(i);
            printPermutation(other, tempList);
        }
    }
}
