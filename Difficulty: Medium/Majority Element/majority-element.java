class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i=0; i<n; i++) {
            if(map.containsKey(arr[i])) {
                int temp = map.get(arr[i]);
                map.put(arr[i],temp+1);
            } else {
                map.put(arr[i],1);
            }
        }

        for (int i=0; i<n; i++) {
            if(map.get(arr[i]) > (n/2)) {
                return arr[i];
            }
        }

        return -1;
    }
}