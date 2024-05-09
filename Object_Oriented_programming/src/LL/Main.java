package LL;

public class Main{
    public static void main(String[] args) throws Exception{
        LL list = new LL();
        list.insertAtFirst(9);
        list.insertAtFirst(8);
        list.insertAtFirst(7);
        list.insertAtFirst(6);
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertAtEnd(10);
        list.insert(33, 15);

        list.display();
    }
}
