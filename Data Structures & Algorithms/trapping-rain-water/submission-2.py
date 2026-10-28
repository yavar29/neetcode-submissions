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
            