package lesson12jdbc;

import java.util.*;

/**
 * @author Alex
 * @since 05.10.14
 */
public class RevertList {
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        l.addAll(Arrays.asList("a", "b", "c", "d", "e"));
        revertList(l);
        Collections.reverse(l);
        System.out.println(l); //should be [e, d, c, b, a]
    }


    //реализовать метод, разворачивающий в обратном порядке
    //сдача ~20.17
    public static void revertList(List<String> list) {
        for (ListIterator<String> first = list.listIterator(), last = list.listIterator(list.size());
             first.hasNext() && last.hasPrevious() && first.nextIndex() < last.previousIndex(); ) {
            String valFirst = first.next();
            String valLast = last.previous();

            first.set(valLast);
            last.set(valFirst);
        }
    }

    public static void revertListAnton(List<String> list) {
            ListIterator iterator = list.listIterator(list.size()-1);
            Object object  = iterator.previous();
            for (;iterator.hasPrevious();){
                list.add((String) object);

                iterator.remove();
                object = iterator.previous();
            }
        }

    public static void revertListKostya(List<String> list) {
        for (int i = list.size() / 2; i < list.size(); i++) {
            int temp1 = i - 1;
            int temp2 = list.size() - i;
            String temp = list.get(temp1);
            list.set(temp2, temp);
        }
    }

    public static List revertListArtem(List<String> list) {

        List<String> newlist = new LinkedList<>();
        for (int j = list.size(); j >= 0; j--) {

            newlist.add(list.get(j));
        }

        return newlist;
    }

    public static void revertListDenis(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        } //проход до максимального значения
        System.out.print("[");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.print("]"); //проход назад
    }

    public static void reverseListBad(List<String> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            String left = list.get(i);
            String right = list.get(list.size() - 1 - i);

            list.set(i, right);
            list.set(list.size() - i - 1, left);
        }
    }



}
