/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        
        if(head == null) return -1;
        Node f = head;
        Node s = head;
        
        while(f!= null && f.next!= null) {
            s = s.next;
            f = f.next.next;
        }
        
        return s.data;
    }
}