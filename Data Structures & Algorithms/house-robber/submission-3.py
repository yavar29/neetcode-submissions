class Solution:
    def rob(self, nums: List[int]) -> int:

        f=0
        s=nums[0]

        for i in range(1,len(nums)):
            ans = max(s, f+nums[i])
            f=s
            s=ans
        return s