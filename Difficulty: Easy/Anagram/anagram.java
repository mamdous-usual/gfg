class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) {
            return false;
        }
        
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        
        for(int i=0; i<s1Arr.length; i++) {
            if(s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }
        
        return true;
    }
}