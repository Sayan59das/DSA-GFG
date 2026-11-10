class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int count = 0;
        int temp = n;
        int sum = 0;

        while(temp > 0){
            int total = 1;
            int last = temp % 10;
            for(int i = 0; i < 3; i++){
                total = total * last;
            }
            sum+=total;
            temp  = (int)temp/10;
        }

        if(sum == n){
            return true;
        }
        else{
            return false;
        }


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna