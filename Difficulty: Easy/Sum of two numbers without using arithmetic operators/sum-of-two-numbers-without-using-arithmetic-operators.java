class Solution {
    public int sum(int a, int b) {
        // code here
        while(b != 0) {
            int sum = a ^ b;
            int carry = (a&b) << 1;
            a = sum;
            b = carry;
        }
        
        return a;
    }
}