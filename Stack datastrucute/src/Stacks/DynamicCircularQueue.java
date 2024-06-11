package Stacks;

public class DynamicCircularQueue extends CircularQueue{

    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;
        }

        // At this point we know array is not full, So
        // else insert the items in the normal way with super
        return super.insert(item);
    }
}
