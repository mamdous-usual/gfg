class Solution {
	public int maxWater(int arr[]) {
		// Code Here
		if (arr.length < 2) {
            return 0;
        }
		int i = 0;
		int j = arr.length - 1;
		int ans = Integer.MIN_VALUE;
		
		while (i < j) {
			int w = (j - i) * Math.min(arr[i], arr[j]);
			ans = Math.max(ans, w);
			
			if (arr[i] <= arr[j]) {
				i++;
			} else {
				j--;
			}
		}
		
		return ans;
		
	}
}
