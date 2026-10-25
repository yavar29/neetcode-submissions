class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dict={}
        for num in nums:
            dict[num]=dict.get(num,0)+1

#initializing the bucket
        bucket=[[] for _ in range(len(nums)+1)]

# filling the bucket
        for num, freq in dict.items():
            bucket[freq].append(num)
        
        res=[]
        for i in range(len(nums), 0, -1):
            for l in bucket[i]:
                res.append(l)
                if len(res)==k: return res 
          
        

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
