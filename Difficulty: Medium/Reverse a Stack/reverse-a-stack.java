class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.empty()){
            return;
        }
        
        int num = st.pop();
        reverseStack(st);
        insertAtBottom(st,num);
    }
    
     public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // Using Recursion
        if(st.empty()) {
            st.push(x);
            return st;
        }
        int num = st.pop();
        insertAtBottom(st,x);
        st.push(num);
        return st;
    }
}
