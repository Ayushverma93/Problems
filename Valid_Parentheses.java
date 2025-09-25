import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If closing bracket, check matching
                if (stack.isEmpty()) {
                    return false;  // no opening bracket to match
                }

                char top = stack.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    stack.pop();  // valid match
                } else {
                    return false; // mismatch
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}

