class Solution {
    public boolean isPalindrome(String s) {
        char[] ch=s.toLowerCase().toCharArray();
        int i=0;
        int j=ch.length -1;

        while(i<=j){
            if(!isAlpha(ch[i])){ i++; continue;}

            if(!isAlpha(ch[j])) {j--; continue;}

            if(ch[i]!=ch[j]){
                return false;
            }
            i++; j--;
            
        }
        return true;

    }

    public boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}
