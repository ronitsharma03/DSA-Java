package LL;

public class MergeSort {

    // Sort the two LL and merge them
    // Using merge sort
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){ // base condition
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }
    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(list1 != null && list2 != null){
            if(list1.value < list2.value){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode middleNode(ListNode head) {
        ListNode midPrev = null;

        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }



    private class ListNode{
        int value;
        ListNode next;

        public ListNode(){

        }
        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
