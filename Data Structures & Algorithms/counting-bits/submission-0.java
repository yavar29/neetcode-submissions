class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=checkNumberOfOnes(i);
        }
        return ans;
    }

    public int checkNumberOfOnes(int num){
        int count =0;
        for(int i=0;i<=31;i++){
            if(checkBit(num, i)) count++;
        }

        return count;
    }

    public boolean checkBit(int num, int pos){
        if((num>>pos) %2 ==1) return true;
        return false;
    }
}
