class Solution:
    def rob(self, nums: List[int]) -> int:

        included = [0]*len(nums)
        included[0]=1
        f =0
        s = nums[0]
        for i in range(1,len(nums)):
            if included[i-1]==1:
                ans = max(f+nums[i],s)
                f = s
                s = ans
                included[i]=1
            else:
                ans = s+nums[i]
                f=s
                s=ans

        return s
        
        
        '''
        2 9 8 3 6

        

        '''