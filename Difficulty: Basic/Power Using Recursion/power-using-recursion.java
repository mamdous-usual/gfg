class Solution {
    static int RecursivePower(int n, int p) {
        if(p == 0) return 1;
        if(p == 1) return n;
        
        int temp = RecursivePower(n,p/2);
        if((p&1) == 0) {
          return  temp * temp;
        } else {
            return temp*temp*n;
        }
    }
}
