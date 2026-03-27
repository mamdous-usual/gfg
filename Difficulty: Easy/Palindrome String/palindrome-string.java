class Solution {
    boolean isPalindrome(String s) {
        // Two pointers
        int i = 0; // Start
        int j = s.length() - 1; // End
        
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}