class Solution {
    public String reverseWords(String s) {
        // Code here
       StringBuilder result = new StringBuilder();
        int right = s.length()-1;
        
        while(right>=0){
            if(s.charAt(right)=='.'){
                right--;
                continue;
            }
            int left=right;
            while(left>=0 && s.charAt(left) !='.'){
                left--;
            }
            
            if(result.length()>0){
                result.append(".");
                
            }
            result.append(s.substring(left+1, right+1));
            right= left-1;
        }
        return result.toString();


    }
}
