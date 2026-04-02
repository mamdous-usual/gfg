/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        if(head == null || head.next == null )  {
           return head;
       }

       Node prev = null;
       Node curr = head;

       while(curr != null) {
           Node next = curr.next; // currP1 -> current+1
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       head = prev;

       return head;
    }
}