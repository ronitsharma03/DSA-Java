import java.util.ArrayList;

public class heaps<T extends Comparable<T>> {
    private ArrayList<T> list;

    private heaps(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        // taking the root to be at 0th index
        return (index - 1)/2;
    }

    private int left(int index){
        // According to the parent index its left child will be at
        return ((2 * index) + 1);
    }

    private int right(int index){
        // According to the parent index its right child will be at
        return ((2 * index) + 2);
    }

    public void insert(T value){
        // We satrt inserting from the end
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index){
        // if the index = 0 then it is a base condition then we can add it in left or right
        if(index == 0){
            return;
        }
        // Getting the parent of the current index node
        int p = parent(index);

        // If the current node is less than the parent because this returns -1, 0, if the objects comparing is smaller, equal to or greater respectively!
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }
    }



}
