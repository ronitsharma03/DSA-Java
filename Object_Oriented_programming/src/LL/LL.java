package LL;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;

    }

    public void insertAtEnd(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insert(int val, int index) throws Exception{
        if(index == 0){
            insertAtFirst(val);
            return;
        }
        if(index > size){
            throw new Exception("Index is out of LL size");
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
