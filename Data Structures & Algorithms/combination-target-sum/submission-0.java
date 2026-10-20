class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        findCombinations(0, nums, target, new ArrayList<>());
        return ans;
    }

    private void findCombinations(int index, int[] nums, int target, List<Integer> res){
        if(index == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(res));
            }
            return;
        }

        if(nums[index]<=target){
            res.add(nums[index]);
            findCombinations(index, nums, target - nums[index], res);
            res.remove(res.size() -1);
        }
        findCombinations(index+1, nums, target, res);
    }
}
