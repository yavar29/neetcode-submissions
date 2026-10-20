class Solution {
    public String minWindow(String s, String t) {

        int start = 0;
        int j = 0;
        char[] ch = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int required = map.size();   
        int count = 0;               
        int ans = Integer.MAX_VALUE; 
        int ansStart = 0;           

        for (j = 0; j < ch.length; j++) {
            char r = ch[j];
            if (map.containsKey(r)) {
                map.put(r, map.get(r) - 1);
                if (map.get(r) == 0) count++;  
            }

            while (count == required) {
                if (j - start + 1 < ans) {
                    ans = j - start + 1;
                    ansStart = start;
                }

                char l = ch[start];
                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                    if (map.get(l) > 0) { 
                        count--;
                    }
                }
                start++;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(ansStart, ansStart + ans);
        }
    }
}
