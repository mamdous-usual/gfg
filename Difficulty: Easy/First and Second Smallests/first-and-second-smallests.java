class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        // code here
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        
        for(int num : arr) {
            if(num < min) min = num;
        }
        
        for(int num : arr ) {
            if(num < sMin && num > min) sMin = num;
        }
         if(sMin != Integer.MAX_VALUE) {
            res.add(min);
            res.add(sMin);
        } else {
            // If second smallest doesn't exist, add -1
            res.add(-1);
        }
        return res;
    }
}
