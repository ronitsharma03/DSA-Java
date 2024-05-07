package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Arraylist is generally faster because it is not synchronized -> multiple threads can access it
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(2);
        list2.add(33);
        System.out.println(list);
        System.out.println(list2);

        // Vector is generally slower because it is not synchronized -> if one thread is accessing it other thread has to wait
        List<Integer> vector = new Vector<>();
        vector.add(422);
        vector.add(122);
        vector.add(221);
        vector.add(223);
        vector.add(232);
        System.out.println(vector);
    }
}
