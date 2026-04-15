/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        while(q.size() > 0) {
            int n = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=1; i<=n; i++) {
                Node temp = q.remove();
                level.add(temp.data);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            ans.add(level);
        }
        
        return ans;
    }
}