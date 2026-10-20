class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1 ||nums[0]<nums[nums.length-1]) return nums[0];

        int left = 0;
        int right = nums.length - 1;

        while(right -left>1){
            int mid = (left+right)/2;
            if(isbefore(nums, mid)){
                left = mid;
            }
            else{
                right = mid;
            }
        }
        return nums[right];
    }

    public boolean isbefore(int[] nums, int i){
        if(nums[i]>nums[0] && nums[i]>nums[nums.length-1]) return true;
        return false;
    }
}
