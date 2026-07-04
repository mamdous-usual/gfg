class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp = n;
        int reverse = 0;

        while(temp != 0) {
            int ld = temp % 10;
            reverse = reverse * 10 + ld;
            temp /= 10;
        }

        return reverse == n;


    }
}