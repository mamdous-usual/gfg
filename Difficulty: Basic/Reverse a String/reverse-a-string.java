// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] ch = s.toCharArray();
        
        int sp = 0;
        int ep = ch.length - 1;
        
        while (sp < ep) {
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
        
        return new String(ch);
    }
}