class Solution {
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<=31;i++){
            if(checkBit(n,i)){
                ans=ans+ (1<<(31-i));
            }
        }
        return ans;
    }

    public boolean checkBit(int num, int pos){
        return ((num >> pos) & 1) == 1;
    }
}
