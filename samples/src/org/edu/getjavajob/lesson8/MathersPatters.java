package org.edu.getjavajob.lesson8;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alex
 * @since 26.09.14
 */
public class MathersPatters {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d+)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);//"324234-12312";
        String s = "0bcm111-222323 324   543 \n 52 34 5asfddsf  234 23 45 453 45";
        ArrayList<String> list = new ArrayList<String>();
        list.add("s");

//        s.replace("a+", "0")  //0bc

        Matcher matcher = pattern.matcher(s);
        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }

    }
}
