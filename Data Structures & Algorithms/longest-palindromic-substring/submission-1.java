class Solution {
    public String longestPalindrome(String s) {
        int left_ans=0;
        int right_ans=0;
        int maxLen=0;

        for(int i=0;i<s.length();i++){
            // odd palindrome check
            int l=i;
            int r=i;
            while(l>=0 && r<s.length()&& s.charAt(l)==s.charAt(r)){
                
                
                if(r-l+1>maxLen){
                    maxLen = r-l+1;
                    left_ans=l;
                    right_ans=r;
                }
                l--;
                r++;
            }

            // even palindrome check
            l=i;
            r=i+1;
            while(l>=0 && r<s.length()&& s.charAt(l)==s.charAt(r)){
                
                if(r-l+1>maxLen){
                    maxLen = r-l+1;
                    left_ans=l;
                    right_ans=r;
                }
                l--;
                r++;
            }

            
        }
        return s.substring(left_ans, right_ans+1);
    }
}
