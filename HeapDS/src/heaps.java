import java.util.ArrayList;

public class heaps<T extends Comparable<T>> {
    private ArrayList<T> list;

    public heaps(){
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

    public T remove() throws Exception{
        // If the heap is empty throws an exception
        if(list.isEmpty()){
            throw new Exception("Removing from the empty heap!");
        }

        // Get the root element because that is going to be removed
        T removed = list.get(0);
        // Now as the root is empty we have to put the last element at the root position
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0, last);
            // while insertion we go and swap upwards as the insertion takes place from the last index and we compare upwards but while removal we remove from top and insert the last index node at the very first place so we now compare them downwards -> downheap
            downheap(0);
        }


        return removed;
    }

    private void downheap(int index) {
        // Assume the minimum to be the actual current index
        int min = index;

        // find the left and the right index child
        int left = left(index);
        int right = right(index);

        // if the min is greater than its left child then make the left child new min
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        // if the min is greater than its right child then make the right child new min
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        // now check if the min is not equal to index the actual one -> then it means the new min is either left or right then just simply swap the new min and the index value and call the downheap to the swapped node at min
        if(min != index){
            swap(min, index);
            downheap(min);
        }
        // if the min is equal to the index it means the tree is just fine it dont need any further operations

    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

}
