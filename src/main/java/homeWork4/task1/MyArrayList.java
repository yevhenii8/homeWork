package homeWork4.task1;

import java.util.Arrays;

public class MyArrayList {

    private int size;

    private int capacity = 10;

    private Integer[] list = new Integer[capacity];

    public MyArrayList() {

    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
    }

    private void expandCapacity() {
        capacity *= 2;
        Integer[] newList = new Integer[capacity];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public int size() {
        return size;
    }

    public void add(int index, Integer number) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) {
            expandCapacity();
        }
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = number;
        size++;
    }

    public void add(Integer number) {
        if (size == capacity) {
            expandCapacity();
        }
        list[size++] = number;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
