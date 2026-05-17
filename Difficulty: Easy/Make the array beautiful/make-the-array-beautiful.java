class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(!stack.isEmpty()){
                if((stack.peek() >= 0 && arr[i] < 0) || (stack.peek() < 0 && arr[i] >= 0)){
                stack.pop();
            }
                else{
                    stack.push(arr[i]);
                }
                
            }
            else{
                stack.push(arr[i]);
            }
        }
        
        for(int num : stack){
            res.add(num);
        }
       
        return res;
}
}