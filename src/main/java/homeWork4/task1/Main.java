package homeWork4.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(10);
        myArrayList.add(17);
        myArrayList.add(2, 1);
        myArrayList.remove(3);
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList);
    }
}
