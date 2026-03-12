// User function Template for Java

class Solution {
    static boolean isLeap(int year) {
        // code here
         return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}