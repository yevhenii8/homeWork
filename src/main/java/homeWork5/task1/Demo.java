package homeWork5.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }

        long t3 = System.currentTimeMillis();
        for (int temp : numbers) {
        }
        System.out.println("task3: " + (System.currentTimeMillis() - t3));

        long t4 = System.currentTimeMillis();
        for (int i = 0; i < numbers.size(); i++) {
            int temp = numbers.get(i);
        }
        System.out.println("task4: " + (System.currentTimeMillis() - t4));

        long t5 = System.currentTimeMillis();
        int sizeOfNumbers = numbers.size();
        for (int i = 0; i < sizeOfNumbers; i++) {
            int temp = numbers.get(i);
        }
        System.out.println("task5: " + (System.currentTimeMillis() - t5));

        long t6 = System.currentTimeMillis();
        for (int i = sizeOfNumbers - 1; i > 0; i--) {
            int temp = numbers.get(i);
        }
        System.out.println("task6: " + (System.currentTimeMillis() - t6));

        long t7 = System.currentTimeMillis();
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        System.out.println("task7: " + (System.currentTimeMillis() - t7));

        long t8 = System.currentTimeMillis();
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        System.out.println("task8: " + (System.currentTimeMillis() - t8));
    }
}
