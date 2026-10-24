class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #dictionary to store unique keys and list of values
        dict=defaultdict(list)

        for string in strs:
            arr = [0]*26
            for char in string:
                arr[ord(char)-ord('a')]+=1
            key = tuple(arr)
            dict[key].append(string)
        
        return list(dict.values())