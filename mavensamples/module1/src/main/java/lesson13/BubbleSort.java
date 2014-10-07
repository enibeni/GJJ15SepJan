package lesson13;

import java.util.*;

/**
 * @author Alex
 * @since 07.10.14
 */
public class BubbleSort {

    //1 | 1 | 2 | 3 | 5 | 6 | 8
//    n + n-1 + n-2 + n-3 + ... + 1

    public static void main1(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(3, 5, 7, 2, 1, 1, 10, -1));
        bubbleSortAnton(list);
        System.out.println(list);
    }

        //iterators
    public static <T extends Comparable<? super T>> void bubbleSort2(List<T> list) {
        if (list.size() <= 1) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            for (ListIterator<T> first = list.listIterator(0), second = list.listIterator(1); second.hasNext() && second.nextIndex() <=i; ) {
                T firstValue = first.next();
                T secondValue = second.next();

                if (firstValue.compareTo(secondValue) > 0) {
                    first.set(secondValue);
                    second.set(firstValue);
                }
            }
        }
    }


    public static void main(String[] args) {
        List<Integer> list = generateLongList(2000);
        long start = System.currentTimeMillis();
        bubbleSortAnton(list);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        //        System.out.println(list);
    }

    public static <T extends Comparable<? super T>> void bubbleSortEvgeny(List<T> list) {
            for (int i = list.size() - 1; i >= 0; i--) {
                Iterator<T> iterator = list.iterator();
                for (int j = 0; j < i; j++) {
                    T currentElement = iterator.next();
                    T nextElement = iterator.next();

                    //swap j, j+1 if >
                    if (currentElement.compareTo(nextElement) > 0) {
                        T val = currentElement;
                        currentElement = nextElement;
                        nextElement = val;
                    }
                }
            }
        }

    public static <T extends Comparable<? super T>> void bubbleSortAnton(List<T> list) {

            ListIterator<T> iterator1 = list.listIterator(0), iterator2 = list.listIterator(1);
            for (int i = list.size() - 1; i >= 0; --i) {
                for (; iterator1.nextIndex() < i; ) {
                    T buf1, buf2;
                    if ((buf1 = iterator1.next()).compareTo(buf2 = iterator2.next()) > 0) {
                        iterator1.set(buf2);
                        iterator2.set(buf1);
                    }
                }
                iterator1 = list.listIterator(0);
                iterator2 = list.listIterator(1);
            }
        }



    private static List<Integer> generateLongList(int count) {
        Random random = new Random();
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < count; i++) {
            result.add(random.nextInt());
        }
        return result;
    }



    //переписать так, чтобы для LinkedList  работало за n*n
    public static <T extends Comparable<? super T>> void bubbleSort(List<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                //swap j, j+1 if >
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T val = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, val);
                }
            }
        }
    }
























}
