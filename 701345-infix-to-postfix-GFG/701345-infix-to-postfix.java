class Solution {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        String ans = "";
        int i = 0;
        while(i < s.length()){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || 
            (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
            (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                ans+=s.charAt(i);
            }
            else if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                while(!st.empty() && st.peek() != '('){
                    ans+=st.peek();
                    st.pop();
                }
                if(!st.empty()){
                    st.pop();
                }
            }
            else{
                while(!st.empty() && st.peek() != '(' && 
                    (priority(s.charAt(i)) < priority(st.peek()) ||
                    (priority(s.charAt(i)) == priority(st.peek()) 
                    && s.charAt(i) != '^'))){
                    ans+=st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.empty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
    public static int priority(char x){
        if(x == '^'){
            return 3;
        }
        else if(x == '*' || x == '/'){
            return 2;
        }
        else if(x == '+' || x == '-'){
            return 1;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna