class Solution {
    public int maxSubArray(int[] nums) {
        int i=1;
        int curr_sum=nums[0];
        int max_sum=nums[0];
        while(i<nums.length){
            curr_sum = Math.max(nums[i], curr_sum + nums[i]);
            max_sum = Math.max(max_sum, curr_sum);
            i++;
        }
        return max_sum;
    }
}
