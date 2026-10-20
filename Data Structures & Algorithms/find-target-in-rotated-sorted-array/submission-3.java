class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) return m;

            // Left half [s..m] is sorted
            if (nums[s] <= nums[m]) {
                if (nums[s] <= target && target < nums[m]) {
                    e = m - 1;        // target lies in left half
                } else {
                    s = m + 1;        // target lies in right half
                }
            } else { // Right half [m..e] is sorted
                if (nums[m] < target && target <= nums[e]) {
                    s = m + 1;        // target lies in right half
                } else {
                    e = m - 1;        // target lies in left half
                }
            }
        }
        return -1;
    }
}