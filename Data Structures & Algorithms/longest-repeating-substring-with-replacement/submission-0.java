class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0;
        int maxf = 0, maxl = 0;
        int[] arr = new int[26];

        while (j < s.length()) {
            int idx = s.charAt(j) - 'A';
            arr[idx]++;
            maxf = Math.max(maxf, arr[idx]);

            int len = j - i + 1;
            while (len - maxf > k) {              
                arr[s.charAt(i) - 'A']--;       
                i++;
                len = j - i + 1;                   
            }

            maxl = Math.max(maxl, len);
            j++;
        }
        return maxl;
    }
}
