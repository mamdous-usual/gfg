class Solution {
    public ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(n <= 2){
            return ans;
        }
        
        boolean[] p = new boolean[n+1];
        Arrays.fill(p, true);
        
        p[0]=p[1]=false;
        
        for(int i=2; i*i<=n; i++) {
            if(p[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    p[j] = false;
                }
            }
        }
        
        for(int i=2; i<=n; i++) {
            if(p[i]) {
                ans.add(i);
            }
        }
        
        return ans;
        
    }
}