package Stacks;

import java.util.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class InbuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(4);
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue.remove());  Gives exception if the queue is already empty

        Deque<Integer> deque = new ArrayDeque<>();

    }
}
