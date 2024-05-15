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

    // Insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public int lengthCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                // calculate the length
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
        public Node detectCycle(Node head) {
            int length = 0;

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(fast == slow){
                    length = lengthCycle(slow);
                    break;
                }
            }
            // find the start node
            Node first = head;
            Node second = head;

            while(length > 0){
                second = second.next;
                length--;
            }

            // Keep moving both forward and they will meet at start
            while(first != second){
                first = first.next;
                second = second.next;
            }
            return second;
        }

    public void removeDup(){
        Node temp = head;
//        Node prev = temp;
//        temp = temp.ne xt;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
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


    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public int delete(int index){
        if(index == size){
            return deleteLast();
        }
        if(index == 0){
            return deleteFirst();
        }

        Node previous = get(index - 1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }

    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
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
