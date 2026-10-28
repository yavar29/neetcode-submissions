class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0

        l, r = 0, len(height) - 1
        leftMax, rightMax = 0, 0
        res = 0

        while l <= r:
            if leftMax <= rightMax:
                if height[l] < leftMax:
                    res += leftMax - height[l]
                else:
                    leftMax = height[l]
                l += 1
            else:
                if height[r] < rightMax:
                    res += rightMax - height[r]
                else:
                    rightMax = height[r]
                r -= 1

        return res