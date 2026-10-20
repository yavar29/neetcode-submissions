class Solution {
    public boolean isHappy(int n) {
        // determine cycle using fast and slow pointers

        int slow =n;
        int fast = findSumOfDigits(n);

        while(slow!=fast){
            if(fast == 1) return true;
            fast=findSumOfDigits(findSumOfDigits(fast));
            slow = findSumOfDigits(slow);
        }

        return fast==1;
    }

    public int findSumOfDigits(int n){
        int ans=0;
        while(n>0){
            int digit = n%10;
            ans += digit * digit;
            n=n/10;
        }

        return ans;
    }
}
