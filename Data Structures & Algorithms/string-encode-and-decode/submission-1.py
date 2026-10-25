class Solution:

    def encode(self, strs: List[str]) -> str:
        enc=""
        for s in strs:
            enc += str(len(s)) + "#" + s
        #print(enc)
        return enc

    def decode(self, s: str) -> List[str]:
        # look for the number till we get a pound sign
        # iterate till that number last

        i=0
        res=[]
        while(i<len(s)):
            j=i
            while(s[j]!='#'): j += 1
            length = int(s[i:j])
            i=j+1
            res.append(s[i:i+length])
            i=i+length
        return res