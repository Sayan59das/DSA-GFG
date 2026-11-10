class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        
        ArrayList<Integer> arr = new ArrayList<>();
        int n=a.length;
        int freq[] = new int[100001];
        for(int i=0;i<n;i++){
            freq[a[i]]++;
        }
        
        for(int i=0;i<b.length;i++){
            if(freq[b[i]] > 0){
                arr.add(b[i]);
                freq[b[i]] = 0;
            }
        }
        
        return arr;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna