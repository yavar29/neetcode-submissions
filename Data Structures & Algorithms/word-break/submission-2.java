
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        int n = s.length();

        int maxLen = 0;
        for (String w : dict) maxLen = Math.max(maxLen, w.length());

        // dp[i] => can segment first i chars, i.e., s[1..i] in 1-based
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // empty prefix

        for (int i = 1; i <= n; i++) {
            // j runs from i down to at least 1, but we cap by maxLen
            int jMin = Math.max(1, i - maxLen + 1);
            for (int j = i; j >= jMin; j--) {
                // 1-based s[j..i]  -> Java substring(j-1, i)
                if (dp[j - 1] && dict.contains(s.substring(j - 1, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
