class Solution {
     public boolean isValid(String s) {
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = (char) stack.pop();
                if (s.charAt(i) == ')' && temp != '(' || s.charAt(i) == '}' && temp != '{'
                        || s.charAt(i) == ']' && temp != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty()?true:false;
    }
}