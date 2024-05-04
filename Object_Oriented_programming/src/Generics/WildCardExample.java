package Generics;

import java.util.Arrays;
import java.util.List;


public class WildCardExample<T> {

    // https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T val){
        if(this.isFull()){
            resize();
        }
        data[size++] = val;
    }

    // Here i can pass the primitives that are int, float -> that belongs to Number class
    public void getList(List<? extends Number> list2){
        // do something

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
        WildCardExample<Integer> list = new WildCardExample<>();

        for (int i = 0; i < 12; i++) {
            list.add(2*i+1);
        }

        System.out.println(list);
    }
}
