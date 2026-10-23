class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False

        dict={}
        for char in s:
            dict[char]=dict.get(char,0)+1
        for ch in t:
            if ch not in dict: return False
            dict[ch]=dict.get(ch)-1 

            if dict.get(ch)==0: del dict[ch]
        return len(dict)==0

# sorting - nlogn - NO
# hashmap - TC - O(n), SC - O(n)
# solution with SC - O(n) -?