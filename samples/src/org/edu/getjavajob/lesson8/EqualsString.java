package org.edu.getjavajob.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Alex
 * @since 26.09.14
 */
public class EqualsString {
    //pool "hi" "and"
    public static String s = "ABCD";
    public static void main(String[] args) {

        for (int i = 0; i < 1_000_000; i++) {
            addWord("and"); //
        }

        int i = 10;
        System.out.println(String.valueOf(i));

        System.out.println(String.format("Number %d is greateer thatn %d", i, i));
    }


    public static void addWord(String word) {
        words.add(word.intern());
    }

    static List<String> words = new ArrayList<>();
}
