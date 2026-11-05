class Solution:
    def decodeString(self, s: str) -> str:

        stack = []

        for char in s:
            if char !=']': 
                stack.append(char)
            else:
                st=""
                num=""
                while stack[-1]!="[":
                    st=stack.pop()+st
                stack.pop()

                # find the number
                while stack and stack[-1].isdigit():
                    num=stack.pop()+num

                stack.append(int(num) * st)
        
        return "".join(stack)

