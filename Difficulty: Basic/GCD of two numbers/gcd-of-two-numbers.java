class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(a == 0 ) return b;
        
        int temp = gcd(b%a, a);
        return temp;
    }
}
