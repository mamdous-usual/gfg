/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        preOrderTraversal(root, ans);
        
        return ans;
    }
    
    static void preOrderTraversal(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        
        ans.add(root.data);
        preOrderTraversal(root.left,ans);
        preOrderTraversal(root.right,ans);
    }
}