class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1) return nums[0];
        int prev1 = 0;
        int prev2 = 0;
        for(int i=0;i<=nums.length-2;i++){
            int curr = Math.max(nums[i]+prev2, prev1);
            prev2=prev1;
            prev1=curr;
        }
        int max1=prev1;
        prev1=0;
        prev2=0;

        for(int i=1;i<=nums.length-1;i++){
            int curr = Math.max(nums[i]+prev2, prev1);
            prev2=prev1;
            prev1=curr;
        }
        int max2=prev1;
        return Math.max(max1, max2);
    }
}