class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()

        for i in range(len(nums)-2):
            if i>0 and nums[i]==nums[i-1]: continue
            fixed=nums[i]
            start = i+1
            end= len(nums)-1
            while start<end:
                
                total=fixed+nums[start]+nums[end]
                if total>0:
                    end-=1
                elif total<0:
                    start+=1
                else:
                    res.append([fixed,nums[start], nums[end]])
                    start+=1
                    end-=1
                
                    while start<end and nums[start]==nums[start-1]:
                        start+=1
                    
                    while start<end and nums[end]==nums[end+1]:
                        end-=1
        
        return res