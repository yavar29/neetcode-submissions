class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        int length = 1;
        int ans=1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for(Integer num: set){
            if(!set.contains(num-1)){
                length = 1;
                while(set.contains(num+length)){
                    length ++;
                }
                ans=Math.max(ans, length);
            }
        }

        return ans;
    }
}