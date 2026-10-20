class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i]^i;
        }
        return ans^nums.length;
    }
}


// 1 2 3 

// 0 1 2 3
