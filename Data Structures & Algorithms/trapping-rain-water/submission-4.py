class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0

        l, r = 0, len(height) - 1
        leftMax, rightMax = height[l], height[r]
        res = 0
        while l < r:
            if leftMax < rightMax:
                l += 1
                leftMax = max(leftMax, height[l])
                res += leftMax - height[l]
            else:
                r -= 1
                rightMax = max(rightMax, height[r])
                res += rightMax - height[r]
        return res
        


"""

Using Prefix/Postfix sum
TC - O(n)
SC - O(n)

class Solution:
    def trap(self, height: List[int]) -> int:
        
        n=len(height)
        lmax=[0]*n
        rmax=[0]*n

        lmax[0]=0
        rmax[n-1]=0

        total =0

        for i in range(1, n):
            j = n - 1 - i
            lmax[i] = max(lmax[i - 1], height[i - 1])
            rmax[j] = max(rmax[j + 1], height[j + 1])

        for i in range(n):
            water = min(lmax[i],rmax[i]) - height[i]
            if water>0:
                total+=water
                
        return total
            

"""
            