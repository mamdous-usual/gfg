class Solution {
  
    static int MAX_N = 200005;
    static int[] spf = new int[MAX_N];
    static boolean isSieveBuilt = false;

    static void sieve() {
        for (int i = 0; i < MAX_N; i++) {
            spf[i] = i;
        }

        spf[0] = spf[1] = -1;
        
        for (int i = 2; i * i <= MAX_N; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j < MAX_N; j += i) {
                    spf[j] = Math.min(spf[j], i);
                }
            }
        }
        
        isSieveBuilt = true;
    }

    static List<Integer> findPrimeFactors(int N) {
        if (!isSieveBuilt) {
            sieve();
        }

        List<Integer> ans = new ArrayList<>();
        while (N > 1) {
            int factor = spf[N];
            ans.add(factor);
            N = N / factor;
        }
        
        return ans;
    }
}