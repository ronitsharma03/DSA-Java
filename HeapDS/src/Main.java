import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        heaps<Integer> heap = new heaps<>();
        heap.insert(100);
        heap.insert(132);
        heap.insert(112);
        heap.insert(122);
        heap.insert(120);
        heap.insert(101);


//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}