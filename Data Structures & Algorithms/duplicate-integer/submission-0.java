class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val: nums){
           if(map.containsKey(val)){
                return true;
            }
            else{
                map.put(val,1);
            } 
        }
        return false;

    }
}