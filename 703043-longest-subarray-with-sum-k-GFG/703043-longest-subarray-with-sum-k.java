class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Long, Integer> map = new HashMap<>();
        int maxlen = 0;
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
            
            if(sum == k){
                maxlen = Math.max(maxlen, i+1);
            }
            
            long rem = sum - k;
            
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        
        return maxlen;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna