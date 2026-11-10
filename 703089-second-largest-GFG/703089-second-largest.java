class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int x = arr[0];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        if(count == arr.length){
            return -1;
        }

        int first = -99999999;
        int second  = -99999999;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > first){
                second  = first;
                first = arr[i];
            }
            else if(arr[i] < first && second < arr[i]){
                second  = arr[i];
            }
        }
        return second;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna