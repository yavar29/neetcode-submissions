class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        int res=0;
        int i=0;
        int total=0;
        while(i<gas.length){
            total+=gas[i]-cost[i];
            if(total<0){
                total =0;
                res=i+1;
            }
            i++;
        }
        return res;
    }
}
