class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev=0;
        int curr=0;
        for(int i=2;i<cost.length;i++){
            int costs= Math.min(cost[i-1]+curr,cost[i-2]+prev);
            prev=curr;
            curr=costs;
        }        
        return Math.min(curr+cost[cost.length-1],prev+cost[cost.length-2]);
    }
}