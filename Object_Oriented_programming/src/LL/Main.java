package LL;

public class Main{
    public static void main(String[] args) throws Exception{
//        LL list = new LL();
//        list.insertAtFirst(9);
//        list.insertAtFirst(8);
//        list.insertAtFirst(7);
//        list.insertAtFirst(6);
//        list.insertAtFirst(5);
//        list.insertAtFirst(4);
//        list.insertAtEnd(10);
//        list.insert(33, 0);
//        list.display();
//        System.out.println(list.deleteFirst() + " is deleted");
//        list.display();
//        System.out.println(list.deleteLast() + " is deleted");
//        list.display();
//        System.out.println(list.delete(2) + " is deleted");
//        list.display();
//        System.out.println(list.findNode(7));


        // Doubly linkedlist
//        DLL list = new DLL();
//        list.insertAtFirst(9);
//        list.insertAtFirst(8);
//        list.insertAtFirst(7);
//        list.insertAtFirst(6);
//        list.insertAtFirst(5);
//        list.insertAtFirst(4);
//        list.insertAtLast(99);
//        list.insert(9, 66);
//        list.display();


        CLL list = new CLL();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(9);
        list.insert(10);
        list.display();
        list.delete(7);
        list.display();
    }
}
