package lesson14samples;

import java.io.*;
import java.util.Scanner;

/**
 * @author Alex
 * @since 10.10.14
 */
public class LoadFileFromClasspath {
    public static void main(String[] args) {
        new LoadFileFromClasspath().readFileFromClasspath();
    }

    public void readFileFromClasspath() {
        String s = "";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("fileinjar3.txt")))) {
            String text = new Scanner(reader).useDelimiter("\\A").next();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileFromFile() {
        File f = new File("module1/src/main/resources/fileinjar.txt");
        try (BufferedReader reader =new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
            String text = new Scanner(reader).useDelimiter("\\A").next();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
