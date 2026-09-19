/* Node Structure
class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	public void reorderList(Node head) {
		// code here
		
		if (head == null || head.next == null) {
			return;
		}
		
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node first = head;
		Node second = slow.next;
		slow.next = null;
		
		second = reverse(second);
		
		while (second != null) {
			Node temp1 = first.next;
			Node temp2 = second.next;
			
			first.next = second;
			second.next = temp1;
			
			first = temp1;
			second = temp2;
		}
		
	}
	
	private Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		Node prev = null;
		Node curr = head;
		
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			
			curr = next;
		}
		
		return prev;
	}
}
