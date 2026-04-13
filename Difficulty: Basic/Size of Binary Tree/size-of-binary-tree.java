/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int getSize(Node node) {
        // code here
        if(node == null) return 0;
        
        int x = getSize(node.left);
        int y = getSize(node.right);
        
        return x + y + 1;
    }
}