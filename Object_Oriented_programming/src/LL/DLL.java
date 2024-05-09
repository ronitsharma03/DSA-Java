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

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
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
