# [Infix To Prefix](https://www.geeksforgeeks.org/problems/infix-to-prefix-notation/1)
## Medium
You are given a string s&nbsp;representing an infix expression. Convert this infix expression to a prefix expression.

Infix&nbsp;: The expression of the form a op b. When an operator is in between every pair of operands.
Prefix : The expression of the form op a b. When an operator comes before its two operands.

 
Precedence Order and Associativity are as follows: 

^ has the highest precedence and is evaluated from right to left.
* and / come next with left to right associativity.
+ and -&nbsp; have the lowest precedence with left to right associativity.

Examples:
Input: s = "a*(b+c)/d"Output: /*a+bcdExplanation: The infix expression is a*(b+c)/d. First, inside the brackets, b + c becomes +bc. Now the expression looks like a*(+bc)/d. Next, multiply a with (+bc), so it becomes *a+bc. Finally, divide this result by d, so it becomes /*a+bcd.
Input: s = "(a-b/c)*(a/k-l)"Output:&nbsp;*-a/bc-/aklExplanation: The infix expression is (a-b/c)*(a/k-l). First, inside the brackets, b/c becomes /bc and a/k becomes /ak.Now the expression looks like (a-/bc) * (/ak-l).Next, handle the subtractions: a-/bc becomes -a/bc, and /ak-l becomes -/akl. Finally, multiply the two results: (-a/bc * -/akl) becomes *-a/bc-/akl.
Constraints:3 ≤ s.length() ≤ 5*103s[i] can be an operand (a–z, A–Z, 0–9), an operator (+, -, *, /, ^) or a parenthesis ((, ))