package Generics;

import java.util.Arrays;
import java.lang.Object;
import java.util.Objects;


public class CustomGenericsArrayList<T> {

    // https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T val){
        if(this.isFull()){
            resize();
        }
        data[size++] = val;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // copy the current items to the temp array
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        return (T)(data[--size]);
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "Custom Array List { " +
                "data = " + Arrays.toString(data) +
                ", size = " + size +
                " }";
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();

        for (int i = 0; i < 12; i++) {
            list.add(2*i+1);
        }

        System.out.println(list);
    }
}
