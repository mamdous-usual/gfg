class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        if(s == null || s.length() < 1) {
            return 0;
        }
        
        Set<Character> seen = new HashSet<>();
        
        int maxLength = 0;
        int left = 0;
        
        for(int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            while(seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            
            seen.add(currentChar);
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}