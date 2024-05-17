package LL;

public class DLL {
    private Node head;

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insert(int after, int val){
        Node p = findNode(after);
        // If the node to find does not exist
        if(p == null){
            System.out.println("Node with given value doesn't exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.prev != null){
            node.next.prev = node;
        }
    }



    public void display(){
        Node node = head;
        // Maintaining the last node
        Node lastNode = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            // When the loop ends the lastNode will be pointing to the last node in DLL
            lastNode = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse - ");
        while (lastNode != null){
            System.out.print(lastNode.val + " -> ");
            lastNode = lastNode.prev;
        }
        System.out.println("START");
    }

 private class Node{
     int val;
     Node next;
     Node prev;

     public Node(int val) {
         this.val = val;
     }

     public Node(int val, Node next, Node prev) {
         this.val = val;
         this.next = next;
         this.prev = prev;
     }
 }
}
