
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) count.put(n, count.getOrDefault(n, 0) + 1);

        List<Integer>[] freq = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            int c = e.getValue();
            if (freq[c] == null) freq[c] = new ArrayList<>();
            freq[c].add(e.getKey());
        }
                                   
        int[] res = new int[k];
        int idx = 0;
        for (int i = freq.length - 1; i >= 0 && idx < k; i--) {
            if (freq[i] == null) continue;
            for (int n : freq[i]) {
                res[idx++] = n;
                if (idx == k) break;
            }
        }
        return res;
    }
}
