class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> y = new ArrayList<>();

        int max = -999999;

        for(int i = arr.length - 1; i >= 0; i--){
            if(max <= arr[i]){
                y.add(arr[i]);
                max = arr[i];
            }
            // System.out.println(arr[i]);
        }

        int start = 0;
        int end = y.size()-1;

        while(start< end){
            int temp = y.get(start);
            y.set(start, y.get(end));
            y.set(end, temp);
            start++;
            end--;
        }
        return y;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna