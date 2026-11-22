class Solution {
    static String infixToPrefix(String x) {
        // code here
        x = reverse(x);
        x = swap(x);
        x = convert(x);
        x = reverse(x);
        return x;
        
    }
    public static String convert(String x){
           Stack<Character> st = new Stack<>();
           String ans = "";
           int i = 0;
           while(i < x.length()){
               if ((x.charAt(i) >= 'A' && x.charAt(i) <= 'Z') ||
                       (x.charAt(i) >= 'a' && x.charAt(i) <= 'z') ||
                       (x.charAt(i) >= '0' && x.charAt(i) <= '9')) {
                   ans += x.charAt(i);
               }
               else if (x.charAt(i) == '(') {
                   st.push(x.charAt(i));
               }
               else if (x.charAt(i) == ')') {
                   while (!st.empty() && st.peek() != '(') {
                       ans += st.peek();
                       st.pop();
                   }
                   if (!st.empty()) {
                       st.pop();
                   }
               }
               else{
                   if(x.charAt(i) == '^'){
                       while(!st.empty() && priority(x.charAt(i)) <= priority(st.peek())){
                           ans+=st.peek();
                           st.pop();
                       }
                   }
                   else{
                       while(!st.empty() && priority(x.charAt(i)) < priority(st.peek())){
                           ans+=st.peek();
                           st.pop();
                       }
                   }
                   st.push(x.charAt(i));
               }
               i++;
           }
           while (!st.empty()) {
               ans += st.peek();
               st.pop();
           }
           return ans;
       }
       public static String reverse(String x){
           StringBuilder sb = new StringBuilder(x);
           sb.reverse();
           return sb.toString();
       }
       public static int priority(char ch) {
           if (ch == '^') {
               return 3;
           }
           else if (ch == '*' || ch == '/') {
               return 2;
           }
           else if (ch == '+' || ch == '-') {
               return 1;
           }
           return -1;
       }
       public static String swap(String x){
           String ans = "";
           for(int i = 0; i < x.length(); i++){
               if(x.charAt(i) == '('){
                   ans += ')';
               }
               else if(x.charAt(i) == ')'){
                   ans += '(';
               }
               else{
                   ans += x.charAt(i);
               }
           }
           return ans;
       }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna