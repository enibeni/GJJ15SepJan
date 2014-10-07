package lesson13;

import java.util.*;

/**
 * @author Alex
 * @since 07.10.14
 */
public class StringInternDemo {
    public static final int STRING_COUNT = 10000;

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < STRING_COUNT; i++) {
              strings.add(randomString(2));
        }
        //show count of distinct strings
        Set<String> distinctStrings = new HashSet<>();
        distinctStrings.addAll(strings);
        System.out.println(distinctStrings.size() + " / " + STRING_COUNT);

        System.out.println(countDistinctObjectEquals(strings) + " / " + STRING_COUNT);
    }

    //distinct by ==
    private static int countDistinctObjectEquals(List<String> strings) {
        Set<StringHolder> distinct = new HashSet<>();
        for (String string : strings) {
            distinct.add(new StringHolder(string));
        }
        return distinct.size();
    }

    public static class StringHolder {
        private final String value;

        public StringHolder(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if(this.getClass() != obj.getClass()) {
                return false;
            }
            StringHolder other = (StringHolder) obj;
            return other.getValue() == this.getValue();
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }


    private static String randomString(int chars) {
        Random random = new Random();
        StringBuffer buffer = new StringBuffer("");
        for (int i = 0; i < chars; i++) {
            buffer.append('a' + random.nextInt(30));
        }
        return  buffer.toString();
    }
}
