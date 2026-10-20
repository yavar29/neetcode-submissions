class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombinations(int index, int[] nums, int target, List<Integer> res, List<List<Integer>> ans){
        
        if(target == 0){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=index;i< nums.length;i++){

            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]> target) break;

            res.add(nums[i]);
            findCombinations(i+1, nums, target-nums[i], res, ans);
            res.remove(res.size()-1);
        }
    }
}
