class Solution:
    def isValid(self, s: str) -> bool:
        combo={')':'(','}':'{',']':'['}
        stack=[]

        for char in s:
            if char in combo and stack:
                if stack[-1]==combo[char]:stack.pop()
                else: return False
            else: stack.append(char)

        return len(stack)==0