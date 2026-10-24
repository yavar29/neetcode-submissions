class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
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
dict 
1:1
2:2
3:3

heap

2,2
3,3

"""