import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // A stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the string character by character
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            } else if (c == ')') {
                // If it's a closing parenthesis, the stack must not be empty
                // and the top element must be an opening parenthesis
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                // If it's a closing brace, check for matching opening brace
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                // If it's a closing bracket, check for matching opening bracket
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        // After iterating through all characters, the stack must be empty
        // for the input string to be valid
        return stack.isEmpty();
    }
}

