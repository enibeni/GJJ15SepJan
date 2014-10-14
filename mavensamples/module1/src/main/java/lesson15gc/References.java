package lesson15gc;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Alex
 * @since 12.10.14
 */
public class References {
    static WeakHashMap<String, List<String>> synonyms = new WeakHashMap<>();

    public static void main(String[] args) {



//        WeakReference

//                SoftReference

//        -------
    }

    public static List<String> getByWord(String s) {
        //call database

        //

        synonyms.put(s, null);

        return null;

    }
}
