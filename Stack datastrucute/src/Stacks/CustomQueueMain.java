package Stacks;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception{
        DynamicCircularQueue queue = new DynamicCircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.insert(22);
        queue.insert(25);
        System.out.println(queue.remove());
        queue.insert(122);

        queue.display();
    }
}
