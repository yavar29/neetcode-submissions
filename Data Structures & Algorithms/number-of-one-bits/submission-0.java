class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<31;i++){
            if(checkBit(n,i)) count++;;
        }
        return count;
    }
    public boolean checkBit(int val, int pos){
        if((val>>pos)%2 == 1) return true;
        return false;
    }
}
