
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int zeros = 0;
        int total = 1;
        for (int x : nums) {
            if (x == 0) zeros++;
            else total *= x;
        }

        if (zeros > 1) {
            Arrays.fill(ans, 0);
            return ans;
        }

        for (int i = 0; i < n; i++) {
            if (zeros == 1) {
                ans[i] = (nums[i] == 0) ? total : 0;
            } else {
                ans[i] = total / nums[i];
            }
        }
        return ans;
    }
}
