class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dict={}
        for num in nums:
            dict[num]=dict.get(num,0)+1

#initializing the bucket
        bucket=[[] for i in range(len(nums)+1)]

# filling the bucket
        for num, freq in dict.items():
            bucket[freq].append(num)
        
        counter = len(nums)
        res=[]
        while counter>0:
            for l in bucket[counter]:
                res.append(l)
                if len(res)==k: return res 
            counter-=1
        

"""
USING MIN-HEAP
        ans=[]
        dict={}
        for num in nums:
            dict[num]=dict.get(num,0)+1

        heap = []

        for num, freq in dict.items():
            heapq.heappush(heap,(freq,num))

            if len(heap)>k:
                heapq.heappop(heap)

        for freq,num in heap:
            ans.append(num)
        return ans
"""

# USING BUCKET SORT

