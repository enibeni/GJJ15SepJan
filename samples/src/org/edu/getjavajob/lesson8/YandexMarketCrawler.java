package org.edu.getjavajob.lesson8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Alex
 * @since 26.09.14
 */
public class YandexMarketCrawler {
    public static void main(String[] args) throws MalformedURLException {
        try(InputStream market = new URL("http://market.yandex.ru/model.xml?modelid=8514837&hid=90633").openStream()) {
            final String text = new Scanner(market).useDelimiter("\\A").next();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
