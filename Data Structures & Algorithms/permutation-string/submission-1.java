class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) {
                matches++;
            }
        }

        int left = 0;
        for(int i=s1.length();i<s2.length();i++){
            if(matches==26) return true;
            s2Count[s2.charAt(i)-'a']++;
            if(s2Count[s2.charAt(i)-'a']==s1Count[s2.charAt(i)-'a']) matches++;
            if (s1Count[s2.charAt(i)-'a'] + 1 == s2Count[s2.charAt(i)-'a']) matches--;

            s2Count[s2.charAt(left)-'a']--;
            if (s1Count[s2.charAt(left)-'a'] == s2Count[s2.charAt(left)-'a']) matches++;
            if (s1Count[s2.charAt(left)-'a'] - 1 == s2Count[s2.charAt(left)-'a']) matches--;
            left++;
        }

        return matches == 26;
    }
}
