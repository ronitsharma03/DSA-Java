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
