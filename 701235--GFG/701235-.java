class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int i = 0; 
        int j = 0;
        int k = 0;


        int x = a.length;
        int y = b.length;

        ArrayList<Integer> arr = new ArrayList<>();

        while(i < x && j < y){
            if(a[i] <= b[j]){
                if(k == 0 || arr.get(k-1) != a[i]){
                    arr.add(a[i]);
                    k++;
                }
                i++;
            }
            else{
                if(k == 0 || arr.get(k-1) != b[j]){
                    arr.add(b[j]);
                    k++;
                }
                j++;
            }
        }

        while(i < x){
            if(k == 0 || arr.get(k-1) != a[i]){
                arr.add(a[i]);
                k++;
            }
            i++;
        }

        while(j < y){
            if(k == 0 || arr.get(k-1) != b[j]){
                arr.add(b[j]);
                k++;
            }
            j++;
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna