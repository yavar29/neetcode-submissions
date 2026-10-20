class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) return false;

                if (c == ')' && s.peek() == '(') {
                    s.pop();
                } else if (c == '}' && s.peek() == '{') {
                    s.pop();
                } else if (c == ']' && s.peek() == '[') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
