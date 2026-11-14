class Solution:
    def rob(self, nums: List[int]) -> int:

        included = True
        f =0
        s = nums[0]
        for i in range(1,len(nums)):
            if included:
                ans = max(f+nums[i],s)
                f = s
                s = ans
            else:
                included= False
                ans = s+nums[i]
                f=s
                s=ans

        return s
        
        
        '''
        2 9 8 3 6

        

        '''