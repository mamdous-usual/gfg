class Solution {
    public int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
    
    int gcd(int a, int b) {
        if(a==0) return b;
        
        int temp = gcd(b%a, a);
        
        return temp;
    }
}