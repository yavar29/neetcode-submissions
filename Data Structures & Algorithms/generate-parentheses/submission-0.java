class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] arr = new char[2 * n];
        backtrack(arr, result, n, 0, 0, 0);
        return result;
    }

    private void backtrack(char[] arr, List<String> result, int size, int open, int close, int index) {
        if (index == 2 * size) {
            result.add(new String(arr));
            return;
        }

        if (open < size) {
            arr[index] = '(';
            backtrack(arr, result, size, open + 1, close, index + 1);
        }

        if (close < open) {
            arr[index] = ')';
            backtrack(arr, result, size, open, close + 1, index + 1);
        }
    }
}
