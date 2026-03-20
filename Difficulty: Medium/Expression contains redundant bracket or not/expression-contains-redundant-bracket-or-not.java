class Solution {
    public static boolean checkRedundancy(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> operators = new ArrayList<>(Arrays.asList('+','-','*','/'));
        
        for(char ch : s.toCharArray()) {
            if (ch == '(' || operators.contains(ch)) {
                stack.push(ch);
            } else if (ch == ')') {
                char top = stack.pop();
                if(!operators.contains(top)) return true; // Yes, its redundant
                while(!stack.isEmpty() && operators.contains(stack.peek())) {
                    stack.pop();
                }
                stack.pop();
            }
        }
        
        return false;
    }
}
