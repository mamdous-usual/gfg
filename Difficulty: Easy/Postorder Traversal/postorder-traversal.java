/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        postOrderTraversal(root, ans);
        
        return ans;
    }
    
    static void postOrderTraversal(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        
        postOrderTraversal(root.left, ans);
        postOrderTraversal(root.right, ans);
        
        ans.add(root.data);
    }
}