/* Linked List Node Structure
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
    Node mergeKLists(Node[] arr) {
        // code here
        if(arr == null || arr.length == 0) {
            return null;
        }
        
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b) -> a.data - b.data);
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != null) {
                minHeap.offer(arr[i]);
            }
        }
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        
        while(!minHeap.isEmpty()) {
            Node minNode = minHeap.poll();
            
            curr.next = minNode;
            curr = curr.next;
            
            if(minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }
        
        return dummy.next;
    }
}