package lesson14samples;

/**
 * @author Alex
 * @since 10.10.14
 */
public class BitwiseTest {
    public static void main(String[] args) {
        int x = 234324;

        System.out.println(~x);
        System.out.println(0xFFFFFFFF ^ x);
    }
}
