package lesson14samples;

import lesson13.ForumUser;

/**
 * @author Alex
 * @since 10.10.14
 */
@SuppressWarnings("unused")
public class SuppressWarningsSample {

    public static void main(String[] args) {
        function("sdafsdf");
    }


    /**
     * deprecated because
     * use sdfsdf instead
     * @param o
     */
    @Deprecated
    public static void function(Object o) {
        ForumUser f = (ForumUser) o;
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1.equals(s2));
        System.out.println(f);
    }

}
