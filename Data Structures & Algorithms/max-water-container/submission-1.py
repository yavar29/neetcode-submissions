class Solution:
    def maxArea(self, heights: List[int]) -> int:
        # 2 pointer

        left = 0
        right = len(heights)-1
        ans =0
        while left<right:
            width = right - left
            height = min(heights[left],heights[right])
            area = width *height
            if area>ans: ans= area
            if heights[left]>heights[right]: right-=1
            else: left+=1
        return ans

"""

"""